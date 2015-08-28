/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.hw14.pkg13108.weishun;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author raliclo
 */
public class PaintColorLabel extends JFrame {

    JPanel p2, p3;
    static ColorLabel clb1;
    String[] colors = {"Red", "Yellow", "White", "Gray", "Green"};
//    String[] colors = {"Red", "Yellow", "White", "Gray", "Green", "Blue"}; // for test more colors
    JButton jbtL, jbtR;

    public PaintColorLabel() {
        // Set Windows
        this.setLocationRelativeTo(null); // Center the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Use GroupRadio as p1
        add(GroupRadio2.createRadioButtons(colors, "Set Message Panel Background"));

        // Panel p2 setup
        p2 = new JPanel();
        clb1 = new ColorLabel("Welcome to Java");
        clb1.jlb.setPreferredSize(new Dimension(400, 50));
        p2.setPreferredSize(new Dimension(400, 50));
        p2.add(clb1.jlb);

        // Panel p3 setup
        p3 = new JPanel();
        jbtL = new JButton("<=");
        jbtR = new JButton("=>");

        //jbtL,jbtR Listener setup
        ActionListener jbtLAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clb1.getIndex() > 0) {
                    clb1.setIndex(clb1.getIndex() - 1);
                }
                clb1.setBG(colors[clb1.getIndex()]);
                System.out.println("Go to Left");// for debug
            }
        };
        ActionListener jbtRAL = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (clb1.getIndex() < colors.length - 1) {
                    clb1.setIndex(clb1.getIndex() + 1);
                }
                clb1.setBG(colors[clb1.getIndex()]);
                System.out.println("Go to Right"); // for debug
            }
        };
        jbtL.addActionListener(jbtLAL);
        jbtR.addActionListener(jbtRAL);
        jbtL.setPreferredSize(new Dimension(100, 40));
        jbtR.setPreferredSize(new Dimension(100, 40));
        p3.add(jbtL);
        p3.add(jbtR);

        // Final Frame
        this.add(p2);
        this.add(p3);
        GridLayout gridL1 = new GridLayout(3, 1, 2, 2);
        this.setLayout(gridL1);

        // Display Windows
        this.pack();
        this.setResizable(false);
        this.setVisible(true);

    }
}
