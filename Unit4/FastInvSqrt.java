package Unit4;

public class FastInvSqrt {
    public static void main(String[] args) {
        System.out.println(invSqrt(1));
    }
    public static double invSqrt(double x) {
        double xhalf = 0.5 * x;
        long i = Double.doubleToLongBits(x);
        i = 0x5fe6ec85e7de30daL - (i >> 1);
        x = Double.longBitsToDouble(i);
        x *= (1.5d - xhalf * x * x);
        // x *= (1.5d - xhalf * x * x); do more times for efficiency
        return x;
    }
}