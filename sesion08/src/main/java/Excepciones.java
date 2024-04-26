import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner nos permite tener datos de entrada por parte del usuario, pedir datos al usuario
public class Excepciones {//Try-Catch es un mecanismo de Java que permite "atrapar o controlar" los errore (excepciones)
    //Try es un bloque de codigo con lineas potencialmente pueden generar una excepcion
    //Catch si sucede una excepcion ¿que hacemos con esa excepcion?

    public static void main(String[] args) {//este metodo es el q permite ejecutar el codigo

        Scanner sc = new Scanner(System.in);//crear una nueva instancia de la clase Scanner <objeto>, dandole parametro "System.in"

        System.out.println("Ingresa el primer numero:");

        int primer = 0;

        try {
            primer = sc.nextInt();//captura y transforma un dato en un numero entero
        } catch (InputMismatchException ex) { //en el catch especificar cual o cuales errores va a estar mandando
            System.out.println("Error al capturar un numero en la primer entrada");
        }
        sc.nextLine();//limpia la entrada, espera a que el usuario escriba algo, hasta que le den enter, el codigo continua, toma los datos y los transforma en Entero
        //sc.nextBoolean();//captura y transforma en booleano
        //sc.nextDouble();//captura y transforma en double (punto flotante)
        //sc.nextLine();//captura y transforma en String

        System.out.println("Ingresa el segundo numero:");

        int segundo = sc.nextInt();
        sc.nextLine();

        int suma = primer + segundo;

        System.out.println("El resultado es: "+suma);//concatenacion, tomar una cadena d texto y pegarle valores

    }

}
