/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.wk11.pkg13108.weishun;

import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author raliclo
 */
public class CS480GWK1113108Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        //currdate.setMonth(currdate.getMonth())
        
        CalenderGUI[] frames = new CalenderGUI[12];
        for (int i=0;i<12;i++) {
        Date currdate = new Date(System.currentTimeMillis()); 
        currdate.setMonth(i);
        frames[i] = new CalenderGUI(currdate);
        frames[i].setTitle("Week 11 Homework" + "Month" + (i+1));
        if (i==0||i==1||i==2||i==3)
        {frames[i].setLocation(0, i*200);}
        if (i==4||i==5||i==6||i==7)
        {frames[i].setLocation(500, (i-4)*200);}
        if (i==8||i==9||i==10||i==11)
        {frames[i].setLocation(1000, (i-8)*200);}
        
         // Center a frame
        frames[i].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frames[i].setVisible(true);// Display the frame
        }
    }
    
}
/*
¢Write a program that displays the calendar for the current month, as shown below. 
Use labels, and set text on the labels to display the calendar. 
Use the GregorianCalendar class to obtain the information for the month, year, first day of the month, and number of days in the month.
*/