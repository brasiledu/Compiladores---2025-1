lexer grammar TimemaniaLexer;

// Palavras-chave existentes
START: 'start';
END: 'end';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
ENQUANTO: 'enquanto';
FACA: 'faca';
ESCREVA: 'escreva';
LEIA: 'leia';

// Times de futebol
FLAMENGO: 'flamengo';
CORINTHIANS: 'corinthians';
PALMEIRAS: 'palmeiras';
SANTOS: 'santos';
VASCO: 'vasco';

// Novas palavras-chave (inspiradas no Pascal)
FUNCAO: 'funcao';
PROCEDIMENTO: 'procedimento';
RETORNA: 'retorna';
PARA: 'para';
ATE: 'ate';
DE: 'de';
REPITA: 'repita';
TIPO: 'tipo';
VAR: 'var';
CONST: 'const';
REGISTRO: 'registro';
VETOR: 'vetor';

// Tipos de dados - adicionados para corrigir o erro
INTEIRO: 'inteiro';
TEXTO: 'texto';
BOOLEANO: 'booleano';

// Símbolos
PARENTESE: '(' | ')';
CHAVE: '{' | '}';
COLCHETE: '[' | ']';
DELIMITER: ';';
ASSIGN: ':=';
PONTO: '.';
VIRGULA: ',';
DOISPONTOS: ':';
OPERATOR: '+' | '-' | '*' | '/' | '%' | '==' | '!=' | '&&' | '||' | '!';
COMPARADOR: '>' | '<' | '>=' | '<=';

// Literais
NUMBER: [0-9]+;
STRING: '"' .*? '"';
ID: [a-zA-Z][a-zA-Z0-9_]*;

// Ignorar espaços em branco e comentários
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\r'? '\n' -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;

// IO expandido
ESCREVA_SEM_QUEBRA : 'escreva_sem_quebra';

// Concatenação de strings
CONCATENAR : '++';

// Conversores de tipo
PARA_TEXTO : 'para_texto';
PARA_NUMERO : 'para_numero';

// Manipulação de arrays
CRIAR_VETOR : 'criar_vetor';
TAMANHO : 'tamanho';