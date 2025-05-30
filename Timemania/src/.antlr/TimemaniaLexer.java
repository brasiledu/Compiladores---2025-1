// Generated from /Users/eduardovinicius/Compiladores---2025-1/Timemania/src/TimemaniaLexer.g4 by ANTLR 4.13.1
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
		START=1, END=2, CONST=3, TIPO=4, VAR=5, FUNCAO=6, PROCEDIMENTO=7, RETORNA=8, 
		SE=9, ENTAO=10, SENAO=11, ENQUANTO=12, FACA=13, PARA=14, ATE=15, REPITA=16, 
		DE=17, INTEIRO=18, TEXTO=19, BOOLEANO=20, OR=21, AND=22, NOT=23, COMPARADOR=24, 
		OPERADOR_ARITMETICO=25, ASSIGN=26, CONCATENAR=27, DELIMITER=28, DOISPONTOS=29, 
		VIRGULA=30, PONTO=31, ABRE_PARENTESE=32, FECHA_PARENTESE=33, ABRE_CHAVE=34, 
		FECHA_CHAVE=35, ABRE_COLCHETE=36, FECHA_COLCHETE=37, ID=38, NUMBER=39, 
		STRING=40, WS=41, LINE_COMMENT=42, BLOCK_COMMENT=43, ESCREVA=44, ESCREVA_SEM_QUEBRA=45, 
		LEIA=46, CRIAR_VETOR=47, TAMANHO=48, REGISTRO=49, VASCO=50, FLAMENGO=51, 
		CORINTHIANS=52, PALMEIRAS=53, SANTOS=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"START", "END", "CONST", "TIPO", "VAR", "FUNCAO", "PROCEDIMENTO", "RETORNA", 
			"SE", "ENTAO", "SENAO", "ENQUANTO", "FACA", "PARA", "ATE", "REPITA", 
			"DE", "INTEIRO", "TEXTO", "BOOLEANO", "OR", "AND", "NOT", "COMPARADOR", 
			"OPERADOR_ARITMETICO", "ASSIGN", "CONCATENAR", "DELIMITER", "DOISPONTOS", 
			"VIRGULA", "PONTO", "ABRE_PARENTESE", "FECHA_PARENTESE", "ABRE_CHAVE", 
			"FECHA_CHAVE", "ABRE_COLCHETE", "FECHA_COLCHETE", "ID", "NUMBER", "STRING", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT", "ESCREVA", "ESCREVA_SEM_QUEBRA", 
			"LEIA", "CRIAR_VETOR", "TAMANHO", "REGISTRO", "VASCO", "FLAMENGO", "CORINTHIANS", 
			"PALMEIRAS", "SANTOS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'end'", "'const'", "'tipo'", "'var'", "'funcao'", "'procedimento'", 
			"'retorna'", "'se'", "'entao'", "'senao'", "'enquanto'", "'faca'", "'para'", 
			"'ate'", "'repita'", "'de'", "'inteiro'", "'texto'", "'booleano'", "'ou'", 
			"'e'", "'nao'", null, null, "':='", "'++'", "';'", "':'", "','", "'.'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", null, null, null, null, null, 
			null, "'escreva'", "'escreva_s'", "'leia'", "'vetor'", "'tamanho'", "'registro'", 
			"'vasco'", "'flamengo'", "'corinthians'", "'palmeiras'", "'santos'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "END", "CONST", "TIPO", "VAR", "FUNCAO", "PROCEDIMENTO", 
			"RETORNA", "SE", "ENTAO", "SENAO", "ENQUANTO", "FACA", "PARA", "ATE", 
			"REPITA", "DE", "INTEIRO", "TEXTO", "BOOLEANO", "OR", "AND", "NOT", "COMPARADOR", 
			"OPERADOR_ARITMETICO", "ASSIGN", "CONCATENAR", "DELIMITER", "DOISPONTOS", 
			"VIRGULA", "PONTO", "ABRE_PARENTESE", "FECHA_PARENTESE", "ABRE_CHAVE", 
			"FECHA_CHAVE", "ABRE_COLCHETE", "FECHA_COLCHETE", "ID", "NUMBER", "STRING", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT", "ESCREVA", "ESCREVA_SEM_QUEBRA", 
			"LEIA", "CRIAR_VETOR", "TAMANHO", "REGISTRO", "VASCO", "FLAMENGO", "CORINTHIANS", 
			"PALMEIRAS", "SANTOS"
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
		"\u0004\u00006\u01a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00fc\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0005"+
		"%\u011c\b%\n%\f%\u011f\t%\u0001&\u0004&\u0122\b&\u000b&\f&\u0123\u0001"+
		"\'\u0001\'\u0005\'\u0128\b\'\n\'\f\'\u012b\t\'\u0001\'\u0001\'\u0001("+
		"\u0004(\u0130\b(\u000b(\f(\u0131\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u013a\b)\n)\f)\u013d\t)\u0001)\u0001)\u0001*\u0001*\u0003*\u0143"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u0000\u00006\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e"+
		"3g4i5k6\u0001\u0000\b\u0002\u0000<<>>\u0004\u0000%%*+--//\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0001\u000009\u0005\u0000\n\n\r\r\"\"\'\'\\"+
		"\\\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u01ac\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001"+
		"\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000"+
		"\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000"+
		"i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0001m\u0001"+
		"\u0000\u0000\u0000\u0003s\u0001\u0000\u0000\u0000\u0005w\u0001\u0000\u0000"+
		"\u0000\u0007}\u0001\u0000\u0000\u0000\t\u0082\u0001\u0000\u0000\u0000"+
		"\u000b\u0086\u0001\u0000\u0000\u0000\r\u008d\u0001\u0000\u0000\u0000\u000f"+
		"\u009a\u0001\u0000\u0000\u0000\u0011\u00a2\u0001\u0000\u0000\u0000\u0013"+
		"\u00a5\u0001\u0000\u0000\u0000\u0015\u00ab\u0001\u0000\u0000\u0000\u0017"+
		"\u00b1\u0001\u0000\u0000\u0000\u0019\u00ba\u0001\u0000\u0000\u0000\u001b"+
		"\u00bf\u0001\u0000\u0000\u0000\u001d\u00c4\u0001\u0000\u0000\u0000\u001f"+
		"\u00c8\u0001\u0000\u0000\u0000!\u00cf\u0001\u0000\u0000\u0000#\u00d2\u0001"+
		"\u0000\u0000\u0000%\u00da\u0001\u0000\u0000\u0000\'\u00e0\u0001\u0000"+
		"\u0000\u0000)\u00e9\u0001\u0000\u0000\u0000+\u00ec\u0001\u0000\u0000\u0000"+
		"-\u00ee\u0001\u0000\u0000\u0000/\u00fb\u0001\u0000\u0000\u00001\u00fd"+
		"\u0001\u0000\u0000\u00003\u00ff\u0001\u0000\u0000\u00005\u0102\u0001\u0000"+
		"\u0000\u00007\u0105\u0001\u0000\u0000\u00009\u0107\u0001\u0000\u0000\u0000"+
		";\u0109\u0001\u0000\u0000\u0000=\u010b\u0001\u0000\u0000\u0000?\u010d"+
		"\u0001\u0000\u0000\u0000A\u010f\u0001\u0000\u0000\u0000C\u0111\u0001\u0000"+
		"\u0000\u0000E\u0113\u0001\u0000\u0000\u0000G\u0115\u0001\u0000\u0000\u0000"+
		"I\u0117\u0001\u0000\u0000\u0000K\u0119\u0001\u0000\u0000\u0000M\u0121"+
		"\u0001\u0000\u0000\u0000O\u0125\u0001\u0000\u0000\u0000Q\u012f\u0001\u0000"+
		"\u0000\u0000S\u0135\u0001\u0000\u0000\u0000U\u0140\u0001\u0000\u0000\u0000"+
		"W\u0149\u0001\u0000\u0000\u0000Y\u0151\u0001\u0000\u0000\u0000[\u015b"+
		"\u0001\u0000\u0000\u0000]\u0160\u0001\u0000\u0000\u0000_\u0166\u0001\u0000"+
		"\u0000\u0000a\u016e\u0001\u0000\u0000\u0000c\u0177\u0001\u0000\u0000\u0000"+
		"e\u017d\u0001\u0000\u0000\u0000g\u0186\u0001\u0000\u0000\u0000i\u0192"+
		"\u0001\u0000\u0000\u0000k\u019c\u0001\u0000\u0000\u0000mn\u0005s\u0000"+
		"\u0000no\u0005t\u0000\u0000op\u0005a\u0000\u0000pq\u0005r\u0000\u0000"+
		"qr\u0005t\u0000\u0000r\u0002\u0001\u0000\u0000\u0000st\u0005e\u0000\u0000"+
		"tu\u0005n\u0000\u0000uv\u0005d\u0000\u0000v\u0004\u0001\u0000\u0000\u0000"+
		"wx\u0005c\u0000\u0000xy\u0005o\u0000\u0000yz\u0005n\u0000\u0000z{\u0005"+
		"s\u0000\u0000{|\u0005t\u0000\u0000|\u0006\u0001\u0000\u0000\u0000}~\u0005"+
		"t\u0000\u0000~\u007f\u0005i\u0000\u0000\u007f\u0080\u0005p\u0000\u0000"+
		"\u0080\u0081\u0005o\u0000\u0000\u0081\b\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005v\u0000\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005"+
		"r\u0000\u0000\u0085\n\u0001\u0000\u0000\u0000\u0086\u0087\u0005f\u0000"+
		"\u0000\u0087\u0088\u0005u\u0000\u0000\u0088\u0089\u0005n\u0000\u0000\u0089"+
		"\u008a\u0005c\u0000\u0000\u008a\u008b\u0005a\u0000\u0000\u008b\u008c\u0005"+
		"o\u0000\u0000\u008c\f\u0001\u0000\u0000\u0000\u008d\u008e\u0005p\u0000"+
		"\u0000\u008e\u008f\u0005r\u0000\u0000\u008f\u0090\u0005o\u0000\u0000\u0090"+
		"\u0091\u0005c\u0000\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u0093\u0005"+
		"d\u0000\u0000\u0093\u0094\u0005i\u0000\u0000\u0094\u0095\u0005m\u0000"+
		"\u0000\u0095\u0096\u0005e\u0000\u0000\u0096\u0097\u0005n\u0000\u0000\u0097"+
		"\u0098\u0005t\u0000\u0000\u0098\u0099\u0005o\u0000\u0000\u0099\u000e\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005r\u0000\u0000\u009b\u009c\u0005e\u0000"+
		"\u0000\u009c\u009d\u0005t\u0000\u0000\u009d\u009e\u0005o\u0000\u0000\u009e"+
		"\u009f\u0005r\u0000\u0000\u009f\u00a0\u0005n\u0000\u0000\u00a0\u00a1\u0005"+
		"a\u0000\u0000\u00a1\u0010\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005s\u0000"+
		"\u0000\u00a3\u00a4\u0005e\u0000\u0000\u00a4\u0012\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u00a7\u0005n\u0000\u0000\u00a7\u00a8"+
		"\u0005t\u0000\u0000\u00a8\u00a9\u0005a\u0000\u0000\u00a9\u00aa\u0005o"+
		"\u0000\u0000\u00aa\u0014\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005s\u0000"+
		"\u0000\u00ac\u00ad\u0005e\u0000\u0000\u00ad\u00ae\u0005n\u0000\u0000\u00ae"+
		"\u00af\u0005a\u0000\u0000\u00af\u00b0\u0005o\u0000\u0000\u00b0\u0016\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005e\u0000\u0000\u00b2\u00b3\u0005n\u0000"+
		"\u0000\u00b3\u00b4\u0005q\u0000\u0000\u00b4\u00b5\u0005u\u0000\u0000\u00b5"+
		"\u00b6\u0005a\u0000\u0000\u00b6\u00b7\u0005n\u0000\u0000\u00b7\u00b8\u0005"+
		"t\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000\u00b9\u0018\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005f\u0000\u0000\u00bb\u00bc\u0005a\u0000\u0000\u00bc"+
		"\u00bd\u0005c\u0000\u0000\u00bd\u00be\u0005a\u0000\u0000\u00be\u001a\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0005p\u0000\u0000\u00c0\u00c1\u0005a\u0000"+
		"\u0000\u00c1\u00c2\u0005r\u0000\u0000\u00c2\u00c3\u0005a\u0000\u0000\u00c3"+
		"\u001c\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005a\u0000\u0000\u00c5\u00c6"+
		"\u0005t\u0000\u0000\u00c6\u00c7\u0005e\u0000\u0000\u00c7\u001e\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005r\u0000\u0000\u00c9\u00ca\u0005e\u0000\u0000"+
		"\u00ca\u00cb\u0005p\u0000\u0000\u00cb\u00cc\u0005i\u0000\u0000\u00cc\u00cd"+
		"\u0005t\u0000\u0000\u00cd\u00ce\u0005a\u0000\u0000\u00ce \u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005d\u0000\u0000\u00d0\u00d1\u0005e\u0000\u0000"+
		"\u00d1\"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005i\u0000\u0000\u00d3"+
		"\u00d4\u0005n\u0000\u0000\u00d4\u00d5\u0005t\u0000\u0000\u00d5\u00d6\u0005"+
		"e\u0000\u0000\u00d6\u00d7\u0005i\u0000\u0000\u00d7\u00d8\u0005r\u0000"+
		"\u0000\u00d8\u00d9\u0005o\u0000\u0000\u00d9$\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005t\u0000\u0000\u00db\u00dc\u0005e\u0000\u0000\u00dc\u00dd\u0005"+
		"x\u0000\u0000\u00dd\u00de\u0005t\u0000\u0000\u00de\u00df\u0005o\u0000"+
		"\u0000\u00df&\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005b\u0000\u0000\u00e1"+
		"\u00e2\u0005o\u0000\u0000\u00e2\u00e3\u0005o\u0000\u0000\u00e3\u00e4\u0005"+
		"l\u0000\u0000\u00e4\u00e5\u0005e\u0000\u0000\u00e5\u00e6\u0005a\u0000"+
		"\u0000\u00e6\u00e7\u0005n\u0000\u0000\u00e7\u00e8\u0005o\u0000\u0000\u00e8"+
		"(\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005o\u0000\u0000\u00ea\u00eb\u0005"+
		"u\u0000\u0000\u00eb*\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005e\u0000"+
		"\u0000\u00ed,\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005n\u0000\u0000\u00ef"+
		"\u00f0\u0005a\u0000\u0000\u00f0\u00f1\u0005o\u0000\u0000\u00f1.\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0005=\u0000\u0000\u00f3\u00fc\u0005=\u0000"+
		"\u0000\u00f4\u00f5\u0005!\u0000\u0000\u00f5\u00fc\u0005=\u0000\u0000\u00f6"+
		"\u00f7\u0005>\u0000\u0000\u00f7\u00fc\u0005=\u0000\u0000\u00f8\u00f9\u0005"+
		"<\u0000\u0000\u00f9\u00fc\u0005=\u0000\u0000\u00fa\u00fc\u0007\u0000\u0000"+
		"\u0000\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f4\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f6\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc0\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0007\u0001\u0000\u0000\u00fe2\u0001\u0000\u0000\u0000\u00ff"+
		"\u0100\u0005:\u0000\u0000\u0100\u0101\u0005=\u0000\u0000\u01014\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005+\u0000\u0000\u0103\u0104\u0005+\u0000"+
		"\u0000\u01046\u0001\u0000\u0000\u0000\u0105\u0106\u0005;\u0000\u0000\u0106"+
		"8\u0001\u0000\u0000\u0000\u0107\u0108\u0005:\u0000\u0000\u0108:\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005,\u0000\u0000\u010a<\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005.\u0000\u0000\u010c>\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005(\u0000\u0000\u010e@\u0001\u0000\u0000\u0000\u010f\u0110\u0005"+
		")\u0000\u0000\u0110B\u0001\u0000\u0000\u0000\u0111\u0112\u0005{\u0000"+
		"\u0000\u0112D\u0001\u0000\u0000\u0000\u0113\u0114\u0005}\u0000\u0000\u0114"+
		"F\u0001\u0000\u0000\u0000\u0115\u0116\u0005[\u0000\u0000\u0116H\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005]\u0000\u0000\u0118J\u0001\u0000\u0000"+
		"\u0000\u0119\u011d\u0007\u0002\u0000\u0000\u011a\u011c\u0007\u0003\u0000"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000"+
		"\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011eL\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000"+
		"\u0120\u0122\u0007\u0004\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124N\u0001\u0000\u0000\u0000\u0125"+
		"\u0129\u0005\"\u0000\u0000\u0126\u0128\b\u0005\u0000\u0000\u0127\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c"+
		"\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0005\"\u0000\u0000\u012dP\u0001\u0000\u0000\u0000\u012e\u0130\u0007"+
		"\u0006\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0006"+
		"(\u0000\u0000\u0134R\u0001\u0000\u0000\u0000\u0135\u0136\u0005/\u0000"+
		"\u0000\u0136\u0137\u0005/\u0000\u0000\u0137\u013b\u0001\u0000\u0000\u0000"+
		"\u0138\u013a\b\u0007\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013e\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0006)\u0000\u0000\u013fT\u0001"+
		"\u0000\u0000\u0000\u0140\u0142\u0005/\u0000\u0000\u0141\u0143\t\u0000"+
		"\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0005*\u0000"+
		"\u0000\u0145\u0146\u0005/\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0006*\u0000\u0000\u0148V\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0005e\u0000\u0000\u014a\u014b\u0005s\u0000\u0000\u014b\u014c\u0005c"+
		"\u0000\u0000\u014c\u014d\u0005r\u0000\u0000\u014d\u014e\u0005e\u0000\u0000"+
		"\u014e\u014f\u0005v\u0000\u0000\u014f\u0150\u0005a\u0000\u0000\u0150X"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0005e\u0000\u0000\u0152\u0153\u0005"+
		"s\u0000\u0000\u0153\u0154\u0005c\u0000\u0000\u0154\u0155\u0005r\u0000"+
		"\u0000\u0155\u0156\u0005e\u0000\u0000\u0156\u0157\u0005v\u0000\u0000\u0157"+
		"\u0158\u0005a\u0000\u0000\u0158\u0159\u0005_\u0000\u0000\u0159\u015a\u0005"+
		"s\u0000\u0000\u015aZ\u0001\u0000\u0000\u0000\u015b\u015c\u0005l\u0000"+
		"\u0000\u015c\u015d\u0005e\u0000\u0000\u015d\u015e\u0005i\u0000\u0000\u015e"+
		"\u015f\u0005a\u0000\u0000\u015f\\\u0001\u0000\u0000\u0000\u0160\u0161"+
		"\u0005v\u0000\u0000\u0161\u0162\u0005e\u0000\u0000\u0162\u0163\u0005t"+
		"\u0000\u0000\u0163\u0164\u0005o\u0000\u0000\u0164\u0165\u0005r\u0000\u0000"+
		"\u0165^\u0001\u0000\u0000\u0000\u0166\u0167\u0005t\u0000\u0000\u0167\u0168"+
		"\u0005a\u0000\u0000\u0168\u0169\u0005m\u0000\u0000\u0169\u016a\u0005a"+
		"\u0000\u0000\u016a\u016b\u0005n\u0000\u0000\u016b\u016c\u0005h\u0000\u0000"+
		"\u016c\u016d\u0005o\u0000\u0000\u016d`\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005r\u0000\u0000\u016f\u0170\u0005e\u0000\u0000\u0170\u0171\u0005g"+
		"\u0000\u0000\u0171\u0172\u0005i\u0000\u0000\u0172\u0173\u0005s\u0000\u0000"+
		"\u0173\u0174\u0005t\u0000\u0000\u0174\u0175\u0005r\u0000\u0000\u0175\u0176"+
		"\u0005o\u0000\u0000\u0176b\u0001\u0000\u0000\u0000\u0177\u0178\u0005v"+
		"\u0000\u0000\u0178\u0179\u0005a\u0000\u0000\u0179\u017a\u0005s\u0000\u0000"+
		"\u017a\u017b\u0005c\u0000\u0000\u017b\u017c\u0005o\u0000\u0000\u017cd"+
		"\u0001\u0000\u0000\u0000\u017d\u017e\u0005f\u0000\u0000\u017e\u017f\u0005"+
		"l\u0000\u0000\u017f\u0180\u0005a\u0000\u0000\u0180\u0181\u0005m\u0000"+
		"\u0000\u0181\u0182\u0005e\u0000\u0000\u0182\u0183\u0005n\u0000\u0000\u0183"+
		"\u0184\u0005g\u0000\u0000\u0184\u0185\u0005o\u0000\u0000\u0185f\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0005c\u0000\u0000\u0187\u0188\u0005o\u0000"+
		"\u0000\u0188\u0189\u0005r\u0000\u0000\u0189\u018a\u0005i\u0000\u0000\u018a"+
		"\u018b\u0005n\u0000\u0000\u018b\u018c\u0005t\u0000\u0000\u018c\u018d\u0005"+
		"h\u0000\u0000\u018d\u018e\u0005i\u0000\u0000\u018e\u018f\u0005a\u0000"+
		"\u0000\u018f\u0190\u0005n\u0000\u0000\u0190\u0191\u0005s\u0000\u0000\u0191"+
		"h\u0001\u0000\u0000\u0000\u0192\u0193\u0005p\u0000\u0000\u0193\u0194\u0005"+
		"a\u0000\u0000\u0194\u0195\u0005l\u0000\u0000\u0195\u0196\u0005m\u0000"+
		"\u0000\u0196\u0197\u0005e\u0000\u0000\u0197\u0198\u0005i\u0000\u0000\u0198"+
		"\u0199\u0005r\u0000\u0000\u0199\u019a\u0005a\u0000\u0000\u019a\u019b\u0005"+
		"s\u0000\u0000\u019bj\u0001\u0000\u0000\u0000\u019c\u019d\u0005s\u0000"+
		"\u0000\u019d\u019e\u0005a\u0000\u0000\u019e\u019f\u0005n\u0000\u0000\u019f"+
		"\u01a0\u0005t\u0000\u0000\u01a0\u01a1\u0005o\u0000\u0000\u01a1\u01a2\u0005"+
		"s\u0000\u0000\u01a2l\u0001\u0000\u0000\u0000\b\u0000\u00fb\u011d\u0123"+
		"\u0129\u0131\u013b\u0142\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}