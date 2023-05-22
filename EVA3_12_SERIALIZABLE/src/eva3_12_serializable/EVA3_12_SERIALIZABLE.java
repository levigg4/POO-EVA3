package eva3_12_serializable;
//RODRIGO LEVI GARCIA GAEAY 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_12_SERIALIZABLE {

    public static void main(String[] args) {
        try {
            Persona perso = new Persona(19,"Levi ","Garcia");
           
            try {
                guardarObjetos(perso);
                Persona resu = leerObjetos();
                System.out.println("Nombre "+resu.getName());
                System.out.println("Apellido "+resu.getName());
                System.out.println("Edad "+resu.getAge());
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public static void guardarObjetos(Persona perso) throws IOException {
        
       FileOutputStream abriArchi = new FileOutputStream("C:\\archivos\\personas.per");
       ObjectOutputStream ouStream = new ObjectOutputStream(abriArchi);
     
       ouStream.writeObject(perso);
       ouStream.close();
    }
    public static Persona leerObjetos() throws  IOException, ClassNotFoundException{
       Persona perso = null;
       FileInputStream abrirArchi = new FileInputStream("C:\\archivos\\personas.per");
       ObjectInputStream oiStream = new ObjectInputStream(abrirArchi);
       //casting de Object a Persona
       perso = (Persona)oiStream.readObject();
       oiStream.close();
       return perso;
    }
}
    

class Persona implements Serializable{

    private int Edad;
    private String Nombre;
    private String Apellido;
    
    public Persona(){
    this.Edad = 0;
    this.Nombre = "__________";
    this.Apellido = "_________";
    }
    public Persona(int Edad, String Nombre, String Apellido) {
            this.Edad = Edad;
            this.Nombre = Nombre;
            this.Apellido = Apellido;
        }

    public int getAge() {
        return Edad;
    }

    public void setAge(int Edad) {
        this.Edad = Edad;
    }

    public String getName() {
        return Nombre;
    }

    public void setName(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLastName() {
        return Apellido;
    }

    public void setLastName(String Apellido) {
        this.Apellido = Apellido;
    }
    
    }