package eva3_9_leer_archivos_txt;
//RODRIGO LEVI GARCIA GARAY 

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_9_LEER_ARCHIVOS_TXT {
    final static String RUTA = "C:\\archivos\\prueba.txt";
    public static void main(String[] args) {
        try {
            readUsingFiles(RUTA);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    /*
    FILES: SE LEE TODO EL CONTENIDO DEL ARCHIVO Y SE 
    TRANSFIERE A MEMORIA PRINCIPAL (RAM) UTIL CON ARCHIVOS PEQUEñOS
    */
    public static void readUsingFiles(String ruta) throws IOException{
        //CONSTRUIMOS LA RUTA EN BASE A LA CADENA DE TEXTO
        Path path = Paths.get(ruta);
        /*List<String> todasLineas = Files.readAllLines(path);
        System.out.println("RESULTADO");
        //System.out.println(todasLineas.toString());
        for (int i=0; i<todasLineas.size(); i++){
            System.out.println(todasLineas.get(i));
            */
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
        }
    
    }

