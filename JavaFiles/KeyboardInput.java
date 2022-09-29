import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        averageGrades();

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
        int gradeSum = 0;
        for (String subject:subjects) {
            System.out.println("Please enter your " + subject + " grade:");
            gradeSum += scan.nextInt();
        }
        double average = ( (double) gradeSum / subjects.length);
        System.out.println("Your average is " + average);
    }
}
