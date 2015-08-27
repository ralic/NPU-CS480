/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.wk12.pkg13108.weishun;

import java.util.Comparator;

/**
 *
 * @author raliclo
 */
public class ComparableAccount extends CDAccount implements Comparable<CDAccount>,Comparator<CDAccount> {
    //private int ID;
    //private double balance;
    //private static double annualInterestRate;
    //private Date dateCreated;
    //private int CDduration;
    //private double CDannualInterestRate;
    
    @Override
    public int compareTo(CDAccount o) {
        if (o.getBalance()<this.balance) {
            return -1;
        }
        
        else if (o.getBalance()>this.balance) {
            return 1;
        }
        else {
            return 0;
        }
        
    }

    @Override
    public int compare(CDAccount o1, CDAccount o2) {
//        
//        boolean isSameID= (o1.ID != o2.ID);        
//        boolean isSameAnnualInterestRate= (o1.getAnnualInterestRate() != o2.getAnnualInterestRate());
//          boolean isSamedateCreated= (o1.getDateCreated() != o2.getDateCreated());        
//        boolean isSameCDduration= (o1.getCDduration() != o2.getCDduration());        
//        boolean isSameCDannualInterestRate= (o1.getCDannualInterestRate() != o2.getCDannualInterestRate());
//       
//        if (isSamedateCreated=false){ System.out.println("ID= "+o1.getID()+ " has different dateCreated");
        ComparableAccount o3=(ComparableAccount) o1;
        ComparableAccount o4=(ComparableAccount) o2;
        return o3.compareTo(o4);   // compare balance   
    }
}
