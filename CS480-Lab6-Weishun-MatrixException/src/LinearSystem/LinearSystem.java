/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSystem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raliclo
 */
public class LinearSystem {

    private double[][] coefficients;
    private double[] constants;
    public double dtm;
    public double dtx;
    public double dty;

    public LinearSystem() {
        this.coefficients = new double[2][2];
        this.constants = new double[2];
    }

    public LinearSystem(double[][] a, double[] b) {
        this.coefficients = a;
        this.constants = b;
        String c = this.toString();
    }

    public double getDeterminant() throws MatrixException {
        double a = this.coefficients[0][0];
        double b = this.coefficients[0][1];
        double c = this.coefficients[1][0];
        double d = this.coefficients[1][1];
        dtm = (a * d - b * c);
        System.out.println("Determinat of Matrix is" + dtm);
        return dtm;
    }

    public double getDeterminantX() throws MatrixException {
        double a = this.coefficients[0][0];
        double b = this.coefficients[0][1];
        double c = this.coefficients[1][0];
        double d = this.coefficients[1][1];
        double e = this.constants[0];
        double f = this.constants[1];
        dtx = (e * d - f * b);
        System.out.println("Determinat of X is " + dtx);
        return dtx;
    }

    public double getDeterminantY() throws MatrixException {
        double a = this.coefficients[0][0];
        double b = this.coefficients[0][1];
        double c = this.coefficients[1][0];
        double d = this.coefficients[1][1];
        double e = this.constants[0];
        double f = this.constants[1];
        dty = (a * f - e * c);
        System.out.println("Determinat of Y is " + dty);
        return dty;
    }

    public double[][] getInverse() throws MatrixException {
        double a = this.coefficients[0][0];
        double b = this.coefficients[0][1];
        double c = this.coefficients[1][0];
        double d = this.coefficients[1][1];
        this.dtm = this.getDeterminant();
        double[][] inv = new double[2][2];
        inv[0][0] = d / dtm;
        inv[0][1] = -b / dtm;
        inv[1][0] = -c / dtm;
        inv[1][1] = a / dtm;
        return inv;
    }

    @Override
    public String toString() {

        try {
            double a = this.getInverse()[0][0];
            double b = this.getInverse()[0][1];
            double c = this.getInverse()[1][0];
            double d = this.getInverse()[1][1];
            double e = this.constants[0];
            double f = this.constants[1];
            double a2 = this.coefficients[0][0];
            double b2 = this.coefficients[0][1];
            double c2 = this.coefficients[1][0];
            double d2 = this.coefficients[1][1];
            this.dtm = this.getDeterminant();
            this.dtx = this.getDeterminantX();
            this.dty = this.getDeterminantY();

            System.out.println("ORIGINAL Matrix- Equation 1 :" + a2 + "X + " + b2 + "Y=" + e);
            System.out.println("ORIGINAL Matrix- Equation 2 :" + c2 + "X + " + d2 + "Y=" + f);

            System.out.println("Inversed Matrix : [" + a + "," + b + "]");
            System.out.println("Inversed Matrix : [" + c + "," + d + "]");
            System.out.println("X= " + dtx / dtm);
            System.out.println("Y= " + dty / dtm);

            return " Test ";

        } catch (MatrixException ex) {
            Logger.getLogger(LinearSystem.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
// Reference :
//http://ncalculators.com/matrix/2x2-inverse-matrix-calculator.htm
//http://www.mathportal.org/algebra/solving-system-of-linear-equations/inverse-matrix-method.php
//http://www.mathportal.org/calculators/system-of-equations-solver/system-2x2.php
