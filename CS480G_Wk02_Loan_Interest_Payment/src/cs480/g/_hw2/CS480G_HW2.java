/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.g._hw2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author raliclo
 */
public class CS480G_HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Write a program that lets the user enter the loan amount and loan period 
        in number of years and displays the monthly and total payments for each interest 
        rate starting from 5% to 8%, with an increment of 1/8. 
        For the formula to compute monthly payment, see Listing 2.8, ComputeLoan.java. 
        Please refer to the attachment for the sample run output.
        */
        Scanner in = new Scanner(System.in);
        
        // Get Loan Amount & Year
        /* System Out Input Method
        double LoanAll;
        int LoanYear;
        System.out.printf("Loan Amount :");
        LoanAll = in.nextDouble();
        System.out.printf("Number of Years :");
        LoanYear = in.nextInt();
        */
        // OptionPane Method
        String LoanAmountString = JOptionPane.showInputDialog("Please Enter Loan Amount");
        String NumberofYearString = JOptionPane.showInputDialog("Please Enter Number of years:");
        double LoanAll = Double.parseDouble(LoanAmountString);
        int LoanYear = Integer.parseInt(NumberofYearString);
                
        //Declare Annual Interest Rate Range @ for loop
        double LoanAInterest;
        System.out.printf("Annual Interest Rate\tMonth Payment\tTotal Payment\t\n");
        
        for (LoanAInterest=5; LoanAInterest <=8;LoanAInterest=LoanAInterest+0.125 ) {
        // Convert Annual Interest to Montly, Count MonthPayment & TotalPayment
        double LoanMInterest =LoanAInterest/1200;
        double LoanMPayment= LoanAll*LoanMInterest/(1-1/Math.pow((1+LoanMInterest),LoanYear*12));
        double TotalPayment= LoanMPayment*LoanYear*12;
        System.out.printf("%1.3f               \t%3.2f        \t%10.2f\t\n",LoanAInterest,LoanMPayment,TotalPayment);
        }
        
       
    }
    
}
