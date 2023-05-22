package eva3_10_escribir_archivos_txt;
//Rodrigo Levi Garcia Garay 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_10_ESCRIBIR_ARCHIVOS_TXT {

    public static void main(String[] args) {
        String ruta = "C:\\Archivos\\";
        try {
            writeUsingFiles("**********Files********\n", 
                    ruta+"/outputFiles.txt");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            writeUsingFileWriter("********FileWriter*************\n ",
                    ruta+"/outputFileWriter.txt");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            writeUsingBufferedWriter("**************bufferedWriter***********\n",
                    ruta+"/outputBufferedWriter.txt");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeUsingFiles(String datos, String ruta) throws IOException{
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    }
    
    public static void writeUsingFileWriter(String datos, String ruta) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.flush();
        fileWriter.close();
    }
    
    public static void writeUsingBufferedWriter(String datos, String ruta) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter buffWriter = new BufferedWriter(fileWriter);
        
        for(int i=0 ; i<10 ; i++){
            buffWriter.write((i+1)+ " " + datos);
            buffWriter.write("\n");
        }
        buffWriter.flush();
        buffWriter.close();
    }
}


