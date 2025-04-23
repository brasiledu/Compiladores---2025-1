// Generated from /Users/eduardovinicius/Compiladores---2025-1/timemania/src/TimemaniaLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TimemaniaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLAMENGO=1, CORINTHIANS=2, PALMEIRAS=3, SANTOS=4, START=5, END=6, SE=7, 
		ENTAO=8, SENAO=9, ENQUANTO=10, FACA=11, ESCREVA=12, LEIA=13, NUMBER=14, 
		ID=15, STRING=16, ASSIGN=17, DELIMITER=18, OPERATOR=19, PARENTESE=20, 
		CHAVE=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FLAMENGO", "CORINTHIANS", "PALMEIRAS", "SANTOS", "START", "END", "SE", 
			"ENTAO", "SENAO", "ENQUANTO", "FACA", "ESCREVA", "LEIA", "NUMBER", "ID", 
			"STRING", "ASSIGN", "DELIMITER", "OPERATOR", "PARENTESE", "CHAVE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'flamengo'", "'corinthians'", "'palmeiras'", "'santos'", "'start'", 
			"'end'", "'se'", "'entao'", "'senao'", "'enquanto'", "'faca'", "'escreva'", 
			"'leia'", null, null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLAMENGO", "CORINTHIANS", "PALMEIRAS", "SANTOS", "START", "END", 
			"SE", "ENTAO", "SENAO", "ENQUANTO", "FACA", "ESCREVA", "LEIA", "NUMBER", 
			"ID", "STRING", "ASSIGN", "DELIMITER", "OPERATOR", "PARENTESE", "CHAVE", 
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


	public TimemaniaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TimemaniaLexer.g4"; }

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
		"\u0004\u0000\u0016\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0004\r\u0089\b\r\u000b\r\f\r\u008a\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u008f\b\u000e\n\u000e\f\u000e\u0092\t\u000e\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0096\b\u000f\n\u000f\f\u000f\u0099\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0004\u0015\u00a9\b\u0015\u000b\u0015\f\u0015\u00aa\u0001\u0015\u0001"+
		"\u0015\u0001\u0097\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016\u0001\u0000\b\u0001\u000009\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0002\u0000,,;;\u0003\u0000*+--//\u0001\u0000()\u0002\u0000"+
		"{{}}\u0003\u0000\t\n\r\r  \u00b1\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-"+
		"\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005B\u0001\u0000"+
		"\u0000\u0000\u0007L\u0001\u0000\u0000\u0000\tS\u0001\u0000\u0000\u0000"+
		"\u000bY\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000\u0000\u000f`\u0001"+
		"\u0000\u0000\u0000\u0011f\u0001\u0000\u0000\u0000\u0013l\u0001\u0000\u0000"+
		"\u0000\u0015u\u0001\u0000\u0000\u0000\u0017z\u0001\u0000\u0000\u0000\u0019"+
		"\u0082\u0001\u0000\u0000\u0000\u001b\u0088\u0001\u0000\u0000\u0000\u001d"+
		"\u008c\u0001\u0000\u0000\u0000\u001f\u0093\u0001\u0000\u0000\u0000!\u009c"+
		"\u0001\u0000\u0000\u0000#\u009f\u0001\u0000\u0000\u0000%\u00a1\u0001\u0000"+
		"\u0000\u0000\'\u00a3\u0001\u0000\u0000\u0000)\u00a5\u0001\u0000\u0000"+
		"\u0000+\u00a8\u0001\u0000\u0000\u0000-.\u0005f\u0000\u0000./\u0005l\u0000"+
		"\u0000/0\u0005a\u0000\u000001\u0005m\u0000\u000012\u0005e\u0000\u0000"+
		"23\u0005n\u0000\u000034\u0005g\u0000\u000045\u0005o\u0000\u00005\u0002"+
		"\u0001\u0000\u0000\u000067\u0005c\u0000\u000078\u0005o\u0000\u000089\u0005"+
		"r\u0000\u00009:\u0005i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005t\u0000"+
		"\u0000<=\u0005h\u0000\u0000=>\u0005i\u0000\u0000>?\u0005a\u0000\u0000"+
		"?@\u0005n\u0000\u0000@A\u0005s\u0000\u0000A\u0004\u0001\u0000\u0000\u0000"+
		"BC\u0005p\u0000\u0000CD\u0005a\u0000\u0000DE\u0005l\u0000\u0000EF\u0005"+
		"m\u0000\u0000FG\u0005e\u0000\u0000GH\u0005i\u0000\u0000HI\u0005r\u0000"+
		"\u0000IJ\u0005a\u0000\u0000JK\u0005s\u0000\u0000K\u0006\u0001\u0000\u0000"+
		"\u0000LM\u0005s\u0000\u0000MN\u0005a\u0000\u0000NO\u0005n\u0000\u0000"+
		"OP\u0005t\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005s\u0000\u0000R\b\u0001"+
		"\u0000\u0000\u0000ST\u0005s\u0000\u0000TU\u0005t\u0000\u0000UV\u0005a"+
		"\u0000\u0000VW\u0005r\u0000\u0000WX\u0005t\u0000\u0000X\n\u0001\u0000"+
		"\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005n\u0000\u0000[\\\u0005d\u0000"+
		"\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005s\u0000\u0000^_\u0005e\u0000"+
		"\u0000_\u000e\u0001\u0000\u0000\u0000`a\u0005e\u0000\u0000ab\u0005n\u0000"+
		"\u0000bc\u0005t\u0000\u0000cd\u0005a\u0000\u0000de\u0005o\u0000\u0000"+
		"e\u0010\u0001\u0000\u0000\u0000fg\u0005s\u0000\u0000gh\u0005e\u0000\u0000"+
		"hi\u0005n\u0000\u0000ij\u0005a\u0000\u0000jk\u0005o\u0000\u0000k\u0012"+
		"\u0001\u0000\u0000\u0000lm\u0005e\u0000\u0000mn\u0005n\u0000\u0000no\u0005"+
		"q\u0000\u0000op\u0005u\u0000\u0000pq\u0005a\u0000\u0000qr\u0005n\u0000"+
		"\u0000rs\u0005t\u0000\u0000st\u0005o\u0000\u0000t\u0014\u0001\u0000\u0000"+
		"\u0000uv\u0005f\u0000\u0000vw\u0005a\u0000\u0000wx\u0005c\u0000\u0000"+
		"xy\u0005a\u0000\u0000y\u0016\u0001\u0000\u0000\u0000z{\u0005e\u0000\u0000"+
		"{|\u0005s\u0000\u0000|}\u0005c\u0000\u0000}~\u0005r\u0000\u0000~\u007f"+
		"\u0005e\u0000\u0000\u007f\u0080\u0005v\u0000\u0000\u0080\u0081\u0005a"+
		"\u0000\u0000\u0081\u0018\u0001\u0000\u0000\u0000\u0082\u0083\u0005l\u0000"+
		"\u0000\u0083\u0084\u0005e\u0000\u0000\u0084\u0085\u0005i\u0000\u0000\u0085"+
		"\u0086\u0005a\u0000\u0000\u0086\u001a\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0007\u0000\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u001c\u0001\u0000\u0000\u0000\u008c\u0090"+
		"\u0007\u0001\u0000\u0000\u008d\u008f\u0007\u0002\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u001e"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0097"+
		"\u0005\"\u0000\u0000\u0094\u0096\t\u0000\u0000\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009a\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\"\u0000\u0000\u009b \u0001\u0000\u0000\u0000\u009c\u009d\u0005:\u0000"+
		"\u0000\u009d\u009e\u0005=\u0000\u0000\u009e\"\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0007\u0003\u0000\u0000\u00a0$\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0007\u0004\u0000\u0000\u00a2&\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0007\u0005\u0000\u0000\u00a4(\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007"+
		"\u0006\u0000\u0000\u00a6*\u0001\u0000\u0000\u0000\u00a7\u00a9\u0007\u0007"+
		"\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0015"+
		"\u0000\u0000\u00ad,\u0001\u0000\u0000\u0000\u0005\u0000\u008a\u0090\u0097"+
		"\u00aa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}