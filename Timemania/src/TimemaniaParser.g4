parser grammar TimemaniaParser;

options { tokenVocab=TimemaniaLexer; }

// Regras sintáticas usando os tokens definidos
programa: START comando+ END;

comando: atribuicao
       | futebol
       | io
       | controle;

atribuicao: ID ASSIGN expressao DELIMITER;

futebol: FLAMENGO PARENTESE STRING PARENTESE DELIMITER
       | CORINTHIANS PARENTESE NUMBER PARENTESE DELIMITER
       | PALMEIRAS PARENTESE PARENTESE DELIMITER
       | SANTOS PARENTESE STRING PARENTESE DELIMITER;

io: ESCREVA PARENTESE expressao PARENTESE DELIMITER
   | LEIA PARENTESE ID PARENTESE DELIMITER;

controle: SE PARENTESE condicao PARENTESE ENTAO bloco (SENAO bloco)?
        | ENQUANTO PARENTESE condicao PARENTESE FACA bloco;

bloco: CHAVE comando+ CHAVE;

expressao: termo (OPERATOR termo)*;

termo: NUMBER | ID | PARENTESE expressao PARENTESE;

condicao: expressao (OPERATOR expressao)?;