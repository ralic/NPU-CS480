/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab8.weishun.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author raliclo
 */
public class CalUIDesign extends JFrame {

    public static Double result;
    public JTextField jtxf1;
    public JTextField jtxf2;
    public JTextField jtxf3;
    public JLabel jlb1;

    public CalUIDesign() {
//        GridLayout gl1 = new GridLayout(0, 5, 0, 0);
        FlowLayout fl1 = new FlowLayout();
        this.setLayout(fl1);
        jtxf1 = new JTextField("Inset a number in jtxf1", 20);
        jtxf2 = new JTextField("Inset a number in jtxf2", 20);
        jtxf3 = new JTextField("Click '+' Button to update jtxf3", 20);
        jlb1 = new JLabel("=");
        CalButtons b1 = new CalButtons("+");

        //Panel-1
        this.add(jtxf1, FlowLayout.LEFT);
        this.add(jtxf3, FlowLayout.CENTER);
        this.add(jlb1, FlowLayout.CENTER);
        this.add(jtxf2, FlowLayout.CENTER);
        this.add(b1, FlowLayout.CENTER);
        //Frame Setup
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    //interactive Button
    private class CalButtons extends JButton {

        ButtonAction selfListener = new ButtonAction();

        private CalButtons(String str) {
            super.setText(str);
            this.addActionListener(selfListener);
        }

        private class ButtonAction implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                //for debug
                System.out.println("Clicked btn, its Text = " + CalButtons.super.getText());
                try {
                    CheckOperation(CalButtons.super.getText());
                } catch (Exception ex) {
                }

            }
        }

        private void CheckOperation(String text) throws Exception {
            double a = Double.parseDouble(jtxf1.getText());
            double b = Double.parseDouble(jtxf2.getText());
            result = a + b;
            jtxf3.setText(result.toString());
        }
    }
}
