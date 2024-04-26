public class Profesor extends Persona{
    String clase;

    public Profesor(String n, String a, String c){
        super (n,a);//manda a llamar el constructor de la clase Madre
        clase = c;
    }
    public void mostrarDatos(){ //se sobreescribe para traer los datos de clase, ya que asi solo trae nombre y apellido
        super.mostrarDatos();//manda a llamar el metodo
        System.out.println("Clase: " +clase); //Imprimir el unico dato extra de Profesor (clase)

    }

}
