public class Estudiante extends Persona{
    String matricula;
    public Estudiante(String n, String a, String m){
        super(n,a);
        matricula = m;
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Matricula: " +matricula);
    }
}
