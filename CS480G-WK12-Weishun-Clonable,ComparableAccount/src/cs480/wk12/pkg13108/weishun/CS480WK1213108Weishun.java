/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.wk12.pkg13108.weishun;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author raliclo
 */
public class CS480WK1213108Weishun {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here

        //Simple Test of Comparable & Clone Interface
        ComparableAccount test1 = new ComparableAccount();
        test1.Account(1, 2000, 3);
        test1.printCDdetails();
        ComparableAccount test2 = new ComparableAccount();
        test2.Account(2, 3000, 4);
        test2.printCDdetails();
        System.out.println("1->2 After comparison : " + test1.compareTo(test2));
        ClonableAccount test3 = new ClonableAccount();
        test3.Account(3, 4000, 5);
        test3.printCDdetails();
        ClonableAccount test4;
        test4 = test3.clone();
        test4.printCDdetails();
        System.out.println("3->4 Clone & comparison : " + test3.compareTo(test4));

        // Test per request
        ArrayList<ComparableAccount> comparableAccountAL = new ArrayList();
        ClonableAccount[] test = new ClonableAccount[5];
        for (int i = 0; i < 5; i++) {
            test[i] = new ClonableAccount(); // initialize all Account objects to default
            test[i].Account((1000 + i), (i + 1) * 1000, 3); // put values in account objects
            test[i].setCDduration((i + 1) * 3);
            //System.out.println(test[i].toString()); // print all objects in array
            comparableAccountAL.add(test[i]);
        }

        System.out.println("\nOriginal List of Account Objects :");
        test[1].printHeader();
        for (int i = 0; i < 5; i++) {
            comparableAccountAL.get(i).printCDdetails();
            //test[i].printCDdetails();
        }

        for (int i = 0; i < 5; i++) {
            if (i != 5) {
                AdminDeposit(test, (1000 + i), 500);
            }
            //test[i].printCDdetails();
        }

        for (int i = 0; i < 5; i++) {
            if (i != 5) {
                AdminWithdraw(test, (1000 + i), ((i + 1) * 100));
            }
            //test[i].printCDdetails();
        }
        System.out.println("\nAfter Deposit & Withdraw :");
        test[1].printHeader();
        for (int i = 0; i < 5; i++) {
            comparableAccountAL.get(i).printCDdetails();
            //test[i].printCDdetails();
        }
//
//       int[] intArray =null;
//       for (int i=0;i<5;i++) {
//       intArray[i] = comparableAccountAL.get(i).getID();
//       }

        Collections.sort(comparableAccountAL);

        System.out.println("\nAfter Sorting :");
        test[1].printHeader();
        for (int i = 0; i < 5; i++) {
            comparableAccountAL.get(i).printCDdetails();
            //test[i].printCDdetails();
        }
    }
    /*
     Enable the Account class comparable & cloneable)
     ¢Create ComparableAccount class inheritanced from  the Account class in Week 5 assignment, and implemented the comparable interface.
     Override the compareTo method to compare the balance of two accounts. Also override toString() method.
     **[Extra Credit] Implements the cloneable interface and override the clone method to perform a deep copy on the dateCreated field.
     Write a driver program to create one array contains 5 ComparableAcccount objects (account #: 1001-1005, initial balance=$1000). Make deposit $500 to each account, and withdraw $100 - $500 for each account.
     Clone all 5 accounts into a new array. Print out each object info from the cloned array, and use “==“ to compare the dateCreated field of each object from both arrays. Use Arrays.sort() to sort the original array and print out object info.
     */

// Admin functions
    public static void AdminWithdraw(ClonableAccount[] array, int a, double b) {
        int c; // search for which index for the account ID.
        c = searchIndexByID(array, a);
        System.out.println("\nWithdraw " + b + " from Account ID=" + a);
        array[c].withdraw(b);
    }

    public static void AdminDeposit(ClonableAccount[] array, int a, double b) {
        int c; // search for which index for the account ID.
        c = searchIndexByID(array, a);
        System.out.println("\nDeposit " + b + " to Account ID=" + a);
        array[c].deposit(b);
    }

    public static int searchIndexByID(ClonableAccount[] array, int a) {
        int c = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].getID() == a) // if the account ID equal to array.ID then set index c
            {
                //System.out.println("Found ID in array index="+i); // for debug
                c = i;
            } else;
            //System.out.println("Account ID not match for index="+i); // for debug
        }
        return c;
    }

}

// Simple Test for two implements for Comparable & Clonable
/*
 ComparableAccount test1 = new ComparableAccount();
 test1.Account(1, 2000, 3);
 test1.printCDdetails();
 ComparableAccount test2 = new ComparableAccount();
 test2.Account(2, 3000, 4);
 test2.printCDdetails();
 System.out.println("1->2 After comparison : "+test1.compareTo(test2));
 ClonableAccount test3 = new ClonableAccount();
 test3.printCDdetails();
 ClonableAccount test4;
 test4 = test3.clone();
 test4.printCDdetails();
 System.out.println("3->4 Clone & comparison : "+test3.compareTo(test4));

 */
       // Check Array contents
//System.out.println("************************************");
//System.out.println("Contents of ArrayList :"+comparableAccountAL);
//System.out.println("\nSize of ArrayList :"+comparableAccountAL.size());

