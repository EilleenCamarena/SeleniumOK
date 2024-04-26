public class Auto {
        //Atributos
        String marca;
        int anio;

        //Métodos Constructores
    //Constructor es un metodo pero dice como se crean  los objetos de la clase-- como hacerle para construir un auto
    //El constructor debe ser el mismo nombnre de la clase, es mas especifico en sus atributos
        public Auto(String m, int a) {
            marca  = m; //almacenar en los atributos la marca
            anio = a; //almacenar en los atributos el anio

        }
        //Sobre Escritura
        @Override
        public String toString(){//manda a llamar el metodo solo cambia el comportamiento del metodo
            String cadena =
                    "Es un auto de la marca: " + marca + "y del año:" +anio;
            return cadena;

        }

}
