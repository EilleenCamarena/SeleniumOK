public class Equipo{ //PARA SABER A QUE CONSTRUCTOR SE REFIERE ES POR EL TIPO DE DATO o EL NUMERO DE ATRIBUTOS QUE SE VAN A USAR
    //Sobrecargo de Operaciones-->Utilizar el mismo nombre del Metodo con dos funcionalidades diferentes
    public String nombre;
    public String ciudad;
    public int puntos;

    //CONSTRUCTOR
    public Equipo(String n){
        nombre = n ;
    }
    //CONSTRUCTOR CON MISMA INFORMACION
    public Equipo(String n, String c, int p){
        nombre = n;
        ciudad = c;
        puntos  = p;
    }
    //CONSTRUCTOR CON MISMA INFORMACION2
    public Equipo(String n, int p){
        nombre = n;
        puntos = p;
    }
    //SOBRECARGO DE OPERACIONES TAMBIEN OCURRE EN LOS METODOS, POR LA CANTIDAD DE PARAMETROS O EL TIPO DE VARIABLE
    public void actualiza(String n){
        nombre = n;
    }
    public void actualiza(String n, String c){
        nombre = n;
        ciudad = c;
    }
    public void actualiza(int p){//el diferenciador siempre se debe de encontrar en los parametros
        puntos = p;
    }
}
