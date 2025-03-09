// Generated from /home/stini/univr/4anno/analisi_software/progetto/simpleLang/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class langParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SKIP_CMD=5, LBRACE=6, RBRACE=7, LPAREN=8, 
		RPAREN=9, LSQUARE=10, RSQUARE=11, NDETCH=12, WHILE=13, IF=14, ELSE=15, 
		SEMICOLON=16, ASSIGN=17, TRUE=18, FALSE=19, AND=20, OR=21, EQ=22, NEQ=23, 
		GT=24, LT=25, GE=26, LE=27, ID=28, INT=29, WS=30;
	public static final int
		RULE_prog = 0, RULE_com = 1, RULE_elseTail = 2, RULE_exp = 3, RULE_aExp = 4, 
		RULE_bExp = 5, RULE_bExp_tail = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "com", "elseTail", "exp", "aExp", "bExp", "bExp_tail"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'skip'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'||'", "'while'", "'if'", "'else'", "';'", "':='", "'true'", 
			"'false'", "'and'", "'or'", "'='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "SKIP_CMD", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "LSQUARE", "RSQUARE", "NDETCH", "WHILE", "IF", "ELSE", "SEMICOLON", 
			"ASSIGN", "TRUE", "FALSE", "AND", "OR", "EQ", "NEQ", "GT", "LT", "GE", 
			"LE", "ID", "INT", "WS"
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
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public langParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public TerminalNode EOF() { return getToken(langParser.EOF, 0); }
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
			if ( listener instanceof langListener ) ((langListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(LBRACE);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268460064L) != 0)) {
				{
				{
				setState(15);
				com();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(21);
			match(RBRACE);
			setState(22);
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
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(langParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public AssignmentContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitAssignment(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComContext {
		public TerminalNode SKIP_CMD() { return getToken(langParser.SKIP_CMD, 0); }
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public SkipContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitSkip(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ComContext {
		public TerminalNode WHILE() { return getToken(langParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(langParser.LPAREN, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public WhileLoopContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitWhileLoop(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ComContext {
		public TerminalNode IF() { return getToken(langParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(langParser.LPAREN, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public ElseTailContext elseTail() {
			return getRuleContext(ElseTailContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(langParser.SEMICOLON, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitIf(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(ID);
				setState(25);
				match(ASSIGN);
				setState(26);
				exp();
				setState(27);
				match(SEMICOLON);
				}
				break;
			case SKIP_CMD:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(SKIP_CMD);
				setState(30);
				match(SEMICOLON);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(IF);
				setState(32);
				match(LPAREN);
				setState(33);
				bExp();
				setState(34);
				match(RPAREN);
				setState(35);
				match(LBRACE);
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268460064L) != 0)) {
					{
					{
					setState(36);
					com();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				match(RBRACE);
				setState(43);
				elseTail();
				setState(44);
				match(SEMICOLON);
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(WHILE);
				setState(47);
				match(LPAREN);
				setState(48);
				bExp();
				setState(49);
				match(RPAREN);
				setState(50);
				match(LBRACE);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268460064L) != 0)) {
					{
					{
					setState(51);
					com();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(RBRACE);
				setState(58);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class ElseTailContext extends ParserRuleContext {
		public ElseTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseTail; }
	 
		public ElseTailContext() { }
		public void copyFrom(ElseTailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseTailEmptyContext extends ElseTailContext {
		public IfElseTailEmptyContext(ElseTailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterIfElseTailEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitIfElseTailEmpty(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseIfTailContext extends ElseTailContext {
		public TerminalNode ELSE() { return getToken(langParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(langParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(langParser.LPAREN, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public ElseTailContext elseTail() {
			return getRuleContext(ElseTailContext.class,0);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public IfElseIfTailContext(ElseTailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterIfElseIfTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitIfElseIfTail(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseTailContext extends ElseTailContext {
		public TerminalNode ELSE() { return getToken(langParser.ELSE, 0); }
		public TerminalNode LBRACE() { return getToken(langParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(langParser.RBRACE, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public IfElseTailContext(ElseTailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterIfElseTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitIfElseTail(this);
		}
	}

	public final ElseTailContext elseTail() throws RecognitionException {
		ElseTailContext _localctx = new ElseTailContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elseTail);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IfElseTailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(ELSE);
				setState(63);
				match(LBRACE);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268460064L) != 0)) {
					{
					{
					setState(64);
					com();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new IfElseIfTailContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(ELSE);
				setState(72);
				match(IF);
				setState(73);
				match(LPAREN);
				setState(74);
				bExp();
				setState(75);
				match(RPAREN);
				setState(76);
				match(LBRACE);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268460064L) != 0)) {
					{
					{
					setState(77);
					com();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(RBRACE);
				setState(84);
				elseTail();
				}
				break;
			case 3:
				_localctx = new IfElseTailEmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
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
			if ( listener instanceof langListener ) ((langListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				aExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
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
		public TerminalNode INT() { return getToken(langParser.INT, 0); }
		public IntegerContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitInteger(this);
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
			if ( listener instanceof langListener ) ((langListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitMultiplication(this);
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
			if ( listener instanceof langListener ) ((langListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitAddition(this);
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
			if ( listener instanceof langListener ) ((langListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitSubtraction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticVariableContext extends AExpContext {
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public ArithmeticVariableContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterArithmeticVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitArithmeticVariable(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AParenthesisContext extends AExpContext {
		public TerminalNode LPAREN() { return getToken(langParser.LPAREN, 0); }
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langParser.RPAREN, 0); }
		public AParenthesisContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterAParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitAParenthesis(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends AExpContext {
		public List<AExpContext> aExp() {
			return getRuleContexts(AExpContext.class);
		}
		public AExpContext aExp(int i) {
			return getRuleContext(AExpContext.class,i);
		}
		public DivisionContext(AExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitDivision(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_aExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new AParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(94);
				match(LPAREN);
				setState(95);
				aExp(0);
				setState(96);
				match(RPAREN);
				}
				break;
			case INT:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new ArithmeticVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new AExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aExp);
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						match(T__0);
						setState(104);
						aExp(8);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new AExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aExp);
						setState(105);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(106);
						match(T__1);
						setState(107);
						aExp(7);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new AExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aExp);
						setState(108);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(109);
						match(T__2);
						setState(110);
						aExp(6);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new AExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aExp);
						setState(111);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(112);
						match(T__3);
						setState(113);
						aExp(5);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode ID() { return getToken(langParser.ID, 0); }
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(langParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(langParser.FALSE, 0); }
		public AExpContext aExp() {
			return getRuleContext(AExpContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(langParser.LPAREN, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(langParser.RPAREN, 0); }
		public BExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterBExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitBExp(this);
		}
	}

	public final BExpContext bExp() throws RecognitionException {
		BExpContext _localctx = new BExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bExp);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(ID);
				setState(121);
				bExp_tail();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(TRUE);
				setState(123);
				bExp_tail();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(FALSE);
				setState(125);
				bExp_tail();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				aExp(0);
				setState(127);
				bExp_tail();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(LPAREN);
				setState(130);
				bExp();
				setState(131);
				match(RPAREN);
				setState(132);
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
		public TerminalNode EQ() { return getToken(langParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BExp_tailContext bExp_tail() {
			return getRuleContext(BExp_tailContext.class,0);
		}
		public TerminalNode NEQ() { return getToken(langParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(langParser.GT, 0); }
		public TerminalNode LT() { return getToken(langParser.LT, 0); }
		public TerminalNode AND() { return getToken(langParser.AND, 0); }
		public BExp_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExp_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).enterBExp_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof langListener ) ((langListener)listener).exitBExp_tail(this);
		}
	}

	public final BExp_tailContext bExp_tail() throws RecognitionException {
		BExp_tailContext _localctx = new BExp_tailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bExp_tail);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(EQ);
				setState(137);
				exp();
				setState(138);
				bExp_tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(NEQ);
				setState(141);
				exp();
				setState(142);
				bExp_tail();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(GT);
				setState(145);
				exp();
				setState(146);
				bExp_tail();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(LT);
				setState(149);
				exp();
				setState(150);
				bExp_tail();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(AND);
				setState(153);
				exp();
				setState(154);
				bExp_tail();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
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
		case 4:
			return aExp_sempred((AExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean aExp_sempred(AExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00015\b"+
		"\u0001\n\u0001\f\u00018\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001=\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002B\b\u0002"+
		"\n\u0002\f\u0002E\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002"+
		"\n\u0002\f\u0002R\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002X\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\\\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004s\b\u0004\n\u0004\f\u0004v\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0087\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009e\b\u0006\u0001\u0006\u0000"+
		"\u0001\b\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000\u00b3\u0000\u000e"+
		"\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004W\u0001\u0000"+
		"\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000"+
		"\n\u0086\u0001\u0000\u0000\u0000\f\u009d\u0001\u0000\u0000\u0000\u000e"+
		"\u0012\u0005\u0006\u0000\u0000\u000f\u0011\u0003\u0002\u0001\u0000\u0010"+
		"\u000f\u0001\u0000\u0000\u0000\u0011\u0014\u0001\u0000\u0000\u0000\u0012"+
		"\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0015\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0015"+
		"\u0016\u0005\u0007\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017"+
		"\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u001c\u0000\u0000\u0019"+
		"\u001a\u0005\u0011\u0000\u0000\u001a\u001b\u0003\u0006\u0003\u0000\u001b"+
		"\u001c\u0005\u0010\u0000\u0000\u001c=\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0005\u0005\u0000\u0000\u001e=\u0005\u0010\u0000\u0000\u001f \u0005\u000e"+
		"\u0000\u0000 !\u0005\b\u0000\u0000!\"\u0003\n\u0005\u0000\"#\u0005\t\u0000"+
		"\u0000#\'\u0005\u0006\u0000\u0000$&\u0003\u0002\u0001\u0000%$\u0001\u0000"+
		"\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0007\u0000\u0000+,\u0003\u0004\u0002\u0000,-\u0005\u0010\u0000"+
		"\u0000-=\u0001\u0000\u0000\u0000./\u0005\r\u0000\u0000/0\u0005\b\u0000"+
		"\u000001\u0003\n\u0005\u000012\u0005\t\u0000\u000026\u0005\u0006\u0000"+
		"\u000035\u0003\u0002\u0001\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0007\u0000\u0000"+
		":;\u0005\u0010\u0000\u0000;=\u0001\u0000\u0000\u0000<\u0018\u0001\u0000"+
		"\u0000\u0000<\u001d\u0001\u0000\u0000\u0000<\u001f\u0001\u0000\u0000\u0000"+
		"<.\u0001\u0000\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>?\u0005\u000f"+
		"\u0000\u0000?C\u0005\u0006\u0000\u0000@B\u0003\u0002\u0001\u0000A@\u0001"+
		"\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000FX\u0005\u0007\u0000\u0000GH\u0005\u000f\u0000\u0000HI\u0005\u000e"+
		"\u0000\u0000IJ\u0005\b\u0000\u0000JK\u0003\n\u0005\u0000KL\u0005\t\u0000"+
		"\u0000LP\u0005\u0006\u0000\u0000MO\u0003\u0002\u0001\u0000NM\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"ST\u0005\u0007\u0000\u0000TU\u0003\u0004\u0002\u0000UX\u0001\u0000\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000W>\u0001\u0000\u0000\u0000WG\u0001\u0000"+
		"\u0000\u0000WV\u0001\u0000\u0000\u0000X\u0005\u0001\u0000\u0000\u0000"+
		"Y\\\u0003\b\u0004\u0000Z\\\u0003\n\u0005\u0000[Y\u0001\u0000\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\\u0007\u0001\u0000\u0000\u0000]^\u0006\u0004"+
		"\uffff\uffff\u0000^_\u0005\b\u0000\u0000_`\u0003\b\u0004\u0000`a\u0005"+
		"\t\u0000\u0000ae\u0001\u0000\u0000\u0000be\u0005\u001d\u0000\u0000ce\u0005"+
		"\u001c\u0000\u0000d]\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"dc\u0001\u0000\u0000\u0000et\u0001\u0000\u0000\u0000fg\n\u0007\u0000\u0000"+
		"gh\u0005\u0001\u0000\u0000hs\u0003\b\u0004\bij\n\u0006\u0000\u0000jk\u0005"+
		"\u0002\u0000\u0000ks\u0003\b\u0004\u0007lm\n\u0005\u0000\u0000mn\u0005"+
		"\u0003\u0000\u0000ns\u0003\b\u0004\u0006op\n\u0004\u0000\u0000pq\u0005"+
		"\u0004\u0000\u0000qs\u0003\b\u0004\u0005rf\u0001\u0000\u0000\u0000ri\u0001"+
		"\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000u\t\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w\u0087\u0001"+
		"\u0000\u0000\u0000xy\u0005\u001c\u0000\u0000y\u0087\u0003\f\u0006\u0000"+
		"z{\u0005\u0012\u0000\u0000{\u0087\u0003\f\u0006\u0000|}\u0005\u0013\u0000"+
		"\u0000}\u0087\u0003\f\u0006\u0000~\u007f\u0003\b\u0004\u0000\u007f\u0080"+
		"\u0003\f\u0006\u0000\u0080\u0087\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\b\u0000\u0000\u0082\u0083\u0003\n\u0005\u0000\u0083\u0084\u0005\t\u0000"+
		"\u0000\u0084\u0085\u0003\f\u0006\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086w\u0001\u0000\u0000\u0000\u0086x\u0001\u0000\u0000\u0000\u0086z"+
		"\u0001\u0000\u0000\u0000\u0086|\u0001\u0000\u0000\u0000\u0086~\u0001\u0000"+
		"\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0087\u000b\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\u0016\u0000\u0000\u0089\u008a\u0003\u0006"+
		"\u0003\u0000\u008a\u008b\u0003\f\u0006\u0000\u008b\u009e\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u0017\u0000\u0000\u008d\u008e\u0003\u0006\u0003"+
		"\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f\u009e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005\u0018\u0000\u0000\u0091\u0092\u0003\u0006\u0003\u0000"+
		"\u0092\u0093\u0003\f\u0006\u0000\u0093\u009e\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005\u0019\u0000\u0000\u0095\u0096\u0003\u0006\u0003\u0000\u0096"+
		"\u0097\u0003\f\u0006\u0000\u0097\u009e\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\u0014\u0000\u0000\u0099\u009a\u0003\u0006\u0003\u0000\u009a\u009b"+
		"\u0003\f\u0006\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009e\u0001"+
		"\u0000\u0000\u0000\u009d\u0088\u0001\u0000\u0000\u0000\u009d\u008c\u0001"+
		"\u0000\u0000\u0000\u009d\u0090\u0001\u0000\u0000\u0000\u009d\u0094\u0001"+
		"\u0000\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\r\u0001\u0000\u0000\u0000\r\u0012\'6<CPW[drt"+
		"\u0086\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}