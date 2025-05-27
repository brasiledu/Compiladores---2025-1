# Timemania - Código Fonte

## 📁 Estrutura do Projeto

### Arquivos Principais
- **`main.py`** - Ponto de entrada do compilador
- **`semantic_analyzer.py`** - Analisador semântico (4 requisitos implementados)
- **`interpretador.py`** - Interpretador da linguagem
- **`tree_visualizer.py`** - Visualizador da árvore sintática

### Gramática ANTLR
- **`TimemaniaLexer.g4`** - Definição do analisador léxico
- **`TimemaniaParser.g4`** - Definição do analisador sintático

### Arquivos Gerados (ANTLR)
- **`TimemaniaLexer.py`** - Lexer gerado
- **`TimemaniaParser.py`** - Parser gerado
- **`TimemaniaParserVisitor.py`** - Visitor pattern
- **`TimemaniaParserListener.py`** - Listener pattern
- **`*.tokens`** - Tokens definidos
- **`*.interp`** - Arquivos de interpretação ANTLR

## 🚀 Como Usar

```bash
# Analisar um arquivo Timemania
python main.py <arquivo.tm>

# Exemplo:
python main.py ../tests/exemplos/teste_triangulo_com_declaracoes.tm
```

## ✅ Recursos Implementados

### Análise Semântica (4 requisitos)
1. **Verificação de declaração prévia de variáveis**
2. **Detecção de declarações duplicadas**
3. **Detecção de divisão por zero**
4. **Verificação de compatibilidade de tipos**

### Gramática Atualizada
- **Início**: `start` (padrão atual)
- **Fim**: `end;`
- **Atribuição**: `:=`
- **Operadores lógicos**: `e`, `ou`, `nao`
- **Comandos especiais**: `vasco()`, `flamengo()`, etc.
