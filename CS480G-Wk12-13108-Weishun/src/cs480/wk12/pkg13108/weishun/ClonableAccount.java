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
public class ClonableAccount extends ComparableAccount implements Cloneable

    throws CloneNotSupportedException {

    public ClonableAccount() throws CloneNotSupportedException {
        this.clone();
    }

    @Override
    public ClonableAccount clone() throws CloneNotSupportedException {
        return (ClonableAccount) super.clone();
    }

}

    //private int ID;
//private double balance;
//private static double annualInterestRate;
//private Date dateCreated;
//private int CDduration;
    //private double CDannualInterestRate;
