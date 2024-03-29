package Unit5.HuggingBearLab;

//testing class built by Huo Chen; Last Update 2/13/2023
//This testing class include the Comparable interface 

public class BearHugTester
{
 public static void main(String[] args)
 {
  System.out.print("MommyBears...");
  MommyBear m1 = new MommyBear();
  MommyBear m2 = new MommyBear();
  System.out.println("PASSED");
  System.out.println();
    
  System.out.print("DaddyBear ...");
  DaddyBear d1 = new DaddyBear();
  System.out.println("PASSED");
  System.out.println();
  
  System.out.print("BabyBear ...");
  BabyBear b1 = new BabyBear();
  System.out.println("PASSED");
  System.out.println();
  
  System.out.print("Checking static getBearCount methods...");
  if(Bear.getBearCount()==4){
    System.out.println("PASSED");
  }else{
    System.out.println("FAILED!");
  }
  System.out.println();
  
  System.out.print("Checking static CheckGroup methods...");
  if(Bear.CheckGroup(b1,m1,d1) && Bear.CheckGroup(m1,b1,d1) && !Bear.CheckGroup(b1,m1,m2)){
    System.out.println("PASSED");
  }else{
    System.out.println("FAILED!");
  }
  System.out.println();
  
  System.out.print("Checking getType() methods...");
  if(m1.getType()=="Mommy Bear" && d1.getType()=="Daddy Bear" && b1.getType()=="Baby Bear"){
    System.out.println("PASSED");
  }else{
    System.out.println("FAILED!");
  }
  System.out.println();
  
  System.out.print("Checking ShowLove() methods...");
  if(b1.showLove(m1).equals("Baby Bear loves Mommy Bear") && d1.showLove(m1).equals("Daddy Bear loves Mommy Bear") && m1.showLove(b1).equals("Mommy Bear loves Baby Bear")){
    System.out.println("PASSED");
  }else{
    System.out.println("FAILED!");
  }
  System.out.println();
 
  System.out.println("Mommy Bear hugs Daddy Bear...");
  m1.hug(d1);
  System.out.println("Mommy Bear hugs Baby Bear...");
  m1.hug(b1);
  System.out.println("Daddy Bear hugs Baby Bear...");
  d1.hug(b1);
  System.out.println("Daddy Bear hugs Mommy Bear...");
  d1.hug(m1);
  
  System.out.println();
  System.out.print("Checking getHugCount() methods...");
  if(m1.getHugCount()==3 && d1.getHugCount()==3 && b1.getHugCount()== 2)
  {
    System.out.println("Pass!");
  }
  else
  {
    System.out.println("Correct Answer: Mommy Bear should have 3 hugs");
    System.out.println("Your Answer: " + m1);
    System.out.println("Correct Answer: Daddy Bear should have 3 hugs");
    System.out.println("Your Answer: " + d1);
    System.out.println("Correct Answer: Baby Bear should have 2 hugs");
    System.out.println("Your Answer: " + b1);
  }

  System.out.println();
  System.out.print("Checking getTotalHugCount() methods...");
  if(Bear.getTotalHugCount() == 4)
  {
    System.out.println("Pass!");
  }
  else
  {
    System.out.println("Correct Answer: In total there should be 4 hugs");
    System.out.println("Your Answer: " + Bear.getTotalHugCount());
  }
  
  System.out.print("Checking equals() methods...");
  if(m1.equals(m2) && !m1.equals(d1) && !m1.equals(b1)){
    System.out.println("PASSED");
  }else{
    System.out.println("FAILED!");
  }

  System.out.print("Checking compareTo() methods...");
  if(m1.compareTo(d1)==0 && m1.compareTo(b1)>0 && d1.compareTo(b1)>0 && b1.compareTo(m1)<0){
    System.out.println("PASSED");
  }else{
    System.out.println("FAILED!");
  }

  System.out.println();
  System.out.println("End Testing");
 }
}

