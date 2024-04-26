public class Analizador { //REVISAR LAS VOCALES DE UN ARREGLO
    // SON ATRIBUTOS: lo que necesita la clase, solo le damos una definicion, queda abstracto
    int vocales;
    int numeros;
        // METODOS: definir funcionalidades
    //Metodo para ver si es o no boolean con true y false
    public boolean isVocal(char c){
        return (c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u'); //regresar como resultado lo que viene anted de que termine mi metodo <dice si es o no vocal>
    }
    public boolean isNumero(char c){
        short ascii = (short) c;
        return ascii >= 48 && ascii <= 57; //revisa el rango del 1 al 9 en el codigo ascii 48 al 57

    }

    public int cuentVocales (String s){
        for (char c : s.toLowerCase().toCharArray()){ //revisar el caracter y convertirlos a vocales y convierte a un arreglo (como el Reto01)
            if(isVocal(c)){
                vocales++;
            }
        }
        return vocales;
    }
    public int cuentaNumeros (String s) {
        for (char c : s.toLowerCase().toCharArray()) {
            if (isNumero(c)) {
                numeros++;
            }
        }
        return numeros;
    }
}
