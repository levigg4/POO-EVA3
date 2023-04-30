package eva3_2_exception_propagation;
//RODRIGO LEVI GARCIA GARAY
public class EVA3_2_EXCEPTION_PROPAGATION {

    public static void main(String[] args) {
        System.out.println("INICA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }
    public static void A(){
        System.out.println("INICIA A");
        B();
        System.out.println("TERMINA A");
    }
    public static void B(){
        System.out.println("INICIA B");
         C();
        System.out.println("TERMINA B");
    }
    public static void C(){
        System.out.println("INICIA C");
        int x=5, y=0;
        int res = x/y;
        System.out.println("Resultado de x/y = "+res);//Se genera una excepción ArithmeticException y se
        System.out.println("TERMINA C");  //propaga arriba en el stack de llamadas
    }                                       //nada de lo que está después se ejecuta
}