// Generated from /Users/eduardovinicius/Compiladores---2025-1/Timemania/src/TimemaniaParser.g4 by ANTLR 4.13.1
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
		START=1, END=2, CONST=3, TIPO=4, VAR=5, FUNCAO=6, PROCEDIMENTO=7, RETORNA=8, 
		SE=9, ENTAO=10, SENAO=11, ENQUANTO=12, FACA=13, PARA=14, ATE=15, REPITA=16, 
		DE=17, INTEIRO=18, TEXTO=19, BOOLEANO=20, OR=21, AND=22, NOT=23, COMPARADOR=24, 
		OPERADOR_ARITMETICO=25, ASSIGN=26, CONCATENAR=27, DELIMITER=28, DOISPONTOS=29, 
		VIRGULA=30, PONTO=31, ABRE_PARENTESE=32, FECHA_PARENTESE=33, ABRE_CHAVE=34, 
		FECHA_CHAVE=35, ABRE_COLCHETE=36, FECHA_COLCHETE=37, ID=38, NUMBER=39, 
		STRING=40, WS=41, LINE_COMMENT=42, BLOCK_COMMENT=43, ESCREVA=44, ESCREVA_SEM_QUEBRA=45, 
		LEIA=46, CRIAR_VETOR=47, TAMANHO=48, REGISTRO=49, VASCO=50, FLAMENGO=51, 
		CORINTHIANS=52, PALMEIRAS=53, SANTOS=54;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_constante = 2, RULE_tipagem = 3, 
		RULE_tipoDefinicao = 4, RULE_tipoSimples = 5, RULE_tipoEstruturado = 6, 
		RULE_registroTipo = 7, RULE_vetorTipo = 8, RULE_variavel = 9, RULE_variavelSimples = 10, 
		RULE_funcaoProcedimento = 11, RULE_funcao = 12, RULE_procedimento = 13, 
		RULE_parametro = 14, RULE_retorno = 15, RULE_comando = 16, RULE_atribuicao = 17, 
		RULE_futebol = 18, RULE_io = 19, RULE_controle = 20, RULE_bloco = 21, 
		RULE_chamadaFuncao = 22, RULE_expressaoGeral = 23, RULE_expressao = 24, 
		RULE_concatenacao = 25, RULE_termo = 26, RULE_arrayOp = 27, RULE_condicao = 28, 
		RULE_condicaoOr = 29, RULE_condicaoAnd = 30, RULE_condicaoUnary = 31, 
		RULE_condicaoAtom = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "constante", "tipagem", "tipoDefinicao", "tipoSimples", 
			"tipoEstruturado", "registroTipo", "vetorTipo", "variavel", "variavelSimples", 
			"funcaoProcedimento", "funcao", "procedimento", "parametro", "retorno", 
			"comando", "atribuicao", "futebol", "io", "controle", "bloco", "chamadaFuncao", 
			"expressaoGeral", "expressao", "concatenacao", "termo", "arrayOp", "condicao", 
			"condicaoOr", "condicaoAnd", "condicaoUnary", "condicaoAtom"
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
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(START);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					declaracao();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				comando();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35026317292425728L) != 0) );
			setState(78);
			match(END);
			setState(79);
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
		public VariavelSimplesContext variavelSimples() {
			return getRuleContext(VariavelSimplesContext.class,0);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				tipagem();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				variavel();
				}
				break;
			case INTEIRO:
			case TEXTO:
			case BOOLEANO:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				variavelSimples();
				}
				break;
			case FUNCAO:
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
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
			setState(88);
			match(CONST);
			setState(89);
			match(ID);
			setState(90);
			match(ASSIGN);
			setState(91);
			expressaoGeral();
			setState(92);
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
			setState(94);
			match(TIPO);
			setState(95);
			match(ID);
			setState(96);
			match(ASSIGN);
			setState(97);
			tipoDefinicao();
			setState(98);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case TEXTO:
			case BOOLEANO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				tipoSimples();
				}
				break;
			case ABRE_CHAVE:
			case CRIAR_VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
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
			setState(104);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 274879741952L) != 0)) ) {
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				registroTipo();
				}
				break;
			case CRIAR_VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
		public TerminalNode ABRE_CHAVE() { return getToken(TimemaniaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(TimemaniaParser.FECHA_CHAVE, 0); }
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
			setState(110);
			match(ABRE_CHAVE);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				match(ID);
				setState(112);
				match(DOISPONTOS);
				setState(113);
				tipoDefinicao();
				setState(114);
				match(DELIMITER);
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(120);
			match(FECHA_CHAVE);
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
		public TerminalNode CRIAR_VETOR() { return getToken(TimemaniaParser.CRIAR_VETOR, 0); }
		public TerminalNode ABRE_COLCHETE() { return getToken(TimemaniaParser.ABRE_COLCHETE, 0); }
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(TimemaniaParser.FECHA_COLCHETE, 0); }
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
			setState(122);
			match(CRIAR_VETOR);
			setState(123);
			match(ABRE_COLCHETE);
			setState(124);
			expressaoGeral();
			setState(125);
			match(FECHA_COLCHETE);
			setState(126);
			match(DE);
			setState(127);
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
			setState(129);
			match(VAR);
			setState(130);
			match(ID);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(131);
				match(VIRGULA);
				setState(132);
				match(ID);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(DOISPONTOS);
			setState(139);
			tipoSimples();
			setState(140);
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
	public static class VariavelSimplesContext extends ParserRuleContext {
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public VariavelSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavelSimples; }
	}

	public final VariavelSimplesContext variavelSimples() throws RecognitionException {
		VariavelSimplesContext _localctx = new VariavelSimplesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variavelSimples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			tipoSimples();
			setState(143);
			match(ID);
			setState(144);
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
		enterRule(_localctx, 22, RULE_funcaoProcedimento);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				funcao();
				}
				break;
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
		public TerminalNode DOISPONTOS() { return getToken(TimemaniaParser.DOISPONTOS, 0); }
		public TipoSimplesContext tipoSimples() {
			return getRuleContext(TipoSimplesContext.class,0);
		}
		public TerminalNode ABRE_CHAVE() { return getToken(TimemaniaParser.ABRE_CHAVE, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(TimemaniaParser.FECHA_CHAVE, 0); }
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
		enterRule(_localctx, 24, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(FUNCAO);
			setState(151);
			match(ID);
			setState(152);
			match(ABRE_PARENTESE);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(153);
				parametro();
				}
			}

			setState(156);
			match(FECHA_PARENTESE);
			setState(157);
			match(DOISPONTOS);
			setState(158);
			tipoSimples();
			setState(159);
			match(ABRE_CHAVE);
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				comando();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35026317292425728L) != 0) );
			setState(165);
			retorno();
			setState(166);
			match(FECHA_CHAVE);
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
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(TimemaniaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(TimemaniaParser.FECHA_CHAVE, 0); }
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
		enterRule(_localctx, 26, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(PROCEDIMENTO);
			setState(169);
			match(ID);
			setState(170);
			match(ABRE_PARENTESE);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(171);
				parametro();
				}
			}

			setState(174);
			match(FECHA_PARENTESE);
			setState(175);
			match(ABRE_CHAVE);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				comando();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35026317292425728L) != 0) );
			setState(181);
			match(FECHA_CHAVE);
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
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ID);
			setState(184);
			match(DOISPONTOS);
			setState(185);
			tipoSimples();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(186);
				match(VIRGULA);
				setState(187);
				match(ID);
				setState(188);
				match(DOISPONTOS);
				setState(189);
				tipoSimples();
				}
				}
				setState(194);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(RETORNA);
			setState(196);
			expressaoGeral();
			setState(197);
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
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				futebol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				io();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				controle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				chamadaFuncao();
				setState(204);
				match(DELIMITER);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(TimemaniaParser.DELIMITER, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(ASSIGN);
			setState(210);
			expressaoGeral();
			setState(211);
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
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public TerminalNode STRING() { return getToken(TimemaniaParser.STRING, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
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
		enterRule(_localctx, 36, RULE_futebol);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VASCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(VASCO);
				setState(214);
				match(ABRE_PARENTESE);
				setState(215);
				match(STRING);
				setState(216);
				match(FECHA_PARENTESE);
				setState(217);
				match(DELIMITER);
				}
				break;
			case FLAMENGO:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(FLAMENGO);
				setState(219);
				match(ABRE_PARENTESE);
				setState(220);
				match(STRING);
				setState(221);
				match(FECHA_PARENTESE);
				setState(222);
				match(DELIMITER);
				}
				break;
			case CORINTHIANS:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(CORINTHIANS);
				setState(224);
				match(ABRE_PARENTESE);
				setState(225);
				match(NUMBER);
				setState(226);
				match(FECHA_PARENTESE);
				setState(227);
				match(DELIMITER);
				}
				break;
			case PALMEIRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				match(PALMEIRAS);
				setState(229);
				match(ABRE_PARENTESE);
				setState(230);
				match(FECHA_PARENTESE);
				setState(231);
				match(DELIMITER);
				}
				break;
			case SANTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(SANTOS);
				setState(233);
				match(ABRE_PARENTESE);
				setState(234);
				match(STRING);
				setState(235);
				match(FECHA_PARENTESE);
				setState(236);
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
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
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
		enterRule(_localctx, 38, RULE_io);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(ESCREVA);
				setState(240);
				match(ABRE_PARENTESE);
				setState(241);
				expressaoGeral();
				setState(242);
				match(FECHA_PARENTESE);
				setState(243);
				match(DELIMITER);
				}
				break;
			case ESCREVA_SEM_QUEBRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(ESCREVA_SEM_QUEBRA);
				setState(246);
				match(ABRE_PARENTESE);
				setState(247);
				expressaoGeral();
				setState(248);
				match(FECHA_PARENTESE);
				setState(249);
				match(DELIMITER);
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(LEIA);
				setState(252);
				match(ABRE_PARENTESE);
				setState(253);
				match(ID);
				setState(254);
				match(FECHA_PARENTESE);
				setState(255);
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
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
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
		public List<ExpressaoGeralContext> expressaoGeral() {
			return getRuleContexts(ExpressaoGeralContext.class);
		}
		public ExpressaoGeralContext expressaoGeral(int i) {
			return getRuleContext(ExpressaoGeralContext.class,i);
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
		enterRule(_localctx, 40, RULE_controle);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(SE);
				setState(259);
				match(ABRE_PARENTESE);
				setState(260);
				condicao();
				setState(261);
				match(FECHA_PARENTESE);
				setState(262);
				match(ENTAO);
				setState(263);
				bloco();
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENAO) {
					{
					setState(264);
					match(SENAO);
					setState(265);
					bloco();
					}
				}

				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(ENQUANTO);
				setState(269);
				match(ABRE_PARENTESE);
				setState(270);
				condicao();
				setState(271);
				match(FECHA_PARENTESE);
				setState(272);
				match(FACA);
				setState(273);
				bloco();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(PARA);
				setState(276);
				match(ID);
				setState(277);
				match(ASSIGN);
				setState(278);
				expressaoGeral();
				setState(279);
				match(ATE);
				setState(280);
				expressaoGeral();
				setState(281);
				match(FACA);
				setState(282);
				bloco();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(REPITA);
				setState(285);
				bloco();
				setState(286);
				match(ENQUANTO);
				setState(287);
				match(ABRE_PARENTESE);
				setState(288);
				condicao();
				setState(289);
				match(FECHA_PARENTESE);
				setState(290);
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
		public TerminalNode ABRE_CHAVE() { return getToken(TimemaniaParser.ABRE_CHAVE, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(TimemaniaParser.FECHA_CHAVE, 0); }
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
		enterRule(_localctx, 42, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ABRE_CHAVE);
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				comando();
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35026317292425728L) != 0) );
			setState(300);
			match(FECHA_CHAVE);
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
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
		public List<ExpressaoGeralContext> expressaoGeral() {
			return getRuleContexts(ExpressaoGeralContext.class);
		}
		public ExpressaoGeralContext expressaoGeral(int i) {
			return getRuleContext(ExpressaoGeralContext.class,i);
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
		enterRule(_localctx, 44, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(ID);
			setState(303);
			match(ABRE_PARENTESE);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1928448704512L) != 0)) {
				{
				setState(304);
				expressaoGeral();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(305);
					match(VIRGULA);
					setState(306);
					expressaoGeral();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(314);
			match(FECHA_PARENTESE);
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
	public static class ExpressaoGeralContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public ExpressaoGeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoGeral; }
	}

	public final ExpressaoGeralContext expressaoGeral() throws RecognitionException {
		ExpressaoGeralContext _localctx = new ExpressaoGeralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressaoGeral);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				condicao();
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OPERADOR_ARITMETICO() { return getTokens(TimemaniaParser.OPERADOR_ARITMETICO); }
		public TerminalNode OPERADOR_ARITMETICO(int i) {
			return getToken(TimemaniaParser.OPERADOR_ARITMETICO, i);
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
		enterRule(_localctx, 48, RULE_expressao);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				termo();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPERADOR_ARITMETICO) {
					{
					{
					setState(321);
					match(OPERADOR_ARITMETICO);
					setState(322);
					termo();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
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
		enterRule(_localctx, 50, RULE_concatenacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			termo();
			setState(332);
			match(CONCATENAR);
			setState(333);
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
		public TerminalNode ABRE_COLCHETE() { return getToken(TimemaniaParser.ABRE_COLCHETE, 0); }
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
		}
		public TerminalNode FECHA_COLCHETE() { return getToken(TimemaniaParser.FECHA_COLCHETE, 0); }
		public TerminalNode PONTO() { return getToken(TimemaniaParser.PONTO, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_termo);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				match(ID);
				setState(339);
				match(ABRE_COLCHETE);
				setState(340);
				expressaoGeral();
				setState(341);
				match(FECHA_COLCHETE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				match(ID);
				setState(344);
				match(PONTO);
				setState(345);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				chamadaFuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(ABRE_PARENTESE);
				setState(348);
				expressaoGeral();
				setState(349);
				match(FECHA_PARENTESE);
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
	public static class ArrayOpContext extends ParserRuleContext {
		public TerminalNode CRIAR_VETOR() { return getToken(TimemaniaParser.CRIAR_VETOR, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
		public TerminalNode TAMANHO() { return getToken(TimemaniaParser.TAMANHO, 0); }
		public TerminalNode ID() { return getToken(TimemaniaParser.ID, 0); }
		public ArrayOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOp; }
	}

	public final ArrayOpContext arrayOp() throws RecognitionException {
		ArrayOpContext _localctx = new ArrayOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayOp);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRIAR_VETOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(CRIAR_VETOR);
				setState(354);
				match(ABRE_PARENTESE);
				setState(355);
				expressaoGeral();
				setState(356);
				match(FECHA_PARENTESE);
				}
				break;
			case TAMANHO:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(TAMANHO);
				setState(359);
				match(ABRE_PARENTESE);
				setState(360);
				match(ID);
				setState(361);
				match(FECHA_PARENTESE);
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
		public CondicaoOrContext condicaoOr() {
			return getRuleContext(CondicaoOrContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			condicaoOr();
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
	public static class CondicaoOrContext extends ParserRuleContext {
		public List<CondicaoAndContext> condicaoAnd() {
			return getRuleContexts(CondicaoAndContext.class);
		}
		public CondicaoAndContext condicaoAnd(int i) {
			return getRuleContext(CondicaoAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(TimemaniaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(TimemaniaParser.OR, i);
		}
		public CondicaoOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoOr; }
	}

	public final CondicaoOrContext condicaoOr() throws RecognitionException {
		CondicaoOrContext _localctx = new CondicaoOrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicaoOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			condicaoAnd();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(367);
				match(OR);
				setState(368);
				condicaoAnd();
				}
				}
				setState(373);
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
	public static class CondicaoAndContext extends ParserRuleContext {
		public List<CondicaoUnaryContext> condicaoUnary() {
			return getRuleContexts(CondicaoUnaryContext.class);
		}
		public CondicaoUnaryContext condicaoUnary(int i) {
			return getRuleContext(CondicaoUnaryContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TimemaniaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TimemaniaParser.AND, i);
		}
		public CondicaoAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoAnd; }
	}

	public final CondicaoAndContext condicaoAnd() throws RecognitionException {
		CondicaoAndContext _localctx = new CondicaoAndContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_condicaoAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			condicaoUnary();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(375);
				match(AND);
				setState(376);
				condicaoUnary();
				}
				}
				setState(381);
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
	public static class CondicaoUnaryContext extends ParserRuleContext {
		public CondicaoAtomContext condicaoAtom() {
			return getRuleContext(CondicaoAtomContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TimemaniaParser.NOT, 0); }
		public CondicaoUnaryContext condicaoUnary() {
			return getRuleContext(CondicaoUnaryContext.class,0);
		}
		public CondicaoUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoUnary; }
	}

	public final CondicaoUnaryContext condicaoUnary() throws RecognitionException {
		CondicaoUnaryContext _localctx = new CondicaoUnaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_condicaoUnary);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESE:
			case ID:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				condicaoAtom();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(NOT);
				setState(384);
				condicaoUnary();
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
	public static class CondicaoAtomContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESE() { return getToken(TimemaniaParser.ABRE_PARENTESE, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(TimemaniaParser.FECHA_PARENTESE, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMPARADOR() { return getToken(TimemaniaParser.COMPARADOR, 0); }
		public CondicaoAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoAtom; }
	}

	public final CondicaoAtomContext condicaoAtom() throws RecognitionException {
		CondicaoAtomContext _localctx = new CondicaoAtomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condicaoAtom);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(ABRE_PARENTESE);
				setState(388);
				condicao();
				setState(389);
				match(FECHA_PARENTESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				expressao();
				setState(392);
				match(COMPARADOR);
				setState(393);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
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
		"\u0004\u00016\u018f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0005\u0000"+
		"E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0000\u0004\u0000K\b\u0000\u000b"+
		"\u0000\f\u0000L\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001W\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004g\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007u\b\u0007\u000b"+
		"\u0007\f\u0007v\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0086"+
		"\b\t\n\t\f\t\u0089\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u0095\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u009b\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u00a2\b\f\u000b\f\f\f\u00a3\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ad\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u00b2\b\r\u000b\r\f\r\u00b3\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00bf\b\u000e\n\u000e\f\u000e\u00c2\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cf\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00ee\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0101\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010b\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0125\b\u0014\u0001\u0015\u0001\u0015\u0004\u0015\u0129\b\u0015\u000b"+
		"\u0015\f\u0015\u012a\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0134\b\u0016\n\u0016\f\u0016"+
		"\u0137\t\u0016\u0003\u0016\u0139\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u013f\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0144\b\u0018\n\u0018\f\u0018\u0147\t\u0018\u0001\u0018"+
		"\u0003\u0018\u014a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0160\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u016b\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0172\b\u001d"+
		"\n\u001d\f\u001d\u0175\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u017a\b\u001e\n\u001e\f\u001e\u017d\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0182\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u018d\b \u0001 \u0000\u0000!\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@\u0000\u0001\u0002\u0000\u0012\u0014&&\u019d\u0000"+
		"B\u0001\u0000\u0000\u0000\u0002V\u0001\u0000\u0000\u0000\u0004X\u0001"+
		"\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\bf\u0001\u0000\u0000"+
		"\u0000\nh\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000en\u0001"+
		"\u0000\u0000\u0000\u0010z\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000"+
		"\u0000\u0000\u0014\u008e\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000"+
		"\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000"+
		"\u0000\u0000\u001c\u00b7\u0001\u0000\u0000\u0000\u001e\u00c3\u0001\u0000"+
		"\u0000\u0000 \u00ce\u0001\u0000\u0000\u0000\"\u00d0\u0001\u0000\u0000"+
		"\u0000$\u00ed\u0001\u0000\u0000\u0000&\u0100\u0001\u0000\u0000\u0000("+
		"\u0124\u0001\u0000\u0000\u0000*\u0126\u0001\u0000\u0000\u0000,\u012e\u0001"+
		"\u0000\u0000\u0000.\u013e\u0001\u0000\u0000\u00000\u0149\u0001\u0000\u0000"+
		"\u00002\u014b\u0001\u0000\u0000\u00004\u015f\u0001\u0000\u0000\u00006"+
		"\u016a\u0001\u0000\u0000\u00008\u016c\u0001\u0000\u0000\u0000:\u016e\u0001"+
		"\u0000\u0000\u0000<\u0176\u0001\u0000\u0000\u0000>\u0181\u0001\u0000\u0000"+
		"\u0000@\u018c\u0001\u0000\u0000\u0000BF\u0005\u0001\u0000\u0000CE\u0003"+
		"\u0002\u0001\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IK\u0003 \u0010\u0000JI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0002\u0000\u0000OP\u0005"+
		"\u001c\u0000\u0000P\u0001\u0001\u0000\u0000\u0000QW\u0003\u0004\u0002"+
		"\u0000RW\u0003\u0006\u0003\u0000SW\u0003\u0012\t\u0000TW\u0003\u0014\n"+
		"\u0000UW\u0003\u0016\u000b\u0000VQ\u0001\u0000\u0000\u0000VR\u0001\u0000"+
		"\u0000\u0000VS\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001"+
		"\u0000\u0000\u0000W\u0003\u0001\u0000\u0000\u0000XY\u0005\u0003\u0000"+
		"\u0000YZ\u0005&\u0000\u0000Z[\u0005\u001a\u0000\u0000[\\\u0003.\u0017"+
		"\u0000\\]\u0005\u001c\u0000\u0000]\u0005\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0004\u0000\u0000_`\u0005&\u0000\u0000`a\u0005\u001a\u0000\u0000ab\u0003"+
		"\b\u0004\u0000bc\u0005\u001c\u0000\u0000c\u0007\u0001\u0000\u0000\u0000"+
		"dg\u0003\n\u0005\u0000eg\u0003\f\u0006\u0000fd\u0001\u0000\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000g\t\u0001\u0000\u0000\u0000hi\u0007\u0000\u0000"+
		"\u0000i\u000b\u0001\u0000\u0000\u0000jm\u0003\u000e\u0007\u0000km\u0003"+
		"\u0010\b\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\r"+
		"\u0001\u0000\u0000\u0000nt\u0005\"\u0000\u0000op\u0005&\u0000\u0000pq"+
		"\u0005\u001d\u0000\u0000qr\u0003\b\u0004\u0000rs\u0005\u001c\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000to\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0005#\u0000\u0000y\u000f\u0001\u0000\u0000\u0000z{\u0005"+
		"/\u0000\u0000{|\u0005$\u0000\u0000|}\u0003.\u0017\u0000}~\u0005%\u0000"+
		"\u0000~\u007f\u0005\u0011\u0000\u0000\u007f\u0080\u0003\n\u0005\u0000"+
		"\u0080\u0011\u0001\u0000\u0000\u0000\u0081\u0082\u0005\u0005\u0000\u0000"+
		"\u0082\u0087\u0005&\u0000\u0000\u0083\u0084\u0005\u001e\u0000\u0000\u0084"+
		"\u0086\u0005&\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u001d\u0000\u0000\u008b\u008c"+
		"\u0003\n\u0005\u0000\u008c\u008d\u0005\u001c\u0000\u0000\u008d\u0013\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0003\n\u0005\u0000\u008f\u0090\u0005&"+
		"\u0000\u0000\u0090\u0091\u0005\u001c\u0000\u0000\u0091\u0015\u0001\u0000"+
		"\u0000\u0000\u0092\u0095\u0003\u0018\f\u0000\u0093\u0095\u0003\u001a\r"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0017\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0006\u0000"+
		"\u0000\u0097\u0098\u0005&\u0000\u0000\u0098\u009a\u0005 \u0000\u0000\u0099"+
		"\u009b\u0003\u001c\u000e\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005!\u0000\u0000\u009d\u009e\u0005\u001d\u0000\u0000\u009e\u009f"+
		"\u0003\n\u0005\u0000\u009f\u00a1\u0005\"\u0000\u0000\u00a0\u00a2\u0003"+
		" \u0010\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u001e"+
		"\u000f\u0000\u00a6\u00a7\u0005#\u0000\u0000\u00a7\u0019\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0007\u0000\u0000\u00a9\u00aa\u0005&\u0000\u0000"+
		"\u00aa\u00ac\u0005 \u0000\u0000\u00ab\u00ad\u0003\u001c\u000e\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005!\u0000\u0000\u00af\u00b1"+
		"\u0005\"\u0000\u0000\u00b0\u00b2\u0003 \u0010\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005#\u0000\u0000\u00b6\u001b\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005&\u0000\u0000\u00b8\u00b9\u0005\u001d\u0000"+
		"\u0000\u00b9\u00c0\u0003\n\u0005\u0000\u00ba\u00bb\u0005\u001e\u0000\u0000"+
		"\u00bb\u00bc\u0005&\u0000\u0000\u00bc\u00bd\u0005\u001d\u0000\u0000\u00bd"+
		"\u00bf\u0003\n\u0005\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00bf\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000\u00c2\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\b\u0000\u0000\u00c4\u00c5\u0003"+
		".\u0017\u0000\u00c5\u00c6\u0005\u001c\u0000\u0000\u00c6\u001f\u0001\u0000"+
		"\u0000\u0000\u00c7\u00cf\u0003\"\u0011\u0000\u00c8\u00cf\u0003$\u0012"+
		"\u0000\u00c9\u00cf\u0003&\u0013\u0000\u00ca\u00cf\u0003(\u0014\u0000\u00cb"+
		"\u00cc\u0003,\u0016\u0000\u00cc\u00cd\u0005\u001c\u0000\u0000\u00cd\u00cf"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c7\u0001\u0000\u0000\u0000\u00ce\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c9\u0001\u0000\u0000\u0000\u00ce\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00cf!\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1\u00d2\u0005\u001a"+
		"\u0000\u0000\u00d2\u00d3\u0003.\u0017\u0000\u00d3\u00d4\u0005\u001c\u0000"+
		"\u0000\u00d4#\u0001\u0000\u0000\u0000\u00d5\u00d6\u00052\u0000\u0000\u00d6"+
		"\u00d7\u0005 \u0000\u0000\u00d7\u00d8\u0005(\u0000\u0000\u00d8\u00d9\u0005"+
		"!\u0000\u0000\u00d9\u00ee\u0005\u001c\u0000\u0000\u00da\u00db\u00053\u0000"+
		"\u0000\u00db\u00dc\u0005 \u0000\u0000\u00dc\u00dd\u0005(\u0000\u0000\u00dd"+
		"\u00de\u0005!\u0000\u0000\u00de\u00ee\u0005\u001c\u0000\u0000\u00df\u00e0"+
		"\u00054\u0000\u0000\u00e0\u00e1\u0005 \u0000\u0000\u00e1\u00e2\u0005\'"+
		"\u0000\u0000\u00e2\u00e3\u0005!\u0000\u0000\u00e3\u00ee\u0005\u001c\u0000"+
		"\u0000\u00e4\u00e5\u00055\u0000\u0000\u00e5\u00e6\u0005 \u0000\u0000\u00e6"+
		"\u00e7\u0005!\u0000\u0000\u00e7\u00ee\u0005\u001c\u0000\u0000\u00e8\u00e9"+
		"\u00056\u0000\u0000\u00e9\u00ea\u0005 \u0000\u0000\u00ea\u00eb\u0005("+
		"\u0000\u0000\u00eb\u00ec\u0005!\u0000\u0000\u00ec\u00ee\u0005\u001c\u0000"+
		"\u0000\u00ed\u00d5\u0001\u0000\u0000\u0000\u00ed\u00da\u0001\u0000\u0000"+
		"\u0000\u00ed\u00df\u0001\u0000\u0000\u0000\u00ed\u00e4\u0001\u0000\u0000"+
		"\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ee%\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005,\u0000\u0000\u00f0\u00f1\u0005 \u0000\u0000\u00f1\u00f2"+
		"\u0003.\u0017\u0000\u00f2\u00f3\u0005!\u0000\u0000\u00f3\u00f4\u0005\u001c"+
		"\u0000\u0000\u00f4\u0101\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005-\u0000"+
		"\u0000\u00f6\u00f7\u0005 \u0000\u0000\u00f7\u00f8\u0003.\u0017\u0000\u00f8"+
		"\u00f9\u0005!\u0000\u0000\u00f9\u00fa\u0005\u001c\u0000\u0000\u00fa\u0101"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005.\u0000\u0000\u00fc\u00fd\u0005"+
		" \u0000\u0000\u00fd\u00fe\u0005&\u0000\u0000\u00fe\u00ff\u0005!\u0000"+
		"\u0000\u00ff\u0101\u0005\u001c\u0000\u0000\u0100\u00ef\u0001\u0000\u0000"+
		"\u0000\u0100\u00f5\u0001\u0000\u0000\u0000\u0100\u00fb\u0001\u0000\u0000"+
		"\u0000\u0101\'\u0001\u0000\u0000\u0000\u0102\u0103\u0005\t\u0000\u0000"+
		"\u0103\u0104\u0005 \u0000\u0000\u0104\u0105\u00038\u001c\u0000\u0105\u0106"+
		"\u0005!\u0000\u0000\u0106\u0107\u0005\n\u0000\u0000\u0107\u010a\u0003"+
		"*\u0015\u0000\u0108\u0109\u0005\u000b\u0000\u0000\u0109\u010b\u0003*\u0015"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u0125\u0001\u0000\u0000\u0000\u010c\u010d\u0005\f\u0000\u0000"+
		"\u010d\u010e\u0005 \u0000\u0000\u010e\u010f\u00038\u001c\u0000\u010f\u0110"+
		"\u0005!\u0000\u0000\u0110\u0111\u0005\r\u0000\u0000\u0111\u0112\u0003"+
		"*\u0015\u0000\u0112\u0125\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u000e"+
		"\u0000\u0000\u0114\u0115\u0005&\u0000\u0000\u0115\u0116\u0005\u001a\u0000"+
		"\u0000\u0116\u0117\u0003.\u0017\u0000\u0117\u0118\u0005\u000f\u0000\u0000"+
		"\u0118\u0119\u0003.\u0017\u0000\u0119\u011a\u0005\r\u0000\u0000\u011a"+
		"\u011b\u0003*\u0015\u0000\u011b\u0125\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005\u0010\u0000\u0000\u011d\u011e\u0003*\u0015\u0000\u011e\u011f\u0005"+
		"\f\u0000\u0000\u011f\u0120\u0005 \u0000\u0000\u0120\u0121\u00038\u001c"+
		"\u0000\u0121\u0122\u0005!\u0000\u0000\u0122\u0123\u0005\u001c\u0000\u0000"+
		"\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0102\u0001\u0000\u0000\u0000"+
		"\u0124\u010c\u0001\u0000\u0000\u0000\u0124\u0113\u0001\u0000\u0000\u0000"+
		"\u0124\u011c\u0001\u0000\u0000\u0000\u0125)\u0001\u0000\u0000\u0000\u0126"+
		"\u0128\u0005\"\u0000\u0000\u0127\u0129\u0003 \u0010\u0000\u0128\u0127"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0005#\u0000\u0000\u012d+\u0001\u0000"+
		"\u0000\u0000\u012e\u012f\u0005&\u0000\u0000\u012f\u0138\u0005 \u0000\u0000"+
		"\u0130\u0135\u0003.\u0017\u0000\u0131\u0132\u0005\u001e\u0000\u0000\u0132"+
		"\u0134\u0003.\u0017\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0137"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005!\u0000\u0000\u013b-\u0001\u0000\u0000\u0000\u013c\u013f\u00030"+
		"\u0018\u0000\u013d\u013f\u00038\u001c\u0000\u013e\u013c\u0001\u0000\u0000"+
		"\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013f/\u0001\u0000\u0000\u0000"+
		"\u0140\u0145\u00034\u001a\u0000\u0141\u0142\u0005\u0019\u0000\u0000\u0142"+
		"\u0144\u00034\u001a\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u014a\u0001\u0000\u0000\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0148\u014a\u00032\u0019\u0000\u0149\u0140\u0001"+
		"\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a1\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u00034\u001a\u0000\u014c\u014d\u0005\u001b\u0000"+
		"\u0000\u014d\u014e\u00034\u001a\u0000\u014e3\u0001\u0000\u0000\u0000\u014f"+
		"\u0160\u0005\'\u0000\u0000\u0150\u0160\u0005(\u0000\u0000\u0151\u0160"+
		"\u0005&\u0000\u0000\u0152\u0153\u0005&\u0000\u0000\u0153\u0154\u0005$"+
		"\u0000\u0000\u0154\u0155\u0003.\u0017\u0000\u0155\u0156\u0005%\u0000\u0000"+
		"\u0156\u0160\u0001\u0000\u0000\u0000\u0157\u0158\u0005&\u0000\u0000\u0158"+
		"\u0159\u0005\u001f\u0000\u0000\u0159\u0160\u0005&\u0000\u0000\u015a\u0160"+
		"\u0003,\u0016\u0000\u015b\u015c\u0005 \u0000\u0000\u015c\u015d\u0003."+
		"\u0017\u0000\u015d\u015e\u0005!\u0000\u0000\u015e\u0160\u0001\u0000\u0000"+
		"\u0000\u015f\u014f\u0001\u0000\u0000\u0000\u015f\u0150\u0001\u0000\u0000"+
		"\u0000\u015f\u0151\u0001\u0000\u0000\u0000\u015f\u0152\u0001\u0000\u0000"+
		"\u0000\u015f\u0157\u0001\u0000\u0000\u0000\u015f\u015a\u0001\u0000\u0000"+
		"\u0000\u015f\u015b\u0001\u0000\u0000\u0000\u01605\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0005/\u0000\u0000\u0162\u0163\u0005 \u0000\u0000\u0163\u0164"+
		"\u0003.\u0017\u0000\u0164\u0165\u0005!\u0000\u0000\u0165\u016b\u0001\u0000"+
		"\u0000\u0000\u0166\u0167\u00050\u0000\u0000\u0167\u0168\u0005 \u0000\u0000"+
		"\u0168\u0169\u0005&\u0000\u0000\u0169\u016b\u0005!\u0000\u0000\u016a\u0161"+
		"\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000\u0000\u016b7\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0003:\u001d\u0000\u016d9\u0001\u0000\u0000"+
		"\u0000\u016e\u0173\u0003<\u001e\u0000\u016f\u0170\u0005\u0015\u0000\u0000"+
		"\u0170\u0172\u0003<\u001e\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u0174;\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0176\u017b\u0003>\u001f\u0000\u0177\u0178\u0005"+
		"\u0016\u0000\u0000\u0178\u017a\u0003>\u001f\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c=\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0182\u0003@ \u0000\u017f"+
		"\u0180\u0005\u0017\u0000\u0000\u0180\u0182\u0003>\u001f\u0000\u0181\u017e"+
		"\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182?\u0001"+
		"\u0000\u0000\u0000\u0183\u0184\u0005 \u0000\u0000\u0184\u0185\u00038\u001c"+
		"\u0000\u0185\u0186\u0005!\u0000\u0000\u0186\u018d\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u00030\u0018\u0000\u0188\u0189\u0005\u0018\u0000\u0000\u0189"+
		"\u018a\u00030\u0018\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u018d"+
		"\u00030\u0018\u0000\u018c\u0183\u0001\u0000\u0000\u0000\u018c\u0187\u0001"+
		"\u0000\u0000\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018dA\u0001\u0000"+
		"\u0000\u0000\u001eFLVflv\u0087\u0094\u009a\u00a3\u00ac\u00b3\u00c0\u00ce"+
		"\u00ed\u0100\u010a\u0124\u012a\u0135\u0138\u013e\u0145\u0149\u015f\u016a"+
		"\u0173\u017b\u0181\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}