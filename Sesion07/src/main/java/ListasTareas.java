import modelo.Tarea;

import java.util.ArrayList;
import java.util.List;

public class ListasTareas {

    private String nombre;
    private Lector lector = new Lector();
    private List<ListasTareas> listasTareas = new ArrayList<>();

    private final List<Tarea> tareas = new ArrayList<>();

    private Menu menu = new Menu();
    private ManejadorTareas tarea = new ManejadorTareas();

    public void crearNuevaLista() {
        System.out.println("Crear nueva lista de tareas.");

        String nombre = lector.leeCadena();

        ListasTareas listaOpciones = new ListasTareas();
        listasTareas.add(listaOpciones);
    }

    public void verListaTareas() {
        System.out.println("Ver listas de tareas.");
        if (!validaExistenciaLista()) {
            return;
        }

        for (int i = 0; i < listasTareas.size(); i++) {
            System.out.println((i + 1) + " - " + listasTareas.get(i).getNombre());
        }
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");
        byte indice = validaIndice();

        if (indice == 0) {
            return;
        }

        ListasTareas listaO = listasTareas.get(indice - 1);

        if (listaO.numeroTareas() == 0) {
            System.out.println("Aún no hay tareas en la lista.");
        }

        listaO.muestraTareas();

    }

    private void muestraTareas() {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + " - " + tareas.get(i).getNombre());
        }
    }

    int numeroTareas() {
        return tareas.size();
    }

    public void actualizarListaDeTareas() {
        System.out.println("Actualizar lista de tareas.");
        byte indice = validaIndice();

        if (indice == 0) {
            return;
        }

        byte listaOpciones = lector.leeOpcion();
        ListasTareas listaActual = listasTareas.get(indice - 1);

        menu.muestraOpcionesTarea();
        byte opcionS = lector.leeOpcion();

        switch (opcionS){
            case 1:
                Tarea nuevaTarea = tarea.nuevaTarea();
                listaActual.agregaTarea(nuevaTarea);
                break;
            case 2:
                Tarea t1 = tarea.eliminaTarea(listaActual);
                if(t1 != null) {
                    System.out.println("Se eliminó la tarea " + t1.getNombre());
                }
                else {
                    System.out.println("No se pudo eliminar la tarea.");
                }
                break;
            case 3:
                Tarea t2 = tarea.marcarTareaFinalizada(listaActual);
                if(t2 != null) {
                    System.out.println("La tarea " + t2.getNombre() + " se completó el " + t2.getFechaRealizacion());
                }else{
                    System.out.println("La tarea no pudo ser marcada como finalizada.");
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Opción desconocida.");
        }
    }

    private void agregaTarea(Tarea nuevaTarea) {
    }


    public void eliminarListaDeTareas() {
        System.out.println("Eliminar lista de tareas.");
        byte indice = validaIndice();

        if(indice == 0){
            return;
        }

        ListasTareas listaEliminada = listasTareas.remove((indice - 1));

        System.out.println("Se eliminó la lista de tareas: " + listaEliminada.getNombre());
    }

    private String getNombre() {
        return nombre;
    }


    private boolean validaExistenciaLista() {
        if (listasTareas != null && !listasTareas.isEmpty()) {
            return true;
        }

        System.out.println("Aún no se ha creado ninguna lista de tareas.");
        return false;
    }

    private byte validaIndice() {
        byte indice = 0;

        if (!validaExistenciaLista()) {
            return indice;
        }

        System.out.println("Indique el índice de la lista de tareas.");
        indice = lector.leeOpcion();

        if (indice > listasTareas.size() || indice < 0) {
            System.out.println("No existen listas de tareas en el índice seleccionado.");
            indice = 0;
        }

        return indice;
    }

    public Tarea eliminaTarea(int i) {
        return null;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
