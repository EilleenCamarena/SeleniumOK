import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejemplo04 {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();

        Collections.addAll(listaFrutas, "Plátanos", "Sandía", "Pera", "Manzana", "Naranja", "Kiwi");//grupo de objetos individuales que se representan como una sola unidad
        muestraFrutas(listaFrutas);

        Collections.reverse(listaFrutas);//Metodo que ya existe de collection para invertir el orden
        muestraFrutas(listaFrutas);

        System.out.println("\nLa fruta más pequeña es: " + Collections.min(listaFrutas));//lo mas pequeño (numero)
        System.out.println("\nLa fruta más grande es: " + Collections.max(listaFrutas));//lo mas grande (numero)

        Collections.sort(listaFrutas);//ordenamiento
        muestraFrutas(listaFrutas);

        System.out.println("\nLa Pera está en la posición: " + Collections.binarySearch(listaFrutas, "Pera"));
        System.out.println("\nLa Manzana está en la posición: " + Collections.binarySearch(listaFrutas, "Manzana"));

        Collections.addAll(listaFrutas, "Manzana", "Manzana", "Manzana");
        muestraFrutas(listaFrutas);

        Collections.shuffle(listaFrutas);//es lo contrario a sort, genera una mezcla aleatoria
        muestraFrutas(listaFrutas);

        System.out.println("\nHay " + Collections.frequency(listaFrutas, "Manzana") + " en la lista.");//cuenta cuantas veces aparece un elemento
    }

    private static void muestraFrutas(List<String> lista) {
        System.out.println();
        for (String fruta : lista) {
            System.out.println(fruta);
        }
    }
}