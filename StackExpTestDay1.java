import java.util.Stack;

import java.lang.IllegalStateException;


public class StackExpTestDay1
{
  public static double evalPostfix(String exp)
  {
    Stack<String> s = new Stack<String>();
    String token;
    double operand1, operand2;
    for(int i =0; i < exp.length(); i++)
    {
      token = exp.substring(i,i+1);
      if (token.equals("!")) s.push( "" + Double.parseDouble(s.pop()));
      if(token.equals("+") || token.equals("-") ||token.equals("*") || token.equals("/") || token.equals("^"))
      {
        operand2 = Double.parseDouble(s.pop());
        operand1 = Double.parseDouble(s.pop());
        if(token.equals("+"))
        {
          s.push(operand1 + operand2 + "");
        }
        else if(token.equals("-"))
        {
          s.push(operand1 - operand2 + "");
        }
        else if(token.equals("*"))
        {
          s.push(operand1 * operand2 + "");
        }
        else if(token.equals("/"))
        {
          s.push(operand1 / operand2 + "");
        }
        else if (token.equals("^")) s.push(Math.pow(operand1, operand2))
      }
      else
      {
        s.push(token);
      }
    }
    return Double.parseDouble(s.peek());
  }
  
}

  public static double factorial(double n){
        if (n >= 1)
        return n * factorial(n - 1);
    else
        return 1;
  }
	
  public static void main(String[] args)
  {
    double answer, yourAns;
    String exp;
		int c=0, w=0;
    
    exp = "256++";
    System.out.println("Testing Post-fix Single Digit Operation");
    System.out.println("Operations tested: +,-,*,/,%,^,!");
    System.out.println("Testing 2+5+6");
    System.out.print("Postfix equivalent " + exp + "...");
    answer = 13;
    yourAns = evalAns(exp);
    if(yourAns==answer){
      System.out.println("Pass");
			c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
			w++;
    }
    
    System.out.println();
    exp = "256*+9-";
    System.out.println("Testing 2+5*6-9");
    System.out.print("Postfix equivalent " + exp + "...");
    answer = 23;
    yourAns = evalAns(exp);
    if(yourAns==answer){
      System.out.println("Pass");
			c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
			w++;
    }
    
    System.out.println();
    exp = "111+3^+2/";
    System.out.println("Testing (1+(1+1)^3)/2");
    System.out.print("Postfix equivalent " + exp + "...");
    answer = 4.5;
    yourAns = evalAns(exp);
    if(yourAns==answer){
      System.out.println("Pass");
			c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
			w++;
    }

		System.out.println();
    exp = "12+3*23+%";
    System.out.println("Testing (1+2)*3%(2+3)");
    System.out.print("Postfix equivalent " + exp + "...");
    answer = 4;
    yourAns = evalAns(exp);
    if(yourAns==answer){
      System.out.println("Pass");
			c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
			w++;
    }

		System.out.println();
    exp = "473%-!";
    System.out.println("Testing (4-7%3)!");
    System.out.print("Postfix equivalent " + exp + "...");
    answer = 6;
    yourAns = evalAns(exp);
    if(yourAns==answer){
      System.out.println("Pass");
			c++;
    }else{
      System.out.println("Failed... Your answer: " + yourAns + "; Correct answer: " + answer);
			w++;
    }

		System.out.println();
		System.out.println("Number of correct answer: " + c);
		System.out.println("Number of incorrect answer: " + w);
		System.out.println("Accuracy: " + Math.round((double)c/(c+w)*100)/100 + "%");
  }
}


