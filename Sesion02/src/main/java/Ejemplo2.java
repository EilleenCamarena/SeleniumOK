public class Ejemplo2 {
    public static void main(String[] args) {
        int calificacion = 7;

        //ESTRUCTURA DE SECUENCIA, construccion del lenguaje que permite decidir que se ejecute y que no
        //switch, primero variable que se usa, despues los casos o posibles alternativas que tiene switch (case)
        //despues que resultado tiene el caso (case) y terminar el case con "break" y para seguir ejecutando lo que sigue
        // deafult si NO ENTRA A UNA DE LAS OPCIONES.. entra a ese caso
        // Tiene una ejecucion en cascada hasta que encuentre el primer break, ejecucion en cascada, si no tiene break se sigue

        switch (calificacion){
            case 10: //los : porque todavia no se termina el caso
                System.out.println("Excelente!!");
                break;
            case 9:
                System.out.println("Muy Bien!!");
                break;
            case 8:
                System.out.println("Bien!!");
                break;
            case 7:
                System.out.println("Bien!!");
                break;
            case 6:
                System.out.println("Pasaste!!");
                break;
            case 5:
                System.out.println("Vuelve a intentarlo!!");
                break;
            default:
                System.out.println("No es una calificación válida"); // deafult NO ENTRA A UNA DE LAS OPCIONES.. entra a ese caso


        }
    }
}
