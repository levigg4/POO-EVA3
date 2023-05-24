package eva3_13_append;
//RODRIGO LEVI GARCIA GARAY

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_13_APPEND {


    public static void main(String[] args) {
       String ruta ="C:\\archivos\\";
        
       //WriteUsingFiles
        try {
            //writeUsingFiles(ruta+"archivoFiles.txt" ,"Prueba de escritura de Files \n");
            //FilesWriter
            //writeUsingFileWriter(ruta+"archivoFileWriter.txt", "Prueba de fileWriter\n");
            
            writeUsingBufferedWriter(ruta+"archivoBufWriter.txt", "Prueba de BufferedWriter"+" Texto de ejemplo.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void writeUsingBufferedWriter(String ruta,String datos) throws IOException{
       File file = new File(ruta);
       FileWriter fileWriter  = new FileWriter(file, true);
       BufferedWriter bufWriter = new BufferedWriter(fileWriter);
       
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
            bufWriter.write((i+1)+" "+datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();

    }
    
}
