public class Rectangulo {
    //Atributos
    int alto;
    int ancho;

    //Constructores
    public Rectangulo() {
        alto = 0;
        ancho = 0;
    }

    public Rectangulo(int v) {
        alto = v;
        ancho = v;
    }

    public Rectangulo(int x, int y) {
        alto = x;
        ancho = y;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }
    public int area() {
        return alto * ancho;
    }
    public boolean equals(Rectangulo r){
        return(r.getAlto() == alto) && (r.getAncho() == ancho);
    }
}
