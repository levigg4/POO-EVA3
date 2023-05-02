package eva3_4_multiples_excepciones;
//RODRIGO LEVI GARCIA GARAY 
import java.util.InputMismatchException;
import java.util.Scanner;
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
       System.out.println("INICIO DE PROGRAMA");
        int x, y;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Teclea el valor (entero) de x: ");
                x = sc.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Input no valido, intenta de nuevo");
            }
        }while(true);
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Teclea el valor (entero) de y: ");
                y = sc.nextInt();
                int res = x/y;
                System.out.println("Divisón de "+x+'/'+y+" es = "+res);
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Input no valido, intenta de nuevo");
            }
            catch(ArithmeticException e){
                System.out.println("Divisón entre 0 no es válida, intenta de nuevo");
            }
            
        }while(true);
        
        //int res = x/y;
        //System.out.println("Divisón de "+x+'/'+y+" es = "+res);
        System.out.println("FIN DE PROGRAMA");
    }
    
}
