public class Libro implements Comparable<Libro>{ //Se pone Comparable y dentro d <> con que se va a comparar, asi solo se va a poder comparar, porque si no arroja un error
    String titulo;
    int paginas;

    //constructor
    public Libro (String t, int p){
        titulo = t;
        paginas = p;
    }

    //metodo
    public String getTitulo(){
        return titulo;
    }
    // -1 si el libro es menor a l
    // 0 si son iguales
    // 1 si el libro es mayor a l
    @Override
    public int compareTo(Libro l){//aqui con compareTo se especifica como se hace la comparacion
        if (paginas < l.paginas){
            return -1;
        }
        if (paginas > l.paginas){
            return 1;
        }
        return 0;

    }
}
