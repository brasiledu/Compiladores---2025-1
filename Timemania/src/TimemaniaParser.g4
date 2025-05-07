parser grammar TimemaniaParser;

options { tokenVocab=TimemaniaLexer; }

// Programa principal
programa: START (declaracao)* comando+ END;

// Declarações
declaracao: constante
          | tipagem
          | variavel
          | funcaoProcedimento;

// Constantes
constante: CONST ID ASSIGN expressaoGeral DELIMITER;

// Definição de tipos
tipagem: TIPO ID ASSIGN tipoDefinicao DELIMITER;

tipoDefinicao: tipoSimples
             | tipoEstruturado;

tipoSimples: ID
           | INTEIRO
           | TEXTO
           | BOOLEANO;

tipoEstruturado: registroTipo
               | vetorTipo;

registroTipo: REGISTRO CHAVE (ID DOISPONTOS tipoDefinicao DELIMITER)+ CHAVE;

vetorTipo: VETOR COLCHETE expressaoGeral COLCHETE DE tipoSimples;

// Variáveis
variavel: VAR ID (VIRGULA ID)* DOISPONTOS tipoSimples DELIMITER;

// Funções e Procedimentos
funcaoProcedimento: funcao
                  | procedimento;

funcao: FUNCAO ID PARENTESE parametro? PARENTESE DOISPONTOS tipoSimples CHAVE comando+ retorno CHAVE;

procedimento: PROCEDIMENTO ID PARENTESE parametro? PARENTESE CHAVE comando+ CHAVE;

parametro: ID DOISPONTOS tipoSimples (VIRGULA ID DOISPONTOS tipoSimples)*;

retorno: RETORNA expressaoGeral DELIMITER;

// Comandos existentes
comando: atribuicao
       | futebol
       | io
       | controle
       | chamadaFuncao;

// MODIFICADO: Agora usa expressaoGeral em vez de expressao
atribuicao: ID ASSIGN expressaoGeral DELIMITER;

futebol: VASCO PARENTESE STRING PARENTESE DELIMITER
       | FLAMENGO PARENTESE STRING PARENTESE DELIMITER
       | CORINTHIANS PARENTESE NUMBER PARENTESE DELIMITER
       | PALMEIRAS PARENTESE PARENTESE DELIMITER
       | SANTOS PARENTESE STRING PARENTESE DELIMITER;

// Expandindo o IO para incluir saída sem quebra de linha
// MODIFICADO: Também usa expressaoGeral
io: ESCREVA PARENTESE expressaoGeral PARENTESE DELIMITER
   | ESCREVA_SEM_QUEBRA PARENTESE expressaoGeral PARENTESE DELIMITER
   | LEIA PARENTESE ID PARENTESE DELIMITER;

// Estruturas de controle estendidas
controle: SE PARENTESE condicao PARENTESE ENTAO bloco (SENAO bloco)?
        | ENQUANTO PARENTESE condicao PARENTESE FACA bloco
        | PARA ID ASSIGN expressaoGeral ATE expressaoGeral FACA bloco
        | REPITA bloco ENQUANTO PARENTESE condicao PARENTESE DELIMITER;

bloco: CHAVE comando+ CHAVE;

// Nova construção para chamadas de função
// MODIFICADO: Usa expressaoGeral
chamadaFuncao: ID PARENTESE (expressaoGeral (VIRGULA expressaoGeral)*)? PARENTESE DELIMITER;

// NOVA REGRA: Expressão Geral que inclui tanto expressões aritméticas quanto condicionais
expressaoGeral
    : expressao
    | condicao          // Aqui está a grande modificação - condicao pode ser usada onde expressao é esperada
    ;

// Expressões e termos com suporte expandido
expressao: termo (OPERATOR termo)*
         | concatenacao;

// Adicionando concatenação de strings
concatenacao: termo CONCATENAR termo;

termo: NUMBER 
     | STRING
     | ID
     | ID COLCHETE expressaoGeral COLCHETE           // Acesso a vetor - modificado
     | ID PONTO ID                              // Acesso a registro
     | chamadaFuncao
     | PARENTESE expressaoGeral PARENTESE            // Modificado
     | conversor;                               // Conversão de tipos

// Conversores de tipo
conversor: PARA_TEXTO PARENTESE expressaoGeral PARENTESE       // Modificado
         | PARA_NUMERO PARENTESE expressaoGeral PARENTESE;     // Modificado

// Manipulação de arrays
arrayOp: CRIAR_VETOR PARENTESE expressaoGeral PARENTESE       // Modificado
       | TAMANHO PARENTESE ID PARENTESE;

// CORRIGIDO: Operações de igualdade/diferença definidas corretamente
condicao
    : condicaoOr
    ;

condicaoOr
    : condicaoAnd (OR condicaoAnd)*
    ;

condicaoAnd
    : condicaoUnary (AND condicaoUnary)*
    ;

condicaoUnary
    : condicaoAtom
    | NOT condicaoUnary
    ;

condicaoAtom
    : PARENTESE condicao PARENTESE
    | expressao COMPARADOR expressao      // Comparações como > < >= <=
    | expressao OPERATOR expressao            // Igualdade - corrigido
    | expressao OPERATOR expressao            // Diferença - corrigido
    | expressao                           // Valor booleano simples
    ;