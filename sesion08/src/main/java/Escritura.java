import java.io.*;
import java.nio.charset.Charset;

public class Escritura {
    public static void main(String[] args) {

        try{
        //Establecer conexion con un archivo y voy a escribir en una codificacion que acepta acentos
            // Si no existe el archivo , lo crea

           File archivo = new File("./src/main/java/archivos/nuevo.txt");
            FileWriter conexion = new FileWriter("./src/main/java/archivos/nuevo.txt", Charset.forName("utf-8"));//uft-8 es la codificacion que acepta acentos
        BufferedWriter escritor = new BufferedWriter(conexion);

        escritor.write("Holi microbi");
        escritor.newLine();
        escritor.write("¿Cómo están?");

        escritor.close();
        }catch (IOException ioex) {
            System.out.println("ERROR: No se pudo escribir en un archivo");
        }
    }
}
