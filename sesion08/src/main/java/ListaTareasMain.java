public class ListaTareasMain {
    public static void main(String[] args) throws Exception{
        Menu menu = new Menu();
        Lector lector = new Lector();
        ListasTareas listaOpciones = new ListasTareas();
        byte opcionS = 0;

        do {
            menu.todasOpciones();
            opcionS = lector.leeOpcion();
            System.out.println("\n\nLa opción seleccionada es: " + opcionS);

            switch (opcionS) {
                case 1:
                    listaOpciones.crearNuevaLista();
                    break;
                case 2:
                    listaOpciones.verListaTareas();
                    break;
                case 3:
                    listaOpciones.verTareasDeLista();
                    break;
                case 4:
                    listaOpciones.actualizarListaDeTareas();
                    break;
                case 5:
                    listaOpciones.eliminarListaDeTareas();
                    break;
                case 6:
                    listaOpciones.guardarTareas();
                    System.out.println("Saliendo de la aplicación.");
                    break;
                default:
                    System.out.println("Opción no conocida.");
            }
        }while(opcionS != 6);
    }
}
