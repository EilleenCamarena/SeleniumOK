public class Ejemplo01 {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        //a1.setCurso("Java");
        a1.setCurso("Python");//este va a ser el ultimo valor porque siempre se va a modificar set
        System.out.println(a1.getCurso());

        Alumno a2 = new Alumno();
        System.out.println(a2.getCurso());
    }
}
