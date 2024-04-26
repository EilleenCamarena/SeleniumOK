public class Reto01 {
    public static void main(String[] args) {
        byte max = 127;
        byte pos = 50; //en forma de byte es -byte por el desbordamiento... entonces suma 49

        max+=pos; // equivalente a max = max + pos
        max+=1; //desbordamiento de valores, como una forma circular.. desdpues del 127, el byte que sigue es -128
        System.out.println(max);
    }
}
