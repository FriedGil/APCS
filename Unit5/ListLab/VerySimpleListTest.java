package Unit5.ListLab;

//testing class built by Huo Chen; Last Update 2/14/2023
import java.util.Arrays;
 
public class VerySimpleListTest {
    public static void main(String[] args) {
      System.out.println("Test Starts...");
 
      System.out.println();
      System.out.print("Testing interface implementation...");
      FixedLengthList l1 = new VerySimpleList();
      System.out.println("Pass");
 
      System.out.println();
      System.out.print("Testing add and count method...");
      l1.add("A");
      l1.add("B");
      l1.add("C");
      if(l1.count()==3){
          System.out.println("Pass");
      }else{
          System.out.println("Failed");
          System.out.println("Expected count: 3");
          System.out.println("Your count: " + l1.count());
      }
 
      System.out.println();
      System.out.print("Testing getArray method...");
      String[] l2 = l1.getArray();
      if(l2[0].equals("A") && l2[1].equals("B") && l2[2].equals("C") && l2[3]==null && l2[4]==null && l2[5]==null && l2[6]==null && l2[7]==null && l2[8]==null && l2[9]==null){
          System.out.println("Pass");
      }else{
          System.out.println("Failed");
          System.out.println("Expected Array: [A, B, C, null, null, null, null, null, null, null]");
          System.out.println("Your Array: " + Arrays.toString(l2));
      }
 
      System.out.println();
      System.out.print("Testing insert method...");
      boolean tempB = l1.insert("BB",1);
      l2 = l1.getArray();
      if(l1.count()==4 && !l1.insert("BB",100) && !l1.insert("BB",-10) && tempB && l2[0].equals("A") && l2[1].equals("BB") && l2[2].equals("B") && l2[3].equals("C") && l2[4]==null && l2[5]==null && l2[6]==null && l2[7]==null && l2[8]==null && l2[9]==null){
          System.out.println("Pass");
      }else{
          System.out.println("Failed");
          System.out.println("Expected Array: [A, BB, B, C, null, null, null, null, null, null]");
          System.out.println("Your Array: " + Arrays.toString(l2));
          System.out.println("Expected count: 4");
          System.out.println("Your count: " + l1.count());
      }
 
      System.out.println();
      System.out.print("Testing remove method...");
      tempB = l1.remove(0);
      l2 = l1.getArray();
      if(l1.count()==3 && !l1.remove(5) && !l1.remove(11) && !l1.remove(-3) && tempB && l2[0].equals("BB") && l2[1].equals("B") && l2[2].equals("C") && l2[3]==null && l2[4]==null && l2[5]==null && l2[6]==null && l2[7]==null && l2[8]==null && l2[9]==null){
          System.out.println("Pass");
      }else{
          System.out.println("Failed");
          System.out.println("Expected Array: [BB, B, C, null, null, null, null, null, null, null]");
          System.out.println("Your Array: " + Arrays.toString(l2));
          System.out.println("Expected count: 3");
          System.out.println("Your count: " + l1.count());
      }
 
      System.out.println();
      System.out.print("Testing clear method...");
      l1.clear();
      l2 = l1.getArray();
      if(l1.count()==0 && l2[0]==null && l2[1]==null && l2[2]==null && l2[3]==null && l2[4]==null && l2[5]==null && l2[6]==null && l2[7]==null && l2[8]==null && l2[9]==null){
          System.out.println("Pass");
      }else{
          System.out.println("Failed");
          System.out.println("Expected Array: [null, null, null, null, null, null, null, null, null, null]");
          System.out.println("Your Array: " + Arrays.toString(l2));
          System.out.println("Expected count: 0");
          System.out.println("Your count: " + l1.count());
      }
 
      System.out.println("End of Test");
    }
}

