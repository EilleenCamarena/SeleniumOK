import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        //Class Scanner-->javadoc en el navegador al buscar vienen todas las clases de Java
        //Constructores -->Metodos que permiten instanciar un objeto-- siempre se llama igual que la CLASE
        //Clase tiene atributos(caracteristicas), objetos y metodos(acciones)
        //Class Scanner leer la informacion

        Scanner sc = new Scanner(System.in); //System-->se refiere a la terminal in-->lo que se pone en la terminal

        System.out.println("Por favor escribe tu nombresin:");
        //sc.nextLine();
        String nombre =sc.nextLine();

        System.out.println("Holi" + nombre);


    }
}
