import java.util.Stack;


import java.util.HashMap;
public class MathExpEvalTest
{
  public static void main(String[] args)
  {
    double answer = evalPostfix(infix2Postfix("(1+2)*3+4*5"));
    System.out.println(answer);   //your answer should be 29
  }

  public static String infix2Postfix(String exp)
  {
    HashMap<String,Integer> priority = new HashMap<String,Integer>();
    Stack<String> s = new Stack<String>();
    String result = "";
    String token;
    priority.put("+", 1);
    priority.put("-", 1);
    priority.put("*", 2);
    priority.put("/", 2);
    priority.put("(", 3);
    for(int i = 0; i < exp.length(); i++){
      token = exp.substring(i,i+1);

      if (token.equals("(")) s.push(token);

      else if (token.equals(")")) {
        while (!s.empty() && !token.equals("(")) {
          token = s.pop();
          result += token;
        }
      }

      else if (token.equals("+") || token.equals("-") ||token.equals("*") || token.equals("/") ){
        while(!s.empty() && priority.get(s.peek()) > priority.get(token)) result += s.pop();
        s.push(token);
      }

      else {
        result += token;
      }
    }

    return result;
  }

  
  public static double evalPostfix(String exp)
  {
    Stack<String> s = new Stack<String>();
    String token;
    double operand1, operand2;
    for(int i =0; i < exp.length(); i++)
    {
      token = exp.substring(i,i+1);
      if(token.equals("+") || token.equals("-") ||token.equals("*") || token.equals("/") )
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
      }
      else
      {
        s.push(token);
      }
    }
    return Double.parseDouble(s.peek());
  }
  
}

