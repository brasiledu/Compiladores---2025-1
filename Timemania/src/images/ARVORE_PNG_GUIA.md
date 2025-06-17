# 🌳 Gerador de PNG da Árvore Sintática - Timemania

## 📋 **Como Gerar PNG da Árvore Sintática**

### 🚀 **Comandos Disponíveis**

#### **1. Análise Normal (apenas texto)**
```bash
python main.py <arquivo.tm>
```
- Mostra a árvore sintática em formato texto no terminal
- Executa análise semântica

#### **2. PNG Completo da Árvore**
```bash
python main.py <arquivo.tm> --png
```
- Gera arquivo PNG completo com todos os nós da árvore
- Mostra regras da gramática e tokens
- Ideal para análise detalhada

#### **3. PNG Simplificado da Árvore**
```bash
python main.py <arquivo.tm> --png-simples
```
- Gera arquivo PNG simplificado
- Remove tokens de pontuação (`;`, `{`, `}`, etc.)
- Foca nas estruturas principais
- Ideal para visualização limpa

### 📁 **Arquivos Gerados**

Os arquivos PNG são salvos no diretório `src/` com os seguintes nomes:
- **PNG Completo:** `arvore_{nome_arquivo}.png`
- **PNG Simplificado:** `arvore_simples_{nome_arquivo}.png`

### 🎨 **Exemplos Práticos**

#### **Teste Simples:**
```bash
cd src
python main.py ../tests/exemplos/teste_simples.tm --png-simples
```
**Resultado:** `arvore_simples_teste_simples.png`

#### **Programa Complexo:**
```bash
cd src  
python main.py ../tests/exemplos/triangulo_pascal.tm --png
```
**Resultado:** `arvore_triangulo_pascal.png`

### 🔍 **Diferenças entre PNG Completo e Simplificado**

| Aspecto | PNG Completo | PNG Simplificado |
|---------|-------------|------------------|
| **Tokens** | Todos incluídos | Só tokens importantes |
| **Pontuação** | `;`, `{`, `}`, etc. | Removidos |
| **Tamanho** | Maior | Menor |
| **Legibilidade** | Detalhada | Limpa |
| **Uso** | Debugging | Apresentação |

### 🎯 **Cores dos Nós**

- 🟢 **Verde Claro:** Regras da gramática (`programa`, `declaracao`, etc.)
- 🟡 **Amarelo Claro:** Tokens importantes (`inteiro`, `x`, `10`, etc.)
- 🔵 **Azul Claro:** Fundo da árvore simplificada
- ⚪ **Cinza Claro:** Nós vazios (ε)

### ⚙️ **Requisitos**

- ✅ **Graphviz instalado:** `brew install graphviz` (macOS)
- ✅ **Pacote Python:** `pip install graphviz`
- ✅ **ANTLR4 configurado**

### 🐛 **Solução de Problemas**

#### **Erro: "cannot import name 'TreeToPNG'"**
```bash
# Reinstalar graphviz
pip uninstall graphviz
pip install graphviz
```

#### **Erro: "graphviz not found"**
```bash
# macOS
brew install graphviz

# Linux
sudo apt-get install graphviz

# Windows
# Baixar de: https://graphviz.org/download/
```

#### **PNG não abre**
- Verificar se o arquivo foi criado: `ls -la *.png`
- Abrir com: `open nome_arquivo.png` (macOS)

### 📊 **Exemplos de Saída**

#### **Comando:**
```bash
python main.py ../tests/exemplos/teste_simples.tm --png-simples
```

#### **Saída:**
```
🎨 Gerando PNG simplificado da árvore sintática...
✅ Árvore simplificada salva em: arvore_simples_teste_simples.png

🚀 Iniciando análise semântica do programa...
✓ Variável 'x' do tipo 'inteiro' declarada.
✓ Atribuição à variável 'x' do tipo 'inteiro'.
✅ Análise semântica concluída sem erros!
```

### 💡 **Dicas de Uso**

1. **Para apresentações:** Use `--png-simples`
2. **Para debugging:** Use `--png`
3. **Arquivos grandes:** PNG pode ficar muito grande, prefira simplificado
4. **Teste incrementalmente:** Comece com arquivos pequenos

---

**🎯 Essa funcionalidade permite visualizar graficamente como o compilador Timemania analisa seus programas!**
