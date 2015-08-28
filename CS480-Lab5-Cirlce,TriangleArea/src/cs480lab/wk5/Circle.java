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
public class Circle {

    private double radius;
    private static final double pi = 3.141592627;

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getCir_r() {
        return this.radius;
    }

    public void setCircle(double r) {
        this.radius = r;
        System.out.println("\nChange the circle raidus to :" + this.radius);
    }

    public double area() {
        double aa;
        aa = this.pi * Math.pow(this.radius, 2);
        System.out.println("Calcualted the area of cirlce.");
        return aa;
    }

    @Override
    public String toString() {
        //double aa= this.area();
        return "\nThis cirlce has radius :" + this.radius;
    }

}
