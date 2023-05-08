package eva3_8_custom_exceptions;
//RODRIGO LEVI GARCIA GARAY 
public class EVA3_8_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Levi");
        perso.setApellido("Garcia");
        try{
            perso.setEdad(-19);
        }catch(DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());
        }
        
    }
    
}

class Persona{
    String nombre;
    String apellido;
    int edad;

    public Persona() {
        nombre = "------";
        apellido = "------";
        edad = 0;
    }
    
    public Persona(String nombre, String apellido, int edad) throws DatoEntradaCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedEx {
        if(edad<=0)
            //throw new DatoEntradaException(); UNCHECKED
            throw new DatoEntradaCheckedEx();
        this.edad = edad;
    }
  
}

class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Dato de entrada incorrecto! El valor debe ser positivo.");
    }
    
}

class DatoEntradaCheckedEx extends Exception{

    public DatoEntradaCheckedEx() {
        super("Dato de entrada incorrecto! El valor debe ser positivo.");
    }
    

}