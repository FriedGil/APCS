
public class PointTester {
    public static void main(String[] args) {
      System.out.print("Constructing a Point called p1 using no-arges constructor...");
      Point p1 = new Point();
      System.out.println("PASSED");
      System.out.println();
      
      System.out.print("Constructing a Point called p2 using parameterized constructor...");
      Point p2 = new Point(-3,-4);
      System.out.println("PASSED");
      System.out.println();
      
        
      System.out.print("Checking p1 instance variables...");
      if(p1.getxCoor()==0 && p1.getyCoor()==0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 0, y = 0");
        System.out.println("Your answer: x = " + p1.getxCoor() + ", y = " + p1.getyCoor());
      }
      System.out.println();
      
      System.out.print("Checking p2 instance variables...");
      if(p2.getxCoor()==-3 && p2.getyCoor()==-4){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = -3, y = -4");
        System.out.println("Your answer: x = " + p2.getxCoor() + ", y = " + p2.getyCoor());
  
      }
      System.out.println();
      
         
      System.out.print("Checking setxCoor and setyCoor method...");
      p1.setxCoor(1);
      p1.setyCoor(2);
      if(p1.getxCoor()==1 && p1.getyCoor()==2){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 1, y = 2");
        System.out.println("Your answer: x = " + p1.getxCoor() + ", y = " + p1.getyCoor());
      }
      System.out.println();
      
      System.out.print("Checking setCoor method...");
      p1.setCoor(3,4);
      if(p1.getxCoor()==3 && p1.getyCoor()==4){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 3, y = 4");
        System.out.println("Your answer: x = " + p1.getxCoor() + ", y = " + p1.getyCoor());
      }
      System.out.println();
      
      System.out.print("Checking goHome method...");
      p1.goHome();
      if(p1.getxCoor()==0 && p1.getyCoor()==0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 0, y = 0");
        System.out.println("Your answer: x = " + p1.getxCoor() + ", y = " + p1.getyCoor());
      }
      System.out.println();
  
      System.out.print("Checking move method...");
      p2.move(3,4);
      if(p2.getxCoor()==0 && p2.getyCoor()==0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 0, y = 0");
        System.out.println("Your answer: x = " + p2.getxCoor() + ", y = " + p2.getyCoor());
      }
      System.out.println();
  
      System.out.print("Checking distance method...");
      Point p3 = new Point(1,2);
      Point p4 = new Point(4,6);
      if(p3.distance(p4)==5){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: distance = 5");
        System.out.println("Your answer: distance = " + p3.distance(p4));
      }
      System.out.println();
  
      System.out.print("Checking toString method...");
      if(p3.toString().equals("(1,2)")){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expected output: (1,2)");
        System.out.println("Your output: " + p3);
      }
      System.out.println();
  
      System.out.print("Checking equals method...");
      if(p3.equals(new Point(1,2)) && !p4.equals(new Point(1,2))){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
      }
      System.out.println();
  
      System.out.println("END of TEST");
    }
}