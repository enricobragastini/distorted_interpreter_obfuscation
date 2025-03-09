from antlr4 import *
from langLexer import langLexer
from langParser import langParser
from langVisitor import langVisitor


class ParityDistorter(langVisitor):
    def __init__(self):
        self.vars = set()
        self.indentation_level = 0
        self.indentation_string = "\t"

    def increase_indentation(self):
        self.indentation_level += 1

    def decrease_indentation(self):
        self.indentation_level = max(0, self.indentation_level - 1)

    def get_indent(self):
        return self.indentation_string * self.indentation_level

    def __obf_com(self, ctx):
        if isinstance(ctx, langParser.AssignmentContext):
            return f"{self.get_indent()}{ctx.ID().getText()} := 2 * ({self.visit(ctx.exp())});\n"
        elif isinstance(ctx, langParser.SkipContext):
            return f"{self.get_indent()}skip; "
        elif isinstance(ctx, langParser.WhileLoopContext):
            result = f"{self.get_indent()}while ({self.visit(ctx.bExp())}) {{\n"
            self.increase_indentation()
            for com in ctx.com():
                result += self.visit(com)
            self.decrease_indentation()
            return result + self.get_indent() + "};\n"

    def __obf_var(self, varName: str):
        self.vars.add(varName)
        return f"({varName} / 2)"

    def visitProg(self, ctx: langParser.ProgContext):
        result = "{\n"
        self.increase_indentation()
        for com in ctx.com():
            result += self.visit(com)
        for var in self.vars:
            result += f"{self.get_indent()}{var} := {self.__obf_var(var)};\n"
        self.decrease_indentation()
        return result + "}"

    def visitAssignment(self, ctx: langParser.AssignmentContext):
        return self.__obf_com(ctx)

    def visitSkip(self, ctx: langParser.SkipContext):
        return self.__obf_com(ctx)

    def visitIf(self, ctx: langParser.IfContext):
        result = f"{self.get_indent()}if ({self.visit(ctx.bExp())}){{\n"
        self.increase_indentation()
        for com in ctx.com():
            result += self.visit(com)
        self.decrease_indentation()
        result += f"{self.get_indent()}}}" + self.visit(ctx.elseTail()) + ";\n"

        return result

    def visitIfElseTail(self, ctx: langParser.IfElseTailContext):
        result = f" else {{\n"
        self.increase_indentation()
        for com in ctx.com():
            result += self.visit(com)
        self.decrease_indentation()
        result += self.get_indent() + "}"
        return result

    def visitIfElseIfTail(self, ctx: langParser.IfElseIfTailContext):
        result = f" if else({self.visit(ctx.bExp())}) {{\n"
        self.increase_indentation()
        for com in ctx.com():
            result += self.visit(com)
        self.decrease_indentation()
        result += self.get_indent() + "}"
        return result

    def visitIfElseTailEmpty(self, ctx: langParser.IfElseTailEmptyContext):
        return ""

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
        result = ""
        for child in ctx.getChildren():
            if isinstance(child, TerminalNode) and child.getSymbol().type == langLexer.ID:
                result += self.__obf_var(child.getText())
            else:
                result += self.visit(child)
        return result

    def visitBExp_tail(self, ctx):
        return f"{"".join(self.visit(child) for child in ctx.getChildren())}"

    def visitTerminal(self, node):
        return node.getText()
