// Generated from /home/stini/univr/4anno/analisi_software/progetto/simpleLang/lang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class langLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, SKIP_CMD=5, LBRACE=6, RBRACE=7, LPAREN=8, 
		RPAREN=9, LSQUARE=10, RSQUARE=11, NDETCH=12, WHILE=13, IF=14, ELSE=15, 
		SEMICOLON=16, ASSIGN=17, TRUE=18, FALSE=19, AND=20, OR=21, EQ=22, NEQ=23, 
		GT=24, LT=25, GE=26, LE=27, ID=28, INT=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "SKIP_CMD", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "LSQUARE", "RSQUARE", "NDETCH", "WHILE", "IF", "ELSE", "SEMICOLON", 
			"ASSIGN", "TRUE", "FALSE", "AND", "OR", "EQ", "NEQ", "GT", "LT", "GE", 
			"LE", "ID", "INT", "WS"
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


	public langLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001e\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0004\u001b\u008f\b\u001b"+
		"\u000b\u001b\f\u001b\u0090\u0001\u001c\u0004\u001c\u0094\b\u001c\u000b"+
		"\u001c\f\u001c\u0095\u0001\u001d\u0004\u001d\u0099\b\u001d\u000b\u001d"+
		"\f\u001d\u009a\u0001\u001d\u0001\u001d\u0000\u0000\u001e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u00a0\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000"+
		"\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000"+
		"\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;"+
		"\u0001\u0000\u0000\u0000\u0001=\u0001\u0000\u0000\u0000\u0003?\u0001\u0000"+
		"\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000\u0000"+
		"\tE\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rL\u0001\u0000"+
		"\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000"+
		"\u0013R\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017V"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b_\u0001\u0000"+
		"\u0000\u0000\u001db\u0001\u0000\u0000\u0000\u001fg\u0001\u0000\u0000\u0000"+
		"!i\u0001\u0000\u0000\u0000#l\u0001\u0000\u0000\u0000%q\u0001\u0000\u0000"+
		"\u0000\'w\u0001\u0000\u0000\u0000){\u0001\u0000\u0000\u0000+~\u0001\u0000"+
		"\u0000\u0000-\u0080\u0001\u0000\u0000\u0000/\u0083\u0001\u0000\u0000\u0000"+
		"1\u0085\u0001\u0000\u0000\u00003\u0087\u0001\u0000\u0000\u00005\u008a"+
		"\u0001\u0000\u0000\u00007\u008e\u0001\u0000\u0000\u00009\u0093\u0001\u0000"+
		"\u0000\u0000;\u0098\u0001\u0000\u0000\u0000=>\u0005*\u0000\u0000>\u0002"+
		"\u0001\u0000\u0000\u0000?@\u0005/\u0000\u0000@\u0004\u0001\u0000\u0000"+
		"\u0000AB\u0005+\u0000\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005-\u0000"+
		"\u0000D\b\u0001\u0000\u0000\u0000EF\u0005s\u0000\u0000FG\u0005k\u0000"+
		"\u0000GH\u0005i\u0000\u0000HI\u0005p\u0000\u0000I\n\u0001\u0000\u0000"+
		"\u0000JK\u0005{\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005}\u0000"+
		"\u0000M\u000e\u0001\u0000\u0000\u0000NO\u0005(\u0000\u0000O\u0010\u0001"+
		"\u0000\u0000\u0000PQ\u0005)\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000"+
		"RS\u0005[\u0000\u0000S\u0014\u0001\u0000\u0000\u0000TU\u0005]\u0000\u0000"+
		"U\u0016\u0001\u0000\u0000\u0000VW\u0005|\u0000\u0000WX\u0005|\u0000\u0000"+
		"X\u0018\u0001\u0000\u0000\u0000YZ\u0005w\u0000\u0000Z[\u0005h\u0000\u0000"+
		"[\\\u0005i\u0000\u0000\\]\u0005l\u0000\u0000]^\u0005e\u0000\u0000^\u001a"+
		"\u0001\u0000\u0000\u0000_`\u0005i\u0000\u0000`a\u0005f\u0000\u0000a\u001c"+
		"\u0001\u0000\u0000\u0000bc\u0005e\u0000\u0000cd\u0005l\u0000\u0000de\u0005"+
		"s\u0000\u0000ef\u0005e\u0000\u0000f\u001e\u0001\u0000\u0000\u0000gh\u0005"+
		";\u0000\u0000h \u0001\u0000\u0000\u0000ij\u0005:\u0000\u0000jk\u0005="+
		"\u0000\u0000k\"\u0001\u0000\u0000\u0000lm\u0005t\u0000\u0000mn\u0005r"+
		"\u0000\u0000no\u0005u\u0000\u0000op\u0005e\u0000\u0000p$\u0001\u0000\u0000"+
		"\u0000qr\u0005f\u0000\u0000rs\u0005a\u0000\u0000st\u0005l\u0000\u0000"+
		"tu\u0005s\u0000\u0000uv\u0005e\u0000\u0000v&\u0001\u0000\u0000\u0000w"+
		"x\u0005a\u0000\u0000xy\u0005n\u0000\u0000yz\u0005d\u0000\u0000z(\u0001"+
		"\u0000\u0000\u0000{|\u0005o\u0000\u0000|}\u0005r\u0000\u0000}*\u0001\u0000"+
		"\u0000\u0000~\u007f\u0005=\u0000\u0000\u007f,\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005!\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082."+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005>\u0000\u0000\u00840\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005<\u0000\u0000\u00862\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005>\u0000\u0000\u0088\u0089\u0005=\u0000\u0000\u00894"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u008c\u0005"+
		"=\u0000\u0000\u008c6\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0000\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u00918\u0001\u0000\u0000\u0000\u0092\u0094\u0007\u0001\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096:\u0001\u0000\u0000\u0000\u0097\u0099\u0007\u0002\u0000\u0000\u0098"+
		"\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u001d\u0000\u0000\u009d"+
		"<\u0001\u0000\u0000\u0000\u0004\u0000\u0090\u0095\u009a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}