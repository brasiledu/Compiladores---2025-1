// Generated from /Users/eduardovinicius/Compiladores---2025-1/timemania/src/TimemaniaParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TimemaniaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLAMENGO=1, CORINTHIANS=2, PALMEIRAS=3, SANTOS=4, START=5, END=6, SE=7, 
		ENTAO=8, SENAO=9, ENQUANTO=10, FACA=11, ESCREVA=12, LEIA=13, VASCO=14, 
		PLUS=15, MINUS=16, MULT=17, DIV=18, MOD=19, OPERATOR=20, DELIMITER=21, 
		PARENTESE=22, COMPARADOR=23, CHAVE=24, AND=25, OR=26, NOT=27, ASSIGN=28, 
		SEMICOLON=29, COMMA=30, NUMBER=31, ID=32, STRING=33, COMMENT=34, MULTILINE_COMMENT=35, 
		WS=36;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_atribuicao = 2, RULE_futebol = 3, 
		RULE_io = 4, RULE_controle = 5, RULE_bloco = 6, RULE_expressao = 7, RULE_termo = 8, 
		RULE_condicao = 9, RULE_comparacao = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "atribuicao", "futebol", "io", "controle", "bloco", 
			"expressao", "termo", "condicao", "comparacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'flamengo'", "'corinthians'", "'palmeiras'", "'santos'", "'start'", 
			"'end'", "'se'", "'entao'", "'senao'", "'enquanto'", "'faca'", "'escreva'", 
			"'leia'", "'vasco'", "'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, 
			null, null, "'&&'", "'||'", "'!'", "':='", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLAMENGO", "CORINTHIANS", "PALMEIRAS", "SANTOS", "START", "END", 
			"SE", "ENTAO", "SENAO", "ENQUANTO", "FACA", "ESCREVA", "LEIA", "VASCO", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "OPERATOR", "DELIMITER", "PARENTESE", 
			"COMPARADOR", "CHAVE", "AND", "OR", "NOT", "ASSIGN", "SEMICOLON", "COMMA", 
			"NUMBER", "ID", "STRING", "COMMENT", "MULTILINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "TimemaniaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TimemaniaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(TimemaniaParser.START, 0); }
		public TerminalNode END() { return getToken(TimemaniaParser.END, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(START);
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				comando();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294997150L) != 0) );
			setState(28);
			match(END);
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
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public FutebolContext futebol() {
			return getRuleContext(FutebolContext.class,0);
		}
		public IoContext io() {
			return getRuleContext(IoContext.class,0);
		}
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				atribuicao();
				}
				break;
			case FLAMENGO:
			case CORINTHIANS:
			case PALMEIRAS:
			case SANTOS:
			case VASCO:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				futebol();
				}
				break;
			case ESCREVA:
			case LEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				io();
				}
				break;
			case SE:
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				controle();
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TimemaniaParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
			setState(37);
			match(ASSIGN);
			setState(38);
			expressao();
			setState(39);
			match(DELIMITER);
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
	public static class FutebolContext extends ParserRuleContext {
		public TerminalNode VASCO() { return getToken(TimemaniaParser.VASCO, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public TerminalNode STRING() { return getToken(TimemaniaParser.STRING, 0); }
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public TerminalNode FLAMENGO() { return getToken(TimemaniaParser.FLAMENGO, 0); }
		public TerminalNode CORINTHIANS() { return getToken(TimemaniaParser.CORINTHIANS, 0); }
		public TerminalNode NUMBER() { return getToken(TimemaniaParser.NUMBER, 0); }
		public TerminalNode PALMEIRAS() { return getToken(TimemaniaParser.PALMEIRAS, 0); }
		public TerminalNode SANTOS() { return getToken(TimemaniaParser.SANTOS, 0); }
		public FutebolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futebol; }
	}

	public final FutebolContext futebol() throws RecognitionException {
		FutebolContext _localctx = new FutebolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_futebol);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VASCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(VASCO);
				setState(42);
				match(PARENTESE);
				setState(43);
				match(STRING);
				setState(44);
				match(PARENTESE);
				setState(45);
				match(DELIMITER);
				}
				break;
			case FLAMENGO:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(FLAMENGO);
				setState(47);
				match(PARENTESE);
				setState(48);
				match(STRING);
				setState(49);
				match(PARENTESE);
				setState(50);
				match(DELIMITER);
				}
				break;
			case CORINTHIANS:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(CORINTHIANS);
				setState(52);
				match(PARENTESE);
				setState(53);
				match(NUMBER);
				setState(54);
				match(PARENTESE);
				setState(55);
				match(DELIMITER);
				}
				break;
			case PALMEIRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(PALMEIRAS);
				setState(57);
				match(PARENTESE);
				setState(58);
				match(PARENTESE);
				setState(59);
				match(DELIMITER);
				}
				break;
			case SANTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				match(SANTOS);
				setState(61);
				match(PARENTESE);
				setState(62);
				match(STRING);
				setState(63);
				match(PARENTESE);
				setState(64);
				match(DELIMITER);
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
	public static class IoContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(TimemaniaParser.ESCREVA, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public TerminalNode LEIA() { return getToken(TimemaniaParser.LEIA, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_io);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(ESCREVA);
				setState(68);
				match(PARENTESE);
				setState(69);
				expressao();
				setState(70);
				match(PARENTESE);
				setState(71);
				match(DELIMITER);
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(LEIA);
				setState(74);
				match(PARENTESE);
				setState(75);
				match(ID);
				setState(76);
				match(PARENTESE);
				setState(77);
				match(DELIMITER);
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
	public static class ControleContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(TimemaniaParser.SE, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(TimemaniaParser.ENTAO, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(TimemaniaParser.SENAO, 0); }
		public TerminalNode ENQUANTO() { return getToken(TimemaniaParser.ENQUANTO, 0); }
		public TerminalNode FACA() { return getToken(TimemaniaParser.FACA, 0); }
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_controle);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(SE);
				setState(81);
				match(PARENTESE);
				setState(82);
				condicao();
				setState(83);
				match(PARENTESE);
				setState(84);
				match(ENTAO);
				setState(85);
				bloco();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENAO) {
					{
					setState(86);
					match(SENAO);
					setState(87);
					bloco();
					}
				}

				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ENQUANTO);
				setState(91);
				match(PARENTESE);
				setState(92);
				condicao();
				setState(93);
				match(PARENTESE);
				setState(94);
				match(FACA);
				setState(95);
				bloco();
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
	public static class BlocoContext extends ParserRuleContext {
		public List<TerminalNode> CHAVE() { return getTokens(TimemaniaParser.CHAVE); }
		public TerminalNode CHAVE(int i) {
			return getToken(TimemaniaParser.CHAVE, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(CHAVE);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				comando();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4294997150L) != 0) );
			setState(105);
			match(CHAVE);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(TimemaniaParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(TimemaniaParser.OPERATOR, i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			termo();
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(108);
					match(OPERATOR);
					setState(109);
					termo();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
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
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TimemaniaParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termo);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(ID);
				}
				break;
			case PARENTESE:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(PARENTESE);
				setState(118);
				expressao();
				setState(119);
				match(PARENTESE);
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
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(TimemaniaParser.OPERATOR, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expressao();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATOR) {
				{
				setState(124);
				match(OPERATOR);
				setState(125);
				expressao();
				}
			}

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
	public static class ComparacaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMPARADOR() { return getToken(TimemaniaParser.COMPARADOR, 0); }
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			expressao();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPARADOR) {
				{
				setState(129);
				match(COMPARADOR);
				setState(130);
				expressao();
				}
			}

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

	public static final String _serializedATN =
		"\u0004\u0001$\u0086\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u0019\b\u0000\u000b\u0000\f\u0000\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"B\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004O\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Y\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006\u0001\u0006\u0004\u0006"+
		"f\b\u0006\u000b\u0006\f\u0006g\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007o\b\u0007\n\u0007\f\u0007r\t\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u007f\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u0084\b\n"+
		"\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0000\u0000\u008b\u0000\u0016\u0001\u0000\u0000\u0000\u0002\"\u0001"+
		"\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000"+
		"\u0000\bN\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fc\u0001"+
		"\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000"+
		"\u0000\u0012{\u0001\u0000\u0000\u0000\u0014\u0080\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0005\u0005\u0000\u0000\u0017\u0019\u0003\u0002\u0001\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0006\u0000\u0000"+
		"\u001d\u0001\u0001\u0000\u0000\u0000\u001e#\u0003\u0004\u0002\u0000\u001f"+
		"#\u0003\u0006\u0003\u0000 #\u0003\b\u0004\u0000!#\u0003\n\u0005\u0000"+
		"\"\u001e\u0001\u0000\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"!\u0001\u0000\u0000\u0000#\u0003\u0001\u0000\u0000"+
		"\u0000$%\u0005 \u0000\u0000%&\u0005\u001c\u0000\u0000&\'\u0003\u000e\u0007"+
		"\u0000\'(\u0005\u0015\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005"+
		"\u000e\u0000\u0000*+\u0005\u0016\u0000\u0000+,\u0005!\u0000\u0000,-\u0005"+
		"\u0016\u0000\u0000-B\u0005\u0015\u0000\u0000./\u0005\u0001\u0000\u0000"+
		"/0\u0005\u0016\u0000\u000001\u0005!\u0000\u000012\u0005\u0016\u0000\u0000"+
		"2B\u0005\u0015\u0000\u000034\u0005\u0002\u0000\u000045\u0005\u0016\u0000"+
		"\u000056\u0005\u001f\u0000\u000067\u0005\u0016\u0000\u00007B\u0005\u0015"+
		"\u0000\u000089\u0005\u0003\u0000\u00009:\u0005\u0016\u0000\u0000:;\u0005"+
		"\u0016\u0000\u0000;B\u0005\u0015\u0000\u0000<=\u0005\u0004\u0000\u0000"+
		"=>\u0005\u0016\u0000\u0000>?\u0005!\u0000\u0000?@\u0005\u0016\u0000\u0000"+
		"@B\u0005\u0015\u0000\u0000A)\u0001\u0000\u0000\u0000A.\u0001\u0000\u0000"+
		"\u0000A3\u0001\u0000\u0000\u0000A8\u0001\u0000\u0000\u0000A<\u0001\u0000"+
		"\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0005\f\u0000\u0000DE\u0005"+
		"\u0016\u0000\u0000EF\u0003\u000e\u0007\u0000FG\u0005\u0016\u0000\u0000"+
		"GH\u0005\u0015\u0000\u0000HO\u0001\u0000\u0000\u0000IJ\u0005\r\u0000\u0000"+
		"JK\u0005\u0016\u0000\u0000KL\u0005 \u0000\u0000LM\u0005\u0016\u0000\u0000"+
		"MO\u0005\u0015\u0000\u0000NC\u0001\u0000\u0000\u0000NI\u0001\u0000\u0000"+
		"\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000QR\u0005\u0016"+
		"\u0000\u0000RS\u0003\u0012\t\u0000ST\u0005\u0016\u0000\u0000TU\u0005\b"+
		"\u0000\u0000UX\u0003\f\u0006\u0000VW\u0005\t\u0000\u0000WY\u0003\f\u0006"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Yb\u0001\u0000"+
		"\u0000\u0000Z[\u0005\n\u0000\u0000[\\\u0005\u0016\u0000\u0000\\]\u0003"+
		"\u0012\t\u0000]^\u0005\u0016\u0000\u0000^_\u0005\u000b\u0000\u0000_`\u0003"+
		"\f\u0006\u0000`b\u0001\u0000\u0000\u0000aP\u0001\u0000\u0000\u0000aZ\u0001"+
		"\u0000\u0000\u0000b\u000b\u0001\u0000\u0000\u0000ce\u0005\u0018\u0000"+
		"\u0000df\u0003\u0002\u0001\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ij\u0005\u0018\u0000\u0000j\r\u0001\u0000\u0000\u0000"+
		"kp\u0003\u0010\b\u0000lm\u0005\u0014\u0000\u0000mo\u0003\u0010\b\u0000"+
		"nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000"+
		"\u0000pq\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000sz\u0005\u001f\u0000\u0000tz\u0005 \u0000\u0000uv\u0005"+
		"\u0016\u0000\u0000vw\u0003\u000e\u0007\u0000wx\u0005\u0016\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000"+
		"\u0000yu\u0001\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{~\u0003"+
		"\u000e\u0007\u0000|}\u0005\u0014\u0000\u0000}\u007f\u0003\u000e\u0007"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0013\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u000e\u0007\u0000\u0081"+
		"\u0082\u0005\u0017\u0000\u0000\u0082\u0084\u0003\u000e\u0007\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0015\u0001\u0000\u0000\u0000\u000b\u001a\"ANXagpy~\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}