public class Reto02 {
    public static void main(String[] args) {
        int calificacion = 5;

        //ESTRUCTURA DE SECUENCIA IF
        if (calificacion == 10) {
            System.out.println("Excelente!!");
        } else if (calificacion == 9 || calificacion == 8) {
            System.out.println("Muy Bien!!");
        } else if (calificacion == 7){
                    System.out.println("Bien Hecho!!");
        } else if (calificacion == 6) {
            System.out.println("Pasaste!!");
        } else {
            System.out.println("Vuelve a Intentarlo");

        }
    }
}
