import modelo.Tarea;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListasTareas {

    private String nombre;

    private static final String NOMBRE_ARCHIVO = System.getProperty("user.home") + "/.tareas";
    private Lector lector = new Lector();
    private List<ListasTareas> listasTareas = new ArrayList<>();

    private final List<Tarea> tareas = new ArrayList<>();

    private Menu menu = new Menu();
    private ManejadorTareas tarea = new ManejadorTareas();

    public ListasTareas() throws Exception {
        cargaTareas();
    }

    public void crearNuevaLista() throws Exception {
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
            System.out.printf("%d - %s%n", (i + 1), listasTareas.get(i).getNombre());
        }
    }

    public void verTareasDeLista() {
        System.out.println("Ver tareas de lista.");
        byte indice = validaIndice();

        if (indice == 0) {
            return;
        }

        ListasTareas listaOpciones = listasTareas.get(indice - 1);

        if (listaOpciones.numeroTareas() == 0) {
            System.out.println("Aún no hay tareas en la lista.");
        }

        listaOpciones.muestraTareas();

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

        ListasTareas listaActual = listasTareas.get(indice - 1);

        menu.muestraOpcionesTarea();
        byte opcionS = lector.leeOpcion();

        System.out.printf("%n%nLa opción seleccionada es: %d%n", opcionS);

        switch (opcionS){
            case 1:
                Tarea nuevaTarea = tarea.nuevaTarea();
                listaActual.agregaTarea(nuevaTarea);
                break;
            case 2:
                Tarea t1 = tarea.eliminaTarea(listaActual);
                if(t1 != null) {
                    System.out.printf("Se eliminó la tarea %s%n", t1.getNombre());
                }
                else {
                    System.out.println("No se pudo eliminar la tarea.");
                }
                break;
            case 3:
                Tarea t2 = tarea.marcarTareaFinalizada(listaActual);
                if(t2 != null) {
                    System.out.printf("La tarea %s se completó el %2$te de %2$tB de %2$tY%n", t2.getNombre(), t2.getFechaRealizacion());
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

        System.out.printf("Se eliminó la lista de tareas: %s%n", listaEliminada.getNombre());
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
    public void cargaTareas() throws Exception {
        if (new File(NOMBRE_ARCHIVO).exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO));
            listasTareas = (List<ListasTareas>) ois.readObject();
        }
    }
    public void guardarTareas() throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO));
        oos.writeObject(listasTareas);
    }
    public Tarea eliminaTarea(int i) {
        return null;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}
