public class Ejemplo02 {
    public static void main(String[] args) {
        Profesor p = new Profesor("Juan",
                "Lopez",
                "Matematicas");
        Estudiante e = new Estudiante("Maria",
                "Sanchez",
                "333B45");
        Persona x = new Persona("Jose",
                "Ruiz");
        p.mostrarDatos();
        e.mostrarDatos();
        x.mostrarDatos();
    }
}
