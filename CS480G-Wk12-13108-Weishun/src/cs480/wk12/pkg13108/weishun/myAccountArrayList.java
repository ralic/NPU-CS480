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
public class myAccountArrayList extends ArrayList<ComparableAccount> {

public myAccountArrayList(){
}

public ArrayList<ComparableAccount> sort(ArrayList<ComparableAccount> x){
    int i;
    ArrayList<Integer> intArrayAL= new ArrayList();
    ArrayList<Integer> newAL;
    
       for (i=0;i<x.size();i++)
       {
       intArrayAL.set(i, x.get(i).getID());
       }
   
    Collections.sort(x);
       
       return x;
       
       
}

public static int searchIndexByID(ClonableAccount[] array, int a) {
        int c=0;
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
