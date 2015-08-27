/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.g.homework;

import java.awt.Component;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author raliclo
 */
public class CS480GHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String FN,LN;
        System.out.println("What is your First name ?");
        FN = in.nextLine();
        System.out.println("What is your Last  name ?");
        LN = in.nextLine();
        Component frame = null;
        JOptionPane.showMessageDialog(frame, "[" + FN +"], [" + LN+ "], Welcome to Java!!",
        "Week 1 Assignment",JOptionPane.PLAIN_MESSAGE);
    } }
  }
}
