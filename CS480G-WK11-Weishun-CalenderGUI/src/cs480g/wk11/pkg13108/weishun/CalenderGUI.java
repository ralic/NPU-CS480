/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.wk11.pkg13108.weishun;

import java.awt.BorderLayout;
import static java.awt.Color.black;
import java.awt.GridLayout;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author raliclo
 */
public class CalenderGUI extends JFrame {
    public CalenderGUI (Date currdate) {

        // Panel-1 datestring
        JPanel p1 = new JPanel();
        String datestring = (currdate.getMonth()+1)+"/"+(currdate.getYear()+1900);        
        p1.add(new JLabel(datestring));
        
        // Panel-2 wks in flowlayout (7)
        JPanel p2 = new JPanel(); 
        p2.setLayout(new GridLayout(1,7,0,0));
        p2.add(new JLabel("Sunday   "));
        p2.add(new JLabel("Monday   "));
        p2.add(new JLabel("Tuesday  "));
        p2.add(new JLabel("Wednesday"));
        p2.add(new JLabel("Thursday "));
        p2.add(new JLabel("Friday   "));
        p2.add(new JLabel("Saturday "));
        p2.setBorder(BorderFactory.createLineBorder(black,1));
        //System.out.println(datestring);
        
        // Panel-3 days in gridlayout (5 row , 7 column, 0 x spaing , 0 y spacing)
        JPanel p3 = new JPanel();        
        p3.setLayout(new GridLayout(5,7,0,0));
        GregorianCalendar cal1 = new GregorianCalendar(currdate.getYear(),currdate.getMonth(),1);
        
        // Check DAY_OF_WEEK fo 1st day of the month to know how much spacings 
        int spacingDays = (cal1.get(cal1.DAY_OF_WEEK)+2)%7; // Get spacing days 
        int daysInMonth = cal1.getActualMaximum(cal1.DAY_OF_MONTH); // Get Total days count in this month               
        
        // Add null labels, Amount = spacingDays 
        if ((daysInMonth+spacingDays) >=36)
        {p3.setLayout(new GridLayout(6,7,0,0));}
        
        if (spacingDays==0) {}
        else {
        JLabel[] spacings = new JLabel[spacingDays];
            for (int i=0;i<spacingDays;i++)
            {
                spacings[i]=new JLabel("");
                p3.add(spacings[i]);
            } 
        }
        // Add 1~daysInMonth labels, Amount = daysInMonth 
        JLabel[] days = new JLabel[daysInMonth];
        for (int i=0;i<daysInMonth;i++)
        {             
            if (i<9)
            {days[i]=new JLabel("             "+(i+1));}
            else 
            {days[i]=new JLabel("           "+(i+1));}
            days[i].setBorder(BorderFactory.createLineBorder(black,1));
            p3.add(days[i]);
        }
        
        if (daysInMonth<=31){
                for (int i=0;i<31-daysInMonth;i++)
            {p3.add(new JLabel(""));}
        }
        if ((daysInMonth+spacingDays) ==36)
        {p3.add(new JLabel(""));}
        
        // Final Layout
        setSize(500, 180);
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.CENTER);
        add(p3,BorderLayout.SOUTH);
    }
    
}

/* 

       for (int i =0;i<12;i++)
        { currdate.setMonth(i);
        System.out.println(currdate);
        GregorianCalendar cal1 = new GregorianCalendar(currdate.getYear(),currdate.getMonth(),1);
        int daysInMonth = cal1.getActualMaximum(cal1.DAY_OF_MONTH);
        int spacingDays = (cal1.get(cal1.DAY_OF_WEEK)+2)%7;
        System.out.println(currdate.getMonth()+" "+daysInMonth+" "+spacingDays);
        }

/*

currdate.getMonth / daysInMonth / spacingDays=(DAY_OF_WEEK+2)%7
Fri Jan 23 07:52:56 PST 2015
0 31 4
Mon Feb 23 07:52:56 PST 2015
1 28 0
Mon Mar 23 07:52:56 PDT 2015
2 31 0
Thu Apr 23 07:52:56 PDT 2015
3 30 3
Sat May 23 07:52:56 PDT 2015
4 31 5
Tue Jun 23 07:52:56 PDT 2015
5 30 1
Thu Jul 23 07:52:56 PDT 2015
6 31 3
Sun Aug 23 07:52:56 PDT 2015
7 31 6
Wed Sep 23 07:52:56 PDT 2015
8 30 2
Fri Oct 23 07:52:56 PDT 2015
9 31 4
Mon Nov 23 07:52:56 PST 2015
10 30 0
Wed Dec 23 07:52:56 PST 2015
11 31 2

// Other notes 
//
       //GregorianCalendar cal1 = new GregorianCalendar();
        Calendar cal1 = new GregorianCalendar();
        //cal1.set(curdate.getYear(),curdate.getMonth(),curdate.getDay());
        //public GregorianCalendar(int year, int month, int dayOfMonth) {
        cal1.set(2015,4,8);
        //cal1.setTime(curdate);
        System.out.println(datestring);
        System.out.println("YEAR: " + cal1.get(Calendar.YEAR));             
        System.out.println("MONTH: " + cal1.get(Calendar.MONTH));
        System.out.println("DAY_OF_MONTH: " + cal1.get(Calendar.DAY_OF_MONTH));
        System.out.println("WEEK_OF MONTH: " + cal1.get(Calendar.WEEK_OF_MONTH));
        System.out.println("DAY_OF_WEEK_IN_MONTH: (row)" + cal1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("DAY_OF_WEEK: (column)" + cal1.get(Calendar.DAY_OF_WEEK)); 
        
        //DAY_OF_WEEK_IN_MONTH :
        //1 - 1st week (1~7 &31)
        //2 - 2nd week (8~14)
        //3 - 3rd week (15~21)
        //4 - 4th week (21~28)
        //5 - 5th week (29~30)

        //DAY_OF_WEEK :
        //5 - Sunday    => no spacing (5+2)%7
        //6 - Monday    => 1 spacing
        //7 - Tuesday   => 2 spacing
        //1 - Wednesday => 3 spacing
        //2 - Thursday  => 4 spacing
        //3 - Friday    => 5 spacing
        //4 - Saturday  => 6 spacing
             
        
        // Check DAY_OF_WEEK fo 1st day of the month to know how much spacings
        
*/