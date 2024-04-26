import java.util.PriorityQueue;
import java.util.Queue;

public class Ejemplo01 {
    public static void main(String[] args) {
        //Cola-->cola del super-->ir agregando los elementos, el primer elemento que llega es el primero que se va a atender
        //Colas de prioridad-->la misma forma de funcionar solo que priorizar algunos elementos pero si llega alguien con mayor prioridad se le da prioridad, depende del orden de los elementos, el elemento mas pequeño es el q tiene prioridad y los acomoda alfabeticamente
        Queue<String>  cola = new PriorityQueue<>();

        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");

        //ver el orden de los elementos
        String valor = null;

        while ((valor = cola.poll()) != null) { //poll da el siguiente elemento de la cola, hasta que sea null se va a ejecutar la cola
            System.out.println(valor);
        }
        Queue<Integer> colaI = new PriorityQueue<>();

        colaI.add(5);
        colaI.add(3);
        colaI.add(1);

        Integer i = null;

        while ((i = colaI.poll()) != null) { //poll da el siguiente elemento de la cola, hasta que sea null se va a ejecutar la cola
            System.out.println(i);
        }

    }
}
