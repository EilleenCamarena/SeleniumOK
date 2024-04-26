public class Contador {
    public static short cuentaClases;
    public short cuentaInstancias;
    public String nombre;

    //constructor
    public Contador(){
        cuentaInstancias++;
        cuentaClases++;
    }
    public Contador(String n){
        nombre = n;
    }

    //si se declara un atributo static tambien se genera un metodo getter static
    public static short getCuentaClases() {
        return cuentaClases;
    }

    public short getCuentaInstancias() {
        return cuentaInstancias;
    }

    public String getNombre() {
        return nombre;
    }
}
