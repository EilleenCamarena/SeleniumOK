public class Triangulo extends Figura{

    //Constructor
    public Triangulo(int b, int a){
        //llamar el constructor de la clase Madre(superClase/(FIGURA))--> se usa "Super"
        super(b,a);
    }
    public int area(){
        return (this.getBase() * this.getAltura()) / 2;//this-->hace referencia a base, hace referencia a un objeto ya creado
    }
}
