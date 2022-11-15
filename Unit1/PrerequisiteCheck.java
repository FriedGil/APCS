import java.util.Scanner;
public class PrerequisiteCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a course:");
        String course = scan.nextLine();
        System.out.println("Prerequisites are: ");

        switch (course)
        {
            case "AP Computer Science": 
                System.out.println("Algebra 2");

            case "Algebra 2": 
             System.out.println("Geometry");

            case "Geometry": 
                System.out.println("Algebra 1");
                break;

            case "Algebra 1": 
                System.out.println("No Prerequsite");
                break;

            default:
                System.out.println("Course not listed");
                break;
        }
        scan.close();
    }
}
