import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        // plusCalculator();
        extractDate();
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
    scan.close();
    }


    static void getFirstName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        int loc = name.indexOf(" ");
        System.out.println("Hello " + name.substring(0, loc));
        scan.close();
    }

    static void extractParantheses(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scan.nextLine();
        int loc1 = text.indexOf("(");
        int loc2 = text.indexOf(")");
        System.out.println(text.substring(loc1 + 1,loc2));
        scan.close();

    }

    static void extractDate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date: ");
        String date = scan.nextLine();

        int loc1 = date.indexOf("/");

        int loc2 = date.lastIndexOf("/");

        int month = Integer.parseInt(date.substring(0,loc1));
        int day = Integer.parseInt(date.substring(loc1+1,loc2));
        int year = Integer.parseInt(date.substring(loc2+1));

        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);




        scan.close();




        scan.close();
    }

}
