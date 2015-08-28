/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.hw14.pkg13108.weishun;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author raliclo
 */
class ColorLabel extends JLabel {

    private static int index;

    public JLabel jlb;

    public ColorLabel(String str) {
        //Initialize ColorLabel
        jlb = new JLabel(str);
        jlb.setText(str);
        jlb.setOpaque(true);
        this.setBG("Red");
    }

    public JLabel getJLabel() {
        return jlb;
    }

    public void setBG(String abtStr) {

        switch (abtStr) {
            case "Red":
//                System.out.println("Red color setting");//for debug
                jlb.setBackground(Color.RED);
                setIndex(0);
                break;
            case "Yellow":
                jlb.setBackground(Color.YELLOW);
                setIndex(1);
                break;
            case "White":
                jlb.setBackground(Color.WHITE);
                setIndex(2);
                break;
            case "Gray":
                jlb.setBackground(Color.GRAY);
                setIndex(3);
                break;
            case "Green":
                jlb.setBackground(Color.GREEN);
                setIndex(4);
                break;
            case "Blue":
                jlb.setBackground(Color.BLUE);
                setIndex(5);
                break;
            default:
                break;
        }
        GroupRadio2.jrbs[getIndex()].setSelected(true);
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param aIndex the index to set
     */
    public void setIndex(int aIndex) {
        index = aIndex;
    }
}
