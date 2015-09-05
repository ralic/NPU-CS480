/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication66;

/**
 *
 * @author raliclo
 */
public class JavaApplication66 {

    public static void main(String[] args) {

        inner = Afinal.java;
        Afinal a = new Afinal(this);
//        a.i = 10;     //Compile time error
//        a.j = 20;     //even you can't assign same value to final variables
        System.out.println(a.i + " " + a.j);
        a.methodOne(20);

    }
}
