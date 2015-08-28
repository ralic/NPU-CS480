/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab12.calGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author raliclo
 */
public class CalculatorGUI extends JFrame {

    private static JTextField t1;
    private StringBuilder displayInfo;
    private double a; // 1st arg,storedInfo
    private double b; // 2nd arg,newInfo
    private boolean isDouble;
    private char operator;

    public CalculatorGUI() {
        this.isDouble = false;
        this.displayInfo = new StringBuilder();

        // Set Window location & Size
        Toolkit tk = Toolkit.getDefaultToolkit();
        double ratio = 0.4;
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        Dimension windowSize = new Dimension((int) (ratio * xSize), (int) (ratio * ySize));

        //Panel-1 Textfiled and its listener
        // Creat Textfield object t1 in panel p1
        JPanel p1 = new JPanel();
        displayInfo.append("Begin with click on buttons");
        t1 = new JTextField(displayInfo.toString(), 32);
        t1.setVisible(true);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setEditable(false);
        p1.add(t1);
    // Creat listeners

        //Panel-2 Buttons
        JPanel p2 = new JPanel();
        GridLayout simple = new GridLayout(4, 4, 1, 1);
        p2.setLayout(simple);

        //row-1
        p2.add(new calButtons("7"));
        p2.add(new calButtons("8"));
        p2.add(new calButtons("9"));
        p2.add(new calButtons("+"));
        p2.add(new calButtons("4"));
        p2.add(new calButtons("5"));
        p2.add(new calButtons("6"));
        p2.add(new calButtons("-"));
        p2.add(new calButtons("1"));
        p2.add(new calButtons("2"));
        p2.add(new calButtons("3"));
        p2.add(new calButtons("*"));
        p2.add(new calButtons("."));
        p2.add(new calButtons("0"));
        p2.add(new calButtons("C"));
        p2.add(new calButtons("/"));

        // Final Layout
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
        this.add(new calButtons("="), BorderLayout.EAST);

        //General settings
        this.setTitle("Ralic's Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(windowSize);
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

    }

    private void CheckOperation(String str) {

        if ("Begin with click on buttons".equals(t1.getText())) {
            this.a = 0;
            this.operator = '=';
            displayInfo.delete(0, displayInfo.length());
            displayInfo.append(0);
            t1.setText(displayInfo.toString());
            //System.out.println("Clean StringBuilder");
        }

        switch (str.charAt(0)) {
            case '0':
                if ("0".equals(t1.getText()) || "0.0".equals(t1.getText())) {
                    break;
                } else {
                    displayInfo.append(0);
                    t1.setText(displayInfo.toString());
                    break;
                }
            case '1':
                updateDisplay('1');
                break;
            case '2':
                updateDisplay('2');
                break;
            case '3':
                updateDisplay('3');
                break;
            case '4':
                updateDisplay('4');
                break;
            case '5':
                updateDisplay('5');
                break;
            case '6':
                updateDisplay('6');
                break;
            case '7':
                updateDisplay('7');
                break;
            case '8':
                updateDisplay('8');
                break;
            case '9':
                updateDisplay('9');
                break;
            case '.':
                updateDot();
                break;
            case 'C':
                resetAll();
                break;
            case '+':
                saveOperator('+');
                break;
            case '-':
                saveOperator('-');
                break;
            case '*':
                saveOperator('*');
                break;
            case '/':
                saveOperator('/');
                break;
            case '=':
                findResults(this.operator);
                break;
        }
    }

    public void resetAll() {
        displayInfo.delete(0, displayInfo.length());
        displayInfo.append(0);
        this.isDouble = false;
        this.a = 0;
        this.b = 0;
        t1.setText(displayInfo.toString());
    }

    ;

    public void updateDot() {
        if (this.isDouble == false) {
            displayInfo.append(".");
            this.isDouble = true;
            t1.setText(displayInfo.toString());
        }
    }

    public void saveOperator(char x) // for +, -, * , /
    {
        if (x != this.operator) {
            this.a = Double.parseDouble(displayInfo.toString());
            this.operator = x;
            displayInfo.delete(0, displayInfo.length());
            displayInfo.append(0);
            t1.setText(displayInfo.toString());
            this.isDouble = false;
            //System.out.println("Save Number a="+a+" Save Operator as "+operator);
        }
    }

    public void updateDisplay(char x) // for 1~9
    {
        if ("0".equals(t1.getText())) {
            displayInfo.delete(0, 1);
        }
        displayInfo.append(x);
        t1.setText(displayInfo.toString());
        //System.out.println("Append a with "+x);
    }

    public void findResults(char x) // for +, -, *, /
    {
        if ('=' == operator) {
            t1.setText(displayInfo.toString());
        } else {
            double result = this.a;
            this.b = Double.parseDouble(displayInfo.toString());
            //System.out.println("Save Number b="+b+" Find Result Using Operator "+operator);
            // Determine the operator
            switch (x) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                case '^':
                    result = Math.pow(a, b);
            }
            operator = '=';
            a = result;
            //System.out.println("Answer is a="+result);
            if (a != 0) {
                displayInfo.delete(0, displayInfo.length());
                displayInfo.append(String.valueOf(a));
                isDouble = true;
            } else {
                displayInfo.delete(0, displayInfo.length());
                displayInfo.append("0");
                isDouble = false;
            }
            t1.setText(displayInfo.toString());
        }

    }
}
