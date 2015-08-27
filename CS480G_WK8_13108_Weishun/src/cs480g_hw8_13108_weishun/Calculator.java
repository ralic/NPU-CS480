/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g_hw8_13108_weishun;
import java.lang.String.*;

/**
 *
 * @author raliclo
 */
public class Calculator {
    
    // The result of the operation
    private double result = 0;
    public char operator;
    private String[] tokens;
 
    
  /** Main method */
  //public Calculator() {}
    
  public Calculator(String[] args) {
    // Check number of strings passed
    if (args.length != 1) {
      System.out.println(
        "Usage: java Calculator \"operand1 operator operand2\"");
      System.exit(0);
    }
    parseOperators(args);
    result=findResults();
  }
   
  private void parseOperators(String[] args) {
    // The result of the operation
      String noSpace = args[0].trim().replaceAll(" ", "");
      //System.out.println(noSpace);// for debug
      int opCharAt=-1;
      // operator char at
      for (int i=0;i<noSpace.length();i++)
      {
          if (noSpace.charAt(i)=='+') 
          {opCharAt=i;tokens=noSpace.split("[+]");
          //System.out.println(tokens[0]);// for debug
          //System.out.println(tokens[1]);// for debug
          operator='+';
          break;}
          if (noSpace.charAt(i)=='-') 
          { opCharAt=i;tokens=noSpace.split("[-]");operator='-';break;}
          if (noSpace.charAt(i)=='*') 
          { opCharAt=i;tokens=noSpace.split("[*]");operator='*';break;}
          if (noSpace.charAt(i)=='/') 
          { opCharAt=i;tokens=noSpace.split("[/]");operator='/';break;}
          if (noSpace.charAt(i)=='^') 
          { opCharAt=i;tokens=noSpace.split("[+^]");operator='^';break;}
      }
      
      if (opCharAt!=-1) {System.out.println("Operator found as \""+operator+"\"");}
      if (opCharAt==-1) {System.out.println("No operator found as in +,-,*,/,^,plese check again");}      
  }
 
  public double findResults ()
    {
      double a =Double.parseDouble(tokens[0]);
      double b =Double.parseDouble(tokens[1]);
      // Determine the operator
    switch (operator) {
      case '+': result =  a+b;
                break;
      case '-': result =  a-b;
                break;
      case '*': result =  a*b;
                break;
      case '/': result =  a/b;
                break;
      case '^': result =  Math.pow(a, b);      
    // Display result
    }
    System.out.println(tokens[0] + ' ' + operator + ' ' + tokens[1] + " = " + result);
    return result;
    }  
  
}