# Testes do Compilador Timemania

## 📁 Estrutura

### `/semanticos/` - Testes de Análise Semântica
- **`teste_erros_completo.tm`** - Teste completo com todos os 4 tipos de erro
- **`teste_logico.tm`** - Teste de incompatibilidade em operações lógicas
- **`teste_nao_declarada.tm`** - Teste de variável não declarada
- **`teste_duplicata.tm`** - Teste de declaração duplicada
- **`testes_erros_semanticos.tm`** - Outros testes semânticos

### `/exemplos/` - Exemplos de Código
- **`teste_triangulo_com_declaracoes.tm`** - Triângulo de Pascal com declarações
- **`teste_semantico_correto.tm`** - Código sem erros semânticos
- **`teste_simples.tm`** - Exemplo básico
- **`teste_vasco.tm`** - Teste de comando especial
- **`triangulo_pascal.tm`** - Exemplo completo do triângulo
- **`triangulos.tm`** - Classificação de triângulos

## 🧪 Como Executar

```bash
# Navegar para pasta src
cd /Users/eduardovinicius/Compiladores---2025-1/Timemania/src

# Testar análise semântica
python main.py ../tests/semanticos/teste_erros_completo.tm

# Testar exemplos
python main.py ../tests/exemplos/teste_triangulo_com_declaracoes.tm
```

## ✅ Resultados Esperados

### Testes Semânticos
- **Erros detectados**: Variável não declarada, duplicata, divisão por zero, tipos incompatíveis
- **Código correto**: Nenhum erro semântico encontrado

### Exemplos
- **Parsing correto**: Árvore sintática gerada
- **Análise semântica**: Verificação de todos os requisitos
