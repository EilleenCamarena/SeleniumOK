import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escribe:");

        String texto = sc.nextLine();

        Analizador an = new Analizador(); //reutilizacion del codigo new siempre va a ir con la instancia de objetos y va aun lado de un constructor

        int v = an.cuentVocales(texto);
        int n = an.cuentaNumeros(texto);

        System.out.println("Hay" + v + "vocales");
        System.out.println("Hay" + n + "numeros");

    }
}
