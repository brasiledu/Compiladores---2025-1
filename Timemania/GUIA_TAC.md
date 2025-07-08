# 🚀 Guia Prático - Gerador TAC Timemania

Este guia demonstra como usar o gerador de código TAC do compilador Timemania.

## 📋 Pré-requisitos

- Python 3.8 ou superior
- ANTLR 4.13.2
- Compilador Timemania configurado

## 🎯 Uso Básico

### 1. Comando para Gerar TAC
```bash
cd Timemania/src
python main.py <arquivo.tm> --gerar-tac
```

### 2. Exemplo Prático

**Arquivo: exemplo.tm**
```timemania
start
inteiro contador;
inteiro limite;

contador := 1;
limite := 5;

enquanto (contador <= limite) faca {
    escreva(contador);
    contador := contador + 1;
}

escreva("Fim do programa");
end;
```

**Comando:**
```bash
python main.py exemplo.tm --gerar-tac
```

**Saída Esperada:**
```
🚀 Iniciando análise semântica do programa...
✅ Análise semântica concluída sem erros!

⚡ Iniciando geração de código TAC...
✅ Código TAC gerado em: exemplo.tac

📋 Código TAC gerado:
========================================
# Início do programa Timemania
# ========================================
# Seção de declarações
# Declaração: inteiro contador
# Declaração: inteiro limite
# Seção de comandos principais
contador = 1
limite = 5
# Início do comando ENQUANTO
L0:
t0 = contador <= limite
if !t0 goto L1
# Corpo do loop ENQUANTO
param contador
call escreva, 1
t1 = contador + 1
contador = t1
goto L0
L1:
# Fim do comando ENQUANTO
param "Fim do programa"
call escreva, 1
# Fim do programa
========================================
```

## 🧪 Exemplos por Categoria

### Operações Aritméticas
```timemania
start
inteiro a, b, resultado;
a := 10;
b := 5;
resultado := a + b * 2;
end;
```

**TAC Gerado:**
```tac
a = 10
b = 5
t0 = b * 2
t1 = a + t0
resultado = t1
```

### Estruturas Condicionais
```timemania
start
inteiro x;
x := 10;

se (x > 5) entao {
    escreva("Maior que 5");
} senao {
    escreva("Menor ou igual a 5");
}
end;
```

**TAC Gerado:**
```tac
x = 10
t0 = x > 5
if !t0 goto L0
param "Maior que 5"
call escreva, 1
goto L1
L0:
param "Menor ou igual a 5"
call escreva, 1
L1:
```

## 🔧 Solução de Problemas

### Erro: "expecting 'start'"
**Problema:** Arquivo não começa com `start`
**Solução:** Certifique-se que o arquivo inicia com `start` e termina com `end;`

### Erro: "variável não declarada"
**Problema:** Análise semântica falhou
**Solução:** Declare todas as variáveis antes de usar

### Arquivo .tac não criado
**Problema:** Erros impedem a geração
**Solução:** Corrija primeiro os erros sintáticos/semânticos

## 📊 Verificação dos Resultados

1. **Arquivo .tac criado** no mesmo diretório
2. **Código TAC mostrado** no terminal
3. **Mensagem de sucesso** exibida
4. **Numeração correta** de temporárias (t0, t1, t2...)
5. **Etiquetas sequenciais** (L0, L1, L2...)

## 🎯 Dicas de Uso

1. **Sempre use `--gerar-tac`** para ativar a geração
2. **Verifique erros** antes de gerar TAC
3. **Analise a saída** para entender o código gerado
4. **Compare com código fonte** para validar tradução

## 📁 Arquivos de Teste Disponíveis

```bash
# Teste simples
python main.py ../tests/teste_minimal.tm --gerar-tac

# Teste com loops
python main.py ../tests/teste_tac_loop.tm --gerar-tac

# Teste com condicionais
python main.py ../tests/teste_tac_controle.tm --gerar-tac

# Teste completo
python main.py ../tests/exemplos/teste_simples.tm --gerar-tac
```

---

**✅ Implementação completa e funcional do Gerador TAC!**
