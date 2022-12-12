public class Review {
    public static void main(String[] args){
        plusStar(10,15);

    }
    public static void nested(int rows, int columns){
        for (int j = 1; j < rows+1; j++){
            for (int i = 1; i < columns+1; i++){
                System.out.print(i+(j*10) + " ");
            }
            System.out.println();
        }

    }
    public static void oSharp(int rows, int columns){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (j % 2 == 0 ^ i % 2 == 0) System.out.print("#");
                else System.out.print("O");
            }
            System.out.println();
        }
    }
    public static void count(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <3+i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    public static void multiTable(int n){
        for (int i = 1; i < n+1; i ++){
            for (int j = 1; j < n+1; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }

    public static void plusStar(int rows, int columns){
        for (int i = 1; i < rows+1; i++){
            for (int j = 0; j < columns; j++){
                if (i>j)System.out.print("+");
                else System.out.print("*"); 
            }
            System.out.println();
        }
    }

}
