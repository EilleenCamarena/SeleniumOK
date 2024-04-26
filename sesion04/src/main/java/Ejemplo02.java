public class Ejemplo02 {
    public static void main(String[] args) {
        Auto f = new Auto("Ford", 1997);// se crean automaticamente las etiquetas de los atributos definidos en el constructor Auto
        Auto b = new Auto("Bugatti", 2010);

        System.out.println(f.toString());//el metodo toString genera en forma de cadena
        System.out.println(b.toString());//java incluye metodos por default en todas las clases

        //toString; equals (comparar); hash (cifrar la informacion)

        //Sobre escritura de metodos--permite cambiar la forma de un metodo, es decir dobre escribir un metodo, cambiar la forma en que funcionaba
    }
}
