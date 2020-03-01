PARSE_BEGIN(test)

class test{
    public static void main(String[] args) throws ParseException {
        try {
            test analizador = new test(System.in);
            analizador.Programa();
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println("Se han encontrado errores");
        }
    }
}
PARSE_END(test)

TOKEN : {
    <ASIGNACION : "=">
   |<PLUS : "+"> 
   |<MINUS : "-">
   |<MULTIPLY : "*">
   |<DIVIDE : "/">
   |<INCR : "++">
   |<DECR : "--">
}

TOKEN : {
    <INT : "num" >
    <DEC : "decimal" >
    <CHR : "letra" >
    <STR : "cadena" >
    <NUMBER : (["0" - "9"])+ >
    <IDENTIFIER : ["a"-"z", "A"-"Z"](["a"-"z", "A"-"Z", "0"-"9","_"])* >

}