/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.wk12.pkg13108.weishun;

/**
 *
 * @author raliclo
 */
public class CDAccount extends Account {
    
    private int CDduration;
    private double CDannualInterestRate;
    
    
    public CDAccount(){
        this.CDduration=0;
        this.CDannualInterestRate=0;
    }
    

    public int getCDduration(){
        return this.CDduration;
    }

    public void setCDduration(int a){
        this.CDduration=a;
        this.setCDannualInterestRate();
    }

    public double getCDannualInterestRate(){
        return CDannualInterestRate;
    }
    
    public void setCDannualInterestRate(){
        this.CDannualInterestRate= (super.getAnnualInterestRate()+0.5*(this.getCDduration()/3)); 
    }
    
    @Override
    public String toString() {
        return super.toString()
                +"\nCDduration:"+this.CDduration +" Months"
                +"\nCDannualInterestRate:"+this.CDannualInterestRate;
    }
    
    public void printCDdetails (){
        System.out.println(this.getID()+"              \t"
                            +this.getBalance()+"              \t"
                            +this.getCDannualInterestRate()+"              \t"
                            +this.getDateCreated()+"              \t");
        
    }
    
    public void printMonthly(){
            
        // print monthly info
        
        System.out.println("Monthly Balance Overview :");
        double tempBal = super.getBalance();
        for (int j=1;j<=this.getCDduration();j++)
        {
            tempBal=tempBal+(getCDannualInterestRate()/12/100)*tempBal;
            System.out.printf("Month\t %d \t %.2f\n",j,tempBal);
        }
        
    }
    
    public void printHeader()
    {// Header
        System.out.println("Account Number       \t"
                            +"Initial Balance        \t"
                            +"Rate(%)              \t"
                            +"DateCreated              \t");
        System.out.println("===================================================================================================");
        //
    }

    int compareTo(CDAccount o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
Create one subclass as CDAccount. 
You will add two private variables, duration (in months) and CDannualInterestRate, 
and four member functions, getDuration(), setDuration(), getCDannualInterestRate(), and setCDannualInterestRate().
¢Every three months CD duration will increase the CDannualInterestRate by 0.5%
from annualInterestRate of the base class. 

For example: if annualInterestRate is 3%, 
the CDannualInterestRate will be 3.5% of a three-months CD saving account,
and the CDannualInterestRate will be 4% of a six-month CD.
*/