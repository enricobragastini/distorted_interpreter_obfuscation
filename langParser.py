# Generated from lang.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,27,128,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,1,
        0,5,0,15,8,0,10,0,12,0,18,9,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,5,1,32,8,1,10,1,12,1,35,9,1,1,1,1,1,5,1,39,8,1,10,
        1,12,1,42,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,52,8,1,10,1,12,
        1,55,9,1,1,1,1,1,1,1,3,1,60,8,1,1,2,1,2,3,2,64,8,2,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,3,3,73,8,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,
        84,8,3,10,3,12,3,87,9,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,
        1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,107,8,4,1,5,1,5,1,5,1,5,1,5,
        1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,126,8,5,1,5,
        0,1,6,6,0,2,4,6,8,10,0,0,143,0,12,1,0,0,0,2,59,1,0,0,0,4,63,1,0,
        0,0,6,72,1,0,0,0,8,106,1,0,0,0,10,125,1,0,0,0,12,16,5,5,0,0,13,15,
        3,2,1,0,14,13,1,0,0,0,15,18,1,0,0,0,16,14,1,0,0,0,16,17,1,0,0,0,
        17,19,1,0,0,0,18,16,1,0,0,0,19,20,5,6,0,0,20,21,5,0,0,1,21,1,1,0,
        0,0,22,23,5,25,0,0,23,24,5,14,0,0,24,25,3,4,2,0,25,26,5,13,0,0,26,
        60,1,0,0,0,27,28,5,4,0,0,28,60,5,13,0,0,29,33,5,9,0,0,30,32,3,2,
        1,0,31,30,1,0,0,0,32,35,1,0,0,0,33,31,1,0,0,0,33,34,1,0,0,0,34,36,
        1,0,0,0,35,33,1,0,0,0,36,40,5,11,0,0,37,39,3,2,1,0,38,37,1,0,0,0,
        39,42,1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,43,1,0,0,0,42,40,1,
        0,0,0,43,44,5,10,0,0,44,60,5,13,0,0,45,46,5,12,0,0,46,47,5,7,0,0,
        47,48,3,8,4,0,48,49,5,8,0,0,49,53,5,5,0,0,50,52,3,2,1,0,51,50,1,
        0,0,0,52,55,1,0,0,0,53,51,1,0,0,0,53,54,1,0,0,0,54,56,1,0,0,0,55,
        53,1,0,0,0,56,57,5,6,0,0,57,58,5,13,0,0,58,60,1,0,0,0,59,22,1,0,
        0,0,59,27,1,0,0,0,59,29,1,0,0,0,59,45,1,0,0,0,60,3,1,0,0,0,61,64,
        3,6,3,0,62,64,3,8,4,0,63,61,1,0,0,0,63,62,1,0,0,0,64,5,1,0,0,0,65,
        66,6,3,-1,0,66,67,5,7,0,0,67,68,3,6,3,0,68,69,5,8,0,0,69,73,1,0,
        0,0,70,73,5,26,0,0,71,73,5,25,0,0,72,65,1,0,0,0,72,70,1,0,0,0,72,
        71,1,0,0,0,73,85,1,0,0,0,74,75,10,6,0,0,75,76,5,1,0,0,76,84,3,6,
        3,7,77,78,10,5,0,0,78,79,5,2,0,0,79,84,3,6,3,6,80,81,10,4,0,0,81,
        82,5,3,0,0,82,84,3,6,3,5,83,74,1,0,0,0,83,77,1,0,0,0,83,80,1,0,0,
        0,84,87,1,0,0,0,85,83,1,0,0,0,85,86,1,0,0,0,86,7,1,0,0,0,87,85,1,
        0,0,0,88,89,5,17,0,0,89,90,3,8,4,0,90,91,3,10,5,0,91,107,1,0,0,0,
        92,93,5,25,0,0,93,107,3,10,5,0,94,95,5,15,0,0,95,107,3,10,5,0,96,
        97,5,16,0,0,97,107,3,10,5,0,98,99,3,6,3,0,99,100,3,10,5,0,100,107,
        1,0,0,0,101,102,5,7,0,0,102,103,3,8,4,0,103,104,5,8,0,0,104,105,
        3,10,5,0,105,107,1,0,0,0,106,88,1,0,0,0,106,92,1,0,0,0,106,94,1,
        0,0,0,106,96,1,0,0,0,106,98,1,0,0,0,106,101,1,0,0,0,107,9,1,0,0,
        0,108,109,5,20,0,0,109,110,3,4,2,0,110,111,3,10,5,0,111,126,1,0,
        0,0,112,113,5,21,0,0,113,114,3,4,2,0,114,115,3,10,5,0,115,126,1,
        0,0,0,116,117,5,22,0,0,117,118,3,4,2,0,118,119,3,10,5,0,119,126,
        1,0,0,0,120,121,5,18,0,0,121,122,3,4,2,0,122,123,3,10,5,0,123,126,
        1,0,0,0,124,126,1,0,0,0,125,108,1,0,0,0,125,112,1,0,0,0,125,116,
        1,0,0,0,125,120,1,0,0,0,125,124,1,0,0,0,126,11,1,0,0,0,11,16,33,
        40,53,59,63,72,83,85,106,125
    ]

class langParser ( Parser ):

    grammarFileName = "lang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'", "'-'", "'*'", "'skip'", "'{'", 
                     "'}'", "'('", "')'", "'['", "']'", "'||'", "'while'", 
                     "';'", "':='", "'true'", "'false'", "'not'", "'and'", 
                     "'or'", "'='", "'>'", "'<'", "'>='", "'<='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "SKIP_CMD", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
                      "LSQUARE", "RSQUARE", "NDETCH", "WHILE", "SEMICOLON", 
                      "ASSIGN", "TRUE", "FALSE", "NOT", "AND", "OR", "EQ", 
                      "GT", "LT", "GE", "LE", "ID", "INT", "WS" ]

    RULE_prog = 0
    RULE_com = 1
    RULE_exp = 2
    RULE_aExp = 3
    RULE_bExp = 4
    RULE_bExp_tail = 5

    ruleNames =  [ "prog", "com", "exp", "aExp", "bExp", "bExp_tail" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    SKIP_CMD=4
    LBRACE=5
    RBRACE=6
    LPAREN=7
    RPAREN=8
    LSQUARE=9
    RSQUARE=10
    NDETCH=11
    WHILE=12
    SEMICOLON=13
    ASSIGN=14
    TRUE=15
    FALSE=16
    NOT=17
    AND=18
    OR=19
    EQ=20
    GT=21
    LT=22
    GE=23
    LE=24
    ID=25
    INT=26
    WS=27

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACE(self):
            return self.getToken(langParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(langParser.RBRACE, 0)

        def EOF(self):
            return self.getToken(langParser.EOF, 0)

        def com(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(langParser.ComContext)
            else:
                return self.getTypedRuleContext(langParser.ComContext,i)


        def getRuleIndex(self):
            return langParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProg" ):
                return visitor.visitProg(self)
            else:
                return visitor.visitChildren(self)




    def prog(self):

        localctx = langParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self.match(langParser.LBRACE)
            self.state = 16
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 33559056) != 0):
                self.state = 13
                self.com()
                self.state = 18
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 19
            self.match(langParser.RBRACE)
            self.state = 20
            self.match(langParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return langParser.RULE_com

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class AssignmentContext(ComContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.ComContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(langParser.ID, 0)
        def ASSIGN(self):
            return self.getToken(langParser.ASSIGN, 0)
        def exp(self):
            return self.getTypedRuleContext(langParser.ExpContext,0)

        def SEMICOLON(self):
            return self.getToken(langParser.SEMICOLON, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)


    class KleeneStarContext(ComContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.ComContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def WHILE(self):
            return self.getToken(langParser.WHILE, 0)
        def LPAREN(self):
            return self.getToken(langParser.LPAREN, 0)
        def bExp(self):
            return self.getTypedRuleContext(langParser.BExpContext,0)

        def RPAREN(self):
            return self.getToken(langParser.RPAREN, 0)
        def LBRACE(self):
            return self.getToken(langParser.LBRACE, 0)
        def RBRACE(self):
            return self.getToken(langParser.RBRACE, 0)
        def SEMICOLON(self):
            return self.getToken(langParser.SEMICOLON, 0)
        def com(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(langParser.ComContext)
            else:
                return self.getTypedRuleContext(langParser.ComContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterKleeneStar" ):
                listener.enterKleeneStar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitKleeneStar" ):
                listener.exitKleeneStar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitKleeneStar" ):
                return visitor.visitKleeneStar(self)
            else:
                return visitor.visitChildren(self)


    class NondeterministicChoiceContext(ComContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.ComContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LSQUARE(self):
            return self.getToken(langParser.LSQUARE, 0)
        def NDETCH(self):
            return self.getToken(langParser.NDETCH, 0)
        def RSQUARE(self):
            return self.getToken(langParser.RSQUARE, 0)
        def SEMICOLON(self):
            return self.getToken(langParser.SEMICOLON, 0)
        def com(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(langParser.ComContext)
            else:
                return self.getTypedRuleContext(langParser.ComContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNondeterministicChoice" ):
                listener.enterNondeterministicChoice(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNondeterministicChoice" ):
                listener.exitNondeterministicChoice(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNondeterministicChoice" ):
                return visitor.visitNondeterministicChoice(self)
            else:
                return visitor.visitChildren(self)


    class SkipContext(ComContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.ComContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def SKIP_CMD(self):
            return self.getToken(langParser.SKIP_CMD, 0)
        def SEMICOLON(self):
            return self.getToken(langParser.SEMICOLON, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSkip" ):
                listener.enterSkip(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSkip" ):
                listener.exitSkip(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSkip" ):
                return visitor.visitSkip(self)
            else:
                return visitor.visitChildren(self)



    def com(self):

        localctx = langParser.ComContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_com)
        self._la = 0 # Token type
        try:
            self.state = 59
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [25]:
                localctx = langParser.AssignmentContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 22
                self.match(langParser.ID)
                self.state = 23
                self.match(langParser.ASSIGN)
                self.state = 24
                self.exp()
                self.state = 25
                self.match(langParser.SEMICOLON)
                pass
            elif token in [4]:
                localctx = langParser.SkipContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 27
                self.match(langParser.SKIP_CMD)
                self.state = 28
                self.match(langParser.SEMICOLON)
                pass
            elif token in [9]:
                localctx = langParser.NondeterministicChoiceContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 29
                self.match(langParser.LSQUARE)
                self.state = 33
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 33559056) != 0):
                    self.state = 30
                    self.com()
                    self.state = 35
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 36
                self.match(langParser.NDETCH)
                self.state = 40
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 33559056) != 0):
                    self.state = 37
                    self.com()
                    self.state = 42
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 43
                self.match(langParser.RSQUARE)
                self.state = 44
                self.match(langParser.SEMICOLON)
                pass
            elif token in [12]:
                localctx = langParser.KleeneStarContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 45
                self.match(langParser.WHILE)
                self.state = 46
                self.match(langParser.LPAREN)
                self.state = 47
                self.bExp()
                self.state = 48
                self.match(langParser.RPAREN)
                self.state = 49
                self.match(langParser.LBRACE)
                self.state = 53
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 33559056) != 0):
                    self.state = 50
                    self.com()
                    self.state = 55
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 56
                self.match(langParser.RBRACE)
                self.state = 57
                self.match(langParser.SEMICOLON)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def aExp(self):
            return self.getTypedRuleContext(langParser.AExpContext,0)


        def bExp(self):
            return self.getTypedRuleContext(langParser.BExpContext,0)


        def getRuleIndex(self):
            return langParser.RULE_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp" ):
                listener.enterExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp" ):
                listener.exitExp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp" ):
                return visitor.visitExp(self)
            else:
                return visitor.visitChildren(self)




    def exp(self):

        localctx = langParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_exp)
        try:
            self.state = 63
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 61
                self.aExp(0)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 62
                self.bExp()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return langParser.RULE_aExp

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class IntegerContext(AExpContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.AExpContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(langParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInteger" ):
                listener.enterInteger(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInteger" ):
                listener.exitInteger(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInteger" ):
                return visitor.visitInteger(self)
            else:
                return visitor.visitChildren(self)


    class AdditionContext(AExpContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.AExpContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def aExp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(langParser.AExpContext)
            else:
                return self.getTypedRuleContext(langParser.AExpContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAddition" ):
                listener.enterAddition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAddition" ):
                listener.exitAddition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAddition" ):
                return visitor.visitAddition(self)
            else:
                return visitor.visitChildren(self)


    class MultiplicationContext(AExpContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.AExpContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def aExp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(langParser.AExpContext)
            else:
                return self.getTypedRuleContext(langParser.AExpContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiplication" ):
                listener.enterMultiplication(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiplication" ):
                listener.exitMultiplication(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMultiplication" ):
                return visitor.visitMultiplication(self)
            else:
                return visitor.visitChildren(self)


    class SubtractionContext(AExpContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.AExpContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def aExp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(langParser.AExpContext)
            else:
                return self.getTypedRuleContext(langParser.AExpContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSubtraction" ):
                listener.enterSubtraction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSubtraction" ):
                listener.exitSubtraction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSubtraction" ):
                return visitor.visitSubtraction(self)
            else:
                return visitor.visitChildren(self)


    class ArithmeticVariableContext(AExpContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.AExpContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(langParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArithmeticVariable" ):
                listener.enterArithmeticVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArithmeticVariable" ):
                listener.exitArithmeticVariable(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArithmeticVariable" ):
                return visitor.visitArithmeticVariable(self)
            else:
                return visitor.visitChildren(self)


    class AParenthesisContext(AExpContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.AExpContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def LPAREN(self):
            return self.getToken(langParser.LPAREN, 0)
        def aExp(self):
            return self.getTypedRuleContext(langParser.AExpContext,0)

        def RPAREN(self):
            return self.getToken(langParser.RPAREN, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAParenthesis" ):
                listener.enterAParenthesis(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAParenthesis" ):
                listener.exitAParenthesis(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAParenthesis" ):
                return visitor.visitAParenthesis(self)
            else:
                return visitor.visitChildren(self)



    def aExp(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = langParser.AExpContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 6
        self.enterRecursionRule(localctx, 6, self.RULE_aExp, _p)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                localctx = langParser.AParenthesisContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 66
                self.match(langParser.LPAREN)
                self.state = 67
                self.aExp(0)
                self.state = 68
                self.match(langParser.RPAREN)
                pass
            elif token in [26]:
                localctx = langParser.IntegerContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 70
                self.match(langParser.INT)
                pass
            elif token in [25]:
                localctx = langParser.ArithmeticVariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 71
                self.match(langParser.ID)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 85
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 83
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                    if la_ == 1:
                        localctx = langParser.AdditionContext(self, langParser.AExpContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_aExp)
                        self.state = 74
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 75
                        self.match(langParser.T__0)
                        self.state = 76
                        self.aExp(7)
                        pass

                    elif la_ == 2:
                        localctx = langParser.SubtractionContext(self, langParser.AExpContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_aExp)
                        self.state = 77
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 78
                        self.match(langParser.T__1)
                        self.state = 79
                        self.aExp(6)
                        pass

                    elif la_ == 3:
                        localctx = langParser.MultiplicationContext(self, langParser.AExpContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_aExp)
                        self.state = 80
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 81
                        self.match(langParser.T__2)
                        self.state = 82
                        self.aExp(5)
                        pass

             
                self.state = 87
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class BExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NOT(self):
            return self.getToken(langParser.NOT, 0)

        def bExp(self):
            return self.getTypedRuleContext(langParser.BExpContext,0)


        def bExp_tail(self):
            return self.getTypedRuleContext(langParser.BExp_tailContext,0)


        def ID(self):
            return self.getToken(langParser.ID, 0)

        def TRUE(self):
            return self.getToken(langParser.TRUE, 0)

        def FALSE(self):
            return self.getToken(langParser.FALSE, 0)

        def aExp(self):
            return self.getTypedRuleContext(langParser.AExpContext,0)


        def LPAREN(self):
            return self.getToken(langParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(langParser.RPAREN, 0)

        def getRuleIndex(self):
            return langParser.RULE_bExp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBExp" ):
                listener.enterBExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBExp" ):
                listener.exitBExp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBExp" ):
                return visitor.visitBExp(self)
            else:
                return visitor.visitChildren(self)




    def bExp(self):

        localctx = langParser.BExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_bExp)
        try:
            self.state = 106
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 88
                self.match(langParser.NOT)
                self.state = 89
                self.bExp()
                self.state = 90
                self.bExp_tail()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 92
                self.match(langParser.ID)
                self.state = 93
                self.bExp_tail()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 94
                self.match(langParser.TRUE)
                self.state = 95
                self.bExp_tail()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 96
                self.match(langParser.FALSE)
                self.state = 97
                self.bExp_tail()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 98
                self.aExp(0)
                self.state = 99
                self.bExp_tail()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 101
                self.match(langParser.LPAREN)
                self.state = 102
                self.bExp()
                self.state = 103
                self.match(langParser.RPAREN)
                self.state = 104
                self.bExp_tail()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BExp_tailContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EQ(self):
            return self.getToken(langParser.EQ, 0)

        def exp(self):
            return self.getTypedRuleContext(langParser.ExpContext,0)


        def bExp_tail(self):
            return self.getTypedRuleContext(langParser.BExp_tailContext,0)


        def GT(self):
            return self.getToken(langParser.GT, 0)

        def LT(self):
            return self.getToken(langParser.LT, 0)

        def AND(self):
            return self.getToken(langParser.AND, 0)

        def getRuleIndex(self):
            return langParser.RULE_bExp_tail

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBExp_tail" ):
                listener.enterBExp_tail(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBExp_tail" ):
                listener.exitBExp_tail(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBExp_tail" ):
                return visitor.visitBExp_tail(self)
            else:
                return visitor.visitChildren(self)




    def bExp_tail(self):

        localctx = langParser.BExp_tailContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_bExp_tail)
        try:
            self.state = 125
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 108
                self.match(langParser.EQ)
                self.state = 109
                self.exp()
                self.state = 110
                self.bExp_tail()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 112
                self.match(langParser.GT)
                self.state = 113
                self.exp()
                self.state = 114
                self.bExp_tail()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 116
                self.match(langParser.LT)
                self.state = 117
                self.exp()
                self.state = 118
                self.bExp_tail()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 120
                self.match(langParser.AND)
                self.state = 121
                self.exp()
                self.state = 122
                self.bExp_tail()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[3] = self.aExp_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def aExp_sempred(self, localctx:AExpContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 4)
         




