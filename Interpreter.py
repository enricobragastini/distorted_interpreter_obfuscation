from antlr4 import *
from lang.langLexer import langLexer
from lang.langParser import langParser
from lang.langVisitor import langVisitor


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

    def visitIf(self, ctx: langParser.IfContext):
        cond = self.visit(ctx.bExp())
        if cond:
            for com in ctx.com():
                self.visit(com)
        else:
            self.visit(ctx.elseTail())

    def visitIfElseTail(self, ctx: langParser.IfElseTailContext):
        for com in ctx.com():
            self.visit(com)

    def visitIfElseIfTail(self, ctx: langParser.IfElseIfTailContext):
        cond = self.visit(ctx.bExp())
        if cond:
            for com in ctx.com():
                self.visit(com)
        else:
            self.visit(ctx.elseTail())

    def visitIfElseTailEmpty(self, ctx: langParser.IfElseTailEmptyContext):
        pass

    def visitWhileLoop(self, ctx: langParser.WhileLoopContext):
        cond = self.visit(ctx.bExp())
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

    def visitDivision(self, ctx: langParser.DivisionContext):
        return self.visit(ctx.aExp(0)) / self.visit(ctx.aExp(1))

    def visitAParenthesis(self, ctx: langParser.AParenthesisContext):
        return self.visit(ctx.aExp())

    def visitInteger(self, ctx: langParser.IntegerContext):
        return int(ctx.INT().getText())

    def visitArithmeticVariable(self, ctx: langParser.ArithmeticVariableContext):
        if ctx.ID().getText() not in self.memory:
            raise Exception("Variable not found: " + ctx.ID().getText())

        return int(self.memory[ctx.ID().getText()])

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

        try:
            if operator == "and":
                result = (left and right)
            elif operator == "=":
                result = (left == right)
            elif operator == "!=":
                result = (left != right)
            elif operator == ">":
                result = (left > right)
            elif operator == "<":
                result = (left < right)
            else:
                raise Exception("Unknown operator: " + operator)
        except TypeError:
            raise Exception(
                str(self.memory) + "\nInvalid operation: " + str(left) + operator + str(right) + " at " + ctx.getText())

        return self._evaluateBExp_tail(ctx=ctx.bExp_tail(), left=result)

    def visitBExp_tail(self, ctx):
        return None  # behavior is handled in _evaluateBExp_tail

    def visitTerminal(self, node):
        if node.getText() == "true":
            return True
        elif node.getText() == "false":
            return False
        elif node.getText() == "not":
            return
        elif node.getText().isdigit():
            return int(node.getText())
        else:
            if node.getText() == "c":
                print(self.memory[node.getText()])
            # ID
            return self.memory[node.getText()]
