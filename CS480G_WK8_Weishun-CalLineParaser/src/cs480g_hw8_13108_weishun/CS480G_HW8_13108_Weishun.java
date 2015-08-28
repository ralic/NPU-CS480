/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g_hw8_13108_weishun;

import java.util.Scanner;

/**
 *
 * @author raliclo
 */
public class CS480G_HW8_13108_Weishun {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Test of all operators
        int n;       
        n=1;
        String[] arg1 = new String[n];
        arg1[0]= "63   +       40";
        Calculator Cal01 = new Calculator(arg1);
        arg1[0]= "63 - 40";
        Calculator Cal02 = new Calculator(arg1);
        arg1[0]= "63 *    40";
        Calculator Cal03 = new Calculator(arg1);
        arg1[0]= "63    / 40";
        Calculator Cal04 = new Calculator(arg1);
        arg1[0]= "63  ^  12";
        Calculator Cal05 = new Calculator(arg1); 
        
        // Test of Scanner input
        int i=0;
        Scanner in = new Scanner(System.in);
        while (i <3)
        {
        System.out.println("\n Calculation of a?b, ? could be < +, - , * , / , ^ > \n Please try to use single line : ");
        System.out.print("Original Input: ");
        arg1[0] = in.nextLine();
        Calculator Cal06 = new Calculator(arg1); 
        i++;
        }
    }
    
}
