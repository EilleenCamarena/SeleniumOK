public class Persona { //Polimorfismo en metodos, reescribir el metodo para una clase diferente
    String nombre;
    String apellido;

    public Persona(String n, String a) {
        nombre = n;
        apellido = a;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
