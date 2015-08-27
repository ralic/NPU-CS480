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
public class Triangle {
    
    private double a;
    private double b;
    private double c;

    private double semiparameter() 
    {
        return ((a+b+c)/2);
    }
    
    public Triangle()
    {
        this.a=1;
        this.b=1;
        this.c=1;
    }
    
    public Triangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
     public void setTriangle(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("\nChange the sides of triangle to A: "+this.a+"\tB:"+ this.b +"\tC:"+this.c);
    }   
     
    public double getTri_a()
    {
        return this.a;
    }
     
    public double getTri_b()
    {
        return this.b;
    }
         
    public double getTri_c()
    {
        return this.c;
    }
    
    public double area()
    {
        double s = this.semiparameter();
        double aa = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Calcualted the area of Triangle.");
        return aa;
    }

   
    public String toString() {
        //double aa= this.area();
        return "\nThree sides of the triangle are A: "+this.a+"\tB:"+ this.b +"\tC:"+this.c;
    }

}
