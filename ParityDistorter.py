from antlr4 import *
from langLexer import langLexer
from langParser import langParser
from langVisitor import langVisitor


class ParityDistorter(langVisitor):
    def __init__(self):
        self.vars = set()

    def __obf_com(self, ctx):
        if isinstance(ctx, langParser.AssignmentContext):
            return f"{ctx.ID().getText()} := 2 * ({self.visit(ctx.exp())});"
        elif isinstance(ctx, langParser.SkipContext):
            return "skip; "
        return ""

    def __obf_var(self, varName: str):
        self.vars.add(varName)
        return f"{varName} / 2"

    def visitProg(self, ctx: langParser.ProgContext):
        result = "{"
        for com in ctx.com():
            result += self.visit(com)
        for var in self.vars:
            result += f"{var} := {self.__obf_var(var)};"
        return result + "}"

    def visitAssignment(self, ctx: langParser.AssignmentContext):
        return self.__obf_com(ctx)

    def visitSkip(self, ctx: langParser.SkipContext):
        return self.__obf_com(ctx)

    def visitNondeterministicChoice(self, ctx: langParser.NondeterministicChoiceContext):
        return f"[{self.visit(ctx.com(0))} || {self.visit(ctx.com(1))}]"

    def visitKleeneStar(self, ctx: langParser.KleeneStarContext):
        result = f"while ({self.visit(ctx.bExp())}) {{"
        for com in ctx.com():
            result += self.visit(com)
        return result + "};"

    def visitAddition(self, ctx: langParser.AdditionContext):
        return f"{self.visit(ctx.aExp(0))} + {self.visit(ctx.aExp(1))}"

    def visitSubtraction(self, ctx: langParser.SubtractionContext):
        return f"{self.visit(ctx.aExp(0))} - {self.visit(ctx.aExp(1))}"

    def visitMultiplication(self, ctx: langParser.MultiplicationContext):
        return f"{self.visit(ctx.aExp(0))} * {self.visit(ctx.aExp(1))}"

    def visitDivision(self, ctx: langParser.DivisionContext):
        return f"{self.visit(ctx.aExp(0))} / {self.visit(ctx.aExp(1))}"

    def visitAParenthesis(self, ctx: langParser.AParenthesisContext):
        return f"({self.visit(ctx.aExp())})"

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
