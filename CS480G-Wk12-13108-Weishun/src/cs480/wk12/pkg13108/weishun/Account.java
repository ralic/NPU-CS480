/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.wk12.pkg13108.weishun;
import java.util.Date;
/**
 *
 * @author raliclo
 */
public class Account {
    int ID;
    double balance;
    private static double annualInterestRate;
    Date dateCreated;
    
    public Account(){
        this.ID= 0;
        this.balance=0;
        this.annualInterestRate=0; 
        this.dateCreated= new Date() ;
            }
    
    public void Account(int a, double b, double c){
    System.out.println("\nNew account created.");
    this.ID = a;
    this.balance = b;
    this.annualInterestRate = c;
    }
    
    public void setID(int a){
    this.ID =a;
    }
    
    public void setBalance(double b){
    this.balance = b;
    }
    
    public void setAnnualInterestRate(double c){
    this.annualInterestRate= c;
    }
    
    public int getID(){
    return ID;
    }
    
    public double getBalance(){
    return balance;
    }
    
    public double getAnnualInterestRate(){
    return annualInterestRate;
    }
    
    public Date getDateCreated(){
    return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
    return annualInterestRate/12;
    }
    
    public double getMonthlyInterest(){
    return balance*annualInterestRate/12;
    }
    
    public void withdraw(double b){
    this.balance -= b;
    System.out.println("Updated balance after withdraw=" + this.balance);
    }
    
    public void deposit(double b){
    this.balance += b;
    System.out.println("Updated balance after deposit =" + this.balance);
    }
    
    @Override
    public String toString(){
        return "\nObject info :"
        +"\nAccountID:"+this.ID
        +"\tBalance:"+this.balance
        +"\tannualInterestRate:"+this.annualInterestRate
        +"\ndateCreated:"+this.dateCreated;
    }
       
}
/* Include toString() methods to print the account number, 
the annual interest rate, the initial balance, 
the monthly interest, and 
the date when this account was created.
*/