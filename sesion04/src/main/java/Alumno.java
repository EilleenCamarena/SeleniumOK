public class Alumno {
    //Las clases tiene Atributos
    //Atributos
    String curso;
    int sesion;
    String objetivo;

    //Bloque de inicializacion--bloque de codigo que se ejecuta en el momento en que instancia un objeto--se ejecuta el bloque dependiendo del numero de instancias de objetos que se agreguen
    //se usa para dar valores a los atributos, los valores por defecto, se crea en automatico cuando se crea un nuevo objeto
    {
        curso = "Java";
        System.out.println("Esta vivo!!!");
    }

    //Metodos
    //Getters-obtener cierta informacion--todos los atributos que se usan necesitan la palabra get--SON DE CONSULTA
    //public, el tipo de valor que tiene declarado el atributo, el get del atributo y en el parentesis dice lo que esperamos recibir
    //definir getter con ctrl+N o click derecho, generate, getter y seleccionar el getter que queremos
    public String getCurso(){
        return curso;
    }
    public int getSesion(){
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }
    //Setters-Modificacion, permite modificar nuestro atributo, no trae nada de regreso ya que solo se modifica
    //en el parentesis va lo que se va asignar o la nueva modificacion del atributo
    public void setCurso(String nuevoCurso){
        curso = nuevoCurso; //curso ahora va a tomar el valor de nuevoCurso (el valor modificado)--CAMBIAR EL VALOR DE UNA VARIABLE
    }

    public void setSesion(int sesion) {
        this.sesion = sesion;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
