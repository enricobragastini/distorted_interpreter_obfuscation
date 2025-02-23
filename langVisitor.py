# Generated from lang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .langParser import langParser
else:
    from langParser import langParser

# This class defines a complete generic visitor for a parse tree produced by langParser.

class langVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by langParser#prog.
    def visitProg(self, ctx:langParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#Assignment.
    def visitAssignment(self, ctx:langParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#Skip.
    def visitSkip(self, ctx:langParser.SkipContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#NondeterministicChoice.
    def visitNondeterministicChoice(self, ctx:langParser.NondeterministicChoiceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#KleeneStar.
    def visitKleeneStar(self, ctx:langParser.KleeneStarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#exp.
    def visitExp(self, ctx:langParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#Integer.
    def visitInteger(self, ctx:langParser.IntegerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#Multiplication.
    def visitMultiplication(self, ctx:langParser.MultiplicationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#Addition.
    def visitAddition(self, ctx:langParser.AdditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#Subtraction.
    def visitSubtraction(self, ctx:langParser.SubtractionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#ArithmeticVariable.
    def visitArithmeticVariable(self, ctx:langParser.ArithmeticVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#AParenthesis.
    def visitAParenthesis(self, ctx:langParser.AParenthesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#Division.
    def visitDivision(self, ctx:langParser.DivisionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#bExp.
    def visitBExp(self, ctx:langParser.BExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by langParser#bExp_tail.
    def visitBExp_tail(self, ctx:langParser.BExp_tailContext):
        return self.visitChildren(ctx)



del langParser