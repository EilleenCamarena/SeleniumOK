public class Ejemplo01 {
    public static void main(String[] args) {//se puede ejecutar sin necesidad de instancias de la clase Ejemplo01
        //los metodos static sin la necesidad de crear una instancia
        //los metodos static si no se necesita una instancia para acceder a el
        System.out.println(Contador.getCuentaClases());

        //generar una instancia para acceder al metodo
        Contador c1 = new Contador();
        System.out.println(c1.getCuentaInstancias());

        //todas las instancias de una clase comparten la referencia al atributo static

        Contador c2 = new Contador();
        System.out.println(c2.getCuentaInstancias());

        System.out.println(c1.getCuentaClases());
        System.out.println(c2.getCuentaClases());

        Contador c3 = new Contador("Beto");
        Contador c4 = new Contador("Lola");

        System.out.println(c3.getNombre());
        System.out.println(c3.getCuentaClases());
        System.out.println(c4.getNombre());
        System.out.println(c4.getCuentaClases());


    }
}
