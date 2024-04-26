package archivos;

import javax.imageio.IIOException;
import java.io.*;

//Excepcion ->IOException->FileNotFoundEception

//Animal->Felinos->Gatos

//Polimorfismo
//Gato->Gato
//Animal->Gato
//Felino->Gato
//Animal->Felino

public class LecturaTres {
    public static void main(String[] args) {
        try {
            File archivo = new File("./src/main/java/archivos/importante.txt"); //./siempre inicia asi... el "." es para hacer referencia de la carpeta en que estamos
            FileReader conexion = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(conexion);

            //Lee la siguiente linea del archivo
            String linea = lector.readLine();

            System.out.println("linea 1: " + linea);

            linea = lector.readLine();

            System.out.println("linea 2: " + linea);

            linea = lector.readLine();

            System.out.println("linea 3: " + linea);

            lector.close();//Cerrar sesion de la lectura del archivo

        } catch (FileNotFoundException fnex) {
            System.out.println("ERROR: No se encontro el archivo");
        } catch (IOException ioex) {
            System.out.println("ERROR: No se puede leer el archivo");
        } catch (Exception ex) {
            System.out.println("ERROR: Ocurrio un error inesperado");
        }
    }
}
