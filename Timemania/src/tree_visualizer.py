import sys
from antlr4 import *

class TreeVisualizer:
    def __init__(self, parser):
        self.parser = parser
        self.rule_names = parser.ruleNames
    
    def visualize(self, tree, indent=0):
        """Visualiza a árvore sintática com informações detalhadas sobre cada nó."""
        if tree is None:
            return
            
        # Imprime o nó atual com seu tipo e texto
        node_type = tree.__class__.__name__
        node_text = tree.getText()
        rule_name = ""
        
        # Tenta obter o nome da regra, se aplicável
        if hasattr(tree, 'getRuleIndex'):
            rule_index = tree.getRuleIndex()
            if 0 <= rule_index < len(self.rule_names):
                rule_name = f" [{self.rule_names[rule_index]}]"
        
        # Imprime informações do nó
        print("  " * indent + f"{node_type}{rule_name}: '{node_text}'")
        
        # Imprime atributos disponíveis para ajudar no diagnóstico
        if indent == 0:  # Apenas para o nó raiz, para não sobrecarregar a saída
            print("  " * (indent+1) + "Atributos disponíveis:")
            for attr in dir(tree):
                if not attr.startswith('__') and not callable(getattr(tree, attr)):
                    print("  " * (indent+2) + f"{attr}")
        
        # Recursivamente visualiza todos os filhos
        for i in range(tree.getChildCount()):
            self.visualize(tree.getChild(i), indent + 1)

# Uso:
# visualizer = TreeVisualizer(parser)
# visualizer.visualize(tree)