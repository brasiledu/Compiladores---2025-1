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
		PONTO=35, VIRGULA=36, DOISPONTOS=37, AND=38, OR=39, NOT=40, OPERATOR=41, 
		COMPARADOR=42, NUMBER=43, STRING=44, ID=45, WS=46, COMMENT=47, MULTILINE_COMMENT=48, 
		ESCREVA_SEM_QUEBRA=49, CONCATENAR=50, PARA_TEXTO=51, PARA_NUMERO=52, CRIAR_VETOR=53, 
		TAMANHO=54;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_constante = 2, RULE_tipagem = 3, 
		RULE_tipoDefinicao = 4, RULE_tipoSimples = 5, RULE_tipoEstruturado = 6, 
		RULE_registroTipo = 7, RULE_vetorTipo = 8, RULE_variavel = 9, RULE_funcaoProcedimento = 10, 
		RULE_funcao = 11, RULE_procedimento = 12, RULE_parametro = 13, RULE_retorno = 14, 
		RULE_comando = 15, RULE_atribuicao = 16, RULE_futebol = 17, RULE_io = 18, 
		RULE_controle = 19, RULE_bloco = 20, RULE_chamadaFuncao = 21, RULE_expressaoGeral = 22, 
		RULE_expressao = 23, RULE_concatenacao = 24, RULE_termo = 25, RULE_conversor = 26, 
		RULE_arrayOp = 27, RULE_condicao = 28, RULE_condicaoOr = 29, RULE_condicaoAnd = 30, 
		RULE_condicaoUnary = 31, RULE_condicaoAtom = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "constante", "tipagem", "tipoDefinicao", "tipoSimples", 
			"tipoEstruturado", "registroTipo", "vetorTipo", "variavel", "funcaoProcedimento", 
			"funcao", "procedimento", "parametro", "retorno", "comando", "atribuicao", 
			"futebol", "io", "controle", "bloco", "chamadaFuncao", "expressaoGeral", 
			"expressao", "concatenacao", "termo", "conversor", "arrayOp", "condicao", 
			"condicaoOr", "condicaoAnd", "condicaoUnary", "condicaoAtom"
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
			"':='", "'.'", "','", "':'", "'&&'", "'||'", "'!'", null, null, null, 
			null, null, null, null, null, "'escreva_sem_quebra'", "'++'", "'para_texto'", 
			"'para_numero'", "'criar_vetor'", "'tamanho'"
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
			"AND", "OR", "NOT", "OPERATOR", "COMPARADOR", "NUMBER", "STRING", "ID", 
			"WS", "COMMENT", "MULTILINE_COMMENT", "ESCREVA_SEM_QUEBRA", "CONCATENAR", 
			"PARA_TEXTO", "PARA_NUMERO", "CRIAR_VETOR", "TAMANHO"
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
			setState(66);
			match(START);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 29458432L) != 0)) {
				{
				{
				setState(67);
				declaracao();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 598134327902024L) != 0) );
			setState(78);
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				tipagem();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				variavel();
				}
				break;
			case FUNCAO:
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
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
			setState(86);
			match(CONST);
			setState(87);
			match(ID);
			setState(88);
			match(ASSIGN);
			setState(89);
			expressaoGeral();
			setState(90);
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
			setState(92);
			match(TIPO);
			setState(93);
			match(ID);
			setState(94);
			match(ASSIGN);
			setState(95);
			tipoDefinicao();
			setState(96);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEIRO:
			case TEXTO:
			case BOOLEANO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				tipoSimples();
				}
				break;
			case REGISTRO:
			case VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35185311612928L) != 0)) ) {
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				registroTipo();
				}
				break;
			case VETOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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
			setState(108);
			match(REGISTRO);
			setState(109);
			match(CHAVE);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				match(ID);
				setState(111);
				match(DOISPONTOS);
				setState(112);
				tipoDefinicao();
				setState(113);
				match(DELIMITER);
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(119);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
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
			setState(121);
			match(VETOR);
			setState(122);
			match(COLCHETE);
			setState(123);
			expressaoGeral();
			setState(124);
			match(COLCHETE);
			setState(125);
			match(DE);
			setState(126);
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
			setState(128);
			match(VAR);
			setState(129);
			match(ID);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(130);
				match(VIRGULA);
				setState(131);
				match(ID);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(DOISPONTOS);
			setState(138);
			tipoSimples();
			setState(139);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				funcao();
				}
				break;
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
			setState(145);
			match(FUNCAO);
			setState(146);
			match(ID);
			setState(147);
			match(PARENTESE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(148);
				parametro();
				}
			}

			setState(151);
			match(PARENTESE);
			setState(152);
			match(DOISPONTOS);
			setState(153);
			tipoSimples();
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 598134327902024L) != 0) );
			setState(160);
			retorno();
			setState(161);
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
			setState(163);
			match(PROCEDIMENTO);
			setState(164);
			match(ID);
			setState(165);
			match(PARENTESE);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(166);
				parametro();
				}
			}

			setState(169);
			match(PARENTESE);
			setState(170);
			match(CHAVE);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				comando();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 598134327902024L) != 0) );
			setState(176);
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
			setState(178);
			match(ID);
			setState(179);
			match(DOISPONTOS);
			setState(180);
			tipoSimples();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(181);
				match(VIRGULA);
				setState(182);
				match(ID);
				setState(183);
				match(DOISPONTOS);
				setState(184);
				tipoSimples();
				}
				}
				setState(189);
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
		enterRule(_localctx, 28, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RETORNA);
			setState(191);
			expressaoGeral();
			setState(192);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				futebol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				io();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				controle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
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
		enterRule(_localctx, 32, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(ASSIGN);
			setState(203);
			expressaoGeral();
			setState(204);
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
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VASCO:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(VASCO);
				setState(207);
				match(PARENTESE);
				setState(208);
				match(STRING);
				setState(209);
				match(PARENTESE);
				setState(210);
				match(DELIMITER);
				}
				break;
			case FLAMENGO:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(FLAMENGO);
				setState(212);
				match(PARENTESE);
				setState(213);
				match(STRING);
				setState(214);
				match(PARENTESE);
				setState(215);
				match(DELIMITER);
				}
				break;
			case CORINTHIANS:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(CORINTHIANS);
				setState(217);
				match(PARENTESE);
				setState(218);
				match(NUMBER);
				setState(219);
				match(PARENTESE);
				setState(220);
				match(DELIMITER);
				}
				break;
			case PALMEIRAS:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(PALMEIRAS);
				setState(222);
				match(PARENTESE);
				setState(223);
				match(PARENTESE);
				setState(224);
				match(DELIMITER);
				}
				break;
			case SANTOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(SANTOS);
				setState(226);
				match(PARENTESE);
				setState(227);
				match(STRING);
				setState(228);
				match(PARENTESE);
				setState(229);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESCREVA:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(ESCREVA);
				setState(233);
				match(PARENTESE);
				setState(234);
				expressaoGeral();
				setState(235);
				match(PARENTESE);
				setState(236);
				match(DELIMITER);
				}
				break;
			case ESCREVA_SEM_QUEBRA:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(ESCREVA_SEM_QUEBRA);
				setState(239);
				match(PARENTESE);
				setState(240);
				expressaoGeral();
				setState(241);
				match(PARENTESE);
				setState(242);
				match(DELIMITER);
				}
				break;
			case LEIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(LEIA);
				setState(245);
				match(PARENTESE);
				setState(246);
				match(ID);
				setState(247);
				match(PARENTESE);
				setState(248);
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
		enterRule(_localctx, 38, RULE_controle);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(SE);
				setState(252);
				match(PARENTESE);
				setState(253);
				condicao();
				setState(254);
				match(PARENTESE);
				setState(255);
				match(ENTAO);
				setState(256);
				bloco();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SENAO) {
					{
					setState(257);
					match(SENAO);
					setState(258);
					bloco();
					}
				}

				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(ENQUANTO);
				setState(262);
				match(PARENTESE);
				setState(263);
				condicao();
				setState(264);
				match(PARENTESE);
				setState(265);
				match(FACA);
				setState(266);
				bloco();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				match(PARA);
				setState(269);
				match(ID);
				setState(270);
				match(ASSIGN);
				setState(271);
				expressaoGeral();
				setState(272);
				match(ATE);
				setState(273);
				expressaoGeral();
				setState(274);
				match(FACA);
				setState(275);
				bloco();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(REPITA);
				setState(278);
				bloco();
				setState(279);
				match(ENQUANTO);
				setState(280);
				match(PARENTESE);
				setState(281);
				condicao();
				setState(282);
				match(PARENTESE);
				setState(283);
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
			setState(287);
			match(CHAVE);
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				comando();
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 598134327902024L) != 0) );
			setState(293);
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
		enterRule(_localctx, 42, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			setState(296);
			match(PARENTESE);
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(297);
				expressaoGeral();
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(298);
					match(VIRGULA);
					setState(299);
					expressaoGeral();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(307);
			match(PARENTESE);
			setState(308);
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
		enterRule(_localctx, 44, RULE_expressaoGeral);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
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
		enterRule(_localctx, 46, RULE_expressao);
		try {
			int _alt;
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				termo();
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(OPERATOR);
						setState(316);
						termo();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
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
		enterRule(_localctx, 48, RULE_concatenacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			termo();
			setState(326);
			match(CONCATENAR);
			setState(327);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
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
		enterRule(_localctx, 50, RULE_termo);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				match(ID);
				setState(333);
				match(COLCHETE);
				setState(334);
				expressaoGeral();
				setState(335);
				match(COLCHETE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				match(ID);
				setState(338);
				match(PONTO);
				setState(339);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				chamadaFuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				match(PARENTESE);
				setState(342);
				expressaoGeral();
				setState(343);
				match(PARENTESE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(345);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
		}
		public TerminalNode PARA_NUMERO() { return getToken(TimemaniaParser.PARA_NUMERO, 0); }
		public ConversorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversor; }
	}

	public final ConversorContext conversor() throws RecognitionException {
		ConversorContext _localctx = new ConversorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conversor);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARA_TEXTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(PARA_TEXTO);
				setState(349);
				match(PARENTESE);
				setState(350);
				expressaoGeral();
				setState(351);
				match(PARENTESE);
				}
				break;
			case PARA_NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(PARA_NUMERO);
				setState(354);
				match(PARENTESE);
				setState(355);
				expressaoGeral();
				setState(356);
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
		public ExpressaoGeralContext expressaoGeral() {
			return getRuleContext(ExpressaoGeralContext.class,0);
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
		enterRule(_localctx, 54, RULE_arrayOp);
		try {
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRIAR_VETOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(CRIAR_VETOR);
				setState(361);
				match(PARENTESE);
				setState(362);
				expressaoGeral();
				setState(363);
				match(PARENTESE);
				}
				break;
			case TAMANHO:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(TAMANHO);
				setState(366);
				match(PARENTESE);
				setState(367);
				match(ID);
				setState(368);
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
			setState(371);
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
			setState(373);
			condicaoAnd();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(374);
				match(OR);
				setState(375);
				condicaoAnd();
				}
				}
				setState(380);
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
			setState(381);
			condicaoUnary();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(382);
				match(AND);
				setState(383);
				condicaoUnary();
				}
				}
				setState(388);
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
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESE:
			case NUMBER:
			case STRING:
			case ID:
			case PARA_TEXTO:
			case PARA_NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				condicaoAtom();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(NOT);
				setState(391);
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
		public List<TerminalNode> PARENTESE() { return getTokens(TimemaniaParser.PARENTESE); }
		public TerminalNode PARENTESE(int i) {
			return getToken(TimemaniaParser.PARENTESE, i);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMPARADOR() { return getToken(TimemaniaParser.COMPARADOR, 0); }
		public TerminalNode OPERATOR() { return getToken(TimemaniaParser.OPERATOR, 0); }
		public CondicaoAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicaoAtom; }
	}

	public final CondicaoAtomContext condicaoAtom() throws RecognitionException {
		CondicaoAtomContext _localctx = new CondicaoAtomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condicaoAtom);
		try {
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(PARENTESE);
				setState(395);
				condicao();
				setState(396);
				match(PARENTESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				expressao();
				setState(399);
				match(COMPARADOR);
				setState(400);
				expressao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				expressao();
				setState(403);
				match(OPERATOR);
				setState(404);
				expressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(406);
				expressao();
				setState(407);
				match(OPERATOR);
				setState(408);
				expressao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
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
		"\u0004\u00016\u019e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0000\f\u0000L\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006k\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0004\u0007t\b\u0007\u000b\u0007\f\u0007"+
		"u\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0085\b\t\n\t\f\t\u0088"+
		"\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u0090\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0096\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b"+
		"\u009d\b\u000b\u000b\u000b\f\u000b\u009e\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a8\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u00ad\b\f\u000b\f\f\f\u00ae\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ba\b\r\n\r"+
		"\f\r\u00bd\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00c8\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00e7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00fa\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0104\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u011e\b\u0013\u0001\u0014\u0001\u0014\u0004\u0014\u0122\b"+
		"\u0014\u000b\u0014\f\u0014\u0123\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u012d\b\u0015\n"+
		"\u0015\f\u0015\u0130\t\u0015\u0003\u0015\u0132\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0003\u0016\u0139\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u013e\b\u0017\n\u0017\f\u0017"+
		"\u0141\t\u0017\u0001\u0017\u0003\u0017\u0144\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u015b\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0167\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0172\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u0179\b\u001d\n\u001d\f\u001d\u017c\t\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0181\b\u001e\n\u001e"+
		"\f\u001e\u0184\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0189\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u019c\b \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0001"+
		"\u0002\u0000\u001b\u001d--\u01af\u0000B\u0001\u0000\u0000\u0000\u0002"+
		"T\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006\\\u0001"+
		"\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000"+
		"\fj\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010y\u0001"+
		"\u0000\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u008f\u0001"+
		"\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u00a3\u0001"+
		"\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00be\u0001"+
		"\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000"+
		"\u0000\u0000\"\u00e6\u0001\u0000\u0000\u0000$\u00f9\u0001\u0000\u0000"+
		"\u0000&\u011d\u0001\u0000\u0000\u0000(\u011f\u0001\u0000\u0000\u0000*"+
		"\u0127\u0001\u0000\u0000\u0000,\u0138\u0001\u0000\u0000\u0000.\u0143\u0001"+
		"\u0000\u0000\u00000\u0145\u0001\u0000\u0000\u00002\u015a\u0001\u0000\u0000"+
		"\u00004\u0166\u0001\u0000\u0000\u00006\u0171\u0001\u0000\u0000\u00008"+
		"\u0173\u0001\u0000\u0000\u0000:\u0175\u0001\u0000\u0000\u0000<\u017d\u0001"+
		"\u0000\u0000\u0000>\u0188\u0001\u0000\u0000\u0000@\u019b\u0001\u0000\u0000"+
		"\u0000BF\u0005\u0001\u0000\u0000CE\u0003\u0002\u0001\u0000DC\u0001\u0000"+
		"\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IK\u0003\u001e\u000f\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0005\u0002\u0000\u0000O\u0001\u0001\u0000\u0000\u0000"+
		"PU\u0003\u0004\u0002\u0000QU\u0003\u0006\u0003\u0000RU\u0003\u0012\t\u0000"+
		"SU\u0003\u0014\n\u0000TP\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0003\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0018\u0000\u0000WX\u0005-\u0000\u0000XY\u0005\""+
		"\u0000\u0000YZ\u0003,\u0016\u0000Z[\u0005!\u0000\u0000[\u0005\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0016\u0000\u0000]^\u0005-\u0000\u0000^_\u0005\""+
		"\u0000\u0000_`\u0003\b\u0004\u0000`a\u0005!\u0000\u0000a\u0007\u0001\u0000"+
		"\u0000\u0000be\u0003\n\u0005\u0000ce\u0003\f\u0006\u0000db\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000fg\u0007"+
		"\u0000\u0000\u0000g\u000b\u0001\u0000\u0000\u0000hk\u0003\u000e\u0007"+
		"\u0000ik\u0003\u0010\b\u0000jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000k\r\u0001\u0000\u0000\u0000lm\u0005\u0019\u0000\u0000ms\u0005\u001f"+
		"\u0000\u0000no\u0005-\u0000\u0000op\u0005%\u0000\u0000pq\u0003\b\u0004"+
		"\u0000qr\u0005!\u0000\u0000rt\u0001\u0000\u0000\u0000sn\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0005\u001f\u0000\u0000x\u000f"+
		"\u0001\u0000\u0000\u0000yz\u0005\u001a\u0000\u0000z{\u0005 \u0000\u0000"+
		"{|\u0003,\u0016\u0000|}\u0005 \u0000\u0000}~\u0005\u0014\u0000\u0000~"+
		"\u007f\u0003\n\u0005\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0017\u0000\u0000\u0081\u0086\u0005-\u0000\u0000\u0082\u0083\u0005"+
		"$\u0000\u0000\u0083\u0085\u0005-\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005%\u0000\u0000"+
		"\u008a\u008b\u0003\n\u0005\u0000\u008b\u008c\u0005!\u0000\u0000\u008c"+
		"\u0013\u0001\u0000\u0000\u0000\u008d\u0090\u0003\u0016\u000b\u0000\u008e"+
		"\u0090\u0003\u0018\f\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0005\u000f\u0000\u0000\u0092\u0093\u0005-\u0000\u0000\u0093\u0095\u0005"+
		"\u001e\u0000\u0000\u0094\u0096\u0003\u001a\r\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u001e\u0000\u0000\u0098\u0099\u0005%\u0000"+
		"\u0000\u0099\u009a\u0003\n\u0005\u0000\u009a\u009c\u0005\u001f\u0000\u0000"+
		"\u009b\u009d\u0003\u001e\u000f\u0000\u009c\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0003\u001c\u000e\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000"+
		"\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0010\u0000\u0000"+
		"\u00a4\u00a5\u0005-\u0000\u0000\u00a5\u00a7\u0005\u001e\u0000\u0000\u00a6"+
		"\u00a8\u0003\u001a\r\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u001e\u0000\u0000\u00aa\u00ac\u0005\u001f\u0000\u0000\u00ab\u00ad"+
		"\u0003\u001e\u000f\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u001f\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005-\u0000\u0000\u00b3\u00b4\u0005%\u0000\u0000\u00b4\u00bb\u0003\n"+
		"\u0005\u0000\u00b5\u00b6\u0005$\u0000\u0000\u00b6\u00b7\u0005-\u0000\u0000"+
		"\u00b7\u00b8\u0005%\u0000\u0000\u00b8\u00ba\u0003\n\u0005\u0000\u00b9"+
		"\u00b5\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u001b\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005\u0011\u0000\u0000\u00bf\u00c0\u0003,\u0016\u0000\u00c0\u00c1"+
		"\u0005!\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000\u00c2\u00c8\u0003"+
		" \u0010\u0000\u00c3\u00c8\u0003\"\u0011\u0000\u00c4\u00c8\u0003$\u0012"+
		"\u0000\u00c5\u00c8\u0003&\u0013\u0000\u00c6\u00c8\u0003*\u0015\u0000\u00c7"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005-\u0000\u0000\u00ca\u00cb\u0005\"\u0000\u0000\u00cb\u00cc"+
		"\u0003,\u0016\u0000\u00cc\u00cd\u0005!\u0000\u0000\u00cd!\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0005\u000e\u0000\u0000\u00cf\u00d0\u0005\u001e"+
		"\u0000\u0000\u00d0\u00d1\u0005,\u0000\u0000\u00d1\u00d2\u0005\u001e\u0000"+
		"\u0000\u00d2\u00e7\u0005!\u0000\u0000\u00d3\u00d4\u0005\n\u0000\u0000"+
		"\u00d4\u00d5\u0005\u001e\u0000\u0000\u00d5\u00d6\u0005,\u0000\u0000\u00d6"+
		"\u00d7\u0005\u001e\u0000\u0000\u00d7\u00e7\u0005!\u0000\u0000\u00d8\u00d9"+
		"\u0005\u000b\u0000\u0000\u00d9\u00da\u0005\u001e\u0000\u0000\u00da\u00db"+
		"\u0005+\u0000\u0000\u00db\u00dc\u0005\u001e\u0000\u0000\u00dc\u00e7\u0005"+
		"!\u0000\u0000\u00dd\u00de\u0005\f\u0000\u0000\u00de\u00df\u0005\u001e"+
		"\u0000\u0000\u00df\u00e0\u0005\u001e\u0000\u0000\u00e0\u00e7\u0005!\u0000"+
		"\u0000\u00e1\u00e2\u0005\r\u0000\u0000\u00e2\u00e3\u0005\u001e\u0000\u0000"+
		"\u00e3\u00e4\u0005,\u0000\u0000\u00e4\u00e5\u0005\u001e\u0000\u0000\u00e5"+
		"\u00e7\u0005!\u0000\u0000\u00e6\u00ce\u0001\u0000\u0000\u0000\u00e6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e6\u00d8\u0001\u0000\u0000\u0000\u00e6\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e7#\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\b\u0000\u0000\u00e9\u00ea\u0005\u001e"+
		"\u0000\u0000\u00ea\u00eb\u0003,\u0016\u0000\u00eb\u00ec\u0005\u001e\u0000"+
		"\u0000\u00ec\u00ed\u0005!\u0000\u0000\u00ed\u00fa\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u00051\u0000\u0000\u00ef\u00f0\u0005\u001e\u0000\u0000\u00f0"+
		"\u00f1\u0003,\u0016\u0000\u00f1\u00f2\u0005\u001e\u0000\u0000\u00f2\u00f3"+
		"\u0005!\u0000\u0000\u00f3\u00fa\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		"\t\u0000\u0000\u00f5\u00f6\u0005\u001e\u0000\u0000\u00f6\u00f7\u0005-"+
		"\u0000\u0000\u00f7\u00f8\u0005\u001e\u0000\u0000\u00f8\u00fa\u0005!\u0000"+
		"\u0000\u00f9\u00e8\u0001\u0000\u0000\u0000\u00f9\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00fa%\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\u0003\u0000\u0000\u00fc\u00fd\u0005\u001e\u0000\u0000"+
		"\u00fd\u00fe\u00038\u001c\u0000\u00fe\u00ff\u0005\u001e\u0000\u0000\u00ff"+
		"\u0100\u0005\u0004\u0000\u0000\u0100\u0103\u0003(\u0014\u0000\u0101\u0102"+
		"\u0005\u0005\u0000\u0000\u0102\u0104\u0003(\u0014\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u011e\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0005\u0006\u0000\u0000\u0106\u0107\u0005"+
		"\u001e\u0000\u0000\u0107\u0108\u00038\u001c\u0000\u0108\u0109\u0005\u001e"+
		"\u0000\u0000\u0109\u010a\u0005\u0007\u0000\u0000\u010a\u010b\u0003(\u0014"+
		"\u0000\u010b\u011e\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0012\u0000"+
		"\u0000\u010d\u010e\u0005-\u0000\u0000\u010e\u010f\u0005\"\u0000\u0000"+
		"\u010f\u0110\u0003,\u0016\u0000\u0110\u0111\u0005\u0013\u0000\u0000\u0111"+
		"\u0112\u0003,\u0016\u0000\u0112\u0113\u0005\u0007\u0000\u0000\u0113\u0114"+
		"\u0003(\u0014\u0000\u0114\u011e\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"\u0015\u0000\u0000\u0116\u0117\u0003(\u0014\u0000\u0117\u0118\u0005\u0006"+
		"\u0000\u0000\u0118\u0119\u0005\u001e\u0000\u0000\u0119\u011a\u00038\u001c"+
		"\u0000\u011a\u011b\u0005\u001e\u0000\u0000\u011b\u011c\u0005!\u0000\u0000"+
		"\u011c\u011e\u0001\u0000\u0000\u0000\u011d\u00fb\u0001\u0000\u0000\u0000"+
		"\u011d\u0105\u0001\u0000\u0000\u0000\u011d\u010c\u0001\u0000\u0000\u0000"+
		"\u011d\u0115\u0001\u0000\u0000\u0000\u011e\'\u0001\u0000\u0000\u0000\u011f"+
		"\u0121\u0005\u001f\u0000\u0000\u0120\u0122\u0003\u001e\u000f\u0000\u0121"+
		"\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u001f\u0000\u0000\u0126"+
		")\u0001\u0000\u0000\u0000\u0127\u0128\u0005-\u0000\u0000\u0128\u0131\u0005"+
		"\u001e\u0000\u0000\u0129\u012e\u0003,\u0016\u0000\u012a\u012b\u0005$\u0000"+
		"\u0000\u012b\u012d\u0003,\u0016\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000"+
		"\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0005\u001e\u0000\u0000\u0134\u0135\u0005!\u0000\u0000\u0135"+
		"+\u0001\u0000\u0000\u0000\u0136\u0139\u0003.\u0017\u0000\u0137\u0139\u0003"+
		"8\u001c\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000"+
		"\u0000\u0000\u0139-\u0001\u0000\u0000\u0000\u013a\u013f\u00032\u0019\u0000"+
		"\u013b\u013c\u0005)\u0000\u0000\u013c\u013e\u00032\u0019\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0144"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u0144"+
		"\u00030\u0018\u0000\u0143\u013a\u0001\u0000\u0000\u0000\u0143\u0142\u0001"+
		"\u0000\u0000\u0000\u0144/\u0001\u0000\u0000\u0000\u0145\u0146\u00032\u0019"+
		"\u0000\u0146\u0147\u00052\u0000\u0000\u0147\u0148\u00032\u0019\u0000\u0148"+
		"1\u0001\u0000\u0000\u0000\u0149\u015b\u0005+\u0000\u0000\u014a\u015b\u0005"+
		",\u0000\u0000\u014b\u015b\u0005-\u0000\u0000\u014c\u014d\u0005-\u0000"+
		"\u0000\u014d\u014e\u0005 \u0000\u0000\u014e\u014f\u0003,\u0016\u0000\u014f"+
		"\u0150\u0005 \u0000\u0000\u0150\u015b\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0005-\u0000\u0000\u0152\u0153\u0005#\u0000\u0000\u0153\u015b\u0005-"+
		"\u0000\u0000\u0154\u015b\u0003*\u0015\u0000\u0155\u0156\u0005\u001e\u0000"+
		"\u0000\u0156\u0157\u0003,\u0016\u0000\u0157\u0158\u0005\u001e\u0000\u0000"+
		"\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u015b\u00034\u001a\u0000\u015a"+
		"\u0149\u0001\u0000\u0000\u0000\u015a\u014a\u0001\u0000\u0000\u0000\u015a"+
		"\u014b\u0001\u0000\u0000\u0000\u015a\u014c\u0001\u0000\u0000\u0000\u015a"+
		"\u0151\u0001\u0000\u0000\u0000\u015a\u0154\u0001\u0000\u0000\u0000\u015a"+
		"\u0155\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000\u015b"+
		"3\u0001\u0000\u0000\u0000\u015c\u015d\u00053\u0000\u0000\u015d\u015e\u0005"+
		"\u001e\u0000\u0000\u015e\u015f\u0003,\u0016\u0000\u015f\u0160\u0005\u001e"+
		"\u0000\u0000\u0160\u0167\u0001\u0000\u0000\u0000\u0161\u0162\u00054\u0000"+
		"\u0000\u0162\u0163\u0005\u001e\u0000\u0000\u0163\u0164\u0003,\u0016\u0000"+
		"\u0164\u0165\u0005\u001e\u0000\u0000\u0165\u0167\u0001\u0000\u0000\u0000"+
		"\u0166\u015c\u0001\u0000\u0000\u0000\u0166\u0161\u0001\u0000\u0000\u0000"+
		"\u01675\u0001\u0000\u0000\u0000\u0168\u0169\u00055\u0000\u0000\u0169\u016a"+
		"\u0005\u001e\u0000\u0000\u016a\u016b\u0003,\u0016\u0000\u016b\u016c\u0005"+
		"\u001e\u0000\u0000\u016c\u0172\u0001\u0000\u0000\u0000\u016d\u016e\u0005"+
		"6\u0000\u0000\u016e\u016f\u0005\u001e\u0000\u0000\u016f\u0170\u0005-\u0000"+
		"\u0000\u0170\u0172\u0005\u001e\u0000\u0000\u0171\u0168\u0001\u0000\u0000"+
		"\u0000\u0171\u016d\u0001\u0000\u0000\u0000\u01727\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0003:\u001d\u0000\u01749\u0001\u0000\u0000\u0000\u0175\u017a"+
		"\u0003<\u001e\u0000\u0176\u0177\u0005\'\u0000\u0000\u0177\u0179\u0003"+
		"<\u001e\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000"+
		"\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000"+
		"\u0000\u0000\u017b;\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017d\u0182\u0003>\u001f\u0000\u017e\u017f\u0005&\u0000\u0000\u017f"+
		"\u0181\u0003>\u001f\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0184"+
		"\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183"+
		"\u0001\u0000\u0000\u0000\u0183=\u0001\u0000\u0000\u0000\u0184\u0182\u0001"+
		"\u0000\u0000\u0000\u0185\u0189\u0003@ \u0000\u0186\u0187\u0005(\u0000"+
		"\u0000\u0187\u0189\u0003>\u001f\u0000\u0188\u0185\u0001\u0000\u0000\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0189?\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0005\u001e\u0000\u0000\u018b\u018c\u00038\u001c\u0000\u018c\u018d"+
		"\u0005\u001e\u0000\u0000\u018d\u019c\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0003.\u0017\u0000\u018f\u0190\u0005*\u0000\u0000\u0190\u0191\u0003."+
		"\u0017\u0000\u0191\u019c\u0001\u0000\u0000\u0000\u0192\u0193\u0003.\u0017"+
		"\u0000\u0193\u0194\u0005)\u0000\u0000\u0194\u0195\u0003.\u0017\u0000\u0195"+
		"\u019c\u0001\u0000\u0000\u0000\u0196\u0197\u0003.\u0017\u0000\u0197\u0198"+
		"\u0005)\u0000\u0000\u0198\u0199\u0003.\u0017\u0000\u0199\u019c\u0001\u0000"+
		"\u0000\u0000\u019a\u019c\u0003.\u0017\u0000\u019b\u018a\u0001\u0000\u0000"+
		"\u0000\u019b\u018e\u0001\u0000\u0000\u0000\u019b\u0192\u0001\u0000\u0000"+
		"\u0000\u019b\u0196\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000"+
		"\u0000\u019cA\u0001\u0000\u0000\u0000\u001fFLTdju\u0086\u008f\u0095\u009e"+
		"\u00a7\u00ae\u00bb\u00c7\u00e6\u00f9\u0103\u011d\u0123\u012e\u0131\u0138"+
		"\u013f\u0143\u015a\u0166\u0171\u017a\u0182\u0188\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}