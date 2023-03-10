
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Feb 03 00:48:49 COT 2023
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Feb 03 00:48:49 COT 2023
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\003\007\000\002\003" +
    "\010\000\002\002\010\000\002\002\010\000\002\002\010" +
    "\000\002\002\010\000\002\002\011\000\002\002\011\000" +
    "\002\002\011\000\002\002\011\000\002\002\011\000\002" +
    "\002\011\000\002\002\011\000\002\002\011\000\002\002" +
    "\012\000\002\002\012\000\002\002\012\000\002\002\012" +
    "\000\002\004\004\000\002\004\004\000\002\004\004\000" +
    "\002\004\006\000\002\004\006\000\002\004\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\153\000\014\004\012\005\006\006\005\007\004\015" +
    "\010\001\002\000\004\020\145\001\002\000\004\020\134" +
    "\001\002\000\004\020\123\001\002\000\014\004\052\005" +
    "\050\006\047\007\046\015\051\001\002\000\004\011\042" +
    "\001\002\000\004\002\041\001\002\000\004\020\013\001" +
    "\002\000\004\011\014\001\002\000\012\004\020\005\016" +
    "\006\015\012\021\001\002\000\004\020\040\001\002\000" +
    "\004\020\037\001\002\000\006\012\026\016\025\001\002" +
    "\000\004\020\024\001\002\000\004\013\022\001\002\000" +
    "\004\014\023\001\002\000\014\004\ufffe\005\ufffe\006\ufffe" +
    "\007\ufffe\015\ufffe\001\002\000\006\012\uffee\016\uffee\001" +
    "\002\000\010\004\033\005\032\006\031\001\002\000\004" +
    "\013\027\001\002\000\004\014\030\001\002\000\014\004" +
    "\ufffa\005\ufffa\006\ufffa\007\ufffa\015\ufffa\001\002\000\004" +
    "\020\036\001\002\000\004\020\035\001\002\000\004\020" +
    "\034\001\002\000\006\012\uffeb\016\uffeb\001\002\000\006" +
    "\012\uffea\016\uffea\001\002\000\006\012\uffe9\016\uffe9\001" +
    "\002\000\006\012\uffed\016\uffed\001\002\000\006\012\uffec" +
    "\016\uffec\001\002\000\004\002\001\001\002\000\004\012" +
    "\043\001\002\000\004\013\044\001\002\000\004\014\045" +
    "\001\002\000\004\002\000\001\002\000\004\020\112\001" +
    "\002\000\004\020\101\001\002\000\004\020\070\001\002" +
    "\000\004\011\064\001\002\000\004\020\053\001\002\000" +
    "\004\011\054\001\002\000\012\004\020\005\016\006\015" +
    "\012\056\001\002\000\006\012\061\016\025\001\002\000" +
    "\004\013\057\001\002\000\004\014\060\001\002\000\014" +
    "\004\ufff6\005\ufff6\006\ufff6\007\ufff6\015\ufff6\001\002\000" +
    "\004\013\062\001\002\000\004\014\063\001\002\000\014" +
    "\004\ufff2\005\ufff2\006\ufff2\007\ufff2\015\ufff2\001\002\000" +
    "\004\012\065\001\002\000\004\013\066\001\002\000\004" +
    "\014\067\001\002\000\004\002\uffff\001\002\000\004\011" +
    "\071\001\002\000\012\004\020\005\016\006\015\012\073" +
    "\001\002\000\006\012\076\016\025\001\002\000\004\013" +
    "\074\001\002\000\004\014\075\001\002\000\014\004\ufff5" +
    "\005\ufff5\006\ufff5\007\ufff5\015\ufff5\001\002\000\004\013" +
    "\077\001\002\000\004\014\100\001\002\000\014\004\ufff1" +
    "\005\ufff1\006\ufff1\007\ufff1\015\ufff1\001\002\000\004\011" +
    "\102\001\002\000\012\004\020\005\016\006\015\012\104" +
    "\001\002\000\006\012\107\016\025\001\002\000\004\013" +
    "\105\001\002\000\004\014\106\001\002\000\014\004\ufff4" +
    "\005\ufff4\006\ufff4\007\ufff4\015\ufff4\001\002\000\004\013" +
    "\110\001\002\000\004\014\111\001\002\000\014\004\ufff0" +
    "\005\ufff0\006\ufff0\007\ufff0\015\ufff0\001\002\000\004\011" +
    "\113\001\002\000\012\004\020\005\016\006\015\012\115" +
    "\001\002\000\006\012\120\016\025\001\002\000\004\013" +
    "\116\001\002\000\004\014\117\001\002\000\014\004\ufff3" +
    "\005\ufff3\006\ufff3\007\ufff3\015\ufff3\001\002\000\004\013" +
    "\121\001\002\000\004\014\122\001\002\000\014\004\uffef" +
    "\005\uffef\006\uffef\007\uffef\015\uffef\001\002\000\004\011" +
    "\124\001\002\000\012\004\020\005\016\006\015\012\126" +
    "\001\002\000\006\012\131\016\025\001\002\000\004\013" +
    "\127\001\002\000\004\014\130\001\002\000\014\004\ufffd" +
    "\005\ufffd\006\ufffd\007\ufffd\015\ufffd\001\002\000\004\013" +
    "\132\001\002\000\004\014\133\001\002\000\014\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\015\ufff9\001\002\000\004\011" +
    "\135\001\002\000\012\004\020\005\016\006\015\012\137" +
    "\001\002\000\006\012\142\016\025\001\002\000\004\013" +
    "\140\001\002\000\004\014\141\001\002\000\014\004\ufffc" +
    "\005\ufffc\006\ufffc\007\ufffc\015\ufffc\001\002\000\004\013" +
    "\143\001\002\000\004\014\144\001\002\000\014\004\ufff8" +
    "\005\ufff8\006\ufff8\007\ufff8\015\ufff8\001\002\000\004\011" +
    "\146\001\002\000\012\004\020\005\016\006\015\012\150" +
    "\001\002\000\006\012\153\016\025\001\002\000\004\013" +
    "\151\001\002\000\004\014\152\001\002\000\014\004\ufffb" +
    "\005\ufffb\006\ufffb\007\ufffb\015\ufffb\001\002\000\004\013" +
    "\154\001\002\000\004\014\155\001\002\000\014\004\ufff7" +
    "\005\ufff7\006\ufff7\007\ufff7\015\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\153\000\006\002\006\003\010\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\016\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\054\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\004\071\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\102\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\113\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\124\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\135\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\146\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // PARAMETRO ::= PARAMETRO Comita Double Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // PARAMETRO ::= PARAMETRO Comita Float Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // PARAMETRO ::= PARAMETRO Comita Int Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // PARAMETRO ::= Double Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // PARAMETRO ::= Float Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // PARAMETRO ::= Int Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PARAMETRO",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // FUNCION ::= FUNCION Void Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // FUNCION ::= FUNCION Double Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // FUNCION ::= FUNCION Float Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // FUNCION ::= FUNCION Int Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // FUNCION ::= FUNCION Void Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FUNCION ::= FUNCION Double Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // FUNCION ::= FUNCION Float Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // FUNCION ::= FUNCION Int Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // FUNCION ::= Void Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FUNCION ::= Double Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FUNCION ::= Float Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // FUNCION ::= Int Identificador Parentesis_a PARAMETRO Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FUNCION ::= Void Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // FUNCION ::= Double Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // FUNCION ::= Float Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // FUNCION ::= Int Identificador Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FUNCION",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= FUNCION Main Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

