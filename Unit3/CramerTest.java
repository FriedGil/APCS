//Built by Huo Chen 
//Last Update 12/12/2022

public class CramerTest {
    public static double[] solveLinearSystem(double[][] coffs, double[] ans)
    {
        [1,2,3]
        [2,3,4]
        [3,4,5]

        double x = 0;
        double y = 0;
        double z = 0;

        
    }

    public static double determinant(double[][] arrArr){
        double n1 = arrArr[0][0];
        double c1 = (arrArr[1][1] * n1 * arrArr[2][2] * n1) - (arrArr[1][2] * n1 - arrArr[2][1] * n1);
        double n2 = arrArr[0][1];
        double c2 = (arrArr[1][0] * n2 * arrArr[2][2] * n2) - (arrArr[1][2] * n2 - arrArr[2][0] * n2);
        double n3 = arrArr[0][2];
        double c3 = (arrArr[1][0] * n3 * arrArr[2][1] * n3) - (arrArr[1][2] * n3- arrArr[2][0] * n3);

 
        return c1 - c2 + c3;
    }
    
    public static void main(String args[]) 
    {
        double[] solution;
        double s1, s2, s3;
        
        System.out.println("Start Testing...");
        
        System.out.println();
        System.out.println("Test #1, Solving this system:");
        System.out.println("3x + 5y - z = 7");
        System.out.println("-2x + y + 5z = 8");
        System.out.println("7x - 3y + 2z = -3");
        
        double[][] matrix1 = {{3,5,-1},
            		       {-2,1,5},
             		       {7,-3,2}};
        double[] answer1 = {7,8,-3};
        
        solution = solveLinearSystem(matrix1,answer1);
        s1 = roundToFour(solution[0]);
        s2 = roundToFour(solution[1]);
        s3 = roundToFour(solution[2]);
        
        if(s1 == -0.0607 && s2 == 1.6842 && s3 == 1.2389){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting:\n x = " + -0.0607 + "\n y = " + 1.6842 + "\n z = " + 1.2389);
            System.out.println("Your Answer:\n x = " + solution[0] + "\n y = " + solution[1] + "\n z = " + solution[2]);
        }
        
        
        System.out.println();
        System.out.println("Test #2, Solving this system:");
        System.out.println("2x + 8z = 15");
        System.out.println("5y - 7z = -3");
        System.out.println("4x + 6y - 8z = 6");
        
        double[][] matrix2 = {{2,0,8},
             		        {0,5,-7},
                              {4,6,-8}};
        double[] answer2 = {15,-3,6};
        
        solution = solveLinearSystem(matrix2,answer2);
        s1 = roundToFour(solution[0]);
        s2 = roundToFour(solution[1]);
        s3 = roundToFour(solution[2]);
        
        if(s1 == 2.2692 && s2 == 1.2308 && s3 ==1.3077){
            System.out.println("Pass!");
        }else{
            System.out.println("Failed!");
            System.out.println("Expecting:\n x = " + 2.2692 + "\n y = " + 1.2308 + "\n z = " + 1.3077);
            System.out.println("Your Answer:\n x = " + solution[0] + "\n y = " + solution[1] + "\n z = " + solution[2]);
        }

    }
    
    public static double roundToFour(double x)
    {
        return Math.round(x*10000)/10000.0;
    }
}

