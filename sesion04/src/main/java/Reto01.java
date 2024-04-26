public class Reto01 {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(2);
        Rectangulo r3 = new Rectangulo(3,2);

        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());

        System.out.println(r1.equals(r2));
    }
}
