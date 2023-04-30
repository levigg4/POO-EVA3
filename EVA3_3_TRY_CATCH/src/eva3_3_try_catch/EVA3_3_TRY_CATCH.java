package eva3_3_try_catch;
//RODRIGO LEVI GARCIA GARAY
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        System.out.println("INICIO DEL PROGRAMA");
        int x=5, y=0;
        try{//llaves obligatorias
            int res = x/y;
            System.out.println("Resultado de x/y = "+res);
        }catch(ArithmeticException e){ 
            //e.printStackTrace();                                    // lo que se imprime por default 
            System.out.println("Excepción de tipo: "+e.getMessage()); //se genera un objeto exception "e"
        }                                                             // de tipo ArithmeticException
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
