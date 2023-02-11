package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

( int ) {return new Symbol(sym.Int, yychar, yyline, yytext());}
( float ) {return new Symbol(sym.Float, yychar, yyline, yytext());}
( double ) {return new Symbol(sym.Double, yychar, yyline, yytext());}
( "void" ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
"//"(.)* {/*Ignore*/}

( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

( "," ) {return new Symbol(sym.Comita, yychar, yyline, yytext());}
( ";" ) {return new Symbol(sym.P_Coma, yychar, yyline, yytext());}

{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
 . {return ERROR;}


