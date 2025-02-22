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
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SKIP_CMD=4, LBRACE=5, RBRACE=6, LPAREN=7, RPAREN=8, 
		LSQUARE=9, RSQUARE=10, NDETCH=11, WHILE=12, SEMICOLON=13, ASSIGN=14, TRUE=15, 
		FALSE=16, NOT=17, AND=18, OR=19, EQ=20, GT=21, LT=22, GE=23, LE=24, VAR=25, 
		INT=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "SKIP_CMD", "LBRACE", "RBRACE", "LPAREN", "RPAREN", 
			"LSQUARE", "RSQUARE", "NDETCH", "WHILE", "SEMICOLON", "ASSIGN", "TRUE", 
			"FALSE", "NOT", "AND", "OR", "EQ", "GT", "LT", "GE", "LE", "VAR", "INT", 
			"WS"
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


	public testLexer(CharStream input) {
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
		"\u0004\u0000\u001b\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0004\u0018\u0080\b\u0018\u000b\u0018\f\u0018"+
		"\u0081\u0001\u0019\u0004\u0019\u0085\b\u0019\u000b\u0019\f\u0019\u0086"+
		"\u0001\u001a\u0004\u001a\u008a\b\u001a\u000b\u001a\f\u001a\u008b\u0001"+
		"\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001"+
		"\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0091"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000"+
		"\u00039\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007="+
		"\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000\u0000\u000bD\u0001\u0000"+
		"\u0000\u0000\rF\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000"+
		"\u0011J\u0001\u0000\u0000\u0000\u0013L\u0001\u0000\u0000\u0000\u0015N"+
		"\u0001\u0000\u0000\u0000\u0017Q\u0001\u0000\u0000\u0000\u0019W\u0001\u0000"+
		"\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001d\\\u0001\u0000\u0000"+
		"\u0000\u001fa\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000\u0000#k\u0001"+
		"\u0000\u0000\u0000%o\u0001\u0000\u0000\u0000\'r\u0001\u0000\u0000\u0000"+
		")t\u0001\u0000\u0000\u0000+v\u0001\u0000\u0000\u0000-x\u0001\u0000\u0000"+
		"\u0000/{\u0001\u0000\u0000\u00001\u007f\u0001\u0000\u0000\u00003\u0084"+
		"\u0001\u0000\u0000\u00005\u0089\u0001\u0000\u0000\u000078\u0005+\u0000"+
		"\u00008\u0002\u0001\u0000\u0000\u00009:\u0005-\u0000\u0000:\u0004\u0001"+
		"\u0000\u0000\u0000;<\u0005*\u0000\u0000<\u0006\u0001\u0000\u0000\u0000"+
		"=>\u0005s\u0000\u0000>?\u0005k\u0000\u0000?@\u0005i\u0000\u0000@A\u0005"+
		"p\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005{\u0000\u0000C\n\u0001"+
		"\u0000\u0000\u0000DE\u0005}\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005"+
		"(\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005)\u0000\u0000I\u0010"+
		"\u0001\u0000\u0000\u0000JK\u0005[\u0000\u0000K\u0012\u0001\u0000\u0000"+
		"\u0000LM\u0005]\u0000\u0000M\u0014\u0001\u0000\u0000\u0000NO\u0005|\u0000"+
		"\u0000OP\u0005|\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QR\u0005w\u0000"+
		"\u0000RS\u0005h\u0000\u0000ST\u0005i\u0000\u0000TU\u0005l\u0000\u0000"+
		"UV\u0005e\u0000\u0000V\u0018\u0001\u0000\u0000\u0000WX\u0005;\u0000\u0000"+
		"X\u001a\u0001\u0000\u0000\u0000YZ\u0005:\u0000\u0000Z[\u0005=\u0000\u0000"+
		"[\u001c\u0001\u0000\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005r\u0000\u0000"+
		"^_\u0005u\u0000\u0000_`\u0005e\u0000\u0000`\u001e\u0001\u0000\u0000\u0000"+
		"ab\u0005f\u0000\u0000bc\u0005a\u0000\u0000cd\u0005l\u0000\u0000de\u0005"+
		"s\u0000\u0000ef\u0005e\u0000\u0000f \u0001\u0000\u0000\u0000gh\u0005n"+
		"\u0000\u0000hi\u0005o\u0000\u0000ij\u0005t\u0000\u0000j\"\u0001\u0000"+
		"\u0000\u0000kl\u0005a\u0000\u0000lm\u0005n\u0000\u0000mn\u0005d\u0000"+
		"\u0000n$\u0001\u0000\u0000\u0000op\u0005o\u0000\u0000pq\u0005r\u0000\u0000"+
		"q&\u0001\u0000\u0000\u0000rs\u0005=\u0000\u0000s(\u0001\u0000\u0000\u0000"+
		"tu\u0005>\u0000\u0000u*\u0001\u0000\u0000\u0000vw\u0005<\u0000\u0000w"+
		",\u0001\u0000\u0000\u0000xy\u0005>\u0000\u0000yz\u0005=\u0000\u0000z."+
		"\u0001\u0000\u0000\u0000{|\u0005<\u0000\u0000|}\u0005=\u0000\u0000}0\u0001"+
		"\u0000\u0000\u0000~\u0080\u0007\u0000\u0000\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u00822\u0001\u0000\u0000\u0000"+
		"\u0083\u0085\u0007\u0001\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0001\u0000\u0000\u0000\u00874\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0007\u0002\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0006\u001a\u0000\u0000\u008e6\u0001\u0000\u0000\u0000\u0004\u0000"+
		"\u0081\u0086\u008b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}