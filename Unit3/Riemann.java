import java.util.Random;

public class Riemann {
    public static void main(String[] args){
        System.out.println(new Random().nextInt(0,5));
    }

    
    public static double xSquareArea(double x1,double x2, int numBoxes)
    {
        double boxWidth = (x2-x1)/numBoxes;
        double sumArea = 0;
        for (double loc = x1; loc < x2; loc += boxWidth){
            sumArea += (boxWidth * loc * loc);
        }
    return sumArea;
    }

    public static double sinArea(double x1,double x2, int numBoxes)
    {
        double boxWidth = (x2-x1)/numBoxes;
        double sumArea = 0;
        for (double loc = x1; loc < x2; loc += boxWidth){
            sumArea += (boxWidth * Math.sin(loc));
        }
    return sumArea;
    }



}

