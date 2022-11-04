//testing class built by Huo Chen; Last Update 10/31/2022

public class CircleTester {
    public static void main(String[] args) {
      System.out.print("Constructing a Circle called c1 using no-arges constructor...");
      Circle c1 = new Circle();
      System.out.println("PASSED");
      System.out.println();
      
      System.out.print("Constructing a Circle called c2 using parameterized constructor...");
      Circle c2 = new Circle(-2,5,3);
      System.out.println("PASSED");
      System.out.println();
      
        
      System.out.print("Checking c1 instance variables...");
      if(c1.getX()==0 && c1.getY()==0 && c1.getRadius()==1.0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 0, y = 0, radius = 1.0");
        System.out.println("Your answer: x = " + c1.getX() + ", y = " + c1.getY() +  ", radius = " + c1.getRadius());
      }
      System.out.println();
      
      System.out.print("Checking c2 instance variables...");
      if(c2.getX()==-2 && c2.getY()==5 && c2.getRadius()==3.0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = -2, y = 5, radius = 3.0");
        System.out.println("Your answer: x = " + c2.getX() + ", y = " + c2.getY() +  ", radius = " + c2.getRadius());
      }
      System.out.println();
      
         
      System.out.print("Checking setX and setY method...");
      c1.setX(1);
      c1.setY(2);
      if(c1.getX()==1 && c1.getY()==2){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 1, y = 2");
        System.out.println("Your answer: x = " + c1.getX() + ", y = " + c1.getY());
      }
      System.out.println();
      
      System.out.print("Checking setCenter method...");
      c1.setCenter(3,4);
      if(c1.getX()==3 && c1.getY()==4){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 3, y = 4");
        System.out.println("Your answer: x = " + c1.getX() + ", y = " + c1.getY());
      }
      System.out.println();
      
      System.out.print("Checking setRadius method...");
      c1.setRadius(2);
      if(c1.getRadius()==2){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: r = 0");
        System.out.println("Your answer: r = " + c1.getRadius());
      }
      System.out.println();
  
      System.out.print("Checking getCircumference method...");
      if(c2.getCircumference()==18.85){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: C = 18.85");
        System.out.println("Your answer: C = " + c2.getCircumference());
      }
      System.out.println();
  
      System.out.print("Checking getArea method...");
      if(c2.getArea()==28.27){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: C = 28.27");
        System.out.println("Your answer: C = " + c2.getArea());
      }
      System.out.println();
  
      System.out.print("Checking toString method...");
      if(c2.toString().equals("Circle:Center=(-2,5);Radius=3.0")){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expected output: Circle:Center=(-2,5);Radius=3.0");
        System.out.println("Your output: " + c2);
      }
      System.out.println();
  
      System.out.print("Checking equals method...");
      if(c2.equals(new Circle(-2,5,3)) && !c2.equals(new Circle(1,2,6))){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
      }
      System.out.println();
  
      System.out.print("Checking compareTo method...");
      if(c2.compareTo(new Circle(-2,5,3))== 0 && c2.compareTo(new Circle(6,8,1)) > 0 && c2.compareTo(new Circle(0,0,5)) < 0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
      }
      System.out.println();
  
      System.out.println("END of TEST");
    }
  }
  
  