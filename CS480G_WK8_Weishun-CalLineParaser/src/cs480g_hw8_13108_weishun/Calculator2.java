/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g_hw8_13108_weishun;

/**
 *
 * @author raliclo
 */
public class Calculator2 {
    
            
  /** Main method
     * @param args */
  public Calculator2(String[] args) {
    // Check number of strings passed
    if (args.length != 1) {
      System.out.println(
        "Usage: java Calculator \"operand1 operator operand2\"");
      System.exit(0);
    }

    // The result of the operation
    int result = 0;

    // The result of the operation
    String[] tokens = args[0].split(" ");

    // Determine the operator
    switch (tokens[1].charAt(0)) {
      case '+': result = Integer.parseInt(tokens[0]) +
                         Integer.parseInt(tokens[2]);
                break;
      case '-': result = Integer.parseInt(tokens[0]) -
                         Integer.parseInt(tokens[2]);
                break;
      case '*': result = Integer.parseInt(tokens[0]) *
                         Integer.parseInt(tokens[2]);
                break;
      case '/': result = Integer.parseInt(tokens[0]) /
                         Integer.parseInt(tokens[2]);
    }

    // Display result
    System.out.println(tokens[0] + ' ' + tokens[1] + ' ' 
      + tokens[2] + " = " + result);
  }
}