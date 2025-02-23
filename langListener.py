# Generated from lang.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .langParser import langParser
else:
    from langParser import langParser

# This class defines a complete listener for a parse tree produced by langParser.
class langListener(ParseTreeListener):

    # Enter a parse tree produced by langParser#prog.
    def enterProg(self, ctx:langParser.ProgContext):
        pass

    # Exit a parse tree produced by langParser#prog.
    def exitProg(self, ctx:langParser.ProgContext):
        pass


    # Enter a parse tree produced by langParser#Assignment.
    def enterAssignment(self, ctx:langParser.AssignmentContext):
        pass

    # Exit a parse tree produced by langParser#Assignment.
    def exitAssignment(self, ctx:langParser.AssignmentContext):
        pass


    # Enter a parse tree produced by langParser#Skip.
    def enterSkip(self, ctx:langParser.SkipContext):
        pass

    # Exit a parse tree produced by langParser#Skip.
    def exitSkip(self, ctx:langParser.SkipContext):
        pass


    # Enter a parse tree produced by langParser#NondeterministicChoice.
    def enterNondeterministicChoice(self, ctx:langParser.NondeterministicChoiceContext):
        pass

    # Exit a parse tree produced by langParser#NondeterministicChoice.
    def exitNondeterministicChoice(self, ctx:langParser.NondeterministicChoiceContext):
        pass


    # Enter a parse tree produced by langParser#KleeneStar.
    def enterKleeneStar(self, ctx:langParser.KleeneStarContext):
        pass

    # Exit a parse tree produced by langParser#KleeneStar.
    def exitKleeneStar(self, ctx:langParser.KleeneStarContext):
        pass


    # Enter a parse tree produced by langParser#exp.
    def enterExp(self, ctx:langParser.ExpContext):
        pass

    # Exit a parse tree produced by langParser#exp.
    def exitExp(self, ctx:langParser.ExpContext):
        pass


    # Enter a parse tree produced by langParser#Integer.
    def enterInteger(self, ctx:langParser.IntegerContext):
        pass

    # Exit a parse tree produced by langParser#Integer.
    def exitInteger(self, ctx:langParser.IntegerContext):
        pass


    # Enter a parse tree produced by langParser#Multiplication.
    def enterMultiplication(self, ctx:langParser.MultiplicationContext):
        pass

    # Exit a parse tree produced by langParser#Multiplication.
    def exitMultiplication(self, ctx:langParser.MultiplicationContext):
        pass


    # Enter a parse tree produced by langParser#Addition.
    def enterAddition(self, ctx:langParser.AdditionContext):
        pass

    # Exit a parse tree produced by langParser#Addition.
    def exitAddition(self, ctx:langParser.AdditionContext):
        pass


    # Enter a parse tree produced by langParser#Subtraction.
    def enterSubtraction(self, ctx:langParser.SubtractionContext):
        pass

    # Exit a parse tree produced by langParser#Subtraction.
    def exitSubtraction(self, ctx:langParser.SubtractionContext):
        pass


    # Enter a parse tree produced by langParser#ArithmeticVariable.
    def enterArithmeticVariable(self, ctx:langParser.ArithmeticVariableContext):
        pass

    # Exit a parse tree produced by langParser#ArithmeticVariable.
    def exitArithmeticVariable(self, ctx:langParser.ArithmeticVariableContext):
        pass


    # Enter a parse tree produced by langParser#AParenthesis.
    def enterAParenthesis(self, ctx:langParser.AParenthesisContext):
        pass

    # Exit a parse tree produced by langParser#AParenthesis.
    def exitAParenthesis(self, ctx:langParser.AParenthesisContext):
        pass


    # Enter a parse tree produced by langParser#Division.
    def enterDivision(self, ctx:langParser.DivisionContext):
        pass

    # Exit a parse tree produced by langParser#Division.
    def exitDivision(self, ctx:langParser.DivisionContext):
        pass


    # Enter a parse tree produced by langParser#bExp.
    def enterBExp(self, ctx:langParser.BExpContext):
        pass

    # Exit a parse tree produced by langParser#bExp.
    def exitBExp(self, ctx:langParser.BExpContext):
        pass


    # Enter a parse tree produced by langParser#bExp_tail.
    def enterBExp_tail(self, ctx:langParser.BExp_tailContext):
        pass

    # Exit a parse tree produced by langParser#bExp_tail.
    def exitBExp_tail(self, ctx:langParser.BExp_tailContext):
        pass



del langParser