import java.lang.reflect.Array;
import java.util.List;

public class Random {
    public static void main(String[] args)   
    {  
        System.out.println(distance(0,0,1,4));
    }

    public static int randint(int b1, int b2){
        return (int) (Math.random()*(b2-b1+1)) + b1;

    }
    public static <T> T[] shuffle(T[] inarr) {
        return inarr;
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(
            (Math.pow(x2 - x1,2) + Math.pow(y2-y1, 2))
            );
    }



}
