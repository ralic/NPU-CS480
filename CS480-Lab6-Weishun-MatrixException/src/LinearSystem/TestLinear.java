/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearSystem;

import java.util.Scanner;

/**
 *
 * @author raliclo
 */
public class TestLinear {

    /**
     * @param args the command line arguments
     * @throws LinearSystem.MatrixException
     */
    public static void main(String[] args) throws MatrixException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //System.out.println("Enter the dimension of square matrix: ");
        //int n = input.nextInt();
        int n = 2;
        double a[][] = new double[n][n];
        System.out.println("Enter Cofficients of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]=");
                a[i][j] = input.nextDouble();
            }
        }
        double b[] = new double[n];
        System.out.println("Enter Constant of matrix: ");
        for (int i = 0; i < n; i++) {
            b[i] = input.nextDouble();
        }
        LinearSystem test;
        test = new LinearSystem(a, b);

    }
}
