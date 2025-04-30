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
		STRING=41, ID=42, WS=43, COMMENT=44, MULTILINE_COMMENT=45, ESCREVA_SEM_QUEBRA=46, 
		CONCATENAR=47, PARA_TEXTO=48, PARA_NUMERO=49, CRIAR_VETOR=50, TAMANHO=51;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_constante = 2, RULE_tipagem = 3, 
		RULE_tipoDefinicao = 4, RULE_tipoSimples = 5, RULE_tipoEstruturado = 6, 
		RULE_registroTipo = 7, RULE_vetorTipo = 8, RULE_variavel = 9, RULE_funcaoProcedimento = 10, 
		RULE_funcao = 11, RULE_procedimento = 12, RULE_parametro = 13, RULE_retorno = 14, 
		RULE_comando = 15, RULE_atribuicao = 16, RULE_futebol = 17, RULE_io = 18, 
		RULE_controle = 19, RULE_bloco = 20, RULE_chamadaFuncao = 21, RULE_expressao = 22, 
		RULE_concatenacao = 23, RULE_termo = 24, RULE_conversor = 25, RULE_arrayOp = 26, 
		RULE_condicao = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "constante", "tipagem", "tipoDefinicao", "tipoSimples", 
			"tipoEstruturado", "registroTipo", "vetorTipo", "variavel", "funcaoProcedimento", 
			"funcao", "procedimento", "parametro", "retorno", "comando", "atribuicao", 
			"futebol", "io", "controle", "bloco", "chamadaFuncao", "expressao", "concatenacao", 
			"termo", "conversor", "arrayOp", "condicao"
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
			"':='", "'.'", "','", "':'", null, null, null, null, null, null, null, 
			null, "'escreva_sem_quebra'", "'++'", "'para_texto'", "'para_numero'", 
			"'criar_vetor'", "'tamanho'"
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
			"MULTILINE_COMMENT", "ESCREVA_SEM_QUEBRA", "CONCATENAR", "PARA_TEXTO", 
			"PARA_NUMERO", "CRIAR_VETOR", "TAMANHO"
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
			setState(56);
			match(START);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29458432L) != 0)) {
				{
				{
				setState(57);
				declaracao();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				comando();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766793080648L) != 0) );
			setState(68);
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				tipagem();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				variavel();
				}
				break;
			case FUNCAO:
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
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
			setState(76);
			match(CONST);
			setState(77);
			match(ID);
			setState(78);
			match(ASSIGN);
			setState(79);
			expressao();
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
			setState(82);
			match(TIPO);
			setState(83);
			match(ID);
			setState(84);
			match(ASSIGN);
			setState(85);
			tipoDefinicao();
			setState(86);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case TEXTO:
			case BOOLEANO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				tipoSimples();
				}
				break;
			case REGISTRO:
			case VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
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
			setState(92);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				registroTipo();
				}
				break;
			case VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
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
			setState(98);
			match(REGISTRO);
			setState(99);
			match(CHAVE);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				match(ID);
				setState(101);
				match(DOISPONTOS);
				setState(102);
				tipoDefinicao();
				setState(103);
				match(DELIMITER);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(109);
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
			setState(111);
			match(VETOR);
			setState(112);
			match(COLCHETE);
			setState(113);
			expressao();
			setState(114);
			match(COLCHETE);
			setState(115);
			match(DE);
			setState(116);
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
			setState(118);
			match(VAR);
			setState(119);
			match(ID);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(120);
				match(VIRGULA);
				setState(121);
				match(ID);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(DOISPONTOS);
			setState(128);
			tipoSimples();
			setState(129);
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
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				funcao();
				}
				break;
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
			setState(135);
			match(FUNCAO);
			setState(136);
			match(ID);
			setState(137);
			match(PARENTESE);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(138);
				parametro();
				}
			}

			setState(141);
			match(PARENTESE);
			setState(142);
			match(DOISPONTOS);
			setState(143);
			tipoSimples();
			setState(144);
			match(CHAVE);
			setState(146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(145);
				comando();
				}
				}
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766793080648L) != 0) );
			setState(150);
			retorno();
			setState(151);
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
			setState(153);
			match(PROCEDIMENTO);
			setState(154);
			match(ID);
			setState(155);
			match(PARENTESE);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(156);
				parametro();
				}
			}

			setState(159);
			match(PARENTESE);
			setState(160);
			match(CHAVE);
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				comando();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766793080648L) != 0) );
			setState(166);
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
			setState(168);
			match(ID);
			setState(169);
			match(DOISPONTOS);
			setState(170);
			tipoSimples();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(171);
				match(VIRGULA);
				setState(172);
				match(ID);
				setState(173);
				match(DOISPONTOS);
				setState(174);
				tipoSimples();
				}
				}
				setState(179);
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
			setState(180);
			match(RETORNA);
			setState(181);
			expressao();
			setState(182);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				futebol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				io();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				controle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188);
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
			setState(191);
			match(ID);
			setState(192);
			match(ASSIGN);
			setState(193);
			expressao();
			setState(194);
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
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VASCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(VASCO);
				setState(197);
				match(PARENTESE);
				setState(198);
				match(STRING);
				setState(199);
				match(PARENTESE);
				setState(200);
				match(DELIMITER);
				}
				break;
			case FLAMENGO:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(FLAMENGO);
				setState(202);
				match(PARENTESE);
				setState(203);
				match(STRING);
				setState(204);
				match(PARENTESE);
				setState(205);
				match(DELIMITER);
				}
				break;
			case CORINTHIANS:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(CORINTHIANS);
				setState(207);
				match(PARENTESE);
				setState(208);
				match(NUMBER);
				setState(209);
				match(PARENTESE);
				setState(210);
				match(DELIMITER);
				}
				break;
			case PALMEIRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				match(PALMEIRAS);
				setState(212);
				match(PARENTESE);
				setState(213);
				match(PARENTESE);
				setState(214);
				match(DELIMITER);
				}
				break;
			case SANTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(SANTOS);
				setState(216);
				match(PARENTESE);
				setState(217);
				match(STRING);
				setState(218);
				match(PARENTESE);
				setState(219);
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
		public TerminalNode ESCREVA_SEM_QUEBRA() { return getToken(TimemaniaParser.ESCREVA_SEM_QUEBRA, 0); }
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
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ESCREVA);
				setState(223);
				match(PARENTESE);
				setState(224);
				expressao();
				setState(225);
				match(PARENTESE);
				setState(226);
				match(DELIMITER);
				}
				break;
			case ESCREVA_SEM_QUEBRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(ESCREVA_SEM_QUEBRA);
				setState(229);
				match(PARENTESE);
				setState(230);
				expressao();
				setState(231);
				match(PARENTESE);
				setState(232);
				match(DELIMITER);
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(LEIA);
				setState(235);
				match(PARENTESE);
				setState(236);
				match(ID);
				setState(237);
				match(PARENTESE);
				setState(238);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(SE);
				setState(242);
				match(PARENTESE);
				setState(243);
				condicao();
				setState(244);
				match(PARENTESE);
				setState(245);
				match(ENTAO);
				setState(246);
				bloco();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENAO) {
					{
					setState(247);
					match(SENAO);
					setState(248);
					bloco();
					}
				}

				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(ENQUANTO);
				setState(252);
				match(PARENTESE);
				setState(253);
				condicao();
				setState(254);
				match(PARENTESE);
				setState(255);
				match(FACA);
				setState(256);
				bloco();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				match(PARA);
				setState(259);
				match(ID);
				setState(260);
				match(ASSIGN);
				setState(261);
				expressao();
				setState(262);
				match(ATE);
				setState(263);
				expressao();
				setState(264);
				match(FACA);
				setState(265);
				bloco();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(REPITA);
				setState(268);
				bloco();
				setState(269);
				match(ENQUANTO);
				setState(270);
				match(PARENTESE);
				setState(271);
				condicao();
				setState(272);
				match(PARENTESE);
				setState(273);
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
			setState(277);
			match(CHAVE);
			setState(279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				comando();
				}
				}
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 74766793080648L) != 0) );
			setState(283);
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
			setState(285);
			match(ID);
			setState(286);
			match(PARENTESE);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(287);
				expressao();
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(288);
					match(VIRGULA);
					setState(289);
					expressao();
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(297);
			match(PARENTESE);
			setState(298);
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
		public ConcatenacaoContext concatenacao() {
			return getRuleContext(ConcatenacaoContext.class,0);
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				termo();
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(301);
						match(OPERATOR);
						setState(302);
						termo();
						}
						} 
					}
					setState(307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				concatenacao();
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
	public static class ConcatenacaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public TerminalNode CONCATENAR() { return getToken(TimemaniaParser.CONCATENAR, 0); }
		public ConcatenacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenacao; }
	}

	public final ConcatenacaoContext concatenacao() throws RecognitionException {
		ConcatenacaoContext _localctx = new ConcatenacaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_concatenacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			termo();
			setState(312);
			match(CONCATENAR);
			setState(313);
			termo();
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
		public ConversorContext conversor() {
			return getRuleContext(ConversorContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termo);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(ID);
				setState(319);
				match(COLCHETE);
				setState(320);
				expressao();
				setState(321);
				match(COLCHETE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				match(ID);
				setState(324);
				match(PONTO);
				setState(325);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(326);
				chamadaFuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(327);
				match(PARENTESE);
				setState(328);
				expressao();
				setState(329);
				match(PARENTESE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(331);
				conversor();
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
	public static class ConversorContext extends ParserRuleContext {
		public TerminalNode PARA_TEXTO() { return getToken(TimemaniaParser.PARA_TEXTO, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PARA_NUMERO() { return getToken(TimemaniaParser.PARA_NUMERO, 0); }
		public ConversorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversor; }
	}

	public final ConversorContext conversor() throws RecognitionException {
		ConversorContext _localctx = new ConversorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_conversor);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARA_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(PARA_TEXTO);
				setState(335);
				match(PARENTESE);
				setState(336);
				expressao();
				setState(337);
				match(PARENTESE);
				}
				break;
			case PARA_NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				match(PARA_NUMERO);
				setState(340);
				match(PARENTESE);
				setState(341);
				expressao();
				setState(342);
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
	public static class ArrayOpContext extends ParserRuleContext {
		public TerminalNode CRIAR_VETOR() { return getToken(TimemaniaParser.CRIAR_VETOR, 0); }
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode TAMANHO() { return getToken(TimemaniaParser.TAMANHO, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public ArrayOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOp; }
	}

	public final ArrayOpContext arrayOp() throws RecognitionException {
		ArrayOpContext _localctx = new ArrayOpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayOp);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRIAR_VETOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(CRIAR_VETOR);
				setState(347);
				match(PARENTESE);
				setState(348);
				expressao();
				setState(349);
				match(PARENTESE);
				}
				break;
			case TAMANHO:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(TAMANHO);
				setState(352);
				match(PARENTESE);
				setState(353);
				match(ID);
				setState(354);
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
		public TerminalNode COMPARADOR() { return getToken(TimemaniaParser.COMPARADOR, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicao);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				expressao();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPERATOR) {
					{
					setState(358);
					match(OPERATOR);
					setState(359);
					expressao();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				expressao();
				setState(363);
				match(COMPARADOR);
				setState(364);
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
		"\u0004\u00013\u0171\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0000\u0004\u0000A\b\u0000\u000b\u0000\f\u0000B\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001K\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006a\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007j\b\u0007\u000b\u0007\f\u0007k\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t{\b\t\n\t\f\t~\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\n\u0086\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u008c\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0093\b\u000b\u000b\u000b\f\u000b\u0094\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009e"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0004\f\u00a3\b\f\u000b\f\f\f\u00a4\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00b0\b\r\n\r\f\r\u00b3\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00be\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00dd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00f0\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00fa\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0114\b\u0013\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u0118\b\u0014\u000b\u0014\f\u0014\u0119\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u0123\b\u0015\n\u0015\f\u0015\u0126\t\u0015\u0003\u0015\u0128\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u0130\b\u0016\n\u0016\f\u0016\u0133\t\u0016\u0001\u0016\u0003"+
		"\u0016\u0136\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u014d"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0159"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0164\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0169\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u016f\b\u001b\u0001\u001b\u0000"+
		"\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0001\u0002\u0000\u001b\u001d"+
		"**\u0181\u00008\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000"+
		"\u0004L\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bZ\u0001"+
		"\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000"+
		"\u000eb\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012v"+
		"\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000\u0016\u0087"+
		"\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u00a8"+
		"\u0001\u0000\u0000\u0000\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00bd"+
		"\u0001\u0000\u0000\u0000 \u00bf\u0001\u0000\u0000\u0000\"\u00dc\u0001"+
		"\u0000\u0000\u0000$\u00ef\u0001\u0000\u0000\u0000&\u0113\u0001\u0000\u0000"+
		"\u0000(\u0115\u0001\u0000\u0000\u0000*\u011d\u0001\u0000\u0000\u0000,"+
		"\u0135\u0001\u0000\u0000\u0000.\u0137\u0001\u0000\u0000\u00000\u014c\u0001"+
		"\u0000\u0000\u00002\u0158\u0001\u0000\u0000\u00004\u0163\u0001\u0000\u0000"+
		"\u00006\u016e\u0001\u0000\u0000\u00008<\u0005\u0001\u0000\u00009;\u0003"+
		"\u0002\u0001\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?A\u0003\u001e\u000f\u0000@?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\u0002\u0000\u0000"+
		"E\u0001\u0001\u0000\u0000\u0000FK\u0003\u0004\u0002\u0000GK\u0003\u0006"+
		"\u0003\u0000HK\u0003\u0012\t\u0000IK\u0003\u0014\n\u0000JF\u0001\u0000"+
		"\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LM\u0005\u0018\u0000"+
		"\u0000MN\u0005*\u0000\u0000NO\u0005\"\u0000\u0000OP\u0003,\u0016\u0000"+
		"PQ\u0005!\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RS\u0005\u0016\u0000"+
		"\u0000ST\u0005*\u0000\u0000TU\u0005\"\u0000\u0000UV\u0003\b\u0004\u0000"+
		"VW\u0005!\u0000\u0000W\u0007\u0001\u0000\u0000\u0000X[\u0003\n\u0005\u0000"+
		"Y[\u0003\f\u0006\u0000ZX\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\t\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000]\u000b\u0001\u0000"+
		"\u0000\u0000^a\u0003\u000e\u0007\u0000_a\u0003\u0010\b\u0000`^\u0001\u0000"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000a\r\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0019\u0000\u0000ci\u0005\u001f\u0000\u0000de\u0005*\u0000\u0000ef\u0005"+
		"%\u0000\u0000fg\u0003\b\u0004\u0000gh\u0005!\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000id\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0005\u001f\u0000\u0000n\u000f\u0001\u0000\u0000\u0000op\u0005\u001a"+
		"\u0000\u0000pq\u0005 \u0000\u0000qr\u0003,\u0016\u0000rs\u0005 \u0000"+
		"\u0000st\u0005\u0014\u0000\u0000tu\u0003\n\u0005\u0000u\u0011\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0017\u0000\u0000w|\u0005*\u0000\u0000xy\u0005$\u0000"+
		"\u0000y{\u0005*\u0000\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005%\u0000"+
		"\u0000\u0080\u0081\u0003\n\u0005\u0000\u0081\u0082\u0005!\u0000\u0000"+
		"\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0086\u0003\u0016\u000b\u0000"+
		"\u0084\u0086\u0003\u0018\f\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005\u000f\u0000\u0000\u0088\u0089\u0005*\u0000\u0000\u0089\u008b"+
		"\u0005\u001e\u0000\u0000\u008a\u008c\u0003\u001a\r\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u001e\u0000\u0000\u008e\u008f\u0005"+
		"%\u0000\u0000\u008f\u0090\u0003\n\u0005\u0000\u0090\u0092\u0005\u001f"+
		"\u0000\u0000\u0091\u0093\u0003\u001e\u000f\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0003\u001c\u000e\u0000\u0097\u0098\u0005\u001f"+
		"\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0010"+
		"\u0000\u0000\u009a\u009b\u0005*\u0000\u0000\u009b\u009d\u0005\u001e\u0000"+
		"\u0000\u009c\u009e\u0003\u001a\r\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u001e\u0000\u0000\u00a0\u00a2\u0005\u001f\u0000\u0000"+
		"\u00a1\u00a3\u0003\u001e\u000f\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005\u001f\u0000\u0000\u00a7\u0019\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0005*\u0000\u0000\u00a9\u00aa\u0005%\u0000\u0000\u00aa\u00b1"+
		"\u0003\n\u0005\u0000\u00ab\u00ac\u0005$\u0000\u0000\u00ac\u00ad\u0005"+
		"*\u0000\u0000\u00ad\u00ae\u0005%\u0000\u0000\u00ae\u00b0\u0003\n\u0005"+
		"\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0011\u0000\u0000\u00b5\u00b6\u0003,\u0016\u0000"+
		"\u00b6\u00b7\u0005!\u0000\u0000\u00b7\u001d\u0001\u0000\u0000\u0000\u00b8"+
		"\u00be\u0003 \u0010\u0000\u00b9\u00be\u0003\"\u0011\u0000\u00ba\u00be"+
		"\u0003$\u0012\u0000\u00bb\u00be\u0003&\u0013\u0000\u00bc\u00be\u0003*"+
		"\u0015\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u001f\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005*\u0000\u0000\u00c0\u00c1\u0005\"\u0000"+
		"\u0000\u00c1\u00c2\u0003,\u0016\u0000\u00c2\u00c3\u0005!\u0000\u0000\u00c3"+
		"!\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u000e\u0000\u0000\u00c5\u00c6"+
		"\u0005\u001e\u0000\u0000\u00c6\u00c7\u0005)\u0000\u0000\u00c7\u00c8\u0005"+
		"\u001e\u0000\u0000\u00c8\u00dd\u0005!\u0000\u0000\u00c9\u00ca\u0005\n"+
		"\u0000\u0000\u00ca\u00cb\u0005\u001e\u0000\u0000\u00cb\u00cc\u0005)\u0000"+
		"\u0000\u00cc\u00cd\u0005\u001e\u0000\u0000\u00cd\u00dd\u0005!\u0000\u0000"+
		"\u00ce\u00cf\u0005\u000b\u0000\u0000\u00cf\u00d0\u0005\u001e\u0000\u0000"+
		"\u00d0\u00d1\u0005(\u0000\u0000\u00d1\u00d2\u0005\u001e\u0000\u0000\u00d2"+
		"\u00dd\u0005!\u0000\u0000\u00d3\u00d4\u0005\f\u0000\u0000\u00d4\u00d5"+
		"\u0005\u001e\u0000\u0000\u00d5\u00d6\u0005\u001e\u0000\u0000\u00d6\u00dd"+
		"\u0005!\u0000\u0000\u00d7\u00d8\u0005\r\u0000\u0000\u00d8\u00d9\u0005"+
		"\u001e\u0000\u0000\u00d9\u00da\u0005)\u0000\u0000\u00da\u00db\u0005\u001e"+
		"\u0000\u0000\u00db\u00dd\u0005!\u0000\u0000\u00dc\u00c4\u0001\u0000\u0000"+
		"\u0000\u00dc\u00c9\u0001\u0000\u0000\u0000\u00dc\u00ce\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d3\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000"+
		"\u0000\u00dd#\u0001\u0000\u0000\u0000\u00de\u00df\u0005\b\u0000\u0000"+
		"\u00df\u00e0\u0005\u001e\u0000\u0000\u00e0\u00e1\u0003,\u0016\u0000\u00e1"+
		"\u00e2\u0005\u001e\u0000\u0000\u00e2\u00e3\u0005!\u0000\u0000\u00e3\u00f0"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005.\u0000\u0000\u00e5\u00e6\u0005"+
		"\u001e\u0000\u0000\u00e6\u00e7\u0003,\u0016\u0000\u00e7\u00e8\u0005\u001e"+
		"\u0000\u0000\u00e8\u00e9\u0005!\u0000\u0000\u00e9\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005\t\u0000\u0000\u00eb\u00ec\u0005\u001e\u0000\u0000"+
		"\u00ec\u00ed\u0005*\u0000\u0000\u00ed\u00ee\u0005\u001e\u0000\u0000\u00ee"+
		"\u00f0\u0005!\u0000\u0000\u00ef\u00de\u0001\u0000\u0000\u0000\u00ef\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000\u0000\u00f0%\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2\u00f3\u0005"+
		"\u001e\u0000\u0000\u00f3\u00f4\u00036\u001b\u0000\u00f4\u00f5\u0005\u001e"+
		"\u0000\u0000\u00f5\u00f6\u0005\u0004\u0000\u0000\u00f6\u00f9\u0003(\u0014"+
		"\u0000\u00f7\u00f8\u0005\u0005\u0000\u0000\u00f8\u00fa\u0003(\u0014\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u0114\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0006\u0000\u0000"+
		"\u00fc\u00fd\u0005\u001e\u0000\u0000\u00fd\u00fe\u00036\u001b\u0000\u00fe"+
		"\u00ff\u0005\u001e\u0000\u0000\u00ff\u0100\u0005\u0007\u0000\u0000\u0100"+
		"\u0101\u0003(\u0014\u0000\u0101\u0114\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\u0012\u0000\u0000\u0103\u0104\u0005*\u0000\u0000\u0104\u0105\u0005"+
		"\"\u0000\u0000\u0105\u0106\u0003,\u0016\u0000\u0106\u0107\u0005\u0013"+
		"\u0000\u0000\u0107\u0108\u0003,\u0016\u0000\u0108\u0109\u0005\u0007\u0000"+
		"\u0000\u0109\u010a\u0003(\u0014\u0000\u010a\u0114\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0015\u0000\u0000\u010c\u010d\u0003(\u0014\u0000\u010d"+
		"\u010e\u0005\u0006\u0000\u0000\u010e\u010f\u0005\u001e\u0000\u0000\u010f"+
		"\u0110\u00036\u001b\u0000\u0110\u0111\u0005\u001e\u0000\u0000\u0111\u0112"+
		"\u0005!\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u00f1\u0001"+
		"\u0000\u0000\u0000\u0113\u00fb\u0001\u0000\u0000\u0000\u0113\u0102\u0001"+
		"\u0000\u0000\u0000\u0113\u010b\u0001\u0000\u0000\u0000\u0114\'\u0001\u0000"+
		"\u0000\u0000\u0115\u0117\u0005\u001f\u0000\u0000\u0116\u0118\u0003\u001e"+
		"\u000f\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005\u001f"+
		"\u0000\u0000\u011c)\u0001\u0000\u0000\u0000\u011d\u011e\u0005*\u0000\u0000"+
		"\u011e\u0127\u0005\u001e\u0000\u0000\u011f\u0124\u0003,\u0016\u0000\u0120"+
		"\u0121\u0005$\u0000\u0000\u0121\u0123\u0003,\u0016\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u011f\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0005\u001e\u0000\u0000\u012a\u012b\u0005"+
		"!\u0000\u0000\u012b+\u0001\u0000\u0000\u0000\u012c\u0131\u00030\u0018"+
		"\u0000\u012d\u012e\u0005&\u0000\u0000\u012e\u0130\u00030\u0018\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0136\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134"+
		"\u0136\u0003.\u0017\u0000\u0135\u012c\u0001\u0000\u0000\u0000\u0135\u0134"+
		"\u0001\u0000\u0000\u0000\u0136-\u0001\u0000\u0000\u0000\u0137\u0138\u0003"+
		"0\u0018\u0000\u0138\u0139\u0005/\u0000\u0000\u0139\u013a\u00030\u0018"+
		"\u0000\u013a/\u0001\u0000\u0000\u0000\u013b\u014d\u0005(\u0000\u0000\u013c"+
		"\u014d\u0005)\u0000\u0000\u013d\u014d\u0005*\u0000\u0000\u013e\u013f\u0005"+
		"*\u0000\u0000\u013f\u0140\u0005 \u0000\u0000\u0140\u0141\u0003,\u0016"+
		"\u0000\u0141\u0142\u0005 \u0000\u0000\u0142\u014d\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005*\u0000\u0000\u0144\u0145\u0005#\u0000\u0000\u0145\u014d"+
		"\u0005*\u0000\u0000\u0146\u014d\u0003*\u0015\u0000\u0147\u0148\u0005\u001e"+
		"\u0000\u0000\u0148\u0149\u0003,\u0016\u0000\u0149\u014a\u0005\u001e\u0000"+
		"\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u014d\u00032\u0019\u0000"+
		"\u014c\u013b\u0001\u0000\u0000\u0000\u014c\u013c\u0001\u0000\u0000\u0000"+
		"\u014c\u013d\u0001\u0000\u0000\u0000\u014c\u013e\u0001\u0000\u0000\u0000"+
		"\u014c\u0143\u0001\u0000\u0000\u0000\u014c\u0146\u0001\u0000\u0000\u0000"+
		"\u014c\u0147\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000"+
		"\u014d1\u0001\u0000\u0000\u0000\u014e\u014f\u00050\u0000\u0000\u014f\u0150"+
		"\u0005\u001e\u0000\u0000\u0150\u0151\u0003,\u0016\u0000\u0151\u0152\u0005"+
		"\u001e\u0000\u0000\u0152\u0159\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"1\u0000\u0000\u0154\u0155\u0005\u001e\u0000\u0000\u0155\u0156\u0003,\u0016"+
		"\u0000\u0156\u0157\u0005\u001e\u0000\u0000\u0157\u0159\u0001\u0000\u0000"+
		"\u0000\u0158\u014e\u0001\u0000\u0000\u0000\u0158\u0153\u0001\u0000\u0000"+
		"\u0000\u01593\u0001\u0000\u0000\u0000\u015a\u015b\u00052\u0000\u0000\u015b"+
		"\u015c\u0005\u001e\u0000\u0000\u015c\u015d\u0003,\u0016\u0000\u015d\u015e"+
		"\u0005\u001e\u0000\u0000\u015e\u0164\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u00053\u0000\u0000\u0160\u0161\u0005\u001e\u0000\u0000\u0161\u0162\u0005"+
		"*\u0000\u0000\u0162\u0164\u0005\u001e\u0000\u0000\u0163\u015a\u0001\u0000"+
		"\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000\u01645\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\u0003,\u0016\u0000\u0166\u0167\u0005&\u0000\u0000\u0167"+
		"\u0169\u0003,\u0016\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0001\u0000\u0000\u0000\u0169\u016f\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0003,\u0016\u0000\u016b\u016c\u0005\'\u0000\u0000\u016c\u016d\u0003"+
		",\u0016\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0165\u0001\u0000"+
		"\u0000\u0000\u016e\u016a\u0001\u0000\u0000\u0000\u016f7\u0001\u0000\u0000"+
		"\u0000\u001c<BJZ`k|\u0085\u008b\u0094\u009d\u00a4\u00b1\u00bd\u00dc\u00ef"+
		"\u00f9\u0113\u0119\u0124\u0127\u0131\u0135\u014c\u0158\u0163\u0168\u016e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}