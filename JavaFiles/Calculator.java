import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an expression: ");
        String query = scan.nextLine();
        if (query.indexOf("+") >= 0){
            int n = query.indexOf("+");
            double num1 = Double.parseDouble(query.substring(0,n));
            double num2 = Double.parseDouble(query.substring(n+1,query.length()));
            System.out.println(num1+num2);
        }
        else if (query.indexOf("-") >= 0){
            int n = query.indexOf("-");
            double num1 = Double.parseDouble(query.substring(0,n));
            double num2 = Double.parseDouble(query.substring(n+1,query.length()));
            System.out.println(num1-num2);
        }
        else if (query.indexOf("*") >= 0){
            int n = query.indexOf("*");
            double num1 = Double.parseDouble(query.substring(0,n));
            double num2 = Double.parseDouble(query.substring(n+1,query.length()));
            System.out.println(num1*num2);    
        }
        else if (query.indexOf("/") >= 0){
            int n = query.indexOf("/");
            double num1 = Double.parseDouble(query.substring(0,n));
            double num2 = Double.parseDouble(query.substring(n+1,query.length()));
            System.out.println(num1/num2);
        }

    }
    public String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);
        if (isWeekend){
          if (vacation) {
            return "off";
          } 
          else {(return "10:00";)}
        }
        else {
          if (vacation) {return "10:00";} 
          else {(return "7:00";)}
        }
        
      }
      
}