import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        // msft();
        // plusCalculator();
        getFirstName();
    }

    static void plusCalculator(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your math problem");
    String query = scan.nextLine();
    int plus_location = query.indexOf("+");
    String first_arg = query.substring(0,plus_location);
    String second_arg = query.substring(plus_location+1);
    double num1 = Double.parseDouble(first_arg);
    double num2 = Double.parseDouble(second_arg);
    System.out.println(num1+num2);
    }

    static void msft(){
        String str = "Microsoft";
        int loc = str.indexOf("soft");
        String str1 = str.substring(loc);
        String str2 = str.substring(loc, str.length());
        System.out.println(str1 + ", " + str2);
    }

    static void getFirstName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        int loc = name.indexOf(" ");
        System.out.println("Hello " + name.substring(0, loc));


    }    
}
