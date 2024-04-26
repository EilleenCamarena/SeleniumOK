public class Ejemplo01 {
    public static void main(String[] args) { //Polimorfismo sobre objetos
        Venado bambi = new Venado(); //al mismo objeto se ven como 4 formas diferentes, de la clase Venado, Herbivoro, Animal, Object
        Herbivoro h = bambi; //Polimorfismo cuando hay relacion de herencia se permite
        Animal a = bambi; //Polimorfismo es ver q un elemento es visto de diferentes formas
        Object o = bambi;

        System.out.println("Venado: " +(bambi instanceof Venado));//instanceof es para revisar si es instancia True/False
        System.out.println("Herbivoro: "+(bambi instanceof Herbivoro));
        System.out.println("Animal: "+(bambi instanceof Animal));
        System.out.println("Objeto: "+(bambi instanceof Object));
        // System.out.println("Cadena: "+(bambi instanceof String));
    }
}
