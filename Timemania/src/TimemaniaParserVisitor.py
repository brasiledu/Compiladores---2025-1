# Generated from TimemaniaParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .TimemaniaParser import TimemaniaParser
else:
    from TimemaniaParser import TimemaniaParser

# This class defines a complete generic visitor for a parse tree produced by TimemaniaParser.

class TimemaniaParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by TimemaniaParser#programa.
    def visitPrograma(self, ctx:TimemaniaParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#declaracao.
    def visitDeclaracao(self, ctx:TimemaniaParser.DeclaracaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#constante.
    def visitConstante(self, ctx:TimemaniaParser.ConstanteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#tipagem.
    def visitTipagem(self, ctx:TimemaniaParser.TipagemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#tipoDefinicao.
    def visitTipoDefinicao(self, ctx:TimemaniaParser.TipoDefinicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#tipoSimples.
    def visitTipoSimples(self, ctx:TimemaniaParser.TipoSimplesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#tipoEstruturado.
    def visitTipoEstruturado(self, ctx:TimemaniaParser.TipoEstruturadoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#registroTipo.
    def visitRegistroTipo(self, ctx:TimemaniaParser.RegistroTipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#vetorTipo.
    def visitVetorTipo(self, ctx:TimemaniaParser.VetorTipoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#variavel.
    def visitVariavel(self, ctx:TimemaniaParser.VariavelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#variavelSimples.
    def visitVariavelSimples(self, ctx:TimemaniaParser.VariavelSimplesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#funcaoProcedimento.
    def visitFuncaoProcedimento(self, ctx:TimemaniaParser.FuncaoProcedimentoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#funcao.
    def visitFuncao(self, ctx:TimemaniaParser.FuncaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#procedimento.
    def visitProcedimento(self, ctx:TimemaniaParser.ProcedimentoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#parametro.
    def visitParametro(self, ctx:TimemaniaParser.ParametroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#retorno.
    def visitRetorno(self, ctx:TimemaniaParser.RetornoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#comando.
    def visitComando(self, ctx:TimemaniaParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#atribuicao.
    def visitAtribuicao(self, ctx:TimemaniaParser.AtribuicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#futebol.
    def visitFutebol(self, ctx:TimemaniaParser.FutebolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#io.
    def visitIo(self, ctx:TimemaniaParser.IoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#controle.
    def visitControle(self, ctx:TimemaniaParser.ControleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#bloco.
    def visitBloco(self, ctx:TimemaniaParser.BlocoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#chamadaFuncao.
    def visitChamadaFuncao(self, ctx:TimemaniaParser.ChamadaFuncaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#expressaoGeral.
    def visitExpressaoGeral(self, ctx:TimemaniaParser.ExpressaoGeralContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#expressao.
    def visitExpressao(self, ctx:TimemaniaParser.ExpressaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#concatenacao.
    def visitConcatenacao(self, ctx:TimemaniaParser.ConcatenacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#termo.
    def visitTermo(self, ctx:TimemaniaParser.TermoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#arrayOp.
    def visitArrayOp(self, ctx:TimemaniaParser.ArrayOpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#condicao.
    def visitCondicao(self, ctx:TimemaniaParser.CondicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#condicaoOr.
    def visitCondicaoOr(self, ctx:TimemaniaParser.CondicaoOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#condicaoAnd.
    def visitCondicaoAnd(self, ctx:TimemaniaParser.CondicaoAndContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#condicaoUnary.
    def visitCondicaoUnary(self, ctx:TimemaniaParser.CondicaoUnaryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by TimemaniaParser#condicaoAtom.
    def visitCondicaoAtom(self, ctx:TimemaniaParser.CondicaoAtomContext):
        return self.visitChildren(ctx)



del TimemaniaParser