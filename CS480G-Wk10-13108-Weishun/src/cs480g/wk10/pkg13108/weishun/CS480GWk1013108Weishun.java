/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.wk10.pkg13108.weishun;

import javax.swing.JFrame;

/**
 *
 * @author raliclo
 */
public class CS480GWk1013108Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Show6Layout frame = new Show6Layout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Center a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);// Display the frame
        
    }
    
}

/*
¢(Swing common features) 
v Display a frame that contains six labels. 
v Set the background of the labels to white. 
v Set the foreground of the labels to black, blue, cyan, green, magenta, and orange, respectively, as shown below. 
v Set the border of each label to a line border with the color yellow. 
v Set the font of each label to Times Roman, bold, and 20 pixels. 
v Set the text and tool tip text of each label to the name of its foreground color.
​( Refer to the attachment for screenshot)
¢[Extra credits: 20 points]
v Set two different kinds of cursors to the top three labels and the bottom three labels.
*/