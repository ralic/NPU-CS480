/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab8.weishun.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author raliclo
 */
public class CalUIDesign extends JFrame {

    private static Double result;

    /**
     * @return the result
     */
    public static Double getResult() {
        return result;
    }

    /**
     * @param aResult the result to set
     */
    public static void setResult(Double aResult) {
        result = aResult;
    }
    private JTextField jtxf1;
    private JTextField jtxf2;
    private JTextField jtxf3;
    private JLabel jlb1;

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

    /**
     * @return the jtxf1
     */
    public JTextField getJtxf1() {
        return jtxf1;
    }

    /**
     * @param jtxf1 the jtxf1 to set
     */
    public void setJtxf1(JTextField jtxf1) {
        this.jtxf1 = jtxf1;
    }

    /**
     * @return the jtxf2
     */
    public JTextField getJtxf2() {
        return jtxf2;
    }

    /**
     * @param jtxf2 the jtxf2 to set
     */
    public void setJtxf2(JTextField jtxf2) {
        this.jtxf2 = jtxf2;
    }

    /**
     * @return the jtxf3
     */
    public JTextField getJtxf3() {
        return jtxf3;
    }

    /**
     * @param jtxf3 the jtxf3 to set
     */
    public void setJtxf3(JTextField jtxf3) {
        this.jtxf3 = jtxf3;
    }

    /**
     * @return the jlb1
     */
    public JLabel getJlb1() {
        return jlb1;
    }

    /**
     * @param jlb1 the jlb1 to set
     */
    public void setJlb1(JLabel jlb1) {
        this.jlb1 = jlb1;
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
            double a = Double.parseDouble(getJtxf1().getText());
            double b = Double.parseDouble(getJtxf2().getText());
            setResult(a + b);
            getJtxf3().setText(getResult().toString());
        }
    }
}
