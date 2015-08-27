/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.hw13.pkg13108.weishun;

/**
 *
 * @author raliclo
 */
public class CS480GHW1313108Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
        SmallCalaculatorGUI test1 = new SmallCalaculatorGUI(); 
        test1.setTitle("Week 13 Assignment");
        
        InvestmentPVGUI test2 = new InvestmentPVGUI(); 
        test2.setTitle("Exercise 16-5");
        test1.setLocation((test2.getX()),(test2.getY()-100));
    }
}

/*
Write a program to perform addition, subtraction, multiplication, and division, as shown in the attachment
¢Submit your source code and screenshots in one WORD document or zip file (if more files included) at “Week 13 Assignment” from course portal by 11:30pm the next class day.
File name: CS480(Section)_Week#_StudentID

¢Late penalty: 10% off for one day late; 20% off for two days late; 30% off for three days late; 50% off for 4 days late; 70% off for 5 days late. No credit received afterwards. && Any resubmission request will apply 10 points deduction.
¢(Create an investment-value calculator) Write a program that calculates the future value of an investment at a given interest rate for a specified number of years. The formula for the calculation is:
futureValue = investmentAmount * (1 + monthlyInterestRate)^years*12
Use text fields for the investment amount, number of years, and annual interest rate. Display the future amount in a text field when the user clicks the Calculate button, as shown in the attachment.
 
*/
