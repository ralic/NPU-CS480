/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g_hw9_13108_weishun;

import java.util.ArrayList;

/**
 *
 * @author raliclo
 */
public class CS480G_HW9_13108_Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayListDemo testAL = new ArrayListDemo();
        
        int iAL; // index of Array List
        ArrayList<CDAccount> CDAccountAL = new ArrayList();
        
        // Test CDACcount
        CDAccount[] test = new CDAccount[5];
        for (int i = 0; i < 5; i++) {
            test[i] = new CDAccount(); // initialize all Account objects to default
            test[i].Account((i + 1) * 1000, (i + 1) * 1000, 3); // put values in account objects
            test[i].setCDduration((i+1)*3);
            System.out.println(test[i].toString()); // print all objects in array
            CDAccountAL.add(test[i]);
        }
       System.out.println("************************************");
       System.out.println("Contents of ArrayList :"+CDAccountAL);       
       System.out.println("\nSize of ArrayList :"+CDAccountAL.size());
       
       for (int i=0;i<5;i++) {
           CDAccountAL.get(1).printCDdetails();
       //test[i].printCDdetails();
       }
       
       
       
        /*
        // Test withdraw & deposit funciton of Account with parmaters : array, ID , money 
        AdminWithdraw(test, 2000, 100);
        AdminDeposit(test, 3000, 999);
        */
       
    }

    //Admin functions
    public static void AdminWithdraw(Account[] array, int a, double b) {
        int c; // search for which index for the account ID.
        c = searchIndexByID(array, a);
        System.out.println("\nWithdraw " + b + " from Account ID=" + a);
        array[c].withdraw(b);
    }

    public static void AdminDeposit(Account[] array, int a, double b) {
        int c; // search for which index for the account ID.
        c = searchIndexByID(array, a);
        System.out.println("\nDeposit " + b + " to Account ID=" + a);
        array[c].deposit(b);
    }

    public static int searchIndexByID(Account[] array, int a) {
        int c = -1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].getID() == a) // if the account ID equal to array.ID then set index c
            {
                //System.out.println("Found ID in array index="+i); // for debug
                c = i;
                return c;
            } else;
            //System.out.println("Account ID not match for index="+i); // for debug
        }
        return c;
    }
    
}


/*
(Calculator)
Revise Listing 9.5, Calculator.java, to accept an expression in which the operands and operator are separated by zero or more spaces.
For example, 3+4 and 3  + 4 are acceptable expressions. 
Also add the “^” operator as exponent operator.
*/