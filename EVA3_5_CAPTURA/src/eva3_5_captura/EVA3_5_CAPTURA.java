package eva3_5_captura;
//RODRIGO LEVI GARCIA GARAY 

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURA {
    
    public static void main(String[] args) {
         int x;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce el valor (entero) de x: ");
                x = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Input no valido, intenta de nuevo");
            }
           
        }while(true);
        
        System.out.println("Valor de x: "+x);

    }
}