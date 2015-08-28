/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs457.hw;

import java.util.Scanner;

/**
 *
 * @author raliclo
 */
public class CS457HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);
        System.out.println("Miles Per Gallon Program");
        double iM, fM, gas;
        double MPG;

        System.out.println("Enter Initial miles:");
        iM = in.nextDouble();
        System.out.println("Enter Final miles:");
        fM = in.nextDouble();
        System.out.println("Enter Gas usage(gallon)");
        gas = in.nextDouble();

        MPG = (fM - iM) / gas;
        System.out.printf("Miles per gallon: %.1f\n", MPG);

    }
}
