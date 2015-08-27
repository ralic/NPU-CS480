/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab.pkgfinal;

/**
 *
 * @author raliclo
 */
public class CS480LabFinal {

    /**
     * @param args the command line arguments
     * @throws cs480.lab.pkgfinal.InvalidInputException
     */
    public static void main(String[] args) throws InvalidInputException, Exception {
        // TODO code application logic here
        Person test1 = new Person();
        test1.display();
        test1.toString();
        System.out.println("\n---Test of Person Done---");

        Student test2 = new Student();
        test2.display();
        test2.toString();

        System.out.println("\n--Test of Student Done---");
    }

}
