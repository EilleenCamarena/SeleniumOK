import java.util.ArrayList;
import java.util.List;

public class ListasTareas {
    private Lector lector = new Lector();

    public void crearNuevaLista() {
        System.out.println("Crear nueva lista de tareas.");

        String nombre = lector.leeCadena();

        ListasTareas listaOpciones = new ListasTareas();
    }

    public void verListaTareas() {
        System.out.println("Ver listas de tareas.");
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");

        byte listaOpciones = lector.leeOpcion();
    }

    public void actualizarListaDeTareas() {
        System.out.println("Actualizar lista de tareas.");

        byte listaOpciones = lector.leeOpcion();
    }


    public void eliminarListaDeTareas() {
        System.out.println("Eliminar lista de tareas.");
        byte listaOpciones = lector.leeOpcion();
    }
}
