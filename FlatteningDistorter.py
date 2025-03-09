from antlr4 import *
from lang.langLexer import langLexer
from lang.langParser import langParser
from lang.langVisitor import langVisitor


class FlatteningDistorter(langVisitor):
    def __init__(self):
        self.vars = set()
        self.pc = 0

    def __obf_com(self, ctx, exit_pc=None):
        if isinstance(ctx, langParser.AssignmentContext):
            result = f"""
        if (pc = {self.pc}) {{
            {ctx.ID().getText()} := {self.visit(ctx.exp())};
            pc := {self.pc + 1 if exit_pc is None else exit_pc};
        }};\n"""
            self.pc += 1
            return result
        elif isinstance(ctx, langParser.SkipContext):
            return "skip; "
        elif isinstance(ctx, langParser.WhileLoopContext):
            starting_pc = self.pc
            self.pc = starting_pc + 1
            body = ""
            for com in ctx.com():
                body += self.visit(com)
            header = f"""
        if(pc = {starting_pc}) {{
            if ({ctx.bExp().getText()}) {{
                pc := {starting_pc + 1};
            }} else {{
                pc := {self.pc + 1 if exit_pc is None else exit_pc};
            }};
        }};
                    """
            result = header + body
            result += f"""
        if (pc = {self.pc}) {{
            pc := {starting_pc};                
        }};\n"""
            self.pc = self.pc + 1
            return result
        return ""

    def __obf_var(self, varName: str):
        self.vars.add(varName)
        return f"{varName}"

    def visitProg(self, ctx: langParser.ProgContext):
        self.pc = 1
        result = "{\n\tpc := 1;\n\twhile (pc != 0) {"
        for com in ctx.com():
            result += self.visit(com)
        result += f"""
        if(pc = {self.pc}) {{ 
            pc := 0; 
        }};\n\n"""  # End of program
        return result + "\t};\n}"

    def visitAssignment(self, ctx: langParser.AssignmentContext):
        return self.__obf_com(ctx)

    def visitSkip(self, ctx: langParser.SkipContext):
        return self.__obf_com(ctx)

    def visitIf(self, ctx: langParser.IfContext):
        branches = [{
            "bExp": self.visit(ctx.bExp()),
            "ctx": ctx,
            "coms": ctx.com()
        }]
        branches.extend(self.visit(ctx.elseTail()))

        start_pc = self.pc                      # start: current pc
        exit_pc = self.pc + len(branches)       # exit node pc

        self.pc = exit_pc + 1                   # body program counter

        body = ""
        branches_pc = []
        for i, b in enumerate(branches):
            coms = b["coms"]
            branches_pc.append(self.pc)
            for j, c in enumerate(coms):
                pc = exit_pc if j == (len(coms) - 1) else None
                body += self.__obf_com(c, exit_pc=pc)

        last_pc = self.pc

        self.pc = start_pc                      # header program counter
        header = ""
        for i in range(len(branches_pc)):
            if not isinstance(branches[i]["ctx"], langParser.IfElseTailContext):
                header += f"""
        if (pc = {self.pc}) {{
            if({branches[i]["bExp"]}) {{
                pc := {branches_pc[i]};
            }} else {{
                pc := {self.pc + 1};
            }};
        }};
                """
            else:
                header += f"""
        if (pc = {self.pc}) {{
            pc := {branches_pc[i]};
        }};
                """
            self.pc += 1

        self.pc = last_pc

        exit_node = f"""
        if(pc = {exit_pc}) {{
            pc := {self.pc};
        }};
        """
        return header + exit_node + body

    def visitIfElseTail(self, ctx: langParser.IfElseTailContext):
        return [{
            "bExp": None,
            "ctx": ctx,
            "coms": ctx.com()
        }]

    def visitIfElseIfTail(self, ctx: langParser.IfElseIfTailContext):
        branches = [{
            "bExp": self.visit(ctx.bExp()),
            "ctx": ctx,
            "coms": ctx.com()
        }]
        branches.extend(self.visit(ctx.elseTail()))
        return branches

    def visitIfElseTailEmpty(self, ctx: langParser.IfElseTailEmptyContext):
        return []

    def visitWhileLoop(self, ctx: langParser.WhileLoopContext):
        return self.__obf_com(ctx)

    def visitAddition(self, ctx: langParser.AdditionContext):
        return f"{self.visit(ctx.aExp(0))} + {self.visit(ctx.aExp(1))}"

    def visitSubtraction(self, ctx: langParser.SubtractionContext):
        return f"{self.visit(ctx.aExp(0))} - {self.visit(ctx.aExp(1))}"

    def visitMultiplication(self, ctx: langParser.MultiplicationContext):
        return f"{self.visit(ctx.aExp(0))} * {self.visit(ctx.aExp(1))}"

    def visitDivision(self, ctx: langParser.DivisionContext):
        return f"{self.visit(ctx.aExp(0))} / {self.visit(ctx.aExp(1))}"

    def visitAParenthesis(self, ctx: langParser.AParenthesisContext):
        return f"({self.visit(ctx.aExp())}"

    def visitInteger(self, ctx: langParser.IntegerContext):
        return ctx.INT().getText()

    def visitArithmeticVariable(self, ctx: langParser.ArithmeticVariableContext):
        return self.__obf_var(ctx.ID().getText())

    def visitBExp(self, ctx: langParser.BExpContext):
        return f"{"".join(self.visit(child) for child in ctx.getChildren())}"

    def visitBExp_tail(self, ctx):
        return f"{"".join(self.visit(child) for child in ctx.getChildren())}"

    def visitTerminal(self, node):
        return node.getText()
