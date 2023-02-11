package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r]+
%{
    public String lexeme;
%}
%%

( int ) {lexeme=yytext(); return Int;}
( float ) {lexeme=yytext(); return Float;}
( double ) {lexeme=yytext(); return Double;}
( "void" ) {lexeme=yytext(); return Void;}

{espacio} {/*Ignore*/}
"//"(.)* {/*Ignore*/}
( "\n" ) {lexeme=yytext(); return Linea;}

( "(" ) {lexeme=yytext(); return Parentesis_a;}
( ")" ) {lexeme=yytext(); return Parentesis_c;}
( "{" ) {lexeme=yytext(); return Llave_a;}
( "}" ) {lexeme=yytext(); return Llave_c;}

( "main" ) {lexeme=yytext(); return Main;}

( "," ) {lexeme=yytext(); return Comita;}
( ";" ) {lexeme=yytext(); return P_coma;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}
