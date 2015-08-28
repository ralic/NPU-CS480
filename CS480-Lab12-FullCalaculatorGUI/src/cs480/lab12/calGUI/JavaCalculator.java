/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab12.calGUI;

/**
 *
 * @author raliclo
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaCalculator extends JFrame {

    private JButton jbtNum1;
    private JButton jbtNum2;
    private JButton jbtNum3;
    private JButton jbtNum4;
    private JButton jbtNum5;
    private JButton jbtNum6;
    private JButton jbtNum7;
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;
    private JButton jbtEqual;
    private JButton jbtAdd;
    private JButton jbtSubtract;
    private JButton jbtMultiply;
    private JButton jbtDivide;
    private JButton jbtSolve;
    private JButton jbtClear;
    private double TEMP;
    private double SolveTEMP;
    private JTextField jtfResult;

    private Boolean addBool = false;
    private Boolean subBool = false;
    private Boolean divBool = false;
    private Boolean mulBool = false;

    private String display = "";

    public JavaCalculator() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));
        p1.add(jbtNum1 = new JButton("1"));
        p1.add(jbtNum2 = new JButton("2"));
        p1.add(jbtNum3 = new JButton("3"));
        p1.add(jbtNum4 = new JButton("4"));
        p1.add(jbtNum5 = new JButton("5"));
        p1.add(jbtNum6 = new JButton("6"));
        p1.add(jbtNum7 = new JButton("7"));
        p1.add(jbtNum8 = new JButton("8"));
        p1.add(jbtNum9 = new JButton("9"));
        p1.add(jbtNum0 = new JButton("0"));
        p1.add(jbtClear = new JButton("C"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(5, 1));
        p3.add(jbtAdd = new JButton("+"));
        p3.add(jbtSubtract = new JButton("-"));
        p3.add(jbtMultiply = new JButton("*"));
        p3.add(jbtDivide = new JButton("/"));
        p3.add(jbtSolve = new JButton("="));

        JPanel p = new JPanel();
        p.setLayout(new GridLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
        p.add(p3, BorderLayout.EAST);

        add(p);

        jbtNum1.addActionListener(new ListenToOne());
        jbtNum2.addActionListener(new ListenToTwo());
        jbtNum3.addActionListener(new ListenToThree());
        jbtNum4.addActionListener(new ListenToFour());
        jbtNum5.addActionListener(new ListenToFive());
        jbtNum6.addActionListener(new ListenToSix());
        jbtNum7.addActionListener(new ListenToSeven());
        jbtNum8.addActionListener(new ListenToEight());
        jbtNum9.addActionListener(new ListenToNine());
        jbtNum0.addActionListener(new ListenToZero());

        jbtAdd.addActionListener(new ListenToAdd());
        jbtSubtract.addActionListener(new ListenToSubtract());
        jbtMultiply.addActionListener(new ListenToMultiply());
        jbtDivide.addActionListener(new ListenToDivide());
        jbtSolve.addActionListener(new ListenToSolve());
        jbtClear.addActionListener(new ListenToClear());

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    } //JavaCaluclator()

    /**
     * @return the jbtNum1
     */
    public JButton getJbtNum1() {
        return jbtNum1;
    }

    /**
     * @param jbtNum1 the jbtNum1 to set
     */
    public void setJbtNum1(JButton jbtNum1) {
        this.jbtNum1 = jbtNum1;
    }

    /**
     * @return the jbtNum2
     */
    public JButton getJbtNum2() {
        return jbtNum2;
    }

    /**
     * @param jbtNum2 the jbtNum2 to set
     */
    public void setJbtNum2(JButton jbtNum2) {
        this.jbtNum2 = jbtNum2;
    }

    /**
     * @return the jbtNum3
     */
    public JButton getJbtNum3() {
        return jbtNum3;
    }

    /**
     * @param jbtNum3 the jbtNum3 to set
     */
    public void setJbtNum3(JButton jbtNum3) {
        this.jbtNum3 = jbtNum3;
    }

    /**
     * @return the jbtNum4
     */
    public JButton getJbtNum4() {
        return jbtNum4;
    }

    /**
     * @param jbtNum4 the jbtNum4 to set
     */
    public void setJbtNum4(JButton jbtNum4) {
        this.jbtNum4 = jbtNum4;
    }

    /**
     * @return the jbtNum5
     */
    public JButton getJbtNum5() {
        return jbtNum5;
    }

    /**
     * @param jbtNum5 the jbtNum5 to set
     */
    public void setJbtNum5(JButton jbtNum5) {
        this.jbtNum5 = jbtNum5;
    }

    /**
     * @return the jbtNum6
     */
    public JButton getJbtNum6() {
        return jbtNum6;
    }

    /**
     * @param jbtNum6 the jbtNum6 to set
     */
    public void setJbtNum6(JButton jbtNum6) {
        this.jbtNum6 = jbtNum6;
    }

    /**
     * @return the jbtNum7
     */
    public JButton getJbtNum7() {
        return jbtNum7;
    }

    /**
     * @param jbtNum7 the jbtNum7 to set
     */
    public void setJbtNum7(JButton jbtNum7) {
        this.jbtNum7 = jbtNum7;
    }

    /**
     * @return the jbtNum8
     */
    public JButton getJbtNum8() {
        return jbtNum8;
    }

    /**
     * @param jbtNum8 the jbtNum8 to set
     */
    public void setJbtNum8(JButton jbtNum8) {
        this.jbtNum8 = jbtNum8;
    }

    /**
     * @return the jbtNum9
     */
    public JButton getJbtNum9() {
        return jbtNum9;
    }

    /**
     * @param jbtNum9 the jbtNum9 to set
     */
    public void setJbtNum9(JButton jbtNum9) {
        this.jbtNum9 = jbtNum9;
    }

    /**
     * @return the jbtNum0
     */
    public JButton getJbtNum0() {
        return jbtNum0;
    }

    /**
     * @param jbtNum0 the jbtNum0 to set
     */
    public void setJbtNum0(JButton jbtNum0) {
        this.jbtNum0 = jbtNum0;
    }

    /**
     * @return the jbtEqual
     */
    public JButton getJbtEqual() {
        return jbtEqual;
    }

    /**
     * @param jbtEqual the jbtEqual to set
     */
    public void setJbtEqual(JButton jbtEqual) {
        this.jbtEqual = jbtEqual;
    }

    /**
     * @return the jbtAdd
     */
    public JButton getJbtAdd() {
        return jbtAdd;
    }

    /**
     * @param jbtAdd the jbtAdd to set
     */
    public void setJbtAdd(JButton jbtAdd) {
        this.jbtAdd = jbtAdd;
    }

    /**
     * @return the jbtSubtract
     */
    public JButton getJbtSubtract() {
        return jbtSubtract;
    }

    /**
     * @param jbtSubtract the jbtSubtract to set
     */
    public void setJbtSubtract(JButton jbtSubtract) {
        this.jbtSubtract = jbtSubtract;
    }

    /**
     * @return the jbtMultiply
     */
    public JButton getJbtMultiply() {
        return jbtMultiply;
    }

    /**
     * @param jbtMultiply the jbtMultiply to set
     */
    public void setJbtMultiply(JButton jbtMultiply) {
        this.jbtMultiply = jbtMultiply;
    }

    /**
     * @return the jbtDivide
     */
    public JButton getJbtDivide() {
        return jbtDivide;
    }

    /**
     * @param jbtDivide the jbtDivide to set
     */
    public void setJbtDivide(JButton jbtDivide) {
        this.jbtDivide = jbtDivide;
    }

    /**
     * @return the jbtSolve
     */
    public JButton getJbtSolve() {
        return jbtSolve;
    }

    /**
     * @param jbtSolve the jbtSolve to set
     */
    public void setJbtSolve(JButton jbtSolve) {
        this.jbtSolve = jbtSolve;
    }

    /**
     * @return the jbtClear
     */
    public JButton getJbtClear() {
        return jbtClear;
    }

    /**
     * @param jbtClear the jbtClear to set
     */
    public void setJbtClear(JButton jbtClear) {
        this.jbtClear = jbtClear;
    }

    /**
     * @return the TEMP
     */
    public double getTEMP() {
        return TEMP;
    }

    /**
     * @param TEMP the TEMP to set
     */
    public void setTEMP(double TEMP) {
        this.TEMP = TEMP;
    }

    /**
     * @return the SolveTEMP
     */
    public double getSolveTEMP() {
        return SolveTEMP;
    }

    /**
     * @param SolveTEMP the SolveTEMP to set
     */
    public void setSolveTEMP(double SolveTEMP) {
        this.SolveTEMP = SolveTEMP;
    }

    /**
     * @return the jtfResult
     */
    public JTextField getJtfResult() {
        return jtfResult;
    }

    /**
     * @param jtfResult the jtfResult to set
     */
    public void setJtfResult(JTextField jtfResult) {
        this.jtfResult = jtfResult;
    }

    /**
     * @return the addBool
     */
    public Boolean getAddBool() {
        return addBool;
    }

    /**
     * @param addBool the addBool to set
     */
    public void setAddBool(Boolean addBool) {
        this.addBool = addBool;
    }

    /**
     * @return the subBool
     */
    public Boolean getSubBool() {
        return subBool;
    }

    /**
     * @param subBool the subBool to set
     */
    public void setSubBool(Boolean subBool) {
        this.subBool = subBool;
    }

    /**
     * @return the divBool
     */
    public Boolean getDivBool() {
        return divBool;
    }

    /**
     * @param divBool the divBool to set
     */
    public void setDivBool(Boolean divBool) {
        this.divBool = divBool;
    }

    /**
     * @return the mulBool
     */
    public Boolean getMulBool() {
        return mulBool;
    }

    /**
     * @param mulBool the mulBool to set
     */
    public void setMulBool(Boolean mulBool) {
        this.mulBool = mulBool;
    }

    /**
     * @return the display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * @param display the display to set
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    class ListenToClear implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //display = jtfResult.getText();
            getJtfResult().setText("");
            setAddBool((Boolean) false);
            setSubBool((Boolean) false);
            setMulBool((Boolean) false);
            setDivBool((Boolean) false);

            setTEMP(0);
            setSolveTEMP(0);
        }
    }

    class ListenToOne implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "1");
        }
    }

    class ListenToTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "2");
        }
    }

    class ListenToThree implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "3");
        }
    }

    class ListenToFour implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "4");
        }
    }

    class ListenToFive implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "5");
        }
    }

    class ListenToSix implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "6");
        }
    }

    class ListenToSeven implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "7");
        }
    }

    class ListenToEight implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "8");
        }
    }

    class ListenToNine implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "9");
        }
    }

    class ListenToZero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setDisplay(getJtfResult().getText());
            getJtfResult().setText(getDisplay() + "0");
        }
    }

    class ListenToAdd implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setTEMP(Double.parseDouble(getJtfResult().getText()));
            getJtfResult().setText("");
            setAddBool((Boolean) true);

        }
    }

    class ListenToSubtract implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setTEMP(Double.parseDouble(getJtfResult().getText()));
            getJtfResult().setText("");
            setSubBool((Boolean) true);
        }
    }

    class ListenToMultiply implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setTEMP(Double.parseDouble(getJtfResult().getText()));
            getJtfResult().setText("");
            setMulBool((Boolean) true);

        }
    }

    class ListenToDivide implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setTEMP(Double.parseDouble(getJtfResult().getText()));
            getJtfResult().setText("");
            setDivBool((Boolean) true);
        }
    }

    class ListenToSolve implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            setSolveTEMP(Double.parseDouble(getJtfResult().getText()));
            if (getAddBool() == true) {
                setSolveTEMP(getSolveTEMP() + getTEMP());
            } else if (getSubBool() == true) {
                setSolveTEMP(getSolveTEMP() - getTEMP());
            } else if (getMulBool() == true) {
                setSolveTEMP(getSolveTEMP() * getTEMP());
            } else if (getDivBool() == true) {
                setSolveTEMP(getSolveTEMP() / getTEMP());
            }
            getJtfResult().setText(Double.toString(getSolveTEMP()));

            setAddBool((Boolean) false);
            setSubBool((Boolean) false);
            setMulBool((Boolean) false);
            setDivBool((Boolean) false);

        }
    }

    public static void main(String[] args) {
        JavaCalculator calc = new JavaCalculator();
        calc.pack();
        calc.setLocationRelativeTo(null);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

} //JavaCalculator
