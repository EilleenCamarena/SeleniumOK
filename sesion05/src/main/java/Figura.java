public class Figura {
    //Herencia trae la informacion de la clase Madre a Hija--> Clase Madre Figura-Clase Hija Triangulo
    public int base;
    public int altura;

    public Figura(int b, int a){
        base = b;
        altura = a;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
}
