package cs480g.wk5_13108.weishun;

/**
 *
 * @author raliclo
 */
public class CS480GWK5_13108Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creat and print out an array of 5 Account objects
        Account[] test = new Account[5];
        for (int i = 0; i < 5; i++) {
            test[i] = new Account(); // initialize all Account objects to default
            test[i].Account((i + 1) * 1000, (i + 1) * 1000, 3); // put values in account objects
            System.out.println(test[i].toString()); // print all objects in array
        }

        // Test withdraw & deposit funciton with parmaters : array, ID , money 
        AdminWithdraw(test, 2000, 100);
        AdminDeposit(test, 3000, 999);
        
    }

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
Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the account was created.
■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id, balance, and annualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the account.
■ A method named deposit that deposits a specified amount to the account.
¢Draw the UML diagram for the class and then implement the class. (Hint: The method getMonthlyInterest() is to return monthly interest, not the interest rate. Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate is a percentage, e.g.,like 3%. You need to divide it by 100.)
¢Write a test program that creates an Account object array of size 5. The account IDs are 1000 to 5000, balance of $1,000 to 5000, and an annual interest rate of 3%. Use the withdraw method to withdraw $500, use the deposit method to deposit $1000, and print the balance, the monthly interest, and the date when this account was created for each account.
¢Submit your source code,UML diagram and screenshots in one WORD document or zip file (if more files included) at “Week 4 Assignment” from course portal by 11:30pm the next class day.
File name: CS480(Section)_Week#_StudentID
¢Late penalty: 10% off for one day late; 20% off for two days late; 30% off for three days late; 50% off for 4 days late; 70% off for 5 days late. No credit received afterwards. && Any resubmission request will apply 10 points deduction.
 
*/
