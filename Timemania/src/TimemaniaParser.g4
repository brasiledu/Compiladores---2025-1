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

registroTipo: ABRE_CHAVE (ID DOISPONTOS tipoDefinicao DELIMITER)+ FECHA_CHAVE;

vetorTipo: VETOR ABRE_COLCHETE expressaoGeral FECHA_COLCHETE DE tipoSimples;

// Variáveis
variavel: VAR ID (VIRGULA ID)* DOISPONTOS tipoSimples DELIMITER;

// Funções e Procedimentos
funcaoProcedimento: funcao
                  | procedimento;

funcao: FUNCAO ID ABRE_PARENTESE parametro? FECHA_PARENTESE DOISPONTOS tipoSimples ABRE_CHAVE comando+ retorno FECHA_CHAVE;

procedimento: PROCEDIMENTO ID ABRE_PARENTESE parametro? FECHA_PARENTESE ABRE_CHAVE comando+ FECHA_CHAVE;

parametro: ID DOISPONTOS tipoSimples (VIRGULA ID DOISPONTOS tipoSimples)*;

retorno: RETORNA expressaoGeral DELIMITER;

// Comandos existentes
comando: atribuicao
       | futebol
       | io
       | controle
       | chamadaFuncao DELIMITER;

atribuicao: ID ASSIGN expressaoGeral DELIMITER;

futebol: VASCO ABRE_PARENTESE STRING FECHA_PARENTESE DELIMITER
       | FLAMENGO ABRE_PARENTESE STRING FECHA_PARENTESE DELIMITER
       | CORINTHIANS ABRE_PARENTESE NUMBER FECHA_PARENTESE DELIMITER
       | PALMEIRAS ABRE_PARENTESE FECHA_PARENTESE DELIMITER
       | SANTOS ABRE_PARENTESE STRING FECHA_PARENTESE DELIMITER;

io: ESCREVA ABRE_PARENTESE expressaoGeral FECHA_PARENTESE DELIMITER
   | ESCREVA_SEM_QUEBRA ABRE_PARENTESE expressaoGeral FECHA_PARENTESE DELIMITER
   | LEIA ABRE_PARENTESE ID FECHA_PARENTESE DELIMITER;

controle: SE ABRE_PARENTESE condicao FECHA_PARENTESE ENTAO bloco (SENAO bloco)?
        | ENQUANTO ABRE_PARENTESE condicao FECHA_PARENTESE FACA bloco
        | PARA ID ASSIGN expressaoGeral ATE expressaoGeral FACA bloco
        | REPITA bloco ENQUANTO ABRE_PARENTESE condicao FECHA_PARENTESE DELIMITER;

bloco: ABRE_CHAVE comando+ FECHA_CHAVE;

chamadaFuncao: ID ABRE_PARENTESE (expressaoGeral (VIRGULA expressaoGeral)*)? FECHA_PARENTESE;

expressaoGeral
    : expressao
    | condicao;

expressao: termo (OPERADOR_ARITMETICO termo)*
         | concatenacao;

concatenacao: termo CONCATENAR termo;

termo: NUMBER 
     | STRING
     | ID
     | ID ABRE_COLCHETE expressaoGeral FECHA_COLCHETE
     | ID PONTO ID
     | chamadaFuncao
     | ABRE_PARENTESE expressaoGeral FECHA_PARENTESE
     | conversor;

conversor: PARA_TEXTO ABRE_PARENTESE expressaoGeral FECHA_PARENTESE
         | PARA_NUMERO ABRE_PARENTESE expressaoGeral FECHA_PARENTESE;

arrayOp: CRIAR_VETOR ABRE_PARENTESE expressaoGeral FECHA_PARENTESE
       | TAMANHO ABRE_PARENTESE ID FECHA_PARENTESE;

condicao: condicaoOr;

condicaoOr: condicaoAnd (OR condicaoAnd)*;

condicaoAnd: condicaoUnary (AND condicaoUnary)*;

condicaoUnary: condicaoAtom
             | NOT condicaoUnary;

condicaoAtom: ABRE_PARENTESE condicao FECHA_PARENTESE
            | expressao COMPARADOR expressao
            | expressao
            ;