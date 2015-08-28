/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.wk10.pkg13108.weishun;

import java.awt.Color;
import static java.awt.Color.yellow;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author raliclo
 */
public class Show6Layout extends JFrame {
    public Show6Layout () {
    setLayout(new GridLayout(2,3,0,0));
    // creat 6 label objects
    JLabel l1=new JLabel("black");
    JLabel l2=new JLabel("blue");
    JLabel l3=new JLabel("cyan");
    JLabel l4=new JLabel("green");
    JLabel l5=new JLabel("magenta");
    JLabel l6=new JLabel("orange");   
    //add 6 label objects to the container
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        
        //set FG color
        l1.setForeground(Color.black);
        l2.setForeground(Color.blue);
        l3.setForeground(Color.cyan);
        l4.setForeground(Color.green);
        l5.setForeground(Color.magenta);       
        l6.setForeground(Color.orange);
        
        //set BG color
        l1.setBackground(Color.white);        
        l2.setBackground(Color.white);
        l3.setBackground(Color.white);
        l4.setBackground(Color.white);
        l5.setBackground(Color.white);
        l6.setBackground(Color.white);
        
        //set boarder
        l1.setBorder(BorderFactory.createLineBorder(yellow,3));
        l2.setBorder(BorderFactory.createLineBorder(yellow,3));
        l3.setBorder(BorderFactory.createLineBorder(yellow,3));
        l4.setBorder(BorderFactory.createLineBorder(yellow,3));
        l5.setBorder(BorderFactory.createLineBorder(yellow,3));        
        l6.setBorder(BorderFactory.createLineBorder(yellow,3));    
        
        //set font
        Font tr = new Font("TimesRoman", Font.BOLD, 20);
        l1.setFont(tr);
        l2.setFont(tr);
        l3.setFont(tr);
        l4.setFont(tr);
        l5.setFont(tr);
        l6.setFont(tr);
        
        //set text & tooltip 
        l1.setToolTipText("black");
        l2.setToolTipText("blue");
        l3.setToolTipText("cyan");
        l4.setToolTipText("green");
        l5.setToolTipText("magenta");
        l6.setToolTipText("orange");
        
        //set differet cursor for top and bottom
        //1st type cursor :Hand
        l1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        //2nd type cursor :
        l4.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        l5.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        l6.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    }
    
}
