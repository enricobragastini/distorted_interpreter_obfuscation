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
        4,1,28,131,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,1,
        0,5,0,15,8,0,10,0,12,0,18,9,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,5,1,32,8,1,10,1,12,1,35,9,1,1,1,1,1,5,1,39,8,1,10,
        1,12,1,42,9,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,52,8,1,10,1,12,
        1,55,9,1,1,1,1,1,1,1,3,1,60,8,1,1,2,1,2,3,2,64,8,2,1,3,1,3,1,3,1,
        3,1,3,1,3,1,3,3,3,73,8,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,
        1,3,1,3,5,3,87,8,3,10,3,12,3,90,9,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,
        1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,110,8,4,1,5,1,5,
        1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,
        129,8,5,1,5,0,1,6,6,0,2,4,6,8,10,0,0,147,0,12,1,0,0,0,2,59,1,0,0,
        0,4,63,1,0,0,0,6,72,1,0,0,0,8,109,1,0,0,0,10,128,1,0,0,0,12,16,5,
        6,0,0,13,15,3,2,1,0,14,13,1,0,0,0,15,18,1,0,0,0,16,14,1,0,0,0,16,
        17,1,0,0,0,17,19,1,0,0,0,18,16,1,0,0,0,19,20,5,7,0,0,20,21,5,0,0,
        1,21,1,1,0,0,0,22,23,5,26,0,0,23,24,5,15,0,0,24,25,3,4,2,0,25,26,
        5,14,0,0,26,60,1,0,0,0,27,28,5,5,0,0,28,60,5,14,0,0,29,33,5,10,0,
        0,30,32,3,2,1,0,31,30,1,0,0,0,32,35,1,0,0,0,33,31,1,0,0,0,33,34,
        1,0,0,0,34,36,1,0,0,0,35,33,1,0,0,0,36,40,5,12,0,0,37,39,3,2,1,0,
        38,37,1,0,0,0,39,42,1,0,0,0,40,38,1,0,0,0,40,41,1,0,0,0,41,43,1,
        0,0,0,42,40,1,0,0,0,43,44,5,11,0,0,44,60,5,14,0,0,45,46,5,13,0,0,
        46,47,5,8,0,0,47,48,3,8,4,0,48,49,5,9,0,0,49,53,5,6,0,0,50,52,3,
        2,1,0,51,50,1,0,0,0,52,55,1,0,0,0,53,51,1,0,0,0,53,54,1,0,0,0,54,
        56,1,0,0,0,55,53,1,0,0,0,56,57,5,7,0,0,57,58,5,14,0,0,58,60,1,0,
        0,0,59,22,1,0,0,0,59,27,1,0,0,0,59,29,1,0,0,0,59,45,1,0,0,0,60,3,
        1,0,0,0,61,64,3,6,3,0,62,64,3,8,4,0,63,61,1,0,0,0,63,62,1,0,0,0,
        64,5,1,0,0,0,65,66,6,3,-1,0,66,67,5,8,0,0,67,68,3,6,3,0,68,69,5,
        9,0,0,69,73,1,0,0,0,70,73,5,27,0,0,71,73,5,26,0,0,72,65,1,0,0,0,
        72,70,1,0,0,0,72,71,1,0,0,0,73,88,1,0,0,0,74,75,10,7,0,0,75,76,5,
        1,0,0,76,87,3,6,3,8,77,78,10,6,0,0,78,79,5,2,0,0,79,87,3,6,3,7,80,
        81,10,5,0,0,81,82,5,3,0,0,82,87,3,6,3,6,83,84,10,4,0,0,84,85,5,4,
        0,0,85,87,3,6,3,5,86,74,1,0,0,0,86,77,1,0,0,0,86,80,1,0,0,0,86,83,
        1,0,0,0,87,90,1,0,0,0,88,86,1,0,0,0,88,89,1,0,0,0,89,7,1,0,0,0,90,
        88,1,0,0,0,91,92,5,18,0,0,92,93,3,8,4,0,93,94,3,10,5,0,94,110,1,
        0,0,0,95,96,5,26,0,0,96,110,3,10,5,0,97,98,5,16,0,0,98,110,3,10,
        5,0,99,100,5,17,0,0,100,110,3,10,5,0,101,102,3,6,3,0,102,103,3,10,
        5,0,103,110,1,0,0,0,104,105,5,8,0,0,105,106,3,8,4,0,106,107,5,9,
        0,0,107,108,3,10,5,0,108,110,1,0,0,0,109,91,1,0,0,0,109,95,1,0,0,
        0,109,97,1,0,0,0,109,99,1,0,0,0,109,101,1,0,0,0,109,104,1,0,0,0,
        110,9,1,0,0,0,111,112,5,21,0,0,112,113,3,4,2,0,113,114,3,10,5,0,
        114,129,1,0,0,0,115,116,5,22,0,0,116,117,3,4,2,0,117,118,3,10,5,
        0,118,129,1,0,0,0,119,120,5,23,0,0,120,121,3,4,2,0,121,122,3,10,
        5,0,122,129,1,0,0,0,123,124,5,19,0,0,124,125,3,4,2,0,125,126,3,10,
        5,0,126,129,1,0,0,0,127,129,1,0,0,0,128,111,1,0,0,0,128,115,1,0,
        0,0,128,119,1,0,0,0,128,123,1,0,0,0,128,127,1,0,0,0,129,11,1,0,0,
        0,11,16,33,40,53,59,63,72,86,88,109,128
    ]

class langParser ( Parser ):

    grammarFileName = "lang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'*'", "'/'", "'+'", "'-'", "'skip'", 
                     "'{'", "'}'", "'('", "')'", "'['", "']'", "'||'", "'while'", 
                     "';'", "':='", "'true'", "'false'", "'not'", "'and'", 
                     "'or'", "'='", "'>'", "'<'", "'>='", "'<='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "SKIP_CMD", "LBRACE", "RBRACE", "LPAREN", 
                      "RPAREN", "LSQUARE", "RSQUARE", "NDETCH", "WHILE", 
                      "SEMICOLON", "ASSIGN", "TRUE", "FALSE", "NOT", "AND", 
                      "OR", "EQ", "GT", "LT", "GE", "LE", "ID", "INT", "WS" ]

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
    T__3=4
    SKIP_CMD=5
    LBRACE=6
    RBRACE=7
    LPAREN=8
    RPAREN=9
    LSQUARE=10
    RSQUARE=11
    NDETCH=12
    WHILE=13
    SEMICOLON=14
    ASSIGN=15
    TRUE=16
    FALSE=17
    NOT=18
    AND=19
    OR=20
    EQ=21
    GT=22
    LT=23
    GE=24
    LE=25
    ID=26
    INT=27
    WS=28

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
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67118112) != 0):
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
            if token in [26]:
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
            elif token in [5]:
                localctx = langParser.SkipContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 27
                self.match(langParser.SKIP_CMD)
                self.state = 28
                self.match(langParser.SEMICOLON)
                pass
            elif token in [10]:
                localctx = langParser.NondeterministicChoiceContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 29
                self.match(langParser.LSQUARE)
                self.state = 33
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67118112) != 0):
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
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67118112) != 0):
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
            elif token in [13]:
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
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 67118112) != 0):
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


    class DivisionContext(AExpContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a langParser.AExpContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def aExp(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(langParser.AExpContext)
            else:
                return self.getTypedRuleContext(langParser.AExpContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDivision" ):
                listener.enterDivision(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDivision" ):
                listener.exitDivision(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDivision" ):
                return visitor.visitDivision(self)
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
            if token in [8]:
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
            elif token in [27]:
                localctx = langParser.IntegerContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 70
                self.match(langParser.INT)
                pass
            elif token in [26]:
                localctx = langParser.ArithmeticVariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 71
                self.match(langParser.ID)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 88
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 86
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                    if la_ == 1:
                        localctx = langParser.MultiplicationContext(self, langParser.AExpContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_aExp)
                        self.state = 74
                        if not self.precpred(self._ctx, 7):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 7)")
                        self.state = 75
                        self.match(langParser.T__0)
                        self.state = 76
                        self.aExp(8)
                        pass

                    elif la_ == 2:
                        localctx = langParser.DivisionContext(self, langParser.AExpContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_aExp)
                        self.state = 77
                        if not self.precpred(self._ctx, 6):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 6)")
                        self.state = 78
                        self.match(langParser.T__1)
                        self.state = 79
                        self.aExp(7)
                        pass

                    elif la_ == 3:
                        localctx = langParser.AdditionContext(self, langParser.AExpContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_aExp)
                        self.state = 80
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 81
                        self.match(langParser.T__2)
                        self.state = 82
                        self.aExp(6)
                        pass

                    elif la_ == 4:
                        localctx = langParser.SubtractionContext(self, langParser.AExpContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_aExp)
                        self.state = 83
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 84
                        self.match(langParser.T__3)
                        self.state = 85
                        self.aExp(5)
                        pass

             
                self.state = 90
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
            self.state = 109
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 91
                self.match(langParser.NOT)
                self.state = 92
                self.bExp()
                self.state = 93
                self.bExp_tail()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 95
                self.match(langParser.ID)
                self.state = 96
                self.bExp_tail()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 97
                self.match(langParser.TRUE)
                self.state = 98
                self.bExp_tail()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 99
                self.match(langParser.FALSE)
                self.state = 100
                self.bExp_tail()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 101
                self.aExp(0)
                self.state = 102
                self.bExp_tail()
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 104
                self.match(langParser.LPAREN)
                self.state = 105
                self.bExp()
                self.state = 106
                self.match(langParser.RPAREN)
                self.state = 107
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
            self.state = 128
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,10,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 111
                self.match(langParser.EQ)
                self.state = 112
                self.exp()
                self.state = 113
                self.bExp_tail()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 115
                self.match(langParser.GT)
                self.state = 116
                self.exp()
                self.state = 117
                self.bExp_tail()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 119
                self.match(langParser.LT)
                self.state = 120
                self.exp()
                self.state = 121
                self.bExp_tail()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 123
                self.match(langParser.AND)
                self.state = 124
                self.exp()
                self.state = 125
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
                return self.precpred(self._ctx, 7)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 6)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 4)
         




