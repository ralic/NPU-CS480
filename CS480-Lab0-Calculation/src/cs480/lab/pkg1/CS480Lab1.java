/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab.pkg1;

import java.util.Scanner;

/**
 *
 * @author raliclo
 */
public class CS480Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b;
        System.out.println("enter a number");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("enter another number");
        b = in.nextInt();
        System.out.println("What operation you want?");
        System.out.println("1. Add");
        System.out.println("2. Substrate");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter your choice");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println(a + b);
        }
        if (choice == 2) {
            System.out.println(a - b);
        }
        if (choice == 3) {
            System.out.println(a * b);
        }
        if (choice == 4) {
            System.out.println(a / b);
        }
    }

}
