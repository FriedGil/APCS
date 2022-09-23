public class Enums {
    public static void main(String[] args) {
        Level myLevel = Level.LOW;
        System.out.println(myLevel);
        double i = 1.1;
        long l = 200;
        l = i;
    }
}
enum Level {
    LOW,
    MEDIUM,
    HIGH
  }