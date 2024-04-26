public class Ejemplo1 {
    public static void main(String[] args) {
        //tipos de dato
        //numericos ENTEROS (6), depende de la longitud con el que se quiere representar
        // definir tipo, valor o nombre a la variable, valor que tiene la variable

        //byte=-128->127
        byte valorByte = 1;
        //short representacion siguiente del byte -32768->32767
        short valorShort = 128;
        //int -> entero, representacion mas comun, numeros mas grandes
        int valorInt = 200;
        //long-> numeros mucho mas grandes, poco comunes por cifras muy grandes,
        //se agrega la L para diferenciar con los valores Long
        long valorLong = 300L;

        //numericos DECIMALES (2), la diferencia es la precision de los decimales

        //float es el menos comun y se pone un F para distinguir, es un numero que
        //tiene suficiente memoria para aceptar de 6 a 7 decimales
        float valorFloat = 1.5F;
        //double, mas precision y 15 decimales despues del decimal, es el que MAS se usa
        double valorDouble = 1.5324234;

        //valores de Verdad-> Verdadero y Falso ->Boolean
        boolean valorBoolean = true;
        boolean valorBooleano2 = false;

        //Caracteres
        //char SOLO 1 caracter
        char valorChar = 'a';

        System.out.println(valorLong + valorByte); //SIEMPRE va a empezar por el valor mas grande cuando
        //sean valores del mismo tipo

        System.out.println(valorDouble + valorFloat);

        System.out.println(valorInt + valorFloat);

        //CASTING
        //CASTING pasar de un tipo de valor a OTRO tipo de valor
        float intAFloat = (float) valorInt;
        System.out.println(intAFloat);
        //ESTRUCTURA DE CASTING->declaracion de variable
        //primero tipo de variable, nombre de variable, valor al que vas a convertir, valor original
        //tipo de variable [int]
        //nombre de variable [floatAint]
        //valor de variable [(int) valorFloat]
        int floatAint = (int) valorFloat;
        System.out.println(floatAint);

        int charAint = (int) valorChar;
        System.out.println(charAint);

        char intAchar = (char) valorInt;
        System.out.println(intAchar);
        System.out.println(valorChar + 1);

        int valorChar2 = valorChar++; //AUTOINCREMENTO x++ === x + 1
        System.out.println(valorChar2);



    }
}
