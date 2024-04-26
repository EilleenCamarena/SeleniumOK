package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//Excepcion ->IOException->FileNotFoundEception

//Animal->Felinos->Gatos

//Polimorfismo
//Gato->Gato
//Animal->Gato
//Felino->Gato
//Animal->Felino

public class LecturaDos {
    public static void main(String[] args) {
        try {
            File archivo = new File("./src/main/java/archivos/importante.txt"); //./siempre inicia asi... el "." es para hacer referencia de la carpeta en que estamos
            FileReader conexion = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(conexion);

            //Lee la siguiente linea del archivo
            String linea = lector.readLine();

            System.out.println("linea 1: " +linea);

            linea = lector.readLine();

            System.out.println("linea 2: " +linea);

            lector.close();//Cerrar sesion de la lectura del archivo

        } catch (Exception fnex) {
            System.out.println("ERROR: El archivo no existe o no se puede abrir");
        }
    }
}
