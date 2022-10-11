import java.util.Scanner;

public class MyMath {
    public static void main(String[] args)   
    {
        // int[] nums = {1,2,3,4,5};
        // int[] nums2 = shuffle(nums);
        // System.out.println(nums2);

    }

    public static int randInt(int b1, int b2){ 
        return (int) (Math.random()*(b2-b1+1)) + b1;

    }


    public static <T> T[] shuffle(T[] inarr) {
        int n = inarr.length;
        T[] outarr = (T[]) new Object[n];
        for (int i = 0; i<n-1; i++){
        }
        return inarr;
    }
    
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(
            (Math.pow(x2 - x1,2) + Math.pow(y2-y1, 2))
            );
    }

    private static void distanceTUI(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1");
        double d1 = scan.nextDouble();
        System.out.println("Enter y1");
        double d2 = scan.nextDouble();
        System.out.println("Enter x2");
        double d3 = scan.nextDouble();
        System.out.println("Enter y2");
        double d4 = scan.nextDouble();
        System.out.println(distance(d1,d2,d3,d4));
        scan.close();
    }

    public interface randInt {
    }
}
