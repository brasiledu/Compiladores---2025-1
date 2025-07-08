#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Gerador de PNG da árvore sintática para o compilador Timemania
"""

import os
try:
    from graphviz import Digraph
except ImportError:
    print(" Erro: graphviz não está instalado. Execute: pip install graphviz")
    exit(1)


class TreeToPNG:
    """Classe para converter árvore sintática em PNG usando Graphviz"""
    
    def __init__(self, parser):
        self.parser = parser
        self.node_counter = 0
        
    def generate_png(self, tree, output_file="arvore_sintatica"):
        """
        Gera um arquivo PNG da árvore sintática
        
        Args:
            tree: Árvore sintática do ANTLR
            output_file: Nome do arquivo de saída (sem extensão)
        
        Returns:
            str: Caminho do arquivo PNG gerado
        """
        try:
            # Criar objeto Digraph
            dot = Digraph(comment='Árvore Sintática Timemania')
            dot.attr(rankdir='TB')  # Top to Bottom
            dot.attr('node', shape='box', style='rounded,filled', fillcolor='lightblue')
            dot.attr('edge', color='black')
            
            # Reset contador
            self.node_counter = 0
            
            # Adicionar nós da árvore
            self._add_nodes(dot, tree, None)
            
            # Salvar arquivo
            output_path = dot.render(output_file, format='png', cleanup=True)
            
            print(f"✅ Árvore sintática salva em: {output_path}")
            return output_path
            
        except Exception as e:
            print(f"❌ Erro ao gerar PNG: {e}")
            return None
    
    def _add_nodes(self, dot, node, parent_id):
        """
        Adiciona nós recursivamente na árvore
        
        Args:
            dot: Objeto Digraph
            node: Nó atual da árvore
            parent_id: ID do nó pai
        """
        # Criar ID único para este nó
        node_id = f"node_{self.node_counter}"
        self.node_counter += 1
        
        # Obter texto do nó
        if hasattr(node, 'getRuleIndex'):
            # Nó intermediário (regra)
            rule_index = node.getRuleIndex()
            if rule_index >= 0 and rule_index < len(self.parser.ruleNames):
                node_text = self.parser.ruleNames[rule_index]
            else:
                node_text = "Unknown Rule"
            
            # Cor diferente para regras
            dot.node(node_id, node_text, fillcolor='lightgreen')
        else:
            # Nó folha (token)
            node_text = str(node.getText())
            if node_text.strip():
                # Limitar tamanho do texto
                if len(node_text) > 20:
                    node_text = node_text[:17] + "..."
                
                # Escapar caracteres especiais
                node_text = node_text.replace('"', '\\"').replace('\n', '\\n')
                
                # Cor diferente para tokens
                dot.node(node_id, f'"{node_text}"', fillcolor='lightyellow')
            else:
                dot.node(node_id, "ε", fillcolor='lightgray')  # Nó vazio
        
        # Conectar ao pai se existir
        if parent_id is not None:
            dot.edge(parent_id, node_id)
        
        # Processar filhos
        if hasattr(node, 'getChildCount'):
            for i in range(node.getChildCount()):
                child = node.getChild(i)
                self._add_nodes(dot, child, node_id)


def create_simplified_tree_png(tree, parser, output_file="arvore_simplificada"):
    """
    Cria uma versão simplificada da árvore sintática
    """
    try:
        dot = Digraph(comment='Árvore Sintática Simplificada')
        dot.attr(rankdir='TB')
        dot.attr('node', shape='ellipse', style='filled', fillcolor='lightcyan')
        dot.attr('edge', color='darkblue')
        
        counter = [0]  # Usar lista para mutabilidade
        
        def add_simplified_nodes(node, parent_id=None):
            node_id = f"n{counter[0]}"
            counter[0] += 1
            
            # Verificar se é um nó de regra (não terminal)
            if hasattr(node, 'getRuleIndex'):
                # Regra da gramática
                rule_index = node.getRuleIndex()
                if rule_index >= 0 and rule_index < len(parser.ruleNames):
                    rule_name = parser.ruleNames[rule_index]
                    
                    # Pular algumas regras muito verbosas
                    if rule_name in ['expressao', 'termo', 'fator']:
                        # Para essas regras, apenas passe para os filhos
                        for i in range(node.getChildCount()):
                            add_simplified_nodes(node.getChild(i), parent_id)
                        return
                    
                    dot.node(node_id, rule_name, fillcolor='lightgreen')
                else:
                    dot.node(node_id, "?", fillcolor='red')
            else:
                # Token/terminal
                text = str(node.getText()).strip()
                if text and text not in [';', '{', '}', '(', ')', ',']:
                    if len(text) > 15:
                        text = text[:12] + "..."
                    dot.node(node_id, f'"{text}"', fillcolor='lightyellow')
                else:
                    return  # Pular tokens de pontuação
            
            if parent_id is not None:
                dot.edge(parent_id, node_id)
            
            # Processar filhos
            if hasattr(node, 'getChildCount'):
                for i in range(node.getChildCount()):
                    add_simplified_nodes(node.getChild(i), node_id)
        
        add_simplified_nodes(tree)
        
        output_path = dot.render(output_file, format='png', cleanup=True)
        print(f"✅ Árvore simplificada salva em: {output_path}")
        return output_path
        
    except Exception as e:
        print(f"❌ Erro ao gerar árvore simplificada: {e}")
        return None
