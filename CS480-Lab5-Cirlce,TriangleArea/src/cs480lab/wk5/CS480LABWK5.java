/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480lab.wk5;

/**
 *
 * @author raliclo
 */
public class CS480LABWK5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Area;
        Triangle testTri = new Triangle(2,3,4);
        System.out.println(testTri+ "--To_String Test");
        Area=testTri.area();    
        System.out.println("\nTriangle Area is :"+ Area);
        testTri.setTriangle(5,6,7);
        Area=testTri.area();  
        System.out.println(testTri+ "--To_String Test");
        System.out.println("\nTriangle Area is :"+ Area);
        
        Circle testCir = new Circle(3);
        Area = testCir.area();
        double r=testCir.getCir_r();
        System.out.println("\nCircle Area is :"+ Area+ "\tRadius is :" + r);
        testCir.setCircle(5);
        Area = testCir.area();
        System.out.println("\nCircle Area is :"+ Area+ "\tRadius is private,unchanged :" + r);
        System.out.println(testCir + "--To_String Test");
 
    }
    
}
