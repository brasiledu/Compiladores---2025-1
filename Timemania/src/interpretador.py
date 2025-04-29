import sys
import os
from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser
from tree_visualizer import TreeVisualizer

class TimemaniaInterpreter:
    def __init__(self):
        self.variables = {}      # Armazenar variáveis
        self.constants = {}      # Armazenar constantes
        self.types = {}          # Armazenar tipos definidos pelo usuário
        self.functions = {}      # Armazenar funções
        self.procedures = {}     # Armazenar procedimentos
        self.current_scope = []  # Pilha de escopos para funções/procedimentos
        self.return_value = None # Valor de retorno para funções
        self.debug = False       # Modo de debug

    def push_scope(self):
        """Cria um novo escopo para variáveis locais."""
        self.current_scope.append({})
        
    def pop_scope(self):
        """Remove o escopo atual ao sair de função/procedimento."""
        if self.current_scope:
            self.current_scope.pop()
            
    def get_variable(self, name):
        """Obtém o valor de uma variável considerando escopo."""
        # Procura em escopos locais, do mais recente para o mais antigo
        for scope in reversed(self.current_scope):
            if name in scope:
                return scope[name]
        
        # Procura no escopo global
        if name in self.variables:
            return self.variables[name]
        
        # Procura em constantes
        if name in self.constants:
            return self.constants[name]
            
        # Variável não encontrada
        print(f"ERRO: Variável '{name}' não definida. Assumindo valor 0.")
        return 0
        
    def set_variable(self, name, value):
        """Define o valor de uma variável considerando escopo."""
        # Se for uma constante, não permite a alteração
        if name in self.constants:
            print(f"ERRO: Não é possível modificar a constante '{name}'")
            return
            
        # Se estiver em um escopo local, atualiza lá
        if self.current_scope:
            # Verifica se já existe em algum escopo local
            for scope in reversed(self.current_scope):
                if name in scope:
                    scope[name] = value
                    return
            
            # Se não existir em nenhum escopo local, cria no mais recente
            self.current_scope[-1][name] = value
        else:
            # Escopo global
            self.variables[name] = value

    def toggle_debug(self):
        self.debug = not self.debug
        print(f"Modo debug: {'ATIVADO' if self.debug else 'DESATIVADO'}")

    def run(self, input_file):
        try:
            # Carregar o arquivo e criar o lexer
            input_stream = FileStream(input_file, encoding='utf-8')
            lexer = TimemaniaLexer(input_stream)
            stream = CommonTokenStream(lexer)
            
            # Criar o parser e iniciar a análise
            parser = TimemaniaParser(stream)
            tree = parser.programa()
            
            # DEBUG: Visualize a árvore antes de interpretar
            if self.debug:
                print("Estrutura da Árvore Sintática:")
                visualizer = TreeVisualizer(parser)
                visualizer.visualize(tree)
                
            # Interpretar o programa
            return self.visitPrograma(tree)
        except Exception as e:
            print(f"Erro ao executar programa: {e}")
            import traceback
            traceback.print_exc()
            return None

    # === Métodos principais de visitação ===
    
    def visitPrograma(self, ctx):
        """Visita o nó raiz do programa."""
        result = None
        
        # Primeiro, processa declarações (constantes, tipos, funções)
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if self.isDeclaracao(child):
                self.visit(child)
        
        # Depois, processa comandos
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if not self.isDeclaracao(child) and not self.isToken(child, ['START', 'END']):
                result = self.visit(child)
                
        return result

    def visit(self, ctx):
        """Método genérico de visita que redireciona para o método específico."""
        if ctx is None:
            return None
            
        # Determina o nome do método a ser chamado com base no nome da classe do contexto
        ctx_class_name = ctx.__class__.__name__
        if ctx_class_name.endswith('Context'):
            # Remove o sufixo 'Context' e adiciona o prefixo 'visit'
            method_name = 'visit' + ctx_class_name[:-7]
            
            # Verifica se o método existe
            if hasattr(self, method_name):
                method = getattr(self, method_name)
                return method(ctx)
        
        # Se método específico não for encontrado, processa genericamente
        return self.visitChildren(ctx)

    def visitChildren(self, ctx):
        """Visita todos os filhos de um nó."""
        result = None
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            result = self.visit(child)
        return result

    # === Novos métodos para declarações ===
    
    def visitDeclaracao(self, ctx):
        """Processa uma declaração."""
        # Delega para o tipo específico de declaração
        return self.visitChildren(ctx)
        
    def visitConstante(self, ctx):
        """Define uma constante."""
        const_name = self.findIdentifier(ctx)
        expr = self.findExpression(ctx)
        
        if const_name and expr:
            value = self.visit(expr)
            self.constants[const_name] = value
            if self.debug:
                print(f"DEBUG: Constante {const_name} = {value}")
        return None
        
    def visitTipagem(self, ctx):
        """Define um novo tipo."""
        type_name = self.findIdentifier(ctx)
        type_def = self.findTypeDefinition(ctx)
        
        if type_name and type_def:
            self.types[type_name] = self.visit(type_def)
            if self.debug:
                print(f"DEBUG: Tipo {type_name} definido")
        return None
        
    def visitTipoDefinicao(self, ctx):
        """Processa uma definição de tipo."""
        # Pode ser tipo simples ou estruturado
        return self.visitChildren(ctx)
        
    def visitRegistroTipo(self, ctx):
        """Define um tipo de registro."""
        fields = {}
        
        # Percorre campos do registro
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if self.isIdentifier(child):
                field_name = child.getText()
                # Procura o tipo do campo
                field_type = self.findNextIdentifierAfter(ctx, i)
                if field_type:
                    fields[field_name] = field_type
        
        return {'type': 'record', 'fields': fields}
        
    def visitVetorTipo(self, ctx):
        """Define um tipo de array."""
        size_expr = self.findExpression(ctx)
        element_type = self.findIdentifierAfter(ctx, 'DE')
        
        size = 10  # Tamanho padrão
        if size_expr:
            size = self.visit(size_expr)
            
        return {'type': 'array', 'size': size, 'element_type': element_type}
        
    def visitVariavel(self, ctx):
        """Declara uma variável."""
        var_names = []
        type_name = None
        
        # Encontra todos os nomes de variáveis
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if self.isIdentifier(child) and child.getText().lower() != 'var':
                if self.hasToken(ctx, 'DOISPONTOS', i+1):
                    # Se for seguido por ":", é o último identificador antes do tipo
                    var_names.append(child.getText())
                    # O próximo identificador após ":" é o tipo
                    type_name = self.findIdentifierAfter(ctx, 'DOISPONTOS')
                    break
                else:
                    var_names.append(child.getText())
        
        # Inicializa as variáveis com valor padrão
        if type_name:
            default_value = 0  # Valor padrão para números
            if type_name.lower() == 'texto':
                default_value = ""
            elif type_name.lower() == 'booleano':
                default_value = False
                
            for var_name in var_names:
                self.variables[var_name] = default_value
                if self.debug:
                    print(f"DEBUG: Variável {var_name}:{type_name} = {default_value}")
        
        return None

    def visitFuncao(self, ctx):
        """Define uma função."""
        func_name = self.findIdentifier(ctx)
        params = self.extractParameters(ctx)
        return_type = self.findIdentifierAfter(ctx, 'DOISPONTOS')
        
        # Extrai o corpo da função
        body = []
        in_body = False
        for i in range(ctx.getChildCount()):
            if ctx.getChild(i).getText() == '{':
                in_body = True
            elif ctx.getChild(i).getText() == '}':
                in_body = False
            elif in_body and not self.isToken(ctx.getChild(i), ['RETORNA']):
                body.append(ctx.getChild(i))
        
        # Extrai o retorno
        return_expr = None
        for i in range(ctx.getChildCount()):
            if self.isToken(ctx.getChild(i), ['RETORNA']):
                return_expr = self.findNextExpression(ctx, i)
                break
        
        # Armazena a definição da função
        self.functions[func_name] = {
            'params': params,
            'return_type': return_type,
            'body': body,
            'return_expr': return_expr
        }
        
        if self.debug:
            print(f"DEBUG: Função {func_name} definida com {len(params)} parâmetros")
        
        return None
        
    def visitProcedimento(self, ctx):
        """Define um procedimento."""
        proc_name = self.findIdentifier(ctx)
        params = self.extractParameters(ctx)
        
        # Extrai o corpo do procedimento
        body = []
        in_body = False
        for i in range(ctx.getChildCount()):
            if ctx.getChild(i).getText() == '{':
                in_body = True
            elif ctx.getChild(i).getText() == '}':
                in_body = False
            elif in_body:
                body.append(ctx.getChild(i))
        
        # Armazena a definição do procedimento
        self.procedures[proc_name] = {
            'params': params,
            'body': body
        }
        
        if self.debug:
            print(f"DEBUG: Procedimento {proc_name} definido com {len(params)} parâmetros")
        
        return None
        
    def visitChamadaFuncao(self, ctx):
        """Processa uma chamada de função ou procedimento."""
        func_name = self.findIdentifier(ctx)
        args = self.extractArguments(ctx)
        
        if func_name in self.functions:
            # Chamada de função
            function = self.functions[func_name]
            
            # Cria um novo escopo
            self.push_scope()
            
            # Liga argumentos aos parâmetros
            for i, param in enumerate(function['params']):
                if i < len(args):
                    self.current_scope[-1][param['name']] = args[i]
            
            # Executa o corpo da função
            for cmd in function['body']:
                self.visit(cmd)
            
            # Obtém o valor de retorno
            if function['return_expr']:
                result = self.visit(function['return_expr'])
            else:
                result = None
                
            # Remove o escopo
            self.pop_scope()
            
            return result
            
        elif func_name in self.procedures:
            # Chamada de procedimento
            procedure = self.procedures[func_name]
            
            # Cria um novo escopo
            self.push_scope()
            
            # Liga argumentos aos parâmetros
            for i, param in enumerate(procedure['params']):
                if i < len(args):
                    self.current_scope[-1][param['name']] = args[i]
            
            # Executa o corpo do procedimento
            for cmd in procedure['body']:
                self.visit(cmd)
                
            # Remove o escopo
            self.pop_scope()
            
            return None
        
        else:
            print(f"ERRO: Função ou procedimento '{func_name}' não definido")
            return None

    # === Métodos existentes atualizados ===

    def visitComando(self, ctx):
        """Processa um comando."""
        # Verificar o tipo de comando e delegar para o método apropriado
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            self.visit(child)
        return None

    def visitIo(self, ctx):
        """Processa comandos de entrada/saída."""
        if self.hasToken(ctx, 'ESCREVA'):
            # Comando escreva
            string_literal = self.findStringLiteral(ctx)
            if string_literal:
                # É uma string literal
                text = string_literal[1:-1]  # Remove as aspas
                print(text)
            else:
                # É uma expressão
                expr = self.findExpression(ctx)
                if expr:
                    value = self.visit(expr)
                    print(value)
        elif self.hasToken(ctx, 'LEIA'):
            # Comando leia
            var_name = self.findIdentifier(ctx)
            if var_name:
                try:
                    value = input()
                    # Tenta converter para inteiro, se não conseguir, mantém como string
                    try:
                        value = int(value)
                    except ValueError:
                        pass
                    self.set_variable(var_name, value)
                except Exception as e:
                    print(f"Erro na leitura: {e}")
        return None

    def visitAtribuicao(self, ctx):
        """Processa uma atribuição."""
        var_name = self.findIdentifier(ctx)
        expr = self.findExpression(ctx)
        
        if var_name and expr:
            value = self.visit(expr)
            self.set_variable(var_name, value)
            if self.debug:
                print(f"DEBUG: Atribuição {var_name} = {value}")
        return None

    def visitControle(self, ctx):
        """Processa estruturas de controle (se/enquanto/para/repita)."""
        if self.hasToken(ctx, 'SE'):
            # Estrutura if-else
            condition = self.findCondition(ctx)
            if condition:
                result = self.visit(condition)
                if result:
                    # Processa o bloco 'então'
                    then_block = self.findBlock(ctx, after='ENTAO')
                    if then_block:
                        return self.visit(then_block)
                else:
                    # Processa o bloco 'senão' se existir
                    else_block = self.findBlock(ctx, after='SENAO')
                    if else_block:
                        return self.visit(else_block)
                        
        elif self.hasToken(ctx, 'ENQUANTO') and not self.hasToken(ctx, 'REPITA'):
            # Estrutura de loop while
            condition = self.findCondition(ctx)
            block = self.findBlock(ctx, after='FACA')
            
            if condition and block:
                while self.visit(condition):
                    result = self.visit(block)
                    if self.debug:
                        print(f"DEBUG: Iteração ENQUANTO")
                        
        elif self.hasToken(ctx, 'PARA'):
            # Loop for
            counter_var = self.findIdentifier(ctx)
            start_expr = self.findExpressionAfter(ctx, 'ASSIGN')
            end_expr = self.findExpressionAfter(ctx, 'ATE')
            block = self.findBlock(ctx, after='FACA')
            
            if counter_var and start_expr and end_expr and block:
                start_val = self.visit(start_expr)
                end_val = self.visit(end_expr)
                
                self.set_variable(counter_var, start_val)
                
                if start_val <= end_val:
                    # Loop crescente
                    while self.get_variable(counter_var) <= end_val:
                        self.visit(block)
                        current = self.get_variable(counter_var)
                        self.set_variable(counter_var, current + 1)
                        if self.debug:
                            print(f"DEBUG: Iteração PARA {counter_var}={current+1}")
                else:
                    # Loop decrescente
                    while self.get_variable(counter_var) >= end_val:
                        self.visit(block)
                        current = self.get_variable(counter_var)
                        self.set_variable(counter_var, current - 1)
                        if self.debug:
                            print(f"DEBUG: Iteração PARA {counter_var}={current-1}")
                            
        elif self.hasToken(ctx, 'REPITA'):
            # Loop do-while (repeat-until)
            block = self.findBlockBetween(ctx, 'REPITA', 'ENQUANTO')
            condition = self.findCondition(ctx)
            
            if block and condition:
                while True:
                    self.visit(block)
                    if self.visit(condition):
                        break
                    if self.debug:
                        print(f"DEBUG: Iteração REPITA")
        
        return None

    def visitFutebol(self, ctx):
        """Processa comandos específicos de futebol."""
        if self.hasToken(ctx, 'FLAMENGO'):
            msg = self.findStringLiteral(ctx)
            if msg:
                print(f"Flamengo diz: {msg[1:-1]}")
        elif self.hasToken(ctx, 'CORINTHIANS'):
            num = self.findNumber(ctx)
            if num:
                print(f"Corinthians marcou {num} gols")
        elif self.hasToken(ctx, 'PALMEIRAS'):
            print("Palmeiras não tem mundial")
        elif self.hasToken(ctx, 'SANTOS'):
            player = self.findStringLiteral(ctx)
            if player:
                print(f"Santos: {player[1:-1]} foi o melhor do mundo")
        elif self.hasToken(ctx, 'VASCO'):
            msg = self.findStringLiteral(ctx)
            if msg:
                print(f"Vasco da Gama: {msg[1:-1]}")
        return None

    def visitExpressao(self, ctx):
        """Avalia uma expressão."""
        if ctx.getChildCount() == 1:
            # Apenas um termo
            return self.visit(ctx.getChild(0))
        
        # Operação binária
        left = self.visit(ctx.getChild(0))
        op = ctx.getChild(1).getText()
        right = self.visit(ctx.getChild(2))
        
        # Operações aritméticas
        if op == '+':
            return left + right
        elif op == '-':
            return left - right
        elif op == '*':
            return left * right
        elif op == '/':
            if right == 0:
                print("ERRO: Divisão por zero!")
                return 0
            return left // right  # Divisão inteira
        elif op == '%':
            if right == 0:
                print("ERRO: Módulo por zero!")
                return 0
            return left % right
            
        # Operações de comparação
        elif op == '==':
            return left == right
        elif op == '!=':
            return left != right
        elif op == '>':
            return left > right
        elif op == '<':
            return left < right
        elif op == '>=':
            return left >= right
        elif op == '<=':
            return left <= right
            
        # Operações lógicas
        elif op == '&&':
            return left and right
        elif op == '||':
            return left or right
        
        return 0  # Não deve chegar aqui
        
    def visitTermo(self, ctx):
        """Avalia um termo."""
        if ctx.getChildCount() == 1:
            text = ctx.getText()
            
            # Número literal
            if text.isdigit():
                return int(text)
                
            # String literal
            if text.startswith('"') and text.endswith('"'):
                return text[1:-1]  # Remove as aspas
                
            # Variável ou constante
            if self.isIdentifier(ctx.getChild(0)):
                var_name = text
                return self.get_variable(var_name)
                
            # Chamada de função
            child = ctx.getChild(0)
            if hasattr(child, 'getRuleIndex') and hasattr(TimemaniaParser, 'RULE_chamadaFuncao'):
                if child.getRuleIndex() == TimemaniaParser.RULE_chamadaFuncao:
                    return self.visit(child)
                    
            # Acesso a elemento de array
            if '[' in text and ']' in text:
                array_name = text.split('[')[0]
                index_expr = self.findExpression(ctx)
                if array_name and index_expr:
                    array = self.get_variable(array_name)
                    index = self.visit(index_expr)
                    if isinstance(array, list) and 0 <= index < len(array):
                        return array[index]
                    else:
                        print(f"ERRO: Índice {index} fora dos limites do array {array_name}")
                        return 0
                        
            # Acesso a campo de registro
            if '.' in text:
                parts = text.split('.')
                record_name = parts[0]
                field_name = parts[1]
                record = self.get_variable(record_name)
                if isinstance(record, dict) and field_name in record:
                    return record[field_name]
                else:
                    print(f"ERRO: Campo {field_name} não encontrado no registro {record_name}")
                    return 0
                
        # Expressão entre parênteses
        if ctx.getChildCount() > 1 and ctx.getChild(0).getText() == '(':
            return self.visit(ctx.getChild(1))
            
        # Se chegou aqui, tenta uma avaliação genérica
        return self.visitChildren(ctx)
    
    def visitCondicao(self, ctx):
        """Avalia uma condição."""
        if ctx.getChildCount() == 1:
            # Condição simples (uma expressão)
            return bool(self.visit(ctx.getChild(0)))
            
        if ctx.getChildCount() < 3:
            return False
            
        left = None
        op = None
        right = None
        
        # Tenta encontrar os operandos e o operador
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            child_text = child.getText()
            
            if child_text in ['<', '>', '<=', '>=', '==', '!=', '&&', '||']:
                op = child_text
            elif left is None:
                left = self.visit(child)
            elif right is None:
                right = self.visit(child)
        
        if left is not None and op is not None and right is not None:
            if op == '<':
                return left < right
            elif op == '>':
                return left > right
            elif op == '<=':
                return left <= right
            elif op == '>=':
                return left >= right
            elif op == '==':
                return left == right
            elif op == '!=':
                return left != right
            elif op == '&&':
                return left and right
            elif op == '||':
                return left or right
                
        return bool(left)

    # === Métodos auxiliares estendidos ===
    
    def isDeclaracao(self, ctx):
        """Verifica se o nó é uma declaração."""
        if hasattr(ctx, 'getRuleIndex') and hasattr(TimemaniaParser, 'RULE_declaracao'):
            return ctx.getRuleIndex() == TimemaniaParser.RULE_declaracao
        return False
    
    def isToken(self, ctx, token_names):
        """Verifica se o contexto corresponde a um dos tokens específicos."""
        text = ctx.getText().lower()
        for token in token_names:
            if text == token.lower():
                return True
        return False
        
    def hasToken(self, ctx, token_name, start_idx=0):
        """Verifica se o contexto tem um token específico a partir de um índice."""
        for i in range(start_idx, ctx.getChildCount()):
            if ctx.getChild(i).getText().lower() == token_name.lower():
                return True
        return False
        
    def findStringLiteral(self, ctx):
        """Encontra um literal string no contexto."""
        for i in range(ctx.getChildCount()):
            text = ctx.getChild(i).getText()
            if text.startswith('"') and text.endswith('"'):
                return text
        return None
        
    def findNumber(self, ctx):
        """Encontra um número no contexto."""
        for i in range(ctx.getChildCount()):
            text = ctx.getChild(i).getText()
            if text.isdigit():
                return int(text)
        return None
        
    def findIdentifier(self, ctx):
        """Encontra um identificador no contexto."""
        reserved_words = [
            'start', 'end', 'se', 'entao', 'senao', 'enquanto', 'faca', 'escreva', 'leia',
            'flamengo', 'corinthians', 'palmeiras', 'santos', 'vasco', 'funcao', 'procedimento',
            'retorna', 'para', 'ate', 'de', 'repita', 'tipo', 'var', 'const', 'registro', 'vetor'
        ]
        
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            # Verifica se parece um identificador (não é uma palavra-chave ou literal)
            text = child.getText().lower()
            if (not text.startswith('"') and 
                not text.isdigit() and
                text not in reserved_words and
                text not in [':=', ';', '{', '}', '(', ')', '[', ']', '+', '-', '*', '/', '%',
                            '<', '>', '<=', '>=', '==', '!=', '&&', '||', '!', '.', ',']):
                return text
        return None
        
    def findIdentifierAfter(self, ctx, token):
        """Encontra um identificador após um token específico."""
        found_token = False
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            
            if found_token and self.isIdentifier(child):
                return child.getText()
                
            if child.getText().lower() == token.lower():
                found_token = True
                
        return None
        
    def findNextIdentifierAfter(self, ctx, start_idx):
        """Encontra o próximo identificador após um índice específico."""
        for i in range(start_idx+1, ctx.getChildCount()):
            child = ctx.getChild(i)
            if self.isIdentifier(child):
                return child.getText()
        return None
        
    def findExpression(self, ctx):
        """Encontra uma expressão no contexto."""
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if (hasattr(child, 'getRuleIndex') and 
                hasattr(TimemaniaParser, 'RULE_expressao') and 
                child.getRuleIndex() == TimemaniaParser.RULE_expressao):
                return child
        return None
        
    def findExpressionAfter(self, ctx, token):
        """Encontra uma expressão após um token específico."""
        found_token = False
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            
            if found_token:
                expr = self.findExpression(ctx)
                if expr:
                    return expr
                    
            if child.getText().lower() == token.lower():
                found_token = True
                
        return None
        
    def findNextExpression(self, ctx, start_idx):
        """Encontra a próxima expressão após um índice específico."""
        for i in range(start_idx+1, ctx.getChildCount()):
            child = ctx.getChild(i)
            if (hasattr(child, 'getRuleIndex') and 
                hasattr(TimemaniaParser, 'RULE_expressao') and 
                child.getRuleIndex() == TimemaniaParser.RULE_expressao):
                return child
        return None
        
    def findTypeDefinition(self, ctx):
        """Encontra uma definição de tipo no contexto."""
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if (hasattr(child, 'getRuleIndex') and 
                hasattr(TimemaniaParser, 'RULE_tipoDefinicao') and 
                child.getRuleIndex() == TimemaniaParser.RULE_tipoDefinicao):
                return child
        return None
        
    def findCondition(self, ctx):
        """Encontra uma condição no contexto."""
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if (hasattr(child, 'getRuleIndex') and 
                hasattr(TimemaniaParser, 'RULE_condicao') and 
                child.getRuleIndex() == TimemaniaParser.RULE_condicao):
                return child
                
        # Método alternativo: procura entre os parênteses
        in_condition = False
        start_idx = -1
        end_idx = -1
        
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if child.getText() == '(':
                in_condition = True
                start_idx = i + 1
            elif child.getText() == ')' and in_condition:
                end_idx = i
                break
                
        if start_idx >= 0 and end_idx > start_idx:
            return ctx.getChild(start_idx)
            
        return None
        
    def findBlock(self, ctx, after=None):
        """Encontra um bloco no contexto, opcionalmente após um token específico."""
        found_marker = after is None
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            
            # Se estamos procurando um marcador e o encontramos
            if not found_marker and child.getText().lower() == after.lower():
                found_marker = True
                continue
                
            # Se já encontramos o marcador e este é um bloco
            if found_marker:
                if child.getText() == '{':
                    # Encontra o bloco inteiro (até o '}' correspondente)
                    start_idx = i
                    bracket_count = 1
                    for j in range(i+1, ctx.getChildCount()):
                        if ctx.getChild(j).getText() == '{':
                            bracket_count += 1
                        elif ctx.getChild(j).getText() == '}':
                            bracket_count -= 1
                            if bracket_count == 0:
                                end_idx = j
                                # Retorna um contexto que contém todos os nós entre { e }
                                return ctx.getChild(start_idx + 1)  # O primeiro nó após o '{'
                    
                # Se encontramos um nó que parece ser um bloco de comando único
                return child
                
        return None
        
    def findBlockBetween(self, ctx, start_token, end_token):
        """Encontra um bloco entre dois tokens."""
        in_block = False
        block_start = -1
        block_end = -1
        
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if not in_block and child.getText().lower() == start_token.lower():
                in_block = True
                block_start = i + 1
            elif in_block and child.getText().lower() == end_token.lower():
                block_end = i
                break
                
        if block_start >= 0 and block_end > block_start:
            # Cria um bloco virtual com os elementos entre os tokens
            return [ctx.getChild(i) for i in range(block_start, block_end)]
            
        return None
        
    def extractParameters(self, ctx):
        """Extrai parâmetros de uma função ou procedimento."""
        params = []
        in_params = False
        current_param = None
        current_type = None
        
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            text = child.getText()
            
            if text == '(':
                in_params = True
            elif text == ')':
                in_params = False
                # Adiciona o último parâmetro se houver
                if current_param and current_type:
                    params.append({'name': current_param, 'type': current_type})
            elif in_params:
                if text == ',':
                    # Adiciona o parâmetro atual e prepara para o próximo
                    if current_param and current_type:
                        params.append({'name': current_param, 'type': current_type})
                        current_param = None
                        current_type = None
                elif text == ':':
                    # Próximo será o tipo
                    pass
                elif not current_param and self.isIdentifier(child):
                    current_param = text
                elif current_param and not current_type and self.isIdentifier(child):
                    current_type = text
        
        return params
        
    def extractArguments(self, ctx):
        """Extrai argumentos de uma chamada de função ou procedimento."""
        args = []
        in_args = False
        current_expr = None
        
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            text = child.getText()
            
            if text == '(':
                in_args = True
            elif text == ')':
                # Adiciona o último argumento se houver
                if current_expr:
                    args.append(self.visit(current_expr))
                in_args = False
            elif in_args:
                if text == ',':
                    # Adiciona o argumento atual e prepara para o próximo
                    if current_expr:
                        args.append(self.visit(current_expr))
                        current_expr = None
                elif not current_expr and self.isExpression(child):
                    current_expr = child
        
        return args
        
    def isExpression(self, ctx):
        """Verifica se o contexto é uma expressão."""
        if hasattr(ctx, 'getRuleIndex') and hasattr(TimemaniaParser, 'RULE_expressao'):
            return ctx.getRuleIndex() == TimemaniaParser.RULE_expressao
        return False
        
    def isIdentifier(self, ctx):
        """Verifica se o contexto é um identificador."""
        text = ctx.getText()
        reserved_words = [
            'start', 'end', 'se', 'entao', 'senao', 'enquanto', 'faca', 'escreva', 'leia',
            'flamengo', 'corinthians', 'palmeiras', 'santos', 'vasco', 'funcao', 'procedimento',
            'retorna', 'para', 'ate', 'de', 'repita', 'tipo', 'var', 'const', 'registro', 'vetor'
        ]
        return (not text.startswith('"') and 
                not text.isdigit() and
                text.lower() not in reserved_words and
                text not in [':=', ';', '{', '}', '(', ')', '[', ']', '+', '-', '*', '/', '%',
                           '<', '>', '<=', '>=', '==', '!=', '&&', '||', '!', '.', ','])

def main():
    if len(sys.argv) > 1:
        file_path = sys.argv[1]
    else:
        # Procura por arquivos .tm no diretório atual como alternativa
        tm_files = [f for f in os.listdir('.') if f.endswith('.tm')]
        if tm_files:
            file_path = tm_files[0]
            print(f"Nenhum arquivo especificado. Usando o arquivo encontrado: {file_path}")
        else:
            file_path = input("Digite o nome do arquivo Timemania a executar: ")
    
    if not os.path.exists(file_path):
        print(f"Erro: O arquivo '{file_path}' não foi encontrado.")
        return
    
    # Cria e executa o interpretador
    interpreter = TimemaniaInterpreter()
    print(f"Executando programa Timemania: {file_path}")
    
    # Modo debug opcional (descomente para ativar)
    # interpreter.toggle_debug()
    
    interpreter.run(file_path)

if __name__ == "__main__":
    main()