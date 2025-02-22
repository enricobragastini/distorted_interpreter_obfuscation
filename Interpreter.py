from antlr4 import *
from langLexer import langLexer
from langParser import langParser
from langVisitor import langVisitor


class Interpreter(langVisitor):
    def __init__(self):
        self.memory = {}

    def visitProg(self, ctx: langParser.ProgContext):
        for com in ctx.com():
            self.visit(com)

    def visitAssignment(self, ctx: langParser.AssignmentContext):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.exp())
        self.memory[var_name] = value

    def visitSkip(self, ctx: langParser.SkipContext):
        pass

    # def visitBoolean(self, ctx: langParser.BooleanContext):
    #     return ctx.visit(ctx.bExp())

    def visitNondeterministicChoice(self, ctx: langParser.NondeterministicChoiceContext):
        import random
        return self.visit(ctx.com(random.choice([0, 1])))

    def visitKleeneStar(self, ctx: langParser.KleeneStarContext):
        cond = self.visit(ctx.bExp())
        print(cond)
        while cond:
            for com in ctx.com():
                self.visit(com)
            cond = self.visit(ctx.bExp())

    def visitAddition(self, ctx: langParser.AdditionContext):
        return self.visit(ctx.aExp(0)) + self.visit(ctx.aExp(1))

    def visitSubtraction(self, ctx: langParser.SubtractionContext):
        return self.visit(ctx.aExp(0)) - self.visit(ctx.aExp(1))

    def visitMultiplication(self, ctx: langParser.MultiplicationContext):
        return self.visit(ctx.aExp(0)) * self.visit(ctx.aExp(1))

    def visitAParenthesis(self, ctx: langParser.AParenthesisContext):
        return self.visit(ctx.aExp())

    def visitInteger(self, ctx: langParser.IntegerContext):
        return int(ctx.INT().getText())

    def visitArithmeticVariable(self, ctx: langParser.ArithmeticVariableContext):
        return self.memory[ctx.ID().getText()]

    def visitBExp(self, ctx: langParser.BExpContext):
        left = self.visit(ctx.getChild(0))
        if ctx.bExp_tail():
            return self._evaluateBExp_tail(ctx=ctx.bExp_tail(), left=left)
        return left

    def _evaluateBExp_tail(self, ctx: langParser.BExp_tailContext, left):
        if ctx.getChildCount() == 0:  # epsilon
            return left

        operator = ctx.getChild(0).getText()
        right = self.visit(ctx.getChild(1))

        if operator == "and":
            result = left and right
        elif operator == "=":
            result = left == right
        elif operator == ">":
            result = left > right
        elif operator == "<":
            result = left < right
        else:
            raise Exception("Unknown operator: " + operator)

        return self._evaluateBExp_tail(ctx=ctx.bExp_tail(), left=result)

    def visitBExp_tail(self, ctx):
        return self.visitChildren(ctx)

    def visitTerminal(self, node):
        if node.getText() == "true":
            return True
        elif node.getText() == "false":
            return False
        elif node.getText().isdigit():
            return int(node.getText())
        else:
            # ID
            return self.memory[node.getText()]
