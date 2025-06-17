#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Visitador TAC para o Compilador Timemania
Percorre a AST e gera código de três endereços
"""

from typing import Optional, List, Dict, Any
from TimemaniaParserVisitor import TimemaniaParserVisitor
from TimemaniaParser import TimemaniaParser
from tac_generator import (
    TACGenerator, TACOperand, TACInstruction, TACOpcode, TACOperandType,
    make_identifier, make_constant, make_label
)


class TACVisitor(TimemaniaParserVisitor):
    """
    Visitador que gera código TAC a partir da AST
    """
    
    def __init__(self):
        self.tac = TACGenerator()
        self.symbol_table: Dict[str, str] = {}  # nome -> tipo
        self.current_function: Optional[str] = None
        
    def get_tac_code(self) -> str:
        """Retorna o código TAC gerado"""
        return self.tac.generate_code()
    
    def save_tac_to_file(self, filename: str):
        """Salva o código TAC em arquivo"""
        self.tac.save_to_file(filename)
    
    def visitPrograma(self, ctx: TimemaniaParser.ProgramaContext) -> TACOperand:
        """Visita o programa principal"""
        self.tac.emit_comment("Início do programa Timemania")
        self.tac.emit_comment("=" * 40)
        
        # Visitar declarações
        if ctx.declaracao():
            self.tac.emit_comment("Seção de declarações")
            for decl in ctx.declaracao():
                self.visit(decl)
        
        # Visitar comandos principais
        self.tac.emit_comment("Seção de comandos principais")
        for cmd in ctx.comando():
            self.visit(cmd)
        
        self.tac.emit_comment("Fim do programa")
        return None
    
    def visitDeclaracao(self, ctx: TimemaniaParser.DeclaracaoContext) -> TACOperand:
        """Visita uma declaração"""
        return self.visitChildren(ctx)
    
    def visitVariavelSimples(self, ctx: TimemaniaParser.VariavelSimplesContext) -> TACOperand:
        """Visita declaração de variável simples: tipo nome;"""
        var_type = ctx.tipoSimples().getText()
        var_name = ctx.ID().getText()
        
        # Adicionar à tabela de símbolos
        self.symbol_table[var_name] = var_type
        
        # Gerar comentário sobre a declaração
        self.tac.emit_comment(f"Declaração: {var_type} {var_name}")
        
        return None
    
    def visitVariavel(self, ctx: TimemaniaParser.VariavelContext) -> TACOperand:
        """Visita declaração de variável: var nome: tipo;"""
        var_type = ctx.tipoSimples().getText()
        
        # ctx.ID() retorna uma lista de IDs
        id_list = ctx.ID()
        if isinstance(id_list, list):
            for id_token in id_list:
                var_name = id_token.getText()
                # Adicionar à tabela de símbolos
                self.symbol_table[var_name] = var_type
                # Gerar comentário sobre a declaração
                self.tac.emit_comment(f"Declaração: var {var_name}: {var_type}")
        else:
            var_name = id_list.getText()
            # Adicionar à tabela de símbolos
            self.symbol_table[var_name] = var_type
            # Gerar comentário sobre a declaração
            self.tac.emit_comment(f"Declaração: var {var_name}: {var_type}")
        
        return None
    
    def visitConstante(self, ctx: TimemaniaParser.ConstanteContext) -> TACOperand:
        """Visita declaração de constante"""
        const_name = ctx.ID().getText()
        const_value = self.visit(ctx.expressaoGeral())
        
        var_operand = make_identifier(const_name)
        self.tac.emit_assign(var_operand, const_value)
        self.tac.emit_comment(f"Constante {const_name}")
        
        return None
    
    def visitComando(self, ctx: TimemaniaParser.ComandoContext) -> TACOperand:
        """Visita um comando"""
        return self.visitChildren(ctx)
    
    def visitAtribuicao(self, ctx: TimemaniaParser.AtribuicaoContext) -> TACOperand:
        """Visita uma atribuição: var = expressao;"""
        id_list = ctx.ID()
        if isinstance(id_list, list):
            var_name = id_list[0].getText()  # Pega o primeiro ID
        else:
            var_name = id_list.getText()
            
        expr_result = self.visit(ctx.expressaoGeral())
        
        var_operand = make_identifier(var_name)
        
        if expr_result:
            self.tac.emit_assign(var_operand, expr_result)
        
        return None
    
    def visitIo(self, ctx: TimemaniaParser.IoContext) -> TACOperand:
        """Visita operações de I/O"""
        if ctx.ESCREVA():
            # escreva(expressao)
            expr_result = self.visit(ctx.expressaoGeral())
            if expr_result:
                self.tac.emit_write(expr_result, newline=True)
        
        elif ctx.ESCREVA_SEM_QUEBRA():
            # escreva_sem_quebra(expressao)
            expr_result = self.visit(ctx.expressaoGeral())
            if expr_result:
                self.tac.emit_write(expr_result, newline=False)
        
        elif ctx.LEIA():
            # leia(variavel)
            var_name = ctx.ID().getText()
            var_operand = make_identifier(var_name)
            self.tac.emit_read(var_operand)
        
        return None
    
    def visitControle(self, ctx: TimemaniaParser.ControleContext) -> TACOperand:
        """Visita estruturas de controle"""
        
        if ctx.SE():
            return self.visit_if_statement(ctx)
        elif ctx.ENQUANTO():
            return self.visit_while_statement(ctx)
        elif ctx.PARA():
            return self.visit_for_statement(ctx)
        elif ctx.REPITA():
            return self.visit_repeat_statement(ctx)
        
        return None
    
    def visit_if_statement(self, ctx: TimemaniaParser.ControleContext) -> TACOperand:
        """Gera TAC para comando SE"""
        self.tac.emit_comment("Início do comando SE")
        
        # Avaliar condição
        condition_result = self.visit(ctx.condicao())
        
        # Criar etiquetas
        else_label = self.tac.new_label()
        end_label = self.tac.new_label()
        
        # Se condição é falsa, pular para else/fim
        if ctx.SENAO():
            self.tac.emit_if_false_goto(condition_result, else_label)
        else:
            self.tac.emit_if_false_goto(condition_result, end_label)
        
        # Bloco ENTÃO
        self.tac.emit_comment("Bloco ENTÃO")
        bloco_list = ctx.bloco()
        if isinstance(bloco_list, list):
            self.visit(bloco_list[0])  # Primeiro bloco
        else:
            self.visit(bloco_list)
        
        if ctx.SENAO():
            # Pular o bloco SENÃO
            self.tac.emit_goto(end_label)
            
            # Etiqueta do SENÃO
            self.tac.emit_label(else_label)
            self.tac.emit_comment("Bloco SENÃO")
            if isinstance(bloco_list, list) and len(bloco_list) > 1:
                self.visit(bloco_list[1])  # Segundo bloco
            else:
                # Procurar segundo bloco na estrutura
                pass
        
        # Etiqueta do fim
        self.tac.emit_label(end_label)
        self.tac.emit_comment("Fim do comando SE")
        
        return None
    
    def visit_while_statement(self, ctx: TimemaniaParser.ControleContext) -> TACOperand:
        """Gera TAC para comando ENQUANTO"""
        self.tac.emit_comment("Início do comando ENQUANTO")
        
        # Etiquetas
        loop_start = self.tac.new_label()
        loop_end = self.tac.new_label()
        
        # Início do loop
        self.tac.emit_label(loop_start)
        
        # Avaliar condição
        condition_result = self.visit(ctx.condicao())
        
        # Se condição é falsa, sair do loop
        self.tac.emit_if_false_goto(condition_result, loop_end)
        
        # Corpo do loop
        self.tac.emit_comment("Corpo do loop ENQUANTO")
        bloco_list = ctx.bloco()
        if isinstance(bloco_list, list):
            bloco = bloco_list[0]
        else:
            bloco = bloco_list
        self.visit(bloco)
        
        # Voltar ao início
        self.tac.emit_goto(loop_start)
        
        # Fim do loop
        self.tac.emit_label(loop_end)
        self.tac.emit_comment("Fim do comando ENQUANTO")
        
        return None
    
    def visit_for_statement(self, ctx: TimemaniaParser.ControleContext) -> TACOperand:
        """Gera TAC para comando PARA"""
        self.tac.emit_comment("Início do comando PARA")
        
        var_name = ctx.ID().getText()
        var_operand = make_identifier(var_name)
        
        # Inicialização
        start_value = self.visit(ctx.expressaoGeral(0))
        self.tac.emit_assign(var_operand, start_value)
        
        # Etiquetas
        loop_start = self.tac.new_label()
        loop_end = self.tac.new_label()
        
        # Início do loop
        self.tac.emit_label(loop_start)
        
        # Verificar condição (var <= fim)
        end_value = self.visit(ctx.expressaoGeral(1))
        temp_condition = self.tac.new_temp("booleano")
        self.tac.emit_binary_op(TACOpcode.LE, temp_condition, var_operand, end_value)
        
        # Se condição é falsa, sair do loop
        self.tac.emit_if_false_goto(temp_condition, loop_end)
        
        # Corpo do loop
        self.tac.emit_comment("Corpo do loop PARA")
        bloco = ctx.bloco()
        if isinstance(bloco, list):
            for b in bloco:
                self.visit(b)
        else:
            self.visit(bloco)
        
        # Incrementar variável
        temp_inc = self.tac.new_temp("inteiro")
        one = make_constant(1, "inteiro")
        self.tac.emit_binary_op(TACOpcode.ADD, temp_inc, var_operand, one)
        self.tac.emit_assign(var_operand, temp_inc)
        
        # Voltar ao início
        self.tac.emit_goto(loop_start)
        
        # Fim do loop
        self.tac.emit_label(loop_end)
        self.tac.emit_comment("Fim do comando PARA")
        
        return None
    
    def visit_repeat_statement(self, ctx: TimemaniaParser.ControleContext) -> TACOperand:
        """Gera TAC para comando REPITA"""
        self.tac.emit_comment("Início do comando REPITA")
        
        # Etiqueta do início
        loop_start = self.tac.new_label()
        self.tac.emit_label(loop_start)
        
        # Corpo do loop (executado pelo menos uma vez)
        self.tac.emit_comment("Corpo do loop REPITA")
        bloco = ctx.bloco()
        if isinstance(bloco, list):
            for b in bloco:
                self.visit(b)
        else:
            self.visit(bloco)
        
        # Avaliar condição
        condition_result = self.visit(ctx.condicao())
        
        # Se condição é falsa, repetir
        self.tac.emit_if_false_goto(condition_result, loop_start)
        
        self.tac.emit_comment("Fim do comando REPITA")
        
        return None
    
    def visitBloco(self, ctx: TimemaniaParser.BlocoContext) -> TACOperand:
        """Visita um bloco de comandos"""
        for cmd in ctx.comando():
            self.visit(cmd)
        return None
    
    def visitExpressaoGeral(self, ctx: TimemaniaParser.ExpressaoGeralContext) -> TACOperand:
        """Visita uma expressão geral"""
        if ctx.expressao():
            return self.visit(ctx.expressao())
        elif ctx.condicao():
            return self.visit(ctx.condicao())
        return None
    
    def visitExpressao(self, ctx: TimemaniaParser.ExpressaoContext) -> TACOperand:
        """Visita uma expressão aritmética"""
        if ctx.concatenacao():
            return self.visit(ctx.concatenacao())
        
        # Expressão aritmética: termo (op termo)*
        if len(ctx.termo()) == 1:
            # Apenas um termo
            return self.visit(ctx.termo(0))
        
        # Múltiplos termos com operadores
        result = self.visit(ctx.termo(0))
        
        for i in range(1, len(ctx.termo())):
            operator = ctx.OPERADOR_ARITMETICO(i-1).getText()
            right_operand = self.visit(ctx.termo(i))
            
            temp_result = self.tac.new_temp("inteiro")
            
            if operator == '+':
                self.tac.emit_binary_op(TACOpcode.ADD, temp_result, result, right_operand)
            elif operator == '-':
                self.tac.emit_binary_op(TACOpcode.SUB, temp_result, result, right_operand)
            elif operator == '*':
                self.tac.emit_binary_op(TACOpcode.MUL, temp_result, result, right_operand)
            elif operator == '/':
                self.tac.emit_binary_op(TACOpcode.DIV, temp_result, result, right_operand)
            elif operator == '%':
                self.tac.emit_binary_op(TACOpcode.MOD, temp_result, result, right_operand)
            
            result = temp_result
        
        return result
    
    def visitConcatenacao(self, ctx: TimemaniaParser.ConcatenacaoContext) -> TACOperand:
        """Visita concatenação de strings"""
        left = self.visit(ctx.termo(0))
        right = self.visit(ctx.termo(1))
        
        temp_result = self.tac.new_temp("texto")
        self.tac.emit_binary_op(TACOpcode.CONCAT, temp_result, left, right)
        
        return temp_result
    
    def visitTermo(self, ctx: TimemaniaParser.TermoContext) -> TACOperand:
        """Visita um termo"""
        if ctx.NUMBER():
            value = int(ctx.NUMBER().getText())
            return make_constant(value, "inteiro")
        
        elif ctx.STRING():
            # Remover aspas da string
            value = ctx.STRING().getText()[1:-1]
            return make_constant(value, "texto")
        
        elif ctx.ID() and not ctx.ABRE_COLCHETE() and not ctx.PONTO():
            # Variável simples
            id_list = ctx.ID()
            if isinstance(id_list, list):
                var_name = id_list[0].getText()  # Pega o primeiro ID
            else:
                var_name = id_list.getText()
            return make_identifier(var_name)
        
        elif ctx.chamadaFuncao():
            return self.visit(ctx.chamadaFuncao())
        
        elif ctx.ABRE_PARENTESE():
            # Expressão entre parênteses
            return self.visit(ctx.expressaoGeral())
        
        # Outros casos (array, record, etc.) - implementar conforme necessário
        return None
    
    def visitCondicao(self, ctx: TimemaniaParser.CondicaoContext) -> TACOperand:
        """Visita uma condição"""
        return self.visit(ctx.condicaoOr())
    
    def visitCondicaoOr(self, ctx: TimemaniaParser.CondicaoOrContext) -> TACOperand:
        """Visita condição com OR"""
        if len(ctx.condicaoAnd()) == 1:
            return self.visit(ctx.condicaoAnd(0))
        
        # Múltiplos termos com OR
        result = self.visit(ctx.condicaoAnd(0))
        
        for i in range(1, len(ctx.condicaoAnd())):
            right_operand = self.visit(ctx.condicaoAnd(i))
            temp_result = self.tac.new_temp("booleano")
            self.tac.emit_binary_op(TACOpcode.OR, temp_result, result, right_operand)
            result = temp_result
        
        return result
    
    def visitCondicaoAnd(self, ctx: TimemaniaParser.CondicaoAndContext) -> TACOperand:
        """Visita condição com AND"""
        if len(ctx.condicaoUnary()) == 1:
            return self.visit(ctx.condicaoUnary(0))
        
        # Múltiplos termos com AND
        result = self.visit(ctx.condicaoUnary(0))
        
        for i in range(1, len(ctx.condicaoUnary())):
            right_operand = self.visit(ctx.condicaoUnary(i))
            temp_result = self.tac.new_temp("booleano")
            self.tac.emit_binary_op(TACOpcode.AND, temp_result, result, right_operand)
            result = temp_result
        
        return result
    
    def visitCondicaoUnary(self, ctx: TimemaniaParser.CondicaoUnaryContext) -> TACOperand:
        """Visita condição unária (com NOT)"""
        if ctx.NOT():
            operand = self.visit(ctx.condicaoUnary())
            temp_result = self.tac.new_temp("booleano")
            self.tac.emit_unary_op(TACOpcode.NOT, temp_result, operand)
            return temp_result
        else:
            return self.visit(ctx.condicaoAtom())
    
    def visitCondicaoAtom(self, ctx: TimemaniaParser.CondicaoAtomContext) -> TACOperand:
        """Visita condição atômica"""
        if ctx.ABRE_PARENTESE():
            # Condição entre parênteses
            return self.visit(ctx.condicao())
        
        elif len(ctx.expressao()) == 2:
            # Comparação: expr COMPARADOR expr
            left = self.visit(ctx.expressao(0))
            right = self.visit(ctx.expressao(1))
            comparator = ctx.COMPARADOR().getText()
            
            temp_result = self.tac.new_temp("booleano")
            
            if comparator == '==':
                self.tac.emit_binary_op(TACOpcode.EQ, temp_result, left, right)
            elif comparator == '!=':
                self.tac.emit_binary_op(TACOpcode.NE, temp_result, left, right)
            elif comparator == '<':
                self.tac.emit_binary_op(TACOpcode.LT, temp_result, left, right)
            elif comparator == '<=':
                self.tac.emit_binary_op(TACOpcode.LE, temp_result, left, right)
            elif comparator == '>':
                self.tac.emit_binary_op(TACOpcode.GT, temp_result, left, right)
            elif comparator == '>=':
                self.tac.emit_binary_op(TACOpcode.GE, temp_result, left, right)
            
            return temp_result
        
        elif len(ctx.expressao()) == 1:
            # Expressão booleana simples
            return self.visit(ctx.expressao(0))
        
        return None
    
    def visitChamadaFuncao(self, ctx: TimemaniaParser.ChamadaFuncaoContext) -> TACOperand:
        """Visita chamada de função"""
        func_name = ctx.ID().getText()
        
        # Gerar código para parâmetros
        param_count = 0
        if ctx.expressaoGeral():
            for expr in ctx.expressaoGeral():
                param_result = self.visit(expr)
                if param_result:
                    self.tac.emit(TACInstruction(TACOpcode.PARAM, arg1=param_result))
                    param_count += 1
        
        # Chamada da função
        func_operand = make_identifier(func_name)
        param_count_operand = make_constant(param_count, "inteiro")
        
        # Resultado da função (se houver)
        if func_name not in ['vasco', 'flamengo', 'escreva', 'leia']:  # Funções sem retorno
            temp_result = self.tac.new_temp()
            self.tac.emit(TACInstruction(TACOpcode.CALL, result=temp_result, 
                                       arg1=func_operand, arg2=param_count_operand))
            return temp_result
        else:
            self.tac.emit(TACInstruction(TACOpcode.CALL, arg1=func_operand, 
                                       arg2=param_count_operand))
            return None
    
    def visitFutebol(self, ctx: TimemaniaParser.FutebolContext) -> TACOperand:
        """Visita comandos especiais (vasco, flamengo, etc.)"""
        if ctx.VASCO():
            # vasco(string) - equivale a print
            string_value = ctx.STRING().getText()[1:-1]  # Remove aspas
            string_operand = make_constant(string_value, "texto")
            self.tac.emit_write(string_operand)
        
        elif ctx.FLAMENGO():
            # flamengo(string) - equivale a print
            string_value = ctx.STRING().getText()[1:-1]  # Remove aspas
            string_operand = make_constant(string_value, "texto")
            self.tac.emit_write(string_operand)
        
        elif ctx.CORINTHIANS():
            # corinthians(number) - equivale a print number
            number_value = int(ctx.NUMBER().getText())
            number_operand = make_constant(number_value, "inteiro")
            self.tac.emit_write(number_operand)
        
        # Outros comandos podem ser adicionados aqui
        
        return None
