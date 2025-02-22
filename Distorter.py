from antlr4 import *
from langLexer import langLexer
from langParser import langParser
from langVisitor import langVisitor


class Distorter(langVisitor):
    def __init__(self):
        self.memory = {}

    def visitProg(self, ctx: langParser.ProgContext):
        return "{" + "".join(self.visit(com) for com in ctx.com()) + "}"

    def visitAssignment(self, ctx: langParser.AssignmentContext):
        return f"{ctx.ID().getText()} := {self.visit(ctx.exp())};"

    def visitSkip(self, ctx: langParser.SkipContext):
        return "skip;"

    def visitNondeterministicChoice(self, ctx: langParser.NondeterministicChoiceContext):
        return f"[{self.visit(ctx.com(0))} || {self.visit(ctx.com(1))}]"

    def visitKleeneStar(self, ctx: langParser.KleeneStarContext):
        result = f"while ({self.visit(ctx.bExp())}) {{"
        for com in ctx.com():
            result += self.visit(com)
        return result + "}"

    def visitAddition(self, ctx: langParser.AdditionContext):
        return f"{self.visit(ctx.aExp(0))} + {self.visit(ctx.aExp(1))}"

    def visitSubtraction(self, ctx: langParser.SubtractionContext):
        return f"{self.visit(ctx.aExp(0))} - {self.visit(ctx.aExp(1))}"

    def visitMultiplication(self, ctx: langParser.MultiplicationContext):
        return f"{self.visit(ctx.aExp(0))} * {self.visit(ctx.aExp(1))}"

    def visitAParenthesis(self, ctx: langParser.AParenthesisContext):
        return f"({self.visit(ctx.aExp())})"

    def visitInteger(self, ctx: langParser.IntegerContext):
        return ctx.INT().getText()

    def visitArithmeticVariable(self, ctx: langParser.ArithmeticVariableContext):
        return ctx.ID().getText()

    def visitBExp(self, ctx: langParser.BExpContext):
        return f"{"".join(self.visit(child) for child in ctx.getChildren())}"

    def visitBExp_tail(self, ctx):
        return f"{"".join(self.visit(child) for child in ctx.getChildren())}"

    def visitTerminal(self, node):
        return node.getText()
