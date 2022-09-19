public class SimpleCalculation {
    public static void main(String[] args) {
        final double PI = 3.14;
        double x = 13;
        System.out.println("x = " + x);
        x = x % 5;
        System.out.println("x = " + x);
        x /= 3;
        System.out.println("x = " + x);
        x += 5;
        System.out.println("x = " + x);
        x++;
        System.out.println("x = " + x);
        x = x - PI;
        System.out.println("x = " + x);
    }
}
