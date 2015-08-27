/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
 import java.util.Scanner;
        
/**
 *
 * @author raliclo
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Part-1
        /*
        System.out.println("This program will calculate circular area ");
        System.out.println("Key in Radius of the circle");
        Scanner in = new Scanner(System.in);
        double r,Area;
        r = in.nextDouble();
        Area = r*r*3.14;
        System.out.println("Area of the circle:"+ Area);
        */
        // Part-2
        /*
        System.out.println("This program will compare two integers ");
        System.out.println("Key in two integers:");
        Scanner in2 = new Scanner(System.in);
        int a,b;
        System.out.println("a (1st integer):");
        a = in2.nextInt();
        System.out.println("b (2nd integer):");
        b = in2.nextInt();
        if (a > b){
        System.out.println("Results : a > b");}
        if (a == b) {
        System.out.println("Results : a = b");}
        if (a < b){
        System.out.println("Results : a < b");}
        */
        // Part-3
        
        System.out.println("This program will seperate 5 digits number");
        System.out.println("Key in the number:");
        Scanner in3 = new Scanner(System.in);
        int n,d1,d2,d3,d4,d5;
        n = in3.nextInt();
        d1 = n%10;
        d2 = (n-d1)%100/10;
        d3 = (n-d1-d2*10)%1000/100;
        d4 = (n-d1-d2*10-d3*100)%10000/1000;
        d5 = (n-d1-d2*10-d3*100-d4*1000)%100000/10000;
        System.out.println("Final :"+ d5 + " " + d4 +" "+ d3 + " " + d2 + " " + d1 );
        
        // TODO code application logic here
    }
    
}
