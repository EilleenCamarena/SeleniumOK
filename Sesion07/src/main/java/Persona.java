public class Persona implements Comparable<Persona>{
    String nombre;
    String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    @Override
    public String toString(){
        return nombre +": " +telefono;
    }
    @Override
    public int compareTo(Persona o) {return nombre.compareTo(o.nombre);}
}
