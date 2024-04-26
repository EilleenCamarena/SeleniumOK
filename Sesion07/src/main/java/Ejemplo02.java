import java.util.*;

public class Ejemplo02 {
    public static void main(String[] args) {
        Queue<Libro> colaL = new PriorityQueue<>();

        Libro l1 = new Libro("uno", 100);
        Libro l2 = new Libro("dos", 76);
        Libro l3 = new Libro("tres", 600);

        colaL.add(l1);//se agrega a la cola
        colaL.add(l2);
        colaL.add(l3);

        Libro l = null;

        while((l = colaL.poll()) != null){
            System.out.println(l.getTitulo());//Se debe d editar la clase que se va a ordenar, usando Comparable<Clase con que se compara>
        }

        List<Libro> listaL = new LinkedList<>();

        listaL.add(l1);
        listaL.add(l2);
        listaL.add(l3);
        System.out.println("----------------");

        for (Libro libro : listaL){
            System.out.println(libro.getTitulo());
        }
        Collections.sort(listaL);
        System.out.println("----------------");

        for (Libro libro : listaL){
            System.out.println(libro.getTitulo());
        }
    }
}
