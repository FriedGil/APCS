//testing class built by Huo Chen; Last Update 11/3/2022

public class CylinderTester {
    public static void main(String[] args) {
      System.out.print("Constructing a Cylinder called c1 using no-arges constructor...");
      Cylinder c1 = new Cylinder();
      System.out.println("PASSED");
      System.out.println();
      
      System.out.print("Constructing a Cylinder called c2 using parameterized constructor...");
      Cylinder c2 = new Cylinder(-2,5,3.2,4.5);
      System.out.println("PASSED");
      System.out.println();
      
        
      System.out.print("Checking c1 instance variables...");
      if(c1.getX()==0 && c1.getY()==0 && c1.getRadius()==1.0 && c1.getHeight()==1.0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = 0, y = 0, radius = 1.0, height = 1.0");
        System.out.println("Your answer: x = " + c1.getX() + ", y = " + c1.getY() +  ", radius = " + c1.getRadius() + ", height = " + c1.getHeight());
      }
      System.out.println();
      
      System.out.print("Checking c2 instance variables...");
      if(c2.getX()==-2 && c2.getY()==5 && c2.getRadius()==3.2 && c2.getHeight()==4.5){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: x = -2, y = 5, radius = 3.2, height = 4.5");
        System.out.println("Your answer: x = " + c2.getX() + ", y = " + c2.getY() +  ", radius = " + c2.getRadius() + ", height = " + c2.getHeight());
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
        System.out.println("Expecting: r = 2.0");
        System.out.println("Your answer: r = " + c1.getRadius());
      }
      System.out.println();
  
      System.out.print("Checking setHeight method...");
      c1.setHeight(3.0);
      if(c1.getHeight()==3.0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: r = 3.0");
        System.out.println("Your answer: r = " + c1.getRadius());
      }
      System.out.println();
  
      System.out.print("Checking getVolume method...");
      Cylinder c3 = new Cylinder(3,6,4,5);
      if(c3.getVolume()==251.33){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expecting: C = 251.33");
        System.out.println("Your answer: C = " + c3.getVolume());
      }
      System.out.println();
  
      System.out.print("Checking toString method...");
      if(c3.toString().equals("Cylinder:Center=(3,6);Radius=4.0;height=5.0")){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
        System.out.println("Expected output: Cylinder:Center=(3,6);Radius=4.0;height=5.0");
        System.out.println("Your output: " + c3);
      }
      System.out.println();
  
      System.out.print("Checking equals method...");
      if(c3.equals(new Cylinder(3,6,4,5)) && !c3.equals(new Cylinder(-3,-6,4,5))){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
      }
      System.out.println();
  
      System.out.print("Checking compareTo method...");
      if(c3.compareTo(new Cylinder(8,6,4,5))== 0 && c3.compareTo(new Cylinder(0,0,3,8)) > 0 && c3.compareTo(new Cylinder(0,0,6,3)) < 0){
        System.out.println("PASSED");
      }else{
        System.out.println("FAILED!");
      }
      System.out.println();
  
      System.out.println("END of TEST");
    }
  }
  
  