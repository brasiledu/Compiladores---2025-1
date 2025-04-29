# Generated from TimemaniaParser.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,45,326,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,1,0,1,0,5,0,53,8,0,
        10,0,12,0,56,9,0,1,0,4,0,59,8,0,11,0,12,0,60,1,0,1,0,1,1,1,1,1,1,
        1,1,3,1,69,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,
        4,1,4,3,4,85,8,4,1,5,1,5,1,6,1,6,3,6,91,8,6,1,7,1,7,1,7,1,7,1,7,
        1,7,1,7,4,7,100,8,7,11,7,12,7,101,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,
        8,1,8,1,9,1,9,1,9,1,9,5,9,117,8,9,10,9,12,9,120,9,9,1,9,1,9,1,9,
        1,9,1,10,1,10,3,10,128,8,10,1,11,1,11,1,11,1,11,3,11,134,8,11,1,
        11,1,11,1,11,1,11,1,11,4,11,141,8,11,11,11,12,11,142,1,11,1,11,1,
        11,1,12,1,12,1,12,1,12,3,12,152,8,12,1,12,1,12,1,12,4,12,157,8,12,
        11,12,12,12,158,1,12,1,12,1,13,1,13,1,13,1,13,1,13,1,13,1,13,5,13,
        170,8,13,10,13,12,13,173,9,13,1,14,1,14,1,14,1,14,1,15,1,15,1,15,
        1,15,1,15,3,15,184,8,15,1,16,1,16,1,16,1,16,1,16,1,17,1,17,1,17,
        1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,
        1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,3,17,215,8,17,1,18,1,18,
        1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,3,18,228,8,18,1,19,
        1,19,1,19,1,19,1,19,1,19,1,19,1,19,3,19,238,8,19,1,19,1,19,1,19,
        1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,
        1,19,1,19,1,19,1,19,1,19,1,19,1,19,1,19,3,19,264,8,19,1,20,1,20,
        4,20,268,8,20,11,20,12,20,269,1,20,1,20,1,21,1,21,1,21,1,21,1,21,
        5,21,279,8,21,10,21,12,21,282,9,21,3,21,284,8,21,1,21,1,21,1,21,
        1,22,1,22,1,22,5,22,292,8,22,10,22,12,22,295,9,22,1,23,1,23,1,23,
        1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,
        3,23,313,8,23,1,24,1,24,1,24,3,24,318,8,24,1,24,1,24,1,24,1,24,3,
        24,324,8,24,1,24,0,0,25,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,
        30,32,34,36,38,40,42,44,46,48,0,1,2,0,27,29,42,42,340,0,50,1,0,0,
        0,2,68,1,0,0,0,4,70,1,0,0,0,6,76,1,0,0,0,8,84,1,0,0,0,10,86,1,0,
        0,0,12,90,1,0,0,0,14,92,1,0,0,0,16,105,1,0,0,0,18,112,1,0,0,0,20,
        127,1,0,0,0,22,129,1,0,0,0,24,147,1,0,0,0,26,162,1,0,0,0,28,174,
        1,0,0,0,30,183,1,0,0,0,32,185,1,0,0,0,34,214,1,0,0,0,36,227,1,0,
        0,0,38,263,1,0,0,0,40,265,1,0,0,0,42,273,1,0,0,0,44,288,1,0,0,0,
        46,312,1,0,0,0,48,323,1,0,0,0,50,54,5,1,0,0,51,53,3,2,1,0,52,51,
        1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,1,0,0,0,55,58,1,0,0,0,
        56,54,1,0,0,0,57,59,3,30,15,0,58,57,1,0,0,0,59,60,1,0,0,0,60,58,
        1,0,0,0,60,61,1,0,0,0,61,62,1,0,0,0,62,63,5,2,0,0,63,1,1,0,0,0,64,
        69,3,4,2,0,65,69,3,6,3,0,66,69,3,18,9,0,67,69,3,20,10,0,68,64,1,
        0,0,0,68,65,1,0,0,0,68,66,1,0,0,0,68,67,1,0,0,0,69,3,1,0,0,0,70,
        71,5,24,0,0,71,72,5,42,0,0,72,73,5,34,0,0,73,74,3,44,22,0,74,75,
        5,33,0,0,75,5,1,0,0,0,76,77,5,22,0,0,77,78,5,42,0,0,78,79,5,34,0,
        0,79,80,3,8,4,0,80,81,5,33,0,0,81,7,1,0,0,0,82,85,3,10,5,0,83,85,
        3,12,6,0,84,82,1,0,0,0,84,83,1,0,0,0,85,9,1,0,0,0,86,87,7,0,0,0,
        87,11,1,0,0,0,88,91,3,14,7,0,89,91,3,16,8,0,90,88,1,0,0,0,90,89,
        1,0,0,0,91,13,1,0,0,0,92,93,5,25,0,0,93,99,5,31,0,0,94,95,5,42,0,
        0,95,96,5,37,0,0,96,97,3,8,4,0,97,98,5,33,0,0,98,100,1,0,0,0,99,
        94,1,0,0,0,100,101,1,0,0,0,101,99,1,0,0,0,101,102,1,0,0,0,102,103,
        1,0,0,0,103,104,5,31,0,0,104,15,1,0,0,0,105,106,5,26,0,0,106,107,
        5,32,0,0,107,108,3,44,22,0,108,109,5,32,0,0,109,110,5,20,0,0,110,
        111,3,10,5,0,111,17,1,0,0,0,112,113,5,23,0,0,113,118,5,42,0,0,114,
        115,5,36,0,0,115,117,5,42,0,0,116,114,1,0,0,0,117,120,1,0,0,0,118,
        116,1,0,0,0,118,119,1,0,0,0,119,121,1,0,0,0,120,118,1,0,0,0,121,
        122,5,37,0,0,122,123,3,10,5,0,123,124,5,33,0,0,124,19,1,0,0,0,125,
        128,3,22,11,0,126,128,3,24,12,0,127,125,1,0,0,0,127,126,1,0,0,0,
        128,21,1,0,0,0,129,130,5,15,0,0,130,131,5,42,0,0,131,133,5,30,0,
        0,132,134,3,26,13,0,133,132,1,0,0,0,133,134,1,0,0,0,134,135,1,0,
        0,0,135,136,5,30,0,0,136,137,5,37,0,0,137,138,3,10,5,0,138,140,5,
        31,0,0,139,141,3,30,15,0,140,139,1,0,0,0,141,142,1,0,0,0,142,140,
        1,0,0,0,142,143,1,0,0,0,143,144,1,0,0,0,144,145,3,28,14,0,145,146,
        5,31,0,0,146,23,1,0,0,0,147,148,5,16,0,0,148,149,5,42,0,0,149,151,
        5,30,0,0,150,152,3,26,13,0,151,150,1,0,0,0,151,152,1,0,0,0,152,153,
        1,0,0,0,153,154,5,30,0,0,154,156,5,31,0,0,155,157,3,30,15,0,156,
        155,1,0,0,0,157,158,1,0,0,0,158,156,1,0,0,0,158,159,1,0,0,0,159,
        160,1,0,0,0,160,161,5,31,0,0,161,25,1,0,0,0,162,163,5,42,0,0,163,
        164,5,37,0,0,164,171,3,10,5,0,165,166,5,36,0,0,166,167,5,42,0,0,
        167,168,5,37,0,0,168,170,3,10,5,0,169,165,1,0,0,0,170,173,1,0,0,
        0,171,169,1,0,0,0,171,172,1,0,0,0,172,27,1,0,0,0,173,171,1,0,0,0,
        174,175,5,17,0,0,175,176,3,44,22,0,176,177,5,33,0,0,177,29,1,0,0,
        0,178,184,3,32,16,0,179,184,3,34,17,0,180,184,3,36,18,0,181,184,
        3,38,19,0,182,184,3,42,21,0,183,178,1,0,0,0,183,179,1,0,0,0,183,
        180,1,0,0,0,183,181,1,0,0,0,183,182,1,0,0,0,184,31,1,0,0,0,185,186,
        5,42,0,0,186,187,5,34,0,0,187,188,3,44,22,0,188,189,5,33,0,0,189,
        33,1,0,0,0,190,191,5,14,0,0,191,192,5,30,0,0,192,193,5,41,0,0,193,
        194,5,30,0,0,194,215,5,33,0,0,195,196,5,10,0,0,196,197,5,30,0,0,
        197,198,5,41,0,0,198,199,5,30,0,0,199,215,5,33,0,0,200,201,5,11,
        0,0,201,202,5,30,0,0,202,203,5,40,0,0,203,204,5,30,0,0,204,215,5,
        33,0,0,205,206,5,12,0,0,206,207,5,30,0,0,207,208,5,30,0,0,208,215,
        5,33,0,0,209,210,5,13,0,0,210,211,5,30,0,0,211,212,5,41,0,0,212,
        213,5,30,0,0,213,215,5,33,0,0,214,190,1,0,0,0,214,195,1,0,0,0,214,
        200,1,0,0,0,214,205,1,0,0,0,214,209,1,0,0,0,215,35,1,0,0,0,216,217,
        5,8,0,0,217,218,5,30,0,0,218,219,3,44,22,0,219,220,5,30,0,0,220,
        221,5,33,0,0,221,228,1,0,0,0,222,223,5,9,0,0,223,224,5,30,0,0,224,
        225,5,42,0,0,225,226,5,30,0,0,226,228,5,33,0,0,227,216,1,0,0,0,227,
        222,1,0,0,0,228,37,1,0,0,0,229,230,5,3,0,0,230,231,5,30,0,0,231,
        232,3,48,24,0,232,233,5,30,0,0,233,234,5,4,0,0,234,237,3,40,20,0,
        235,236,5,5,0,0,236,238,3,40,20,0,237,235,1,0,0,0,237,238,1,0,0,
        0,238,264,1,0,0,0,239,240,5,6,0,0,240,241,5,30,0,0,241,242,3,48,
        24,0,242,243,5,30,0,0,243,244,5,7,0,0,244,245,3,40,20,0,245,264,
        1,0,0,0,246,247,5,18,0,0,247,248,5,42,0,0,248,249,5,34,0,0,249,250,
        3,44,22,0,250,251,5,19,0,0,251,252,3,44,22,0,252,253,5,7,0,0,253,
        254,3,40,20,0,254,264,1,0,0,0,255,256,5,21,0,0,256,257,3,40,20,0,
        257,258,5,6,0,0,258,259,5,30,0,0,259,260,3,48,24,0,260,261,5,30,
        0,0,261,262,5,33,0,0,262,264,1,0,0,0,263,229,1,0,0,0,263,239,1,0,
        0,0,263,246,1,0,0,0,263,255,1,0,0,0,264,39,1,0,0,0,265,267,5,31,
        0,0,266,268,3,30,15,0,267,266,1,0,0,0,268,269,1,0,0,0,269,267,1,
        0,0,0,269,270,1,0,0,0,270,271,1,0,0,0,271,272,5,31,0,0,272,41,1,
        0,0,0,273,274,5,42,0,0,274,283,5,30,0,0,275,280,3,44,22,0,276,277,
        5,36,0,0,277,279,3,44,22,0,278,276,1,0,0,0,279,282,1,0,0,0,280,278,
        1,0,0,0,280,281,1,0,0,0,281,284,1,0,0,0,282,280,1,0,0,0,283,275,
        1,0,0,0,283,284,1,0,0,0,284,285,1,0,0,0,285,286,5,30,0,0,286,287,
        5,33,0,0,287,43,1,0,0,0,288,293,3,46,23,0,289,290,5,38,0,0,290,292,
        3,46,23,0,291,289,1,0,0,0,292,295,1,0,0,0,293,291,1,0,0,0,293,294,
        1,0,0,0,294,45,1,0,0,0,295,293,1,0,0,0,296,313,5,40,0,0,297,313,
        5,41,0,0,298,313,5,42,0,0,299,300,5,42,0,0,300,301,5,32,0,0,301,
        302,3,44,22,0,302,303,5,32,0,0,303,313,1,0,0,0,304,305,5,42,0,0,
        305,306,5,35,0,0,306,313,5,42,0,0,307,313,3,42,21,0,308,309,5,30,
        0,0,309,310,3,44,22,0,310,311,5,30,0,0,311,313,1,0,0,0,312,296,1,
        0,0,0,312,297,1,0,0,0,312,298,1,0,0,0,312,299,1,0,0,0,312,304,1,
        0,0,0,312,307,1,0,0,0,312,308,1,0,0,0,313,47,1,0,0,0,314,317,3,44,
        22,0,315,316,5,38,0,0,316,318,3,44,22,0,317,315,1,0,0,0,317,318,
        1,0,0,0,318,324,1,0,0,0,319,320,3,44,22,0,320,321,5,39,0,0,321,322,
        3,44,22,0,322,324,1,0,0,0,323,314,1,0,0,0,323,319,1,0,0,0,324,49,
        1,0,0,0,25,54,60,68,84,90,101,118,127,133,142,151,158,171,183,214,
        227,237,263,269,280,283,293,312,317,323
    ]

class TimemaniaParser ( Parser ):

    grammarFileName = "TimemaniaParser.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'start'", "'end'", "'se'", "'entao'", 
                     "'senao'", "'enquanto'", "'faca'", "'escreva'", "'leia'", 
                     "'flamengo'", "'corinthians'", "'palmeiras'", "'santos'", 
                     "'vasco'", "'funcao'", "'procedimento'", "'retorna'", 
                     "'para'", "'ate'", "'de'", "'repita'", "'tipo'", "'var'", 
                     "'const'", "'registro'", "'vetor'", "'inteiro'", "'texto'", 
                     "'booleano'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "';'", "':='", "'.'", "','", "':'" ]

    symbolicNames = [ "<INVALID>", "START", "END", "SE", "ENTAO", "SENAO", 
                      "ENQUANTO", "FACA", "ESCREVA", "LEIA", "FLAMENGO", 
                      "CORINTHIANS", "PALMEIRAS", "SANTOS", "VASCO", "FUNCAO", 
                      "PROCEDIMENTO", "RETORNA", "PARA", "ATE", "DE", "REPITA", 
                      "TIPO", "VAR", "CONST", "REGISTRO", "VETOR", "INTEIRO", 
                      "TEXTO", "BOOLEANO", "PARENTESE", "CHAVE", "COLCHETE", 
                      "DELIMITER", "ASSIGN", "PONTO", "VIRGULA", "DOISPONTOS", 
                      "OPERATOR", "COMPARADOR", "NUMBER", "STRING", "ID", 
                      "WS", "COMMENT", "MULTILINE_COMMENT" ]

    RULE_programa = 0
    RULE_declaracao = 1
    RULE_constante = 2
    RULE_tipagem = 3
    RULE_tipoDefinicao = 4
    RULE_tipoSimples = 5
    RULE_tipoEstruturado = 6
    RULE_registroTipo = 7
    RULE_vetorTipo = 8
    RULE_variavel = 9
    RULE_funcaoProcedimento = 10
    RULE_funcao = 11
    RULE_procedimento = 12
    RULE_parametro = 13
    RULE_retorno = 14
    RULE_comando = 15
    RULE_atribuicao = 16
    RULE_futebol = 17
    RULE_io = 18
    RULE_controle = 19
    RULE_bloco = 20
    RULE_chamadaFuncao = 21
    RULE_expressao = 22
    RULE_termo = 23
    RULE_condicao = 24

    ruleNames =  [ "programa", "declaracao", "constante", "tipagem", "tipoDefinicao", 
                   "tipoSimples", "tipoEstruturado", "registroTipo", "vetorTipo", 
                   "variavel", "funcaoProcedimento", "funcao", "procedimento", 
                   "parametro", "retorno", "comando", "atribuicao", "futebol", 
                   "io", "controle", "bloco", "chamadaFuncao", "expressao", 
                   "termo", "condicao" ]

    EOF = Token.EOF
    START=1
    END=2
    SE=3
    ENTAO=4
    SENAO=5
    ENQUANTO=6
    FACA=7
    ESCREVA=8
    LEIA=9
    FLAMENGO=10
    CORINTHIANS=11
    PALMEIRAS=12
    SANTOS=13
    VASCO=14
    FUNCAO=15
    PROCEDIMENTO=16
    RETORNA=17
    PARA=18
    ATE=19
    DE=20
    REPITA=21
    TIPO=22
    VAR=23
    CONST=24
    REGISTRO=25
    VETOR=26
    INTEIRO=27
    TEXTO=28
    BOOLEANO=29
    PARENTESE=30
    CHAVE=31
    COLCHETE=32
    DELIMITER=33
    ASSIGN=34
    PONTO=35
    VIRGULA=36
    DOISPONTOS=37
    OPERATOR=38
    COMPARADOR=39
    NUMBER=40
    STRING=41
    ID=42
    WS=43
    COMMENT=44
    MULTILINE_COMMENT=45

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def START(self):
            return self.getToken(TimemaniaParser.START, 0)

        def END(self):
            return self.getToken(TimemaniaParser.END, 0)

        def declaracao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.DeclaracaoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.DeclaracaoContext,i)


        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.ComandoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.ComandoContext,i)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)




    def programa(self):

        localctx = TimemaniaParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.match(TimemaniaParser.START)
            self.state = 54
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 29458432) != 0):
                self.state = 51
                self.declaracao()
                self.state = 56
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 58 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 57
                self.comando()
                self.state = 60 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 4398048902984) != 0)):
                    break

            self.state = 62
            self.match(TimemaniaParser.END)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaracaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def constante(self):
            return self.getTypedRuleContext(TimemaniaParser.ConstanteContext,0)


        def tipagem(self):
            return self.getTypedRuleContext(TimemaniaParser.TipagemContext,0)


        def variavel(self):
            return self.getTypedRuleContext(TimemaniaParser.VariavelContext,0)


        def funcaoProcedimento(self):
            return self.getTypedRuleContext(TimemaniaParser.FuncaoProcedimentoContext,0)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_declaracao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclaracao" ):
                listener.enterDeclaracao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclaracao" ):
                listener.exitDeclaracao(self)




    def declaracao(self):

        localctx = TimemaniaParser.DeclaracaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_declaracao)
        try:
            self.state = 68
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [24]:
                self.enterOuterAlt(localctx, 1)
                self.state = 64
                self.constante()
                pass
            elif token in [22]:
                self.enterOuterAlt(localctx, 2)
                self.state = 65
                self.tipagem()
                pass
            elif token in [23]:
                self.enterOuterAlt(localctx, 3)
                self.state = 66
                self.variavel()
                pass
            elif token in [15, 16]:
                self.enterOuterAlt(localctx, 4)
                self.state = 67
                self.funcaoProcedimento()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConstanteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CONST(self):
            return self.getToken(TimemaniaParser.CONST, 0)

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def ASSIGN(self):
            return self.getToken(TimemaniaParser.ASSIGN, 0)

        def expressao(self):
            return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,0)


        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_constante

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConstante" ):
                listener.enterConstante(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConstante" ):
                listener.exitConstante(self)




    def constante(self):

        localctx = TimemaniaParser.ConstanteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_constante)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(TimemaniaParser.CONST)
            self.state = 71
            self.match(TimemaniaParser.ID)
            self.state = 72
            self.match(TimemaniaParser.ASSIGN)
            self.state = 73
            self.expressao()
            self.state = 74
            self.match(TimemaniaParser.DELIMITER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipagemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TIPO(self):
            return self.getToken(TimemaniaParser.TIPO, 0)

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def ASSIGN(self):
            return self.getToken(TimemaniaParser.ASSIGN, 0)

        def tipoDefinicao(self):
            return self.getTypedRuleContext(TimemaniaParser.TipoDefinicaoContext,0)


        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_tipagem

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipagem" ):
                listener.enterTipagem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipagem" ):
                listener.exitTipagem(self)




    def tipagem(self):

        localctx = TimemaniaParser.TipagemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_tipagem)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            self.match(TimemaniaParser.TIPO)
            self.state = 77
            self.match(TimemaniaParser.ID)
            self.state = 78
            self.match(TimemaniaParser.ASSIGN)
            self.state = 79
            self.tipoDefinicao()
            self.state = 80
            self.match(TimemaniaParser.DELIMITER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoDefinicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tipoSimples(self):
            return self.getTypedRuleContext(TimemaniaParser.TipoSimplesContext,0)


        def tipoEstruturado(self):
            return self.getTypedRuleContext(TimemaniaParser.TipoEstruturadoContext,0)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_tipoDefinicao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipoDefinicao" ):
                listener.enterTipoDefinicao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipoDefinicao" ):
                listener.exitTipoDefinicao(self)




    def tipoDefinicao(self):

        localctx = TimemaniaParser.TipoDefinicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_tipoDefinicao)
        try:
            self.state = 84
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [27, 28, 29, 42]:
                self.enterOuterAlt(localctx, 1)
                self.state = 82
                self.tipoSimples()
                pass
            elif token in [25, 26]:
                self.enterOuterAlt(localctx, 2)
                self.state = 83
                self.tipoEstruturado()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoSimplesContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def INTEIRO(self):
            return self.getToken(TimemaniaParser.INTEIRO, 0)

        def TEXTO(self):
            return self.getToken(TimemaniaParser.TEXTO, 0)

        def BOOLEANO(self):
            return self.getToken(TimemaniaParser.BOOLEANO, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_tipoSimples

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipoSimples" ):
                listener.enterTipoSimples(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipoSimples" ):
                listener.exitTipoSimples(self)




    def tipoSimples(self):

        localctx = TimemaniaParser.TipoSimplesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_tipoSimples)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 4398986035200) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoEstruturadoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def registroTipo(self):
            return self.getTypedRuleContext(TimemaniaParser.RegistroTipoContext,0)


        def vetorTipo(self):
            return self.getTypedRuleContext(TimemaniaParser.VetorTipoContext,0)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_tipoEstruturado

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipoEstruturado" ):
                listener.enterTipoEstruturado(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipoEstruturado" ):
                listener.exitTipoEstruturado(self)




    def tipoEstruturado(self):

        localctx = TimemaniaParser.TipoEstruturadoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_tipoEstruturado)
        try:
            self.state = 90
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [25]:
                self.enterOuterAlt(localctx, 1)
                self.state = 88
                self.registroTipo()
                pass
            elif token in [26]:
                self.enterOuterAlt(localctx, 2)
                self.state = 89
                self.vetorTipo()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RegistroTipoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def REGISTRO(self):
            return self.getToken(TimemaniaParser.REGISTRO, 0)

        def CHAVE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.CHAVE)
            else:
                return self.getToken(TimemaniaParser.CHAVE, i)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.ID)
            else:
                return self.getToken(TimemaniaParser.ID, i)

        def DOISPONTOS(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.DOISPONTOS)
            else:
                return self.getToken(TimemaniaParser.DOISPONTOS, i)

        def tipoDefinicao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.TipoDefinicaoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.TipoDefinicaoContext,i)


        def DELIMITER(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.DELIMITER)
            else:
                return self.getToken(TimemaniaParser.DELIMITER, i)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_registroTipo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRegistroTipo" ):
                listener.enterRegistroTipo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRegistroTipo" ):
                listener.exitRegistroTipo(self)




    def registroTipo(self):

        localctx = TimemaniaParser.RegistroTipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_registroTipo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 92
            self.match(TimemaniaParser.REGISTRO)
            self.state = 93
            self.match(TimemaniaParser.CHAVE)
            self.state = 99 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 94
                self.match(TimemaniaParser.ID)
                self.state = 95
                self.match(TimemaniaParser.DOISPONTOS)
                self.state = 96
                self.tipoDefinicao()
                self.state = 97
                self.match(TimemaniaParser.DELIMITER)
                self.state = 101 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==42):
                    break

            self.state = 103
            self.match(TimemaniaParser.CHAVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VetorTipoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VETOR(self):
            return self.getToken(TimemaniaParser.VETOR, 0)

        def COLCHETE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.COLCHETE)
            else:
                return self.getToken(TimemaniaParser.COLCHETE, i)

        def expressao(self):
            return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,0)


        def DE(self):
            return self.getToken(TimemaniaParser.DE, 0)

        def tipoSimples(self):
            return self.getTypedRuleContext(TimemaniaParser.TipoSimplesContext,0)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_vetorTipo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVetorTipo" ):
                listener.enterVetorTipo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVetorTipo" ):
                listener.exitVetorTipo(self)




    def vetorTipo(self):

        localctx = TimemaniaParser.VetorTipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_vetorTipo)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            self.match(TimemaniaParser.VETOR)
            self.state = 106
            self.match(TimemaniaParser.COLCHETE)
            self.state = 107
            self.expressao()
            self.state = 108
            self.match(TimemaniaParser.COLCHETE)
            self.state = 109
            self.match(TimemaniaParser.DE)
            self.state = 110
            self.tipoSimples()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariavelContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VAR(self):
            return self.getToken(TimemaniaParser.VAR, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.ID)
            else:
                return self.getToken(TimemaniaParser.ID, i)

        def DOISPONTOS(self):
            return self.getToken(TimemaniaParser.DOISPONTOS, 0)

        def tipoSimples(self):
            return self.getTypedRuleContext(TimemaniaParser.TipoSimplesContext,0)


        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def VIRGULA(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.VIRGULA)
            else:
                return self.getToken(TimemaniaParser.VIRGULA, i)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_variavel

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariavel" ):
                listener.enterVariavel(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariavel" ):
                listener.exitVariavel(self)




    def variavel(self):

        localctx = TimemaniaParser.VariavelContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_variavel)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 112
            self.match(TimemaniaParser.VAR)
            self.state = 113
            self.match(TimemaniaParser.ID)
            self.state = 118
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==36:
                self.state = 114
                self.match(TimemaniaParser.VIRGULA)
                self.state = 115
                self.match(TimemaniaParser.ID)
                self.state = 120
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 121
            self.match(TimemaniaParser.DOISPONTOS)
            self.state = 122
            self.tipoSimples()
            self.state = 123
            self.match(TimemaniaParser.DELIMITER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncaoProcedimentoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def funcao(self):
            return self.getTypedRuleContext(TimemaniaParser.FuncaoContext,0)


        def procedimento(self):
            return self.getTypedRuleContext(TimemaniaParser.ProcedimentoContext,0)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_funcaoProcedimento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncaoProcedimento" ):
                listener.enterFuncaoProcedimento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncaoProcedimento" ):
                listener.exitFuncaoProcedimento(self)




    def funcaoProcedimento(self):

        localctx = TimemaniaParser.FuncaoProcedimentoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_funcaoProcedimento)
        try:
            self.state = 127
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [15]:
                self.enterOuterAlt(localctx, 1)
                self.state = 125
                self.funcao()
                pass
            elif token in [16]:
                self.enterOuterAlt(localctx, 2)
                self.state = 126
                self.procedimento()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FuncaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCAO(self):
            return self.getToken(TimemaniaParser.FUNCAO, 0)

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def PARENTESE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.PARENTESE)
            else:
                return self.getToken(TimemaniaParser.PARENTESE, i)

        def DOISPONTOS(self):
            return self.getToken(TimemaniaParser.DOISPONTOS, 0)

        def tipoSimples(self):
            return self.getTypedRuleContext(TimemaniaParser.TipoSimplesContext,0)


        def CHAVE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.CHAVE)
            else:
                return self.getToken(TimemaniaParser.CHAVE, i)

        def retorno(self):
            return self.getTypedRuleContext(TimemaniaParser.RetornoContext,0)


        def parametro(self):
            return self.getTypedRuleContext(TimemaniaParser.ParametroContext,0)


        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.ComandoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.ComandoContext,i)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_funcao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncao" ):
                listener.enterFuncao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncao" ):
                listener.exitFuncao(self)




    def funcao(self):

        localctx = TimemaniaParser.FuncaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_funcao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 129
            self.match(TimemaniaParser.FUNCAO)
            self.state = 130
            self.match(TimemaniaParser.ID)
            self.state = 131
            self.match(TimemaniaParser.PARENTESE)
            self.state = 133
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==42:
                self.state = 132
                self.parametro()


            self.state = 135
            self.match(TimemaniaParser.PARENTESE)
            self.state = 136
            self.match(TimemaniaParser.DOISPONTOS)
            self.state = 137
            self.tipoSimples()
            self.state = 138
            self.match(TimemaniaParser.CHAVE)
            self.state = 140 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 139
                self.comando()
                self.state = 142 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 4398048902984) != 0)):
                    break

            self.state = 144
            self.retorno()
            self.state = 145
            self.match(TimemaniaParser.CHAVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProcedimentoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PROCEDIMENTO(self):
            return self.getToken(TimemaniaParser.PROCEDIMENTO, 0)

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def PARENTESE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.PARENTESE)
            else:
                return self.getToken(TimemaniaParser.PARENTESE, i)

        def CHAVE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.CHAVE)
            else:
                return self.getToken(TimemaniaParser.CHAVE, i)

        def parametro(self):
            return self.getTypedRuleContext(TimemaniaParser.ParametroContext,0)


        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.ComandoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.ComandoContext,i)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_procedimento

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProcedimento" ):
                listener.enterProcedimento(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProcedimento" ):
                listener.exitProcedimento(self)




    def procedimento(self):

        localctx = TimemaniaParser.ProcedimentoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_procedimento)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 147
            self.match(TimemaniaParser.PROCEDIMENTO)
            self.state = 148
            self.match(TimemaniaParser.ID)
            self.state = 149
            self.match(TimemaniaParser.PARENTESE)
            self.state = 151
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==42:
                self.state = 150
                self.parametro()


            self.state = 153
            self.match(TimemaniaParser.PARENTESE)
            self.state = 154
            self.match(TimemaniaParser.CHAVE)
            self.state = 156 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 155
                self.comando()
                self.state = 158 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 4398048902984) != 0)):
                    break

            self.state = 160
            self.match(TimemaniaParser.CHAVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParametroContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.ID)
            else:
                return self.getToken(TimemaniaParser.ID, i)

        def DOISPONTOS(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.DOISPONTOS)
            else:
                return self.getToken(TimemaniaParser.DOISPONTOS, i)

        def tipoSimples(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.TipoSimplesContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.TipoSimplesContext,i)


        def VIRGULA(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.VIRGULA)
            else:
                return self.getToken(TimemaniaParser.VIRGULA, i)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_parametro

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParametro" ):
                listener.enterParametro(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParametro" ):
                listener.exitParametro(self)




    def parametro(self):

        localctx = TimemaniaParser.ParametroContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_parametro)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 162
            self.match(TimemaniaParser.ID)
            self.state = 163
            self.match(TimemaniaParser.DOISPONTOS)
            self.state = 164
            self.tipoSimples()
            self.state = 171
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==36:
                self.state = 165
                self.match(TimemaniaParser.VIRGULA)
                self.state = 166
                self.match(TimemaniaParser.ID)
                self.state = 167
                self.match(TimemaniaParser.DOISPONTOS)
                self.state = 168
                self.tipoSimples()
                self.state = 173
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RetornoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETORNA(self):
            return self.getToken(TimemaniaParser.RETORNA, 0)

        def expressao(self):
            return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,0)


        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_retorno

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRetorno" ):
                listener.enterRetorno(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRetorno" ):
                listener.exitRetorno(self)




    def retorno(self):

        localctx = TimemaniaParser.RetornoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_retorno)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 174
            self.match(TimemaniaParser.RETORNA)
            self.state = 175
            self.expressao()
            self.state = 176
            self.match(TimemaniaParser.DELIMITER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ComandoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def atribuicao(self):
            return self.getTypedRuleContext(TimemaniaParser.AtribuicaoContext,0)


        def futebol(self):
            return self.getTypedRuleContext(TimemaniaParser.FutebolContext,0)


        def io(self):
            return self.getTypedRuleContext(TimemaniaParser.IoContext,0)


        def controle(self):
            return self.getTypedRuleContext(TimemaniaParser.ControleContext,0)


        def chamadaFuncao(self):
            return self.getTypedRuleContext(TimemaniaParser.ChamadaFuncaoContext,0)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_comando

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComando" ):
                listener.enterComando(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComando" ):
                listener.exitComando(self)




    def comando(self):

        localctx = TimemaniaParser.ComandoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_comando)
        try:
            self.state = 183
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,13,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 178
                self.atribuicao()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 179
                self.futebol()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 180
                self.io()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 181
                self.controle()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 182
                self.chamadaFuncao()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AtribuicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def ASSIGN(self):
            return self.getToken(TimemaniaParser.ASSIGN, 0)

        def expressao(self):
            return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,0)


        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_atribuicao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtribuicao" ):
                listener.enterAtribuicao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtribuicao" ):
                listener.exitAtribuicao(self)




    def atribuicao(self):

        localctx = TimemaniaParser.AtribuicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_atribuicao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 185
            self.match(TimemaniaParser.ID)
            self.state = 186
            self.match(TimemaniaParser.ASSIGN)
            self.state = 187
            self.expressao()
            self.state = 188
            self.match(TimemaniaParser.DELIMITER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FutebolContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VASCO(self):
            return self.getToken(TimemaniaParser.VASCO, 0)

        def PARENTESE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.PARENTESE)
            else:
                return self.getToken(TimemaniaParser.PARENTESE, i)

        def STRING(self):
            return self.getToken(TimemaniaParser.STRING, 0)

        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def FLAMENGO(self):
            return self.getToken(TimemaniaParser.FLAMENGO, 0)

        def CORINTHIANS(self):
            return self.getToken(TimemaniaParser.CORINTHIANS, 0)

        def NUMBER(self):
            return self.getToken(TimemaniaParser.NUMBER, 0)

        def PALMEIRAS(self):
            return self.getToken(TimemaniaParser.PALMEIRAS, 0)

        def SANTOS(self):
            return self.getToken(TimemaniaParser.SANTOS, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_futebol

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFutebol" ):
                listener.enterFutebol(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFutebol" ):
                listener.exitFutebol(self)




    def futebol(self):

        localctx = TimemaniaParser.FutebolContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_futebol)
        try:
            self.state = 214
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 190
                self.match(TimemaniaParser.VASCO)
                self.state = 191
                self.match(TimemaniaParser.PARENTESE)
                self.state = 192
                self.match(TimemaniaParser.STRING)
                self.state = 193
                self.match(TimemaniaParser.PARENTESE)
                self.state = 194
                self.match(TimemaniaParser.DELIMITER)
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 2)
                self.state = 195
                self.match(TimemaniaParser.FLAMENGO)
                self.state = 196
                self.match(TimemaniaParser.PARENTESE)
                self.state = 197
                self.match(TimemaniaParser.STRING)
                self.state = 198
                self.match(TimemaniaParser.PARENTESE)
                self.state = 199
                self.match(TimemaniaParser.DELIMITER)
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 3)
                self.state = 200
                self.match(TimemaniaParser.CORINTHIANS)
                self.state = 201
                self.match(TimemaniaParser.PARENTESE)
                self.state = 202
                self.match(TimemaniaParser.NUMBER)
                self.state = 203
                self.match(TimemaniaParser.PARENTESE)
                self.state = 204
                self.match(TimemaniaParser.DELIMITER)
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 4)
                self.state = 205
                self.match(TimemaniaParser.PALMEIRAS)
                self.state = 206
                self.match(TimemaniaParser.PARENTESE)
                self.state = 207
                self.match(TimemaniaParser.PARENTESE)
                self.state = 208
                self.match(TimemaniaParser.DELIMITER)
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 5)
                self.state = 209
                self.match(TimemaniaParser.SANTOS)
                self.state = 210
                self.match(TimemaniaParser.PARENTESE)
                self.state = 211
                self.match(TimemaniaParser.STRING)
                self.state = 212
                self.match(TimemaniaParser.PARENTESE)
                self.state = 213
                self.match(TimemaniaParser.DELIMITER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ESCREVA(self):
            return self.getToken(TimemaniaParser.ESCREVA, 0)

        def PARENTESE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.PARENTESE)
            else:
                return self.getToken(TimemaniaParser.PARENTESE, i)

        def expressao(self):
            return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,0)


        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def LEIA(self):
            return self.getToken(TimemaniaParser.LEIA, 0)

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_io

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIo" ):
                listener.enterIo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIo" ):
                listener.exitIo(self)




    def io(self):

        localctx = TimemaniaParser.IoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_io)
        try:
            self.state = 227
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 216
                self.match(TimemaniaParser.ESCREVA)
                self.state = 217
                self.match(TimemaniaParser.PARENTESE)
                self.state = 218
                self.expressao()
                self.state = 219
                self.match(TimemaniaParser.PARENTESE)
                self.state = 220
                self.match(TimemaniaParser.DELIMITER)
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 222
                self.match(TimemaniaParser.LEIA)
                self.state = 223
                self.match(TimemaniaParser.PARENTESE)
                self.state = 224
                self.match(TimemaniaParser.ID)
                self.state = 225
                self.match(TimemaniaParser.PARENTESE)
                self.state = 226
                self.match(TimemaniaParser.DELIMITER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ControleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def SE(self):
            return self.getToken(TimemaniaParser.SE, 0)

        def PARENTESE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.PARENTESE)
            else:
                return self.getToken(TimemaniaParser.PARENTESE, i)

        def condicao(self):
            return self.getTypedRuleContext(TimemaniaParser.CondicaoContext,0)


        def ENTAO(self):
            return self.getToken(TimemaniaParser.ENTAO, 0)

        def bloco(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.BlocoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.BlocoContext,i)


        def SENAO(self):
            return self.getToken(TimemaniaParser.SENAO, 0)

        def ENQUANTO(self):
            return self.getToken(TimemaniaParser.ENQUANTO, 0)

        def FACA(self):
            return self.getToken(TimemaniaParser.FACA, 0)

        def PARA(self):
            return self.getToken(TimemaniaParser.PARA, 0)

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def ASSIGN(self):
            return self.getToken(TimemaniaParser.ASSIGN, 0)

        def expressao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.ExpressaoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,i)


        def ATE(self):
            return self.getToken(TimemaniaParser.ATE, 0)

        def REPITA(self):
            return self.getToken(TimemaniaParser.REPITA, 0)

        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_controle

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterControle" ):
                listener.enterControle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitControle" ):
                listener.exitControle(self)




    def controle(self):

        localctx = TimemaniaParser.ControleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_controle)
        self._la = 0 # Token type
        try:
            self.state = 263
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 229
                self.match(TimemaniaParser.SE)
                self.state = 230
                self.match(TimemaniaParser.PARENTESE)
                self.state = 231
                self.condicao()
                self.state = 232
                self.match(TimemaniaParser.PARENTESE)
                self.state = 233
                self.match(TimemaniaParser.ENTAO)
                self.state = 234
                self.bloco()
                self.state = 237
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==5:
                    self.state = 235
                    self.match(TimemaniaParser.SENAO)
                    self.state = 236
                    self.bloco()


                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 2)
                self.state = 239
                self.match(TimemaniaParser.ENQUANTO)
                self.state = 240
                self.match(TimemaniaParser.PARENTESE)
                self.state = 241
                self.condicao()
                self.state = 242
                self.match(TimemaniaParser.PARENTESE)
                self.state = 243
                self.match(TimemaniaParser.FACA)
                self.state = 244
                self.bloco()
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 3)
                self.state = 246
                self.match(TimemaniaParser.PARA)
                self.state = 247
                self.match(TimemaniaParser.ID)
                self.state = 248
                self.match(TimemaniaParser.ASSIGN)
                self.state = 249
                self.expressao()
                self.state = 250
                self.match(TimemaniaParser.ATE)
                self.state = 251
                self.expressao()
                self.state = 252
                self.match(TimemaniaParser.FACA)
                self.state = 253
                self.bloco()
                pass
            elif token in [21]:
                self.enterOuterAlt(localctx, 4)
                self.state = 255
                self.match(TimemaniaParser.REPITA)
                self.state = 256
                self.bloco()
                self.state = 257
                self.match(TimemaniaParser.ENQUANTO)
                self.state = 258
                self.match(TimemaniaParser.PARENTESE)
                self.state = 259
                self.condicao()
                self.state = 260
                self.match(TimemaniaParser.PARENTESE)
                self.state = 261
                self.match(TimemaniaParser.DELIMITER)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlocoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CHAVE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.CHAVE)
            else:
                return self.getToken(TimemaniaParser.CHAVE, i)

        def comando(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.ComandoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.ComandoContext,i)


        def getRuleIndex(self):
            return TimemaniaParser.RULE_bloco

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBloco" ):
                listener.enterBloco(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBloco" ):
                listener.exitBloco(self)




    def bloco(self):

        localctx = TimemaniaParser.BlocoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_bloco)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 265
            self.match(TimemaniaParser.CHAVE)
            self.state = 267 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 266
                self.comando()
                self.state = 269 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 4398048902984) != 0)):
                    break

            self.state = 271
            self.match(TimemaniaParser.CHAVE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ChamadaFuncaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(TimemaniaParser.ID, 0)

        def PARENTESE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.PARENTESE)
            else:
                return self.getToken(TimemaniaParser.PARENTESE, i)

        def DELIMITER(self):
            return self.getToken(TimemaniaParser.DELIMITER, 0)

        def expressao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.ExpressaoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,i)


        def VIRGULA(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.VIRGULA)
            else:
                return self.getToken(TimemaniaParser.VIRGULA, i)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_chamadaFuncao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterChamadaFuncao" ):
                listener.enterChamadaFuncao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitChamadaFuncao" ):
                listener.exitChamadaFuncao(self)




    def chamadaFuncao(self):

        localctx = TimemaniaParser.ChamadaFuncaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_chamadaFuncao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            self.match(TimemaniaParser.ID)
            self.state = 274
            self.match(TimemaniaParser.PARENTESE)
            self.state = 283
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
            if la_ == 1:
                self.state = 275
                self.expressao()
                self.state = 280
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==36:
                    self.state = 276
                    self.match(TimemaniaParser.VIRGULA)
                    self.state = 277
                    self.expressao()
                    self.state = 282
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 285
            self.match(TimemaniaParser.PARENTESE)
            self.state = 286
            self.match(TimemaniaParser.DELIMITER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.TermoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.TermoContext,i)


        def OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.OPERATOR)
            else:
                return self.getToken(TimemaniaParser.OPERATOR, i)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_expressao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpressao" ):
                listener.enterExpressao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpressao" ):
                listener.exitExpressao(self)




    def expressao(self):

        localctx = TimemaniaParser.ExpressaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_expressao)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 288
            self.termo()
            self.state = 293
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,21,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 289
                    self.match(TimemaniaParser.OPERATOR)
                    self.state = 290
                    self.termo() 
                self.state = 295
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,21,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(TimemaniaParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(TimemaniaParser.STRING, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.ID)
            else:
                return self.getToken(TimemaniaParser.ID, i)

        def COLCHETE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.COLCHETE)
            else:
                return self.getToken(TimemaniaParser.COLCHETE, i)

        def expressao(self):
            return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,0)


        def PONTO(self):
            return self.getToken(TimemaniaParser.PONTO, 0)

        def chamadaFuncao(self):
            return self.getTypedRuleContext(TimemaniaParser.ChamadaFuncaoContext,0)


        def PARENTESE(self, i:int=None):
            if i is None:
                return self.getTokens(TimemaniaParser.PARENTESE)
            else:
                return self.getToken(TimemaniaParser.PARENTESE, i)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_termo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermo" ):
                listener.enterTermo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermo" ):
                listener.exitTermo(self)




    def termo(self):

        localctx = TimemaniaParser.TermoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_termo)
        try:
            self.state = 312
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,22,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 296
                self.match(TimemaniaParser.NUMBER)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 297
                self.match(TimemaniaParser.STRING)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 298
                self.match(TimemaniaParser.ID)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 299
                self.match(TimemaniaParser.ID)
                self.state = 300
                self.match(TimemaniaParser.COLCHETE)
                self.state = 301
                self.expressao()
                self.state = 302
                self.match(TimemaniaParser.COLCHETE)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 304
                self.match(TimemaniaParser.ID)
                self.state = 305
                self.match(TimemaniaParser.PONTO)
                self.state = 306
                self.match(TimemaniaParser.ID)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 307
                self.chamadaFuncao()
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 308
                self.match(TimemaniaParser.PARENTESE)
                self.state = 309
                self.expressao()
                self.state = 310
                self.match(TimemaniaParser.PARENTESE)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CondicaoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expressao(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(TimemaniaParser.ExpressaoContext)
            else:
                return self.getTypedRuleContext(TimemaniaParser.ExpressaoContext,i)


        def OPERATOR(self):
            return self.getToken(TimemaniaParser.OPERATOR, 0)

        def COMPARADOR(self):
            return self.getToken(TimemaniaParser.COMPARADOR, 0)

        def getRuleIndex(self):
            return TimemaniaParser.RULE_condicao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondicao" ):
                listener.enterCondicao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondicao" ):
                listener.exitCondicao(self)




    def condicao(self):

        localctx = TimemaniaParser.CondicaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_condicao)
        self._la = 0 # Token type
        try:
            self.state = 323
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,24,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 314
                self.expressao()
                self.state = 317
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==38:
                    self.state = 315
                    self.match(TimemaniaParser.OPERATOR)
                    self.state = 316
                    self.expressao()


                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 319
                self.expressao()
                self.state = 320
                self.match(TimemaniaParser.COMPARADOR)
                self.state = 321
                self.expressao()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





