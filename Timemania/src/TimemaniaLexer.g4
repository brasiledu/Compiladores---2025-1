lexer grammar TimemaniaLexer;

// Definição de tokens para palavras-chave
FLAMENGO: 'flamengo';
CORINTHIANS: 'corinthians';
PALMEIRAS: 'palmeiras';
SANTOS: 'santos';
START: 'start';
END: 'end';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
ENQUANTO: 'enquanto';
FACA: 'faca';
ESCREVA: 'escreva';
LEIA: 'leia';

// Tokens para outros elementos
NUMBER: [0-9]+;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' .*? '"';
ASSIGN: ':=';
DELIMITER: [;,];
OPERATOR: [+\-*/];
PARENTESE: [()];
CHAVE: [{}];

// Ignorar espaços em branco
WS: [ \t\r\n]+ -> skip;