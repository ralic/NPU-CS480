/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

import java.util.Scanner;

/**
 *
 * @author raliclo
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        byte a = 110;
        short b = 30000;
        int c = 32154786;
        long d = 467871213;
        double e;//= 12.3456;

        // 輸入
        System.out.print("Please enter e : ");
        Scanner in = new Scanner(System.in);
        e = in.nextDouble();
        //
        System.out.println("\nByte: " + a + "\nShort: " + b + "\nInt: " + c + "\nLong: " + d);
        System.out.println("double:" + e);

    }
}
