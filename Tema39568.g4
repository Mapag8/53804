grammar Tema39568;

// Reglas del parser
programa       : instrucciones EOF ;
instrucciones  : instruccion+ ;
instruccion    : decision ;
decision       : IF LPAREN condicion RPAREN LBRACE sentencia RBRACE
                 ( ELSE LBRACE sentencia RBRACE )? ;
sentencia
    : salida sentencia?  #SalidaExpr
    | terminar           #TerminarExpr
    ;
salida    : PRINTF LPAREN CADENA RPAREN SEMI ;
terminar  : RETURN SEMI ;
condicion : CERO | UNO ;

// Reglas del lexer
IF     : 'if' ;
ELSE   : 'else' ;
PRINTF : 'printf' ;
RETURN : 'return' ;
LPAREN : '(' ;
RPAREN : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;
SEMI   : ';' ;
CERO   : '0' ;
UNO    : '1' ;
CADENA : '"' [a-zA-Z0-9.,!?:; ]* '"' ;
WS     : [ \t\r\n]+ -> skip ;
