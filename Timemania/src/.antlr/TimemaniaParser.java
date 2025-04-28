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
		ENTAO=8, SENAO=9, ENQUANTO=10, FACA=11, ESCREVA=12, LEIA=13, NUMBER=14, 
		ID=15, STRING=16, ASSIGN=17, DELIMITER=18, OPERATOR=19, PARENTESE=20, 
		CHAVE=21, WS=22, VASCO=23;
	public static final int
		RULE_programa = 0, RULE_comando = 1, RULE_atribuicao = 2, RULE_futebol = 3, 
		RULE_io = 4, RULE_controle = 5, RULE_bloco = 6, RULE_expressao = 7, RULE_termo = 8, 
		RULE_condicao = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comando", "atribuicao", "futebol", "io", "controle", "bloco", 
			"expressao", "termo", "condicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'flamengo'", "'corinthians'", "'palmeiras'", "'santos'", "'start'", 
			"'end'", "'se'", "'entao'", "'senao'", "'enquanto'", "'faca'", "'escreva'", 
			"'leia'", null, null, null, "':='", null, null, null, null, null, "'vasco'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLAMENGO", "CORINTHIANS", "PALMEIRAS", "SANTOS", "START", "END", 
			"SE", "ENTAO", "SENAO", "ENQUANTO", "FACA", "ESCREVA", "LEIA", "NUMBER", 
			"ID", "STRING", "ASSIGN", "DELIMITER", "OPERATOR", "PARENTESE", "CHAVE", 
			"WS", "VASCO"
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
			setState(20);
			match(START);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				comando();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8434846L) != 0) );
			setState(26);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
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
				setState(29);
				futebol();
				}
				break;
			case ESCREVA:
			case LEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				io();
				}
				break;
			case SE:
			case ENQUANTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
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
			setState(34);
			match(ID);
			setState(35);
			match(ASSIGN);
			setState(36);
			expressao();
			setState(37);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VASCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(VASCO);
				setState(40);
				match(PARENTESE);
				setState(41);
				match(STRING);
				setState(42);
				match(PARENTESE);
				setState(43);
				match(DELIMITER);
				}
				break;
			case FLAMENGO:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(FLAMENGO);
				setState(45);
				match(PARENTESE);
				setState(46);
				match(STRING);
				setState(47);
				match(PARENTESE);
				setState(48);
				match(DELIMITER);
				}
				break;
			case CORINTHIANS:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(CORINTHIANS);
				setState(50);
				match(PARENTESE);
				setState(51);
				match(NUMBER);
				setState(52);
				match(PARENTESE);
				setState(53);
				match(DELIMITER);
				}
				break;
			case PALMEIRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				match(PALMEIRAS);
				setState(55);
				match(PARENTESE);
				setState(56);
				match(PARENTESE);
				setState(57);
				match(DELIMITER);
				}
				break;
			case SANTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(SANTOS);
				setState(59);
				match(PARENTESE);
				setState(60);
				match(STRING);
				setState(61);
				match(PARENTESE);
				setState(62);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(ESCREVA);
				setState(66);
				match(PARENTESE);
				setState(67);
				expressao();
				setState(68);
				match(PARENTESE);
				setState(69);
				match(DELIMITER);
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(LEIA);
				setState(72);
				match(PARENTESE);
				setState(73);
				match(ID);
				setState(74);
				match(PARENTESE);
				setState(75);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(SE);
				setState(79);
				match(PARENTESE);
				setState(80);
				condicao();
				setState(81);
				match(PARENTESE);
				setState(82);
				match(ENTAO);
				setState(83);
				bloco();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENAO) {
					{
					setState(84);
					match(SENAO);
					setState(85);
					bloco();
					}
				}

				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ENQUANTO);
				setState(89);
				match(PARENTESE);
				setState(90);
				condicao();
				setState(91);
				match(PARENTESE);
				setState(92);
				match(FACA);
				setState(93);
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
			setState(97);
			match(CHAVE);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(98);
				comando();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8434846L) != 0) );
			setState(103);
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
			setState(105);
			termo();
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(OPERATOR);
					setState(107);
					termo();
					}
					} 
				}
				setState(112);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(ID);
				}
				break;
			case PARENTESE:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(PARENTESE);
				setState(116);
				expressao();
				setState(117);
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
			setState(121);
			expressao();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPERATOR) {
				{
				setState(122);
				match(OPERATOR);
				setState(123);
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
		"\u0004\u0001\u0017\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0004\u0000\u0017"+
		"\b\u0000\u000b\u0000\f\u0000\u0018\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003@\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"M\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005`\b\u0005\u0001\u0006\u0001\u0006\u0004\u0006d\b\u0006\u000b"+
		"\u0006\f\u0006e\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007m\b\u0007\n\u0007\f\u0007p\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bx\b\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t}\b\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0000\u0084\u0000\u0014\u0001\u0000\u0000\u0000\u0002 \u0001"+
		"\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000\u0006?\u0001\u0000"+
		"\u0000\u0000\bL\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fa"+
		"\u0001\u0000\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010w\u0001\u0000"+
		"\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014\u0016\u0005\u0005\u0000"+
		"\u0000\u0015\u0017\u0003\u0002\u0001\u0000\u0016\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0006\u0000\u0000\u001b\u0001\u0001\u0000\u0000"+
		"\u0000\u001c!\u0003\u0004\u0002\u0000\u001d!\u0003\u0006\u0003\u0000\u001e"+
		"!\u0003\b\u0004\u0000\u001f!\u0003\n\u0005\u0000 \u001c\u0001\u0000\u0000"+
		"\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 "+
		"\u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"#\u0005"+
		"\u000f\u0000\u0000#$\u0005\u0011\u0000\u0000$%\u0003\u000e\u0007\u0000"+
		"%&\u0005\u0012\u0000\u0000&\u0005\u0001\u0000\u0000\u0000\'(\u0005\u0017"+
		"\u0000\u0000()\u0005\u0014\u0000\u0000)*\u0005\u0010\u0000\u0000*+\u0005"+
		"\u0014\u0000\u0000+@\u0005\u0012\u0000\u0000,-\u0005\u0001\u0000\u0000"+
		"-.\u0005\u0014\u0000\u0000./\u0005\u0010\u0000\u0000/0\u0005\u0014\u0000"+
		"\u00000@\u0005\u0012\u0000\u000012\u0005\u0002\u0000\u000023\u0005\u0014"+
		"\u0000\u000034\u0005\u000e\u0000\u000045\u0005\u0014\u0000\u00005@\u0005"+
		"\u0012\u0000\u000067\u0005\u0003\u0000\u000078\u0005\u0014\u0000\u0000"+
		"89\u0005\u0014\u0000\u00009@\u0005\u0012\u0000\u0000:;\u0005\u0004\u0000"+
		"\u0000;<\u0005\u0014\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0005\u0014"+
		"\u0000\u0000>@\u0005\u0012\u0000\u0000?\'\u0001\u0000\u0000\u0000?,\u0001"+
		"\u0000\u0000\u0000?1\u0001\u0000\u0000\u0000?6\u0001\u0000\u0000\u0000"+
		"?:\u0001\u0000\u0000\u0000@\u0007\u0001\u0000\u0000\u0000AB\u0005\f\u0000"+
		"\u0000BC\u0005\u0014\u0000\u0000CD\u0003\u000e\u0007\u0000DE\u0005\u0014"+
		"\u0000\u0000EF\u0005\u0012\u0000\u0000FM\u0001\u0000\u0000\u0000GH\u0005"+
		"\r\u0000\u0000HI\u0005\u0014\u0000\u0000IJ\u0005\u000f\u0000\u0000JK\u0005"+
		"\u0014\u0000\u0000KM\u0005\u0012\u0000\u0000LA\u0001\u0000\u0000\u0000"+
		"LG\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0005\u0007\u0000"+
		"\u0000OP\u0005\u0014\u0000\u0000PQ\u0003\u0012\t\u0000QR\u0005\u0014\u0000"+
		"\u0000RS\u0005\b\u0000\u0000SV\u0003\f\u0006\u0000TU\u0005\t\u0000\u0000"+
		"UW\u0003\f\u0006\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000"+
		"W`\u0001\u0000\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0005\u0014\u0000\u0000"+
		"Z[\u0003\u0012\t\u0000[\\\u0005\u0014\u0000\u0000\\]\u0005\u000b\u0000"+
		"\u0000]^\u0003\f\u0006\u0000^`\u0001\u0000\u0000\u0000_N\u0001\u0000\u0000"+
		"\u0000_X\u0001\u0000\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ac\u0005"+
		"\u0015\u0000\u0000bd\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u0015\u0000\u0000h\r\u0001\u0000"+
		"\u0000\u0000in\u0003\u0010\b\u0000jk\u0005\u0013\u0000\u0000km\u0003\u0010"+
		"\b\u0000lj\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000o\u000f\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000qx\u0005\u000e\u0000\u0000rx\u0005\u000f\u0000"+
		"\u0000st\u0005\u0014\u0000\u0000tu\u0003\u000e\u0007\u0000uv\u0005\u0014"+
		"\u0000\u0000vx\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000wr\u0001"+
		"\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000x\u0011\u0001\u0000\u0000"+
		"\u0000y|\u0003\u000e\u0007\u0000z{\u0005\u0013\u0000\u0000{}\u0003\u000e"+
		"\u0007\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0013"+
		"\u0001\u0000\u0000\u0000\n\u0018 ?LV_enw|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}