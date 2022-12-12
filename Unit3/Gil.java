import java.util.Random;


public class Gil {
    public static void print(Object x){
        System.out.println(x);
    }
    public static int randint(int f, int c){
        Random rand = new Random();
        return  rand.nextInt(0,5);
    }

    public int altRandInt(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
}
