package eva3_7_throw_exception;

//RODRIGO LEVI GARCIA GARAY 

import java.util.InputMismatchException;
import java.util.Scanner;



public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
        Prueba pru = new Prueba();
        //UNCHECKED: errores de logica, no es forzoso resolverlas 
            //int resu = 5/0;
        //CHECKED: obligados a resolverlas
        try {
            pru.capturarMayorCero(250);
            System.out.println("Introduce un valor ");
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }//catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }
        //Arithmetic es unchecked
        System.out.println("\nDIVISON DE 100/0");
        try{
            pru.divison(100, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
}
class Prueba{
    //ECPETION ES CHECKED EXCEPTION, ESTAMOS OBLIGADOS A RESOLVERLA
    public void capturarMayorCero(int valor) throws Exception{
        if(valor<=0)//voy a generar una excepcion
            throw new Exception(valor + " es negativo, solo acepta valores positivos");
        System.out.println("El valor es: " + valor);
    }
    public int divison(int x,int y)throws ArithmeticException{
        if(y == 0 )
            throw new ArithmeticException("El divisor es un cero, y es invalida la divison");
        return x/y;
    }
}
