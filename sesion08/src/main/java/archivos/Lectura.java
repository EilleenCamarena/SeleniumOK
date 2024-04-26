package archivos;

import java.io.File; //es la referencia de un archivo
import java.io.FileReader; //establece conexion con el archivo 1/0
import java.io.BufferedReader; //extraer los datos (binario) del archivo
import java.io.FileNotFoundException; //excepcion de archivo si no s encuentra

//Esto funciona de manera "Local" <dentro de la computadora>

public class Lectura {
    public static void main(String[] args) {
        try {
            File archivo = new File("./src/main/java/archivos/importante.txt"); //./siempre inicia asi... el "." es para hacer referencia de la carpeta en que estamos
            FileReader conexion = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(conexion);

//            //Lee la siguiente linea del archivo
//            String linea = lector.readLine();
//
//            System.out.println(linea);

        } catch (FileNotFoundException fnex) {
            System.out.println("ERROR: El archivo no existe o no se puede abrir");
        }
    }
}
