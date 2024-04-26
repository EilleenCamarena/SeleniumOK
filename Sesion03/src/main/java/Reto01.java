import java.util.Scanner;

public class Reto01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enunciado a analizar:");

        String enunciado =sc.nextLine();

        int conteoVocales = 0;

        for (char caracter : enunciado.toLowerCase().toCharArray()) {
            if (caracter == 'a'
                    || caracter == 'e'
                    || caracter == 'e'
                    || caracter == 'i'
                    || caracter == 'o'
                    || caracter == 'u') {
                conteoVocales++;
            }
        }

        System.out.println(enunciado + ':' + conteoVocales);
    }
}
