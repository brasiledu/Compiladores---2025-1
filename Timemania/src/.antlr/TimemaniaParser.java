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
		START=1, END=2, SE=3, ENTAO=4, SENAO=5, ENQUANTO=6, FACA=7, ESCREVA=8, 
		LEIA=9, FLAMENGO=10, CORINTHIANS=11, PALMEIRAS=12, SANTOS=13, VASCO=14, 
		FUNCAO=15, PROCEDIMENTO=16, RETORNA=17, PARA=18, ATE=19, DE=20, REPITA=21, 
		TIPO=22, VAR=23, CONST=24, REGISTRO=25, VETOR=26, INTEIRO=27, TEXTO=28, 
		BOOLEANO=29, PARENTESE=30, CHAVE=31, COLCHETE=32, DELIMITER=33, ASSIGN=34, 
		PONTO=35, VIRGULA=36, DOISPONTOS=37, OPERATOR=38, COMPARADOR=39, NUMBER=40, 
		STRING=41, ID=42, WS=43, COMMENT=44, MULTILINE_COMMENT=45;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_constante = 2, RULE_tipagem = 3, 
		RULE_tipoDefinicao = 4, RULE_tipoSimples = 5, RULE_tipoEstruturado = 6, 
		RULE_registroTipo = 7, RULE_vetorTipo = 8, RULE_variavel = 9, RULE_funcaoProcedimento = 10, 
		RULE_funcao = 11, RULE_procedimento = 12, RULE_parametro = 13, RULE_retorno = 14, 
		RULE_comando = 15, RULE_atribuicao = 16, RULE_futebol = 17, RULE_io = 18, 
		RULE_controle = 19, RULE_bloco = 20, RULE_chamadaFuncao = 21, RULE_expressao = 22, 
		RULE_termo = 23, RULE_condicao = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "constante", "tipagem", "tipoDefinicao", "tipoSimples", 
			"tipoEstruturado", "registroTipo", "vetorTipo", "variavel", "funcaoProcedimento", 
			"funcao", "procedimento", "parametro", "retorno", "comando", "atribuicao", 
			"futebol", "io", "controle", "bloco", "chamadaFuncao", "expressao", "termo", 
			"condicao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'start'", "'end'", "'se'", "'entao'", "'senao'", "'enquanto'", 
			"'faca'", "'escreva'", "'leia'", "'flamengo'", "'corinthians'", "'palmeiras'", 
			"'santos'", "'vasco'", "'funcao'", "'procedimento'", "'retorna'", "'para'", 
			"'ate'", "'de'", "'repita'", "'tipo'", "'var'", "'const'", "'registro'", 
			"'vetor'", "'inteiro'", "'texto'", "'booleano'", null, null, null, "';'", 
			"':='", "'.'", "','", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "END", "SE", "ENTAO", "SENAO", "ENQUANTO", "FACA", "ESCREVA", 
			"LEIA", "FLAMENGO", "CORINTHIANS", "PALMEIRAS", "SANTOS", "VASCO", "FUNCAO", 
			"PROCEDIMENTO", "RETORNA", "PARA", "ATE", "DE", "REPITA", "TIPO", "VAR", 
			"CONST", "REGISTRO", "VETOR", "INTEIRO", "TEXTO", "BOOLEANO", "PARENTESE", 
			"CHAVE", "COLCHETE", "DELIMITER", "ASSIGN", "PONTO", "VIRGULA", "DOISPONTOS", 
			"OPERATOR", "COMPARADOR", "NUMBER", "STRING", "ID", "WS", "COMMENT", 
			"MULTILINE_COMMENT"
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
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
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
			setState(50);
			match(START);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29458432L) != 0)) {
				{
				{
				setState(51);
				declaracao();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				comando();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048902984L) != 0) );
			setState(62);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public TipagemContext tipagem() {
			return getRuleContext(TipagemContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public FuncaoProcedimentoContext funcaoProcedimento() {
			return getRuleContext(FuncaoProcedimentoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				tipagem();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				variavel();
				}
				break;
			case FUNCAO:
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				funcaoProcedimento();
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
	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(TimemaniaParser.CONST, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TimemaniaParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(CONST);
			setState(71);
			match(ID);
			setState(72);
			match(ASSIGN);
			setState(73);
			expressao();
			setState(74);
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
	public static class TipagemContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(TimemaniaParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TimemaniaParser.ASSIGN, 0); }
		public TipoDefinicaoContext tipoDefinicao() {
			return getRuleContext(TipoDefinicaoContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public TipagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipagem; }
	}

	public final TipagemContext tipagem() throws RecognitionException {
		TipagemContext _localctx = new TipagemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(TIPO);
			setState(77);
			match(ID);
			setState(78);
			match(ASSIGN);
			setState(79);
			tipoDefinicao();
			setState(80);
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
	public static class TipoDefinicaoContext extends ParserRuleContext {
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public TipoEstruturadoContext tipoEstruturado() {
			return getRuleContext(TipoEstruturadoContext.class,0);
		}
		public TipoDefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDefinicao; }
	}

	public final TipoDefinicaoContext tipoDefinicao() throws RecognitionException {
		TipoDefinicaoContext _localctx = new TipoDefinicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoDefinicao);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case TEXTO:
			case BOOLEANO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				tipoSimples();
				}
				break;
			case REGISTRO:
			case VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				tipoEstruturado();
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
	public static class TipoSimplesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public TerminalNode INTEIRO() { return getToken(TimemaniaParser.INTEIRO, 0); }
		public TerminalNode TEXTO() { return getToken(TimemaniaParser.TEXTO, 0); }
		public TerminalNode BOOLEANO() { return getToken(TimemaniaParser.BOOLEANO, 0); }
		public TipoSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoSimples; }
	}

	public final TipoSimplesContext tipoSimples() throws RecognitionException {
		TipoSimplesContext _localctx = new TipoSimplesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoSimples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398986035200L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class TipoEstruturadoContext extends ParserRuleContext {
		public RegistroTipoContext registroTipo() {
			return getRuleContext(RegistroTipoContext.class,0);
		}
		public VetorTipoContext vetorTipo() {
			return getRuleContext(VetorTipoContext.class,0);
		}
		public TipoEstruturadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEstruturado; }
	}

	public final TipoEstruturadoContext tipoEstruturado() throws RecognitionException {
		TipoEstruturadoContext _localctx = new TipoEstruturadoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipoEstruturado);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				registroTipo();
				}
				break;
			case VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				vetorTipo();
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
	public static class RegistroTipoContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(TimemaniaParser.REGISTRO, 0); }
		public List<TerminalNode> CHAVE() { return getTokens(TimemaniaParser.CHAVE); }
		public TerminalNode CHAVE(int i) {
			return getToken(TimemaniaParser.CHAVE, i);
		}
		public List<TerminalNode> ID() { return getTokens(TimemaniaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TimemaniaParser.ID, i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(TimemaniaParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(TimemaniaParser.DOISPONTOS, i);
		}
		public List<TipoDefinicaoContext> tipoDefinicao() {
			return getRuleContexts(TipoDefinicaoContext.class);
		}
		public TipoDefinicaoContext tipoDefinicao(int i) {
			return getRuleContext(TipoDefinicaoContext.class,i);
		}
		public List<TerminalNode> DELIMITER() { return getTokens(TimemaniaParser.DELIMITER); }
		public TerminalNode DELIMITER(int i) {
			return getToken(TimemaniaParser.DELIMITER, i);
		}
		public RegistroTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registroTipo; }
	}

	public final RegistroTipoContext registroTipo() throws RecognitionException {
		RegistroTipoContext _localctx = new RegistroTipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_registroTipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(REGISTRO);
			setState(93);
			match(CHAVE);
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				match(ID);
				setState(95);
				match(DOISPONTOS);
				setState(96);
				tipoDefinicao();
				setState(97);
				match(DELIMITER);
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
	public static class VetorTipoContext extends ParserRuleContext {
		public TerminalNode VETOR() { return getToken(TimemaniaParser.VETOR, 0); }
		public List<TerminalNode> COLCHETE() { return getTokens(TimemaniaParser.COLCHETE); }
		public TerminalNode COLCHETE(int i) {
			return getToken(TimemaniaParser.COLCHETE, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DE() { return getToken(TimemaniaParser.DE, 0); }
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public VetorTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vetorTipo; }
	}

	public final VetorTipoContext vetorTipo() throws RecognitionException {
		VetorTipoContext _localctx = new VetorTipoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vetorTipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(VETOR);
			setState(106);
			match(COLCHETE);
			setState(107);
			expressao();
			setState(108);
			match(COLCHETE);
			setState(109);
			match(DE);
			setState(110);
			tipoSimples();
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
	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(TimemaniaParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(TimemaniaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TimemaniaParser.ID, i);
		}
		public TerminalNode DOISPONTOS() { return getToken(TimemaniaParser.DOISPONTOS, 0); }
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(TimemaniaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(TimemaniaParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(VAR);
			setState(113);
			match(ID);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(114);
				match(VIRGULA);
				setState(115);
				match(ID);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(DOISPONTOS);
			setState(122);
			tipoSimples();
			setState(123);
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
	public static class FuncaoProcedimentoContext extends ParserRuleContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ProcedimentoContext procedimento() {
			return getRuleContext(ProcedimentoContext.class,0);
		}
		public FuncaoProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoProcedimento; }
	}

	public final FuncaoProcedimentoContext funcaoProcedimento() throws RecognitionException {
		FuncaoProcedimentoContext _localctx = new FuncaoProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcaoProcedimento);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				funcao();
				}
				break;
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				procedimento();
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
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNCAO() { return getToken(TimemaniaParser.FUNCAO, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public TerminalNode DOISPONTOS() { return getToken(TimemaniaParser.DOISPONTOS, 0); }
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public List<TerminalNode> CHAVE() { return getTokens(TimemaniaParser.CHAVE); }
		public TerminalNode CHAVE(int i) {
			return getToken(TimemaniaParser.CHAVE, i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FUNCAO);
			setState(130);
			match(ID);
			setState(131);
			match(PARENTESE);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(132);
				parametro();
				}
			}

			setState(135);
			match(PARENTESE);
			setState(136);
			match(DOISPONTOS);
			setState(137);
			tipoSimples();
			setState(138);
			match(CHAVE);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				comando();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048902984L) != 0) );
			setState(144);
			retorno();
			setState(145);
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
	public static class ProcedimentoContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(TimemaniaParser.PROCEDIMENTO, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public List<TerminalNode> CHAVE() { return getTokens(TimemaniaParser.CHAVE); }
		public TerminalNode CHAVE(int i) {
			return getToken(TimemaniaParser.CHAVE, i);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(PROCEDIMENTO);
			setState(148);
			match(ID);
			setState(149);
			match(PARENTESE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(150);
				parametro();
				}
			}

			setState(153);
			match(PARENTESE);
			setState(154);
			match(CHAVE);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				comando();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048902984L) != 0) );
			setState(160);
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
	public static class ParametroContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TimemaniaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TimemaniaParser.ID, i);
		}
		public List<TerminalNode> DOISPONTOS() { return getTokens(TimemaniaParser.DOISPONTOS); }
		public TerminalNode DOISPONTOS(int i) {
			return getToken(TimemaniaParser.DOISPONTOS, i);
		}
		public List<TipoSimplesContext> tipoSimples() {
			return getRuleContexts(TipoSimplesContext.class);
		}
		public TipoSimplesContext tipoSimples(int i) {
			return getRuleContext(TipoSimplesContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(TimemaniaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(TimemaniaParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(DOISPONTOS);
			setState(164);
			tipoSimples();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(165);
				match(VIRGULA);
				setState(166);
				match(ID);
				setState(167);
				match(DOISPONTOS);
				setState(168);
				tipoSimples();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNA() { return getToken(TimemaniaParser.RETORNA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(RETORNA);
			setState(175);
			expressao();
			setState(176);
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
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comando);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				futebol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				io();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				controle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				chamadaFuncao();
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
		enterRule(_localctx, 32, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(186);
			match(ASSIGN);
			setState(187);
			expressao();
			setState(188);
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
		enterRule(_localctx, 34, RULE_futebol);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VASCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(VASCO);
				setState(191);
				match(PARENTESE);
				setState(192);
				match(STRING);
				setState(193);
				match(PARENTESE);
				setState(194);
				match(DELIMITER);
				}
				break;
			case FLAMENGO:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(FLAMENGO);
				setState(196);
				match(PARENTESE);
				setState(197);
				match(STRING);
				setState(198);
				match(PARENTESE);
				setState(199);
				match(DELIMITER);
				}
				break;
			case CORINTHIANS:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(CORINTHIANS);
				setState(201);
				match(PARENTESE);
				setState(202);
				match(NUMBER);
				setState(203);
				match(PARENTESE);
				setState(204);
				match(DELIMITER);
				}
				break;
			case PALMEIRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(PALMEIRAS);
				setState(206);
				match(PARENTESE);
				setState(207);
				match(PARENTESE);
				setState(208);
				match(DELIMITER);
				}
				break;
			case SANTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(SANTOS);
				setState(210);
				match(PARENTESE);
				setState(211);
				match(STRING);
				setState(212);
				match(PARENTESE);
				setState(213);
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
		enterRule(_localctx, 36, RULE_io);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(ESCREVA);
				setState(217);
				match(PARENTESE);
				setState(218);
				expressao();
				setState(219);
				match(PARENTESE);
				setState(220);
				match(DELIMITER);
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(LEIA);
				setState(223);
				match(PARENTESE);
				setState(224);
				match(ID);
				setState(225);
				match(PARENTESE);
				setState(226);
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
		public TerminalNode PARA() { return getToken(TimemaniaParser.PARA, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TimemaniaParser.ASSIGN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode ATE() { return getToken(TimemaniaParser.ATE, 0); }
		public TerminalNode REPITA() { return getToken(TimemaniaParser.REPITA, 0); }
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_controle);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(SE);
				setState(230);
				match(PARENTESE);
				setState(231);
				condicao();
				setState(232);
				match(PARENTESE);
				setState(233);
				match(ENTAO);
				setState(234);
				bloco();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENAO) {
					{
					setState(235);
					match(SENAO);
					setState(236);
					bloco();
					}
				}

				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(ENQUANTO);
				setState(240);
				match(PARENTESE);
				setState(241);
				condicao();
				setState(242);
				match(PARENTESE);
				setState(243);
				match(FACA);
				setState(244);
				bloco();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(PARA);
				setState(247);
				match(ID);
				setState(248);
				match(ASSIGN);
				setState(249);
				expressao();
				setState(250);
				match(ATE);
				setState(251);
				expressao();
				setState(252);
				match(FACA);
				setState(253);
				bloco();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				match(REPITA);
				setState(256);
				bloco();
				setState(257);
				match(ENQUANTO);
				setState(258);
				match(PARENTESE);
				setState(259);
				condicao();
				setState(260);
				match(PARENTESE);
				setState(261);
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
		enterRule(_localctx, 40, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(CHAVE);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				comando();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4398048902984L) != 0) );
			setState(271);
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
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(TimemaniaParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(TimemaniaParser.VIRGULA, i);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(ID);
			setState(274);
			match(PARENTESE);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(275);
				expressao();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(276);
					match(VIRGULA);
					setState(277);
					expressao();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(285);
			match(PARENTESE);
			setState(286);
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
		enterRule(_localctx, 44, RULE_expressao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			termo();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(OPERATOR);
					setState(290);
					termo();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public TerminalNode STRING() { return getToken(TimemaniaParser.STRING, 0); }
		public List<TerminalNode> ID() { return getTokens(TimemaniaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TimemaniaParser.ID, i);
		}
		public List<TerminalNode> COLCHETE() { return getTokens(TimemaniaParser.COLCHETE); }
		public TerminalNode COLCHETE(int i) {
			return getToken(TimemaniaParser.COLCHETE, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTO() { return getToken(TimemaniaParser.PONTO, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termo);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				match(ID);
				setState(300);
				match(COLCHETE);
				setState(301);
				expressao();
				setState(302);
				match(COLCHETE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				match(ID);
				setState(305);
				match(PONTO);
				setState(306);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				chamadaFuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				match(PARENTESE);
				setState(309);
				expressao();
				setState(310);
				match(PARENTESE);
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
	public static class CondicaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode OPERATOR() { return getToken(TimemaniaParser.OPERATOR, 0); }
		public TerminalNode COMPARADOR() { return getToken(TimemaniaParser.COMPARADOR, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condicao);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				expressao();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(315);
					match(OPERATOR);
					setState(316);
					expressao();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				expressao();
				setState(320);
				match(COMPARADOR);
				setState(321);
				expressao();
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

	public static final String _serializedATN =
		"\u0004\u0001-\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000"+
		"\u0001\u0000\u0004\u0000;\b\u0000\u000b\u0000\f\u0000<\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001E\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004U\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007d\b\u0007\u000b\u0007\f\u0007e\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\tu\b\t\n\t\f\tx\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\n\u0080\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0086\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u008d\b\u000b\u000b\u000b\f\u000b\u008e\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0098"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0004\f\u009d\b\f\u000b\f\f\f\u009e\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00aa\b\r\n\r\f\r\u00ad\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00b8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00d7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00e4\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00ee\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0108\b\u0013\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u010c\b\u0014\u000b\u0014\f\u0014\u010d\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0117\b\u0015\n\u0015\f\u0015\u011a\t\u0015\u0003\u0015\u011c\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0124\b\u0016\n\u0016\f\u0016\u0127\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0139\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u013e\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0144\b\u0018\u0001\u0018\u0000\u0000\u0019"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0\u0000\u0001\u0002\u0000\u001b\u001d**\u0154\u0000"+
		"2\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004F\u0001"+
		"\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000"+
		"\u0000\nV\u0001\u0000\u0000\u0000\fZ\u0001\u0000\u0000\u0000\u000e\\\u0001"+
		"\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u0081\u0001\u0000\u0000"+
		"\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a\u00a2\u0001\u0000\u0000"+
		"\u0000\u001c\u00ae\u0001\u0000\u0000\u0000\u001e\u00b7\u0001\u0000\u0000"+
		"\u0000 \u00b9\u0001\u0000\u0000\u0000\"\u00d6\u0001\u0000\u0000\u0000"+
		"$\u00e3\u0001\u0000\u0000\u0000&\u0107\u0001\u0000\u0000\u0000(\u0109"+
		"\u0001\u0000\u0000\u0000*\u0111\u0001\u0000\u0000\u0000,\u0120\u0001\u0000"+
		"\u0000\u0000.\u0138\u0001\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u0000"+
		"26\u0005\u0001\u0000\u000035\u0003\u0002\u0001\u000043\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009;\u0003"+
		"\u001e\u000f\u0000:9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>?\u0005\u0002\u0000\u0000?\u0001\u0001\u0000\u0000\u0000@E\u0003"+
		"\u0004\u0002\u0000AE\u0003\u0006\u0003\u0000BE\u0003\u0012\t\u0000CE\u0003"+
		"\u0014\n\u0000D@\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000DB\u0001"+
		"\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0003\u0001\u0000\u0000"+
		"\u0000FG\u0005\u0018\u0000\u0000GH\u0005*\u0000\u0000HI\u0005\"\u0000"+
		"\u0000IJ\u0003,\u0016\u0000JK\u0005!\u0000\u0000K\u0005\u0001\u0000\u0000"+
		"\u0000LM\u0005\u0016\u0000\u0000MN\u0005*\u0000\u0000NO\u0005\"\u0000"+
		"\u0000OP\u0003\b\u0004\u0000PQ\u0005!\u0000\u0000Q\u0007\u0001\u0000\u0000"+
		"\u0000RU\u0003\n\u0005\u0000SU\u0003\f\u0006\u0000TR\u0001\u0000\u0000"+
		"\u0000TS\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000VW\u0007\u0000"+
		"\u0000\u0000W\u000b\u0001\u0000\u0000\u0000X[\u0003\u000e\u0007\u0000"+
		"Y[\u0003\u0010\b\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\r\u0001\u0000\u0000\u0000\\]\u0005\u0019\u0000\u0000]c\u0005\u001f\u0000"+
		"\u0000^_\u0005*\u0000\u0000_`\u0005%\u0000\u0000`a\u0003\b\u0004\u0000"+
		"ab\u0005!\u0000\u0000bd\u0001\u0000\u0000\u0000c^\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0005\u001f\u0000\u0000h\u000f\u0001"+
		"\u0000\u0000\u0000ij\u0005\u001a\u0000\u0000jk\u0005 \u0000\u0000kl\u0003"+
		",\u0016\u0000lm\u0005 \u0000\u0000mn\u0005\u0014\u0000\u0000no\u0003\n"+
		"\u0005\u0000o\u0011\u0001\u0000\u0000\u0000pq\u0005\u0017\u0000\u0000"+
		"qv\u0005*\u0000\u0000rs\u0005$\u0000\u0000su\u0005*\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000yz\u0005%\u0000\u0000z{\u0003\n\u0005\u0000{|\u0005!\u0000\u0000"+
		"|\u0013\u0001\u0000\u0000\u0000}\u0080\u0003\u0016\u000b\u0000~\u0080"+
		"\u0003\u0018\f\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u000f"+
		"\u0000\u0000\u0082\u0083\u0005*\u0000\u0000\u0083\u0085\u0005\u001e\u0000"+
		"\u0000\u0084\u0086\u0003\u001a\r\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0005\u001e\u0000\u0000\u0088\u0089\u0005%\u0000\u0000\u0089"+
		"\u008a\u0003\n\u0005\u0000\u008a\u008c\u0005\u001f\u0000\u0000\u008b\u008d"+
		"\u0003\u001e\u000f\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0003\u001c\u000e\u0000\u0091\u0092\u0005\u001f\u0000\u0000\u0092\u0017"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0010\u0000\u0000\u0094\u0095"+
		"\u0005*\u0000\u0000\u0095\u0097\u0005\u001e\u0000\u0000\u0096\u0098\u0003"+
		"\u001a\r\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u001e"+
		"\u0000\u0000\u009a\u009c\u0005\u001f\u0000\u0000\u009b\u009d\u0003\u001e"+
		"\u000f\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u001f"+
		"\u0000\u0000\u00a1\u0019\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005*\u0000"+
		"\u0000\u00a3\u00a4\u0005%\u0000\u0000\u00a4\u00ab\u0003\n\u0005\u0000"+
		"\u00a5\u00a6\u0005$\u0000\u0000\u00a6\u00a7\u0005*\u0000\u0000\u00a7\u00a8"+
		"\u0005%\u0000\u0000\u00a8\u00aa\u0003\n\u0005\u0000\u00a9\u00a5\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u001b\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		"\u0011\u0000\u0000\u00af\u00b0\u0003,\u0016\u0000\u00b0\u00b1\u0005!\u0000"+
		"\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b8\u0003 \u0010\u0000"+
		"\u00b3\u00b8\u0003\"\u0011\u0000\u00b4\u00b8\u0003$\u0012\u0000\u00b5"+
		"\u00b8\u0003&\u0013\u0000\u00b6\u00b8\u0003*\u0015\u0000\u00b7\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u001f\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"*\u0000\u0000\u00ba\u00bb\u0005\"\u0000\u0000\u00bb\u00bc\u0003,\u0016"+
		"\u0000\u00bc\u00bd\u0005!\u0000\u0000\u00bd!\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u000e\u0000\u0000\u00bf\u00c0\u0005\u001e\u0000\u0000\u00c0"+
		"\u00c1\u0005)\u0000\u0000\u00c1\u00c2\u0005\u001e\u0000\u0000\u00c2\u00d7"+
		"\u0005!\u0000\u0000\u00c3\u00c4\u0005\n\u0000\u0000\u00c4\u00c5\u0005"+
		"\u001e\u0000\u0000\u00c5\u00c6\u0005)\u0000\u0000\u00c6\u00c7\u0005\u001e"+
		"\u0000\u0000\u00c7\u00d7\u0005!\u0000\u0000\u00c8\u00c9\u0005\u000b\u0000"+
		"\u0000\u00c9\u00ca\u0005\u001e\u0000\u0000\u00ca\u00cb\u0005(\u0000\u0000"+
		"\u00cb\u00cc\u0005\u001e\u0000\u0000\u00cc\u00d7\u0005!\u0000\u0000\u00cd"+
		"\u00ce\u0005\f\u0000\u0000\u00ce\u00cf\u0005\u001e\u0000\u0000\u00cf\u00d0"+
		"\u0005\u001e\u0000\u0000\u00d0\u00d7\u0005!\u0000\u0000\u00d1\u00d2\u0005"+
		"\r\u0000\u0000\u00d2\u00d3\u0005\u001e\u0000\u0000\u00d3\u00d4\u0005)"+
		"\u0000\u0000\u00d4\u00d5\u0005\u001e\u0000\u0000\u00d5\u00d7\u0005!\u0000"+
		"\u0000\u00d6\u00be\u0001\u0000\u0000\u0000\u00d6\u00c3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00c8\u0001\u0000\u0000\u0000\u00d6\u00cd\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d1\u0001\u0000\u0000\u0000\u00d7#\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005\b\u0000\u0000\u00d9\u00da\u0005\u001e\u0000\u0000\u00da"+
		"\u00db\u0003,\u0016\u0000\u00db\u00dc\u0005\u001e\u0000\u0000\u00dc\u00dd"+
		"\u0005!\u0000\u0000\u00dd\u00e4\u0001\u0000\u0000\u0000\u00de\u00df\u0005"+
		"\t\u0000\u0000\u00df\u00e0\u0005\u001e\u0000\u0000\u00e0\u00e1\u0005*"+
		"\u0000\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000\u00e2\u00e4\u0005!\u0000"+
		"\u0000\u00e3\u00d8\u0001\u0000\u0000\u0000\u00e3\u00de\u0001\u0000\u0000"+
		"\u0000\u00e4%\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u0003\u0000\u0000"+
		"\u00e6\u00e7\u0005\u001e\u0000\u0000\u00e7\u00e8\u00030\u0018\u0000\u00e8"+
		"\u00e9\u0005\u001e\u0000\u0000\u00e9\u00ea\u0005\u0004\u0000\u0000\u00ea"+
		"\u00ed\u0003(\u0014\u0000\u00eb\u00ec\u0005\u0005\u0000\u0000\u00ec\u00ee"+
		"\u0003(\u0014\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u0108\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"\u0006\u0000\u0000\u00f0\u00f1\u0005\u001e\u0000\u0000\u00f1\u00f2\u0003"+
		"0\u0018\u0000\u00f2\u00f3\u0005\u001e\u0000\u0000\u00f3\u00f4\u0005\u0007"+
		"\u0000\u0000\u00f4\u00f5\u0003(\u0014\u0000\u00f5\u0108\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0005\u0012\u0000\u0000\u00f7\u00f8\u0005*\u0000\u0000"+
		"\u00f8\u00f9\u0005\"\u0000\u0000\u00f9\u00fa\u0003,\u0016\u0000\u00fa"+
		"\u00fb\u0005\u0013\u0000\u0000\u00fb\u00fc\u0003,\u0016\u0000\u00fc\u00fd"+
		"\u0005\u0007\u0000\u0000\u00fd\u00fe\u0003(\u0014\u0000\u00fe\u0108\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\u0015\u0000\u0000\u0100\u0101\u0003"+
		"(\u0014\u0000\u0101\u0102\u0005\u0006\u0000\u0000\u0102\u0103\u0005\u001e"+
		"\u0000\u0000\u0103\u0104\u00030\u0018\u0000\u0104\u0105\u0005\u001e\u0000"+
		"\u0000\u0105\u0106\u0005!\u0000\u0000\u0106\u0108\u0001\u0000\u0000\u0000"+
		"\u0107\u00e5\u0001\u0000\u0000\u0000\u0107\u00ef\u0001\u0000\u0000\u0000"+
		"\u0107\u00f6\u0001\u0000\u0000\u0000\u0107\u00ff\u0001\u0000\u0000\u0000"+
		"\u0108\'\u0001\u0000\u0000\u0000\u0109\u010b\u0005\u001f\u0000\u0000\u010a"+
		"\u010c\u0003\u001e\u000f\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005\u001f\u0000\u0000\u0110)\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0005*\u0000\u0000\u0112\u011b\u0005\u001e\u0000\u0000\u0113\u0118\u0003"+
		",\u0016\u0000\u0114\u0115\u0005$\u0000\u0000\u0115\u0117\u0003,\u0016"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u001e\u0000"+
		"\u0000\u011e\u011f\u0005!\u0000\u0000\u011f+\u0001\u0000\u0000\u0000\u0120"+
		"\u0125\u0003.\u0017\u0000\u0121\u0122\u0005&\u0000\u0000\u0122\u0124\u0003"+
		".\u0017\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126-\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0128\u0139\u0005(\u0000\u0000\u0129\u0139\u0005)\u0000\u0000\u012a"+
		"\u0139\u0005*\u0000\u0000\u012b\u012c\u0005*\u0000\u0000\u012c\u012d\u0005"+
		" \u0000\u0000\u012d\u012e\u0003,\u0016\u0000\u012e\u012f\u0005 \u0000"+
		"\u0000\u012f\u0139\u0001\u0000\u0000\u0000\u0130\u0131\u0005*\u0000\u0000"+
		"\u0131\u0132\u0005#\u0000\u0000\u0132\u0139\u0005*\u0000\u0000\u0133\u0139"+
		"\u0003*\u0015\u0000\u0134\u0135\u0005\u001e\u0000\u0000\u0135\u0136\u0003"+
		",\u0016\u0000\u0136\u0137\u0005\u001e\u0000\u0000\u0137\u0139\u0001\u0000"+
		"\u0000\u0000\u0138\u0128\u0001\u0000\u0000\u0000\u0138\u0129\u0001\u0000"+
		"\u0000\u0000\u0138\u012a\u0001\u0000\u0000\u0000\u0138\u012b\u0001\u0000"+
		"\u0000\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0138\u0133\u0001\u0000"+
		"\u0000\u0000\u0138\u0134\u0001\u0000\u0000\u0000\u0139/\u0001\u0000\u0000"+
		"\u0000\u013a\u013d\u0003,\u0016\u0000\u013b\u013c\u0005&\u0000\u0000\u013c"+
		"\u013e\u0003,\u0016\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u0144\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0003,\u0016\u0000\u0140\u0141\u0005\'\u0000\u0000\u0141\u0142\u0003"+
		",\u0016\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u013a\u0001\u0000"+
		"\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u01441\u0001\u0000\u0000"+
		"\u0000\u00196<DTZev\u007f\u0085\u008e\u0097\u009e\u00ab\u00b7\u00d6\u00e3"+
		"\u00ed\u0107\u010d\u0118\u011b\u0125\u0138\u013d\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}