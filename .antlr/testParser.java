// Generated from /home/stini/univr/4anno/analisi_software/progetto/simpleLang/test.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SKIP_CMD=4, LBRACE=5, RBRACE=6, LPAREN=7, RPAREN=8, 
		LSQUARE=9, RSQUARE=10, NDETCH=11, WHILE=12, SEMICOLON=13, ASSIGN=14, TRUE=15, 
		FALSE=16, NOT=17, AND=18, OR=19, EQ=20, GT=21, LT=22, GE=23, LE=24, VAR=25, 
		INT=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_com = 1, RULE_exp = 2, RULE_aExp = 3, RULE_bExp = 4, 
		RULE_bExp_tail = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "com", "exp", "aExp", "bExp", "bExp_tail"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'skip'", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", "'||'", "'while'", "';'", "':='", "'true'", "'false'", "'not'", 
			"'and'", "'or'", "'='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "SKIP_CMD", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"LSQUARE", "RSQUARE", "NDETCH", "WHILE", "SEMICOLON", "ASSIGN", "TRUE", 
			"FALSE", "NOT", "AND", "OR", "EQ", "GT", "LT", "GE", "LE", "VAR", "INT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(testParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(testParser.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(testParser.EOF, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(LBRACE);
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100897424L) != 0)) {
				{
				{
				setState(13);
				com();
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			match(RBRACE);
			setState(20);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ComContext {
		public TerminalNode VAR() { return getToken(testParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(testParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(testParser.SEMICOLON, 0); }
		public AssignmentContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAssignment(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KleeneStarContext extends ComContext {
		public TerminalNode WHILE() { return getToken(testParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(testParser.LPAREN, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(testParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(testParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(testParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(testParser.SEMICOLON, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public KleeneStarContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterKleeneStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitKleeneStar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NondeterministicChoiceContext extends ComContext {
		public TerminalNode LSQUARE() { return getToken(testParser.LSQUARE, 0); }
		public TerminalNode NDETCH() { return getToken(testParser.NDETCH, 0); }
		public TerminalNode RSQUARE() { return getToken(testParser.RSQUARE, 0); }
		public TerminalNode SEMICOLON() { return getToken(testParser.SEMICOLON, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public NondeterministicChoiceContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterNondeterministicChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitNondeterministicChoice(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIP_CMD() { return getToken(testParser.SKIP_CMD, 0); }
		public TerminalNode SEMICOLON() { return getToken(testParser.SEMICOLON, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSkip(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ComContext {
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(testParser.SEMICOLON, 0); }
		public BooleanContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBoolean(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(VAR);
				setState(23);
				match(ASSIGN);
				setState(24);
				exp();
				setState(25);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(SKIP_CMD);
				setState(28);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				bExp();
				setState(30);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new NondeterministicChoiceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				match(LSQUARE);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100897424L) != 0)) {
					{
					{
					setState(33);
					com();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(39);
				match(NDETCH);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100897424L) != 0)) {
					{
					{
					setState(40);
					com();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(46);
				match(RSQUARE);
				setState(47);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new KleeneStarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				match(WHILE);
				setState(49);
				match(LPAREN);
				setState(50);
				bExp();
				setState(51);
				match(RPAREN);
				setState(52);
				match(LBRACE);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 100897424L) != 0)) {
					{
					{
					setState(53);
					com();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(RBRACE);
				setState(60);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				aExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				bExp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AExpContext extends ParserRuleContext {
		public AExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aExp; }
	 
		public AExpContext() { }
		public void copyFrom(AExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends AExpContext {
		public TerminalNode INT() { return getToken(testParser.INT, 0); }
		public IntegerContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends AExpContext {
		public List<AExpContext> aExp() {
			return getRuleContexts(AExpContext.class);
		}
		public AExpContext aExp(int i) {
			return getRuleContext(AExpContext.class,i);
		}
		public AdditionContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAddition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends AExpContext {
		public List<AExpContext> aExp() {
			return getRuleContexts(AExpContext.class);
		}
		public AExpContext aExp(int i) {
			return getRuleContext(AExpContext.class,i);
		}
		public MultiplicationContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitMultiplication(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionContext extends AExpContext {
		public List<AExpContext> aExp() {
			return getRuleContexts(AExpContext.class);
		}
		public AExpContext aExp(int i) {
			return getRuleContext(AExpContext.class,i);
		}
		public SubtractionContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitSubtraction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticVariableContext extends AExpContext {
		public TerminalNode VAR() { return getToken(testParser.VAR, 0); }
		public ArithmeticVariableContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterArithmeticVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitArithmeticVariable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AParenthesisContext extends AExpContext {
		public TerminalNode LPAREN() { return getToken(testParser.LPAREN, 0); }
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(testParser.RPAREN, 0); }
		public AParenthesisContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAParenthesis(this);
		}
	}

	public final AExpContext aExp() throws RecognitionException {
		return aExp(0);
	}

	private AExpContext aExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AExpContext _localctx = new AExpContext(_ctx, _parentState);
		AExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_aExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new AParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				match(LPAREN);
				setState(70);
				aExp(0);
				setState(71);
				match(RPAREN);
				}
				break;
			case INT:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(INT);
				}
				break;
			case VAR:
				{
				_localctx = new ArithmeticVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new AExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aExp);
						setState(77);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(78);
						match(T__0);
						setState(79);
						aExp(7);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new AExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aExp);
						setState(80);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(81);
						match(T__1);
						setState(82);
						aExp(6);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationContext(new AExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aExp);
						setState(83);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(84);
						match(T__2);
						setState(85);
						aExp(5);
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BExpContext extends ParserRuleContext {
		public BExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExp; }
	 
		public BExpContext() { }
		public void copyFrom(BExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends BExpContext {
		public TerminalNode NOT() { return getToken(testParser.NOT, 0); }
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public NotContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends BExpContext {
		public TerminalNode VAR() { return getToken(testParser.VAR, 0); }
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public VariableContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitVariable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BParenthesisContext extends BExpContext {
		public TerminalNode LPAREN() { return getToken(testParser.LPAREN, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(testParser.RPAREN, 0); }
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public BParenthesisContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterBParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitBParenthesis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends BExpContext {
		public TerminalNode TRUE() { return getToken(testParser.TRUE, 0); }
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public TrueContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitTrue(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends BExpContext {
		public TerminalNode FALSE() { return getToken(testParser.FALSE, 0); }
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public FalseContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitFalse(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends BExpContext {
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public ArithmeticContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitArithmetic(this);
		}
	}

	public final BExpContext bExp() throws RecognitionException {
		BExpContext _localctx = new BExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bExp);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(NOT);
				setState(92);
				bExp_tail();
				}
				break;
			case 2:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(VAR);
				setState(94);
				bExp_tail();
				}
				break;
			case 3:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(TRUE);
				setState(96);
				bExp_tail();
				}
				break;
			case 4:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				match(FALSE);
				setState(98);
				bExp_tail();
				}
				break;
			case 5:
				_localctx = new ArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				aExp(0);
				setState(100);
				bExp_tail();
				}
				break;
			case 6:
				_localctx = new BParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(LPAREN);
				setState(103);
				bExp();
				setState(104);
				match(RPAREN);
				setState(105);
				bExp_tail();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BExp_tailContext extends ParserRuleContext {
		public BExp_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExp_tail; }
	 
		public BExp_tailContext() { }
		public void copyFrom(BExp_tailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends BExp_tailContext {
		public TerminalNode LT() { return getToken(testParser.LT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public LessThanContext(BExp_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitLessThan(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends BExp_tailContext {
		public EmptyContext(BExp_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEmpty(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends BExp_tailContext {
		public TerminalNode EQ() { return getToken(testParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public EqualContext(BExp_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitEqual(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanContext extends BExp_tailContext {
		public TerminalNode GT() { return getToken(testParser.GT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public GreaterThanContext(BExp_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitGreaterThan(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BExp_tailContext {
		public TerminalNode AND() { return getToken(testParser.AND, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public AndContext(BExp_tailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitAnd(this);
		}
	}

	public final BExp_tailContext bExp_tail() throws RecognitionException {
		BExp_tailContext _localctx = new BExp_tailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bExp_tail);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(EQ);
				setState(110);
				exp();
				setState(111);
				bExp_tail();
				}
				break;
			case 2:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(GT);
				setState(114);
				exp();
				setState(115);
				bExp_tail();
				}
				break;
			case 3:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(LT);
				setState(118);
				exp();
				setState(119);
				bExp_tail();
				}
				break;
			case 4:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(AND);
				setState(122);
				exp();
				setState(123);
				bExp_tail();
				}
				break;
			case 5:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return aExp_sempred((AExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aExp_sempred(AExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000"+
		"\n\u0000\f\u0000\u0012\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001#\b\u0001\n\u0001\f\u0001&\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u00017\b\u0001\n\u0001\f\u0001:\t\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002C\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003W\b\u0003\n\u0003\f\u0003Z\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004l\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u007f\b\u0005\u0001\u0005"+
		"\u0000\u0001\u0006\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000\u0091"+
		"\u0000\f\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004"+
		"B\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bk\u0001\u0000"+
		"\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u0010\u0005\u0005\u0000\u0000"+
		"\r\u000f\u0003\u0002\u0001\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000\u0012"+
		"\u0010\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0006\u0000\u0000\u0014"+
		"\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016"+
		"\u0017\u0005\u0019\u0000\u0000\u0017\u0018\u0005\u000e\u0000\u0000\u0018"+
		"\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0005\r\u0000\u0000\u001a?"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0004\u0000\u0000\u001c?\u0005"+
		"\r\u0000\u0000\u001d\u001e\u0003\b\u0004\u0000\u001e\u001f\u0005\r\u0000"+
		"\u0000\u001f?\u0001\u0000\u0000\u0000 $\u0005\t\u0000\u0000!#\u0003\u0002"+
		"\u0001\u0000\"!\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001\u0000\u0000\u0000"+
		"&$\u0001\u0000\u0000\u0000\'+\u0005\u000b\u0000\u0000(*\u0003\u0002\u0001"+
		"\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000./\u0005\n\u0000\u0000/?\u0005\r\u0000\u000001\u0005"+
		"\f\u0000\u000012\u0005\u0007\u0000\u000023\u0003\b\u0004\u000034\u0005"+
		"\b\u0000\u000048\u0005\u0005\u0000\u000057\u0003\u0002\u0001\u000065\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0006\u0000\u0000<=\u0005\r\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000>\u0016\u0001\u0000\u0000\u0000>\u001b\u0001\u0000\u0000\u0000>"+
		"\u001d\u0001\u0000\u0000\u0000> \u0001\u0000\u0000\u0000>0\u0001\u0000"+
		"\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@C\u0003\u0006\u0003\u0000"+
		"AC\u0003\b\u0004\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"C\u0005\u0001\u0000\u0000\u0000DE\u0006\u0003\uffff\uffff\u0000EF\u0005"+
		"\u0007\u0000\u0000FG\u0003\u0006\u0003\u0000GH\u0005\b\u0000\u0000HL\u0001"+
		"\u0000\u0000\u0000IL\u0005\u001a\u0000\u0000JL\u0005\u0019\u0000\u0000"+
		"KD\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KJ\u0001\u0000\u0000"+
		"\u0000LX\u0001\u0000\u0000\u0000MN\n\u0006\u0000\u0000NO\u0005\u0001\u0000"+
		"\u0000OW\u0003\u0006\u0003\u0007PQ\n\u0005\u0000\u0000QR\u0005\u0002\u0000"+
		"\u0000RW\u0003\u0006\u0003\u0006ST\n\u0004\u0000\u0000TU\u0005\u0003\u0000"+
		"\u0000UW\u0003\u0006\u0003\u0005VM\u0001\u0000\u0000\u0000VP\u0001\u0000"+
		"\u0000\u0000VS\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u0011\u0000\u0000\\l\u0003\n"+
		"\u0005\u0000]^\u0005\u0019\u0000\u0000^l\u0003\n\u0005\u0000_`\u0005\u000f"+
		"\u0000\u0000`l\u0003\n\u0005\u0000ab\u0005\u0010\u0000\u0000bl\u0003\n"+
		"\u0005\u0000cd\u0003\u0006\u0003\u0000de\u0003\n\u0005\u0000el\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0007\u0000\u0000gh\u0003\b\u0004\u0000hi\u0005\b"+
		"\u0000\u0000ij\u0003\n\u0005\u0000jl\u0001\u0000\u0000\u0000k[\u0001\u0000"+
		"\u0000\u0000k]\u0001\u0000\u0000\u0000k_\u0001\u0000\u0000\u0000ka\u0001"+
		"\u0000\u0000\u0000kc\u0001\u0000\u0000\u0000kf\u0001\u0000\u0000\u0000"+
		"l\t\u0001\u0000\u0000\u0000mn\u0005\u0014\u0000\u0000no\u0003\u0004\u0002"+
		"\u0000op\u0003\n\u0005\u0000p\u007f\u0001\u0000\u0000\u0000qr\u0005\u0015"+
		"\u0000\u0000rs\u0003\u0004\u0002\u0000st\u0003\n\u0005\u0000t\u007f\u0001"+
		"\u0000\u0000\u0000uv\u0005\u0016\u0000\u0000vw\u0003\u0004\u0002\u0000"+
		"wx\u0003\n\u0005\u0000x\u007f\u0001\u0000\u0000\u0000yz\u0005\u0012\u0000"+
		"\u0000z{\u0003\u0004\u0002\u0000{|\u0003\n\u0005\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~m\u0001\u0000\u0000\u0000"+
		"~q\u0001\u0000\u0000\u0000~u\u0001\u0000\u0000\u0000~y\u0001\u0000\u0000"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u000b"+
		"\u0010$+8>BKVXk~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}