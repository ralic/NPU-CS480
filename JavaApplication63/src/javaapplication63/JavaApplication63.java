/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author raliclo
 */
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x++;
        System.out.println(x + " " + y + " " + z);
        int a = --y;
        System.out.println(x + " " + y + " " + z + " " + a);
        int b = z--;
        System.out.println(x + " " + y + " " + z + " " + a + " " + b);
        b += ++z;
        System.out.println(x + " " + y + " " + z + " " + a + " " + b);
        System.out.println(new Boolean(false));
        System.out.println(new Boolean("yes"));
        System.out.println(Boolean.parseBoolean("True"));
        System.out.println(Boolean.valueOf("true"));
        ;
    }

}
