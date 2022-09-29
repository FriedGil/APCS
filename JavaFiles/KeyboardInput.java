import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        roundDouble();

    }
    static void getName() {
        Scanner scan = new Scanner(System.in);    
        System.out.println("Enter name");
        String name = scan.nextLine(); 
        System.out.println("Hello " + name);
    }
    static void averageGrades() {
        Scanner scan = new Scanner(System.in);
        String[] subjects = {"Math", "English", "Science"};
        double gradeSum = 0;
        for (String subject:subjects) {
            System.out.println("Please enter your " + subject + " grade:");
            gradeSum += scan.nextDouble();
        }
        double average = ( (double) gradeSum / subjects.length);
        System.out.println("Your average is " + average);
    }
    static void roundDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter double");
        double entered_num = scan.nextDouble();
        entered_num *= 100;
        int new_num = (int) entered_num + 5;
        new_num /= 10;
        double result = (double) new_num / 10;

        System.out.println(result);
        }
    }


