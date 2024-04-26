public class Ejemplo3 {
    public static void main(String[] args) {
        int w = 2;
        //SECUENCIA WHILE, decide si se sigue ejecutando la condicion del while o no
        //variable de las repeticiones, condicion detener o no, cuerpo del while y modificacion de la variable para ver cuando se cumple y se detenga en algun momento
        //NO ESTAN CLARAS LAS REPETICIONES <RECIBIR DATOS INFINITOS Y NO SE SABE CUANDO TERMINA><PUEDEN SER STRINGS>
        while (w > 0){
            System.out.println("Hola");
            w--; //despues de ejecutar le resta 1, y asi garantiza que se detenga al llegar a 0
        }
        //SECUENCIA FOR, esta todo dentro del FOR como el while
        //variable de las repeticiones, condicion detener o no, cuerpo del while y modificacion de la variable para ver cuando se cumple y se detenga en algun momento
        // ESTAN CLARAS LAS REPETICIONES <ARREGLO Y ELEMENTOS><NUMERICO>

        for (int f = 2; f > 0; f--) {
            System.out.println("Adios");
        }

        //DO WHILE- ES IGUAL QUE EL WHILE-GARANTIZA QUE AL MENOS SE EJECUTA UNA VEZ
        //La diferencia, es el orden de la ejecucion:
        //While checa primero la condicion
        //Do While primero ejecuta y luego checa la condicion
        int d = 2;
        do {
            System.out.println("Hola");
            d--;
        } while (d > 0);
    }
}
