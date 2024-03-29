package Unit4.FractionLab;

//testing class built by Huo Chen; Last Update 1/13/2023
public class FracTester
{
  public static void main(String[] args)
  {
    System.out.print("*** Checking Fraction Class ***");
    System.out.print("Checking no-arges constructor...");
    Fraction f1 = new Fraction();
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Checking parameterized constructor...");
    Fraction f2 = new Fraction(2,5);
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Checking instance variables...");
    if(f1.getNum()==0 && f1.getDen()==1 && f2.getNum()==2 && f2.getDen()==5){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    

    
    System.out.print("Checking getReciprocal() method...");
    if(f2.getReciprocal().getNum() == 5 && f2.getReciprocal().getDen() == 2)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.print("Checking setValue() method...");
    f1.setValue(2,5);
    if(f1.getNum() == 2 && f1.getDen() == 5)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();   


System.out.print("Checking getValue() method...");
    if(Math.round((new Fraction(2,5)).getValue()*100) == 40 && Math.round((new Fraction(-5,2)).getValue()*100) == -250)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    
    System.out.print("Checking reciprocal() method...");
    Fraction temp = new Fraction(3,5);
    temp.reciprocal();
    if(temp.getNum() == 5 && temp.getDen() == 3)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.print("Checking multiply() method...");
    temp = new Fraction(3,5);
    temp.multiply(new Fraction(6,4));
    if(temp.equals(new Fraction(18,20)))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    temp = new Fraction(3,5);
    temp.divide(new Fraction(6,4));
    System.out.print("Checking divide() method...");
    if(temp.equals(new Fraction(12,30)))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    temp = new Fraction(3,5);
    temp.add(new Fraction(6,4));
    
    Fraction temp1 = new Fraction(3,5);
    temp1.add(new Fraction(6,4));
    System.out.print("Checking add() method...");
    if(temp.equals(new Fraction(42,20)) || temp1.equals(new Fraction(21,10)))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    temp = new Fraction(3,5);
    temp.subtract(new Fraction(6,4));
    
    temp1 = new Fraction(3,5);
    temp1.subtract(new Fraction(6,4));
    System.out.print("Checking subtract() method...");
    if(temp.equals(new Fraction(-18,20)) || temp1.equals(new Fraction(-9,10)))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking simplify() method...");
    Fraction fsim = new Fraction(8,-10);
    fsim.simplify();
    Fraction fsim1 = new Fraction(-10,5);
    fsim1.simplify();
    if(fsim.getNum() == -4 && fsim.getDen() == 5 && fsim1.getNum() == -2 && fsim1.getDen() == 1)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.print("Checking equals() method...");
    if(f1.equals(f2) && !f2.equals(new Fraction(3,5)))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    Fraction ff1 = new Fraction(1,5);
    Fraction ff2 = new Fraction(-3,-15);
    Fraction ff3 = new Fraction(3,4);
    System.out.print("Checking compareTo() method...");
    if(ff1.compareTo(ff2) == 0 && ff1.compareTo(ff3) < 0 && ff3.compareTo(ff2) > 0)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    
    System.out.println("Checking toString() method...");
    if(fsim.toString().equals("-4/5") && (new Fraction(-5,1).toString().equals("-5/1")))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.println();
    System.out.print("*** Checking WholeNum Class ***");
    
    System.out.print("Checking no-arges constructor...");
    WholeNum w1 = new WholeNum();
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Checking parameterized constructor...");
    WholeNum w2 = new WholeNum(5);
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Checking Hierachy...");
    Fraction w3 = new WholeNum();
    System.out.println("PASSED");
    System.out.println();
    
    System.out.print("Checking instance variables...");
    if(w1.getNum()==0 && w1.getDen()==1 && w2.getNum()==5 && w2.getDen()==1){
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.print("Checking setValue() method...");
    w1.setValue(3);
    if(w1.getNum() == 3 && w1.getDen() == 1)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.print("Checking toFrac() method...");
    Fraction f4 = w1.toFrac();
    if(f4.getNum() == 3 && f4.getDen() == 1)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    
    System.out.println("Checking toString() method...");
    if(w1.toString().equals("3"))
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    System.out.println("Checking getValue() method...");
    if(w1.getValue()==3)
    {
      System.out.println("PASSED");
    }else{
      System.out.println("FAILED!!!");
    }
    System.out.println();
    
    
    System.out.println("END of TEST");
  }
}


