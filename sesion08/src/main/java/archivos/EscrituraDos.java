package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class EscrituraDos {
    public static void main(String[] args) {

        try{
            //Establecer conexion con un archivo y voy a escribir en una codificacion que acepta acentos
            //Si no existe el archivo , lo crea
            // Si yo quiero conservar el contenido del archivo , poner TRUE como ultimo parametro

            //File archivo = new File("./src/main/java/archivos/nuevo.txt");
            FileWriter conexion = new FileWriter("./src/main/java/archivos/nuevo.txt", Charset.forName("utf-8"), true);//uft-8 es la codificacion que acepta acentos
            BufferedWriter escritor = new BufferedWriter(conexion);

            escritor.newLine();
            escritor.write("Holiiii microbii ravioliii");
            escritor.newLine();
            escritor.write("¿Cómo están?");

            escritor.close();
        }catch (IOException ioex) {
            System.out.println("ERROR: No se pudo escribir en un archivo");
        }
    }
}
