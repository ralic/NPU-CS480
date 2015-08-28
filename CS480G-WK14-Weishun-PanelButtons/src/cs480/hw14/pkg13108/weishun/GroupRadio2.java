/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.hw14.pkg13108.weishun;

import static cs480.hw14.pkg13108.weishun.PaintColorLabel.clb1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

/**
 *
 * @author raliclo
 */
public class GroupRadio2 {

    static JRadioButton[] jrbs;

    GroupRadio2() {
    }

    public static Component createRadioButtons(String array[], String str) {
        // Initialize
        JPanel jp1 = new JPanel();
        Border bod1 = null;
        ButtonGroup btg = new ButtonGroup();
        //System.out.println(array.length);// for debug
        jrbs = new JRadioButton[array.length];

        ActionListener aLS = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton abt = (AbstractButton) e.getSource();
                String abtStr = abt.getText();
                clb1.setBG(abtStr);
                System.out.println("Clicked--" + abt.getText()); // for debug
            }
        };

        int i;
        for (i = 0;
                i < array.length;
                i++) {
            jrbs[i] = new JRadioButton(array[i]);
            // System.out.println(array[i]); // for debug
            jrbs[i].addActionListener(aLS);
            jp1.add(jrbs[i]); // add radio buttons to inner panel #1
            btg.add(jrbs[i]);
            //jrbs[i].setBorderPainted(false); // pain or unpain bolder
        }

        // Border setup
        int hjustification = 1; // 1 Left , 2 Center , 3 Right , 4 Leader ,5 Trailing
        int vposition = 2; // 2= on the top , 5 = on the bottom
        Font fontStyle = null;
        bod1 = BorderFactory.createTitledBorder(bod1, str, hjustification, vposition, fontStyle, Color.RED);

        // Layout setup
        GridLayout gridH, gridV;
        gridH = new GridLayout(array.length, 1, 2, 2);
        gridV = new GridLayout(1, array.length, 2, 2);

        jp1.setBorder(bod1);
        jp1.setLayout(gridV);

        return jp1;
    }

}

//        public static TitledBorder createTitledBorder(Border border,
//                        String title,
//                        int titleJustification,
//                        int titlePosition,
//                        Font titleFont,
//                        Color titleColor)
//     int hjustification = 1; // 1 Left , 2 Center , 3 Right , 4 Leader ,5 Trailing
//     * @param titleJustification  an integer specifying the justification of the title -- one of the following:
//     *<li><code>TitledBorder.LEFT </code> 1
//     *<li><code>TitledBorder.CENTER</code>2
//     *<li><code>TitledBorder.RIGHT</code> 3
//     *<li><code>TitledBorder.LEADING</code> 4
//     *<li><code>TitledBorder.TRAILING</code> 5
//     *<li><code>TitledBorder.DEFAULT_JUSTIFICATION</code> 0 = 4(leading)
/**
 * Use the default vertical orientation for the title text. //
 */
    //     int vposition = TitledBorder.ABOVE_TOP;
//    static public final int     DEFAULT_POSITION        = 0; (it's on the TOP)
//    /** Position the title above the border's top line. */
//    static public final int     ABOVE_TOP               = 1; (above  top)
//    /** Position the title in the middle of the border's top line. */
//    static public final int     TOP                     = 2; (on the top)
//    /** Position the title below the border's top line. */
//    static public final int     BELOW_TOP               = 3; (below the top)
//    /** Position the title above the border's bottom line. */
//    static public final int     ABOVE_BOTTOM            = 4; (above bottom)
//    /** Position the title in the middle of the border's bottom line. */
//    static public final int     BOTTOM                  = 5; (on the bottom)
//    /** Position the title below the border's bottom line. */
//    static public final int     BELOW_BOTTOM            = 6; (below the bottom)
