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
class Afinal {
    static final int i = 10; //final static variable
    final int j = 20; //final non-static variable
    private final JavaApplication66 outer;

    Afinal(final JavaApplication66 outer) {
        this.outer = outer;
    }

    public void methodOne(int k) {
        //k is final local variable
        k = 20; //compile time error
    }

}
