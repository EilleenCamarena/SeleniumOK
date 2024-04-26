import java.util.ArrayList;
import java.util.List;

public class Ejemplo03 {//polimorfismo de clases
    public static void main(String[] args) {
        //lista o elementos o contenidos de la lista con el metodo List <> se adapta al tipo de lista que se esta guardando
        List<String> compras = new ArrayList<>();
        compras.add("leche");
        compras.add("huevo");
        compras.add("jamon");
        compras.add("azucar");

        for (int i = 0; i < compras.size(); i++) {//size regresa el numero de elementos<contar>
            System.out.println(compras.get(i));//get va a imprimir lo que se especifica
        }
        List<Integer> calificaciones = new ArrayList<>();//Integer son datos primitivos
        calificaciones.add(10);
        calificaciones.add(8);
        calificaciones.add(9);

        for (int j = 0; j < calificaciones.size(); j++) {//size regresa el numero de elementos<contar>
            System.out.println(calificaciones.get(j));//get va a imprimir lo que se especifica
        }
    }
}
