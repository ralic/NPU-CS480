package cs480g.hw13.pkg13108.weishun;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raliclo
 */
public class InvestmentPVGUI extends JFrame {
    private static Double n1,n2,n3,n4;
    private JLabel jlb1,jlb2,jlb3,jlb4;
    private JTextField jtf1,jtf2,jtf3,jtf4;
    
    public InvestmentPVGUI(){
    
        

        // Initialize
        n1=n2=n3=n4=0.0;
        
        jlb1 = new JLabel("Investment Amount   :");
        jlb2 = new JLabel("Years               :");
        jlb3 = new JLabel("Annual Interest Rate:");
        jlb4 = new JLabel("Future Value        :");  
        jtf1 = new JTextField(n1.toString());
        jtf2 = new JTextField(n2.toString());
        jtf3 = new JTextField(n3.toString());
        jtf4 = new JTextField(n4.toString());
        jtf1.setHorizontalAlignment(SwingConstants.RIGHT);
        jtf2.setHorizontalAlignment(SwingConstants.RIGHT);
        jtf3.setHorizontalAlignment(SwingConstants.RIGHT);
        jtf4.setHorizontalAlignment(SwingConstants.RIGHT);
        jtf4.setEditable(false);
        
        //Panel1
        JPanel p1 = new JPanel();  
        
        //Add Into Panel;
        p1.add(jlb1);
        p1.add(jtf1);
        p1.add(jlb2);
        p1.add(jtf2);        
        p1.add(jlb3);
        p1.add(jtf3);        
        p1.add(jlb4);
        p1.add(jtf4);  
        GridLayout gridL1= new GridLayout(4,2,5,2);
        p1.setLayout(gridL1);

        //Panel2
        JPanel p2 = new JPanel();
        p2.add(new calButtons("Calculate"));
        p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        //Show Screen
        
        this.add(p1,BorderLayout.CENTER);
        this.add(p2,BorderLayout.SOUTH);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
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
                n1=Double.parseDouble(jtf1.getText()); //Amount
                n2=Double.parseDouble(jtf2.getText()); //Years
                n3=Double.parseDouble(jtf2.getText()); //Interest   
                switch (str) {
                    case "Calculate":
                        //futureValue = investmentAmount * (1 + monthlyInterestRate)^years*12
                        n4 =n1* Math.pow((1+n3/12/100),(n2*12)) ;
                    default:
                        break;
                }
                jtf4.setText(String.format("%.2f",n4));//fv
        }       
    }
}
