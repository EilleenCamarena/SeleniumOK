public class Rectangulo extends Figura{//SIEMPRE ES SOLO UNA CLASE MADRE

    public Rectangulo(int b, int a){
        //Super es para mandar a llamar el constructor de la clase MADRE (FIGURA)
        super(b,a);
    }
    public int area(){
        return this.getBase() * this.getAltura();
    } //this para una clase en especifico
}
