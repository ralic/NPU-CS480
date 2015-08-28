/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.hw13.pkg13108.weishun;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author raliclo
 */
public class SmallCalaculatorGUI extends JFrame {

    private static Double n1,n2,n3; // 3 numbers 
    private static JTextField jtf1,jtf2,jtf3;

    public SmallCalaculatorGUI() {
        // Variable initialization
        n1 = n2 = n3 = 0.0;
        
        // Set Window location & Size
        Toolkit tk = Toolkit.getDefaultToolkit();
        double ratio = 0.3;
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        Dimension windowSize = new Dimension((int) (ratio * xSize), (int) (ratio * ySize));

        //Create and set up the window.
        //JFrame frame = new JFrame("SpringBox");
        //this.setTitle("Week 13 Assignment");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLocation(xSize / 2, ySize / 2);
        this.setLocationRelativeTo(null);

        // declare and setup layout for panel1
        JPanel p1 = new JPanel();
        GridLayout gridL1 = new GridLayout(1,6,0,4);
        p1.setLayout(gridL1);
        
        // declare panel1 components
        JLabel jlb1 = new JLabel("Number-1:");
        jtf1 = new JTextField(n1.toString());
        JLabel jlb2 = new JLabel("Number-2:");
        jtf2 = new JTextField(n2.toString());
        JLabel jlb3 = new JLabel("Results :");
        jtf3 = new JTextField(n3.toString());
        p1.add(jlb1);
        p1.add(jtf1);
        p1.add(jlb2);
        p1.add(jtf2);
        p1.add(jlb3);
        p1.add(jtf3);
        jtf3.setEditable(false);
        
        //Set up the content pane2
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());

        //Add the buttons 
        calButtons jbtAdd = new calButtons("Add");
        calButtons jbtSubstract = new calButtons("Substract");
        calButtons jbtMultiply = new calButtons("Multiply");
        calButtons jbtDivide = new calButtons("Divide");
        p2.add(jbtAdd);
        p2.add(jbtSubstract);
        p2.add(jbtMultiply);
        p2.add(jbtDivide);

        // layout for final frame
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
        //Display the window.
        //this.setSize(windowSize);
        this.pack();
        this.setVisible(true);

    }

    //interactive Button
    private class calButtons extends JButton {

        ButtonAction selfListener = new ButtonAction();

        private calButtons(String str) {
            super.setText(str);
            this.addActionListener(selfListener);
        }

        private class ButtonAction implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
            //for debug
                //System.out.println("Clicked btn, its Text = " + calButtons.super.getText());
                CheckOperation(calButtons.super.getText());
            }
        }
        
        private  void CheckOperation(String str) {
        
                n1=Double.parseDouble(jtf1.getText());
                //System.out.println(n1);// for debug
                n2=Double.parseDouble(jtf2.getText());
                //System.out.println(n2);// for debug
                
        switch (str) {
            case "Add":
                n3=n1+n2;
                break;
             case "Substract":
                n3=n1-n2;
                break;
            case "Multiply":
                n3=n1*n2;
                break;
            case "Divide":
                if (n2==0)
                {
                n3=n1/n2;
                break;
                }   
                else {
                n3=n1/n2;
                break;
                }
            default:
                break;
    }
                jtf3.setText(n3.toString());
    }
    }

}
