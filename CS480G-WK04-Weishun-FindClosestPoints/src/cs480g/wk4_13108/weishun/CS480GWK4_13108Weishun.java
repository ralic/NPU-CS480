/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.wk4_13108.weishun;

import java.util.Scanner;

/**
 *
 * @author raliclo
 */
public class CS480GWK4_13108Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// Input number of points N_pt
        System.out.print("Enter number of points : ");
        Scanner in = new Scanner(System.in);
        int N_pts = in.nextInt();
// Input every pts,
        double[][] pts = new double[N_pts][3];
        System.out.print("Enter " + N_pts + " points (x,y,z) seperated by space\n");
        for (int i = 0; i < N_pts; i++) {
            System.out.print("pts[" + i + "][]= (x y z) = ");
            pts[i][0] = in.nextDouble();
            //System.out.print("pts["+i+"][y]=");
            pts[i][1] = in.nextDouble();
            //System.out.print("pts["+i+"][z]=");
            pts[i][2] = in.nextDouble();
            //System.out.println();
        }
        displayallpts(pts, N_pts);
// calaculate P2P distance
// for each pts,compare distance, find smallest
        // assume nearest = 1 & 2
        int n1 = 0, n2 = 1;
        int i, j;
        double nearest = p2pdistance(pts, 0, 1);
        for (i = n1; i < pts.length - 2; i++)// variable 1st pts =0~lenght-1
        {
            for (j = i + 1; j < pts.length - 1; j++) // variable next pts =~lenght
            {
                double temp = p2pdistance(pts, i, j);
                if (temp < nearest) {
                    n1 = i;
                    n2 = j;
                    nearest = temp;
                }
            }
        }

// Show nearest pts n1,n2
        //System.out.print("The closest pts are "+ n1 + " and " + n2+"\n");
        display2pts(pts, n1, n2);
        System.out.printf("\nThe cloest distance is %.4f\n", nearest);
    }
//

    public static double p2pdistance(double[][] pts, int n1, int n2) {
        double distance;
        distance = Math.sqrt(
                Math.pow((pts[n1][0] - pts[n2][0]), 2)
                + Math.pow((pts[n1][1] - pts[n2][1]), 2)
                + Math.pow((pts[n1][2] - pts[n2][2]), 2));
        //System.out.print("Distance of " + n1 +" & " +n2 +"=" + distance +"\n");
        return distance;
    }

    public static void displayallpts(double[][] pts, int N_pts) {
        System.out.printf("\nDisplay all points as below:\n");
        for (int i = 0; i < N_pts; i++) {
            System.out.printf("pt[%d][] = (%.1f,%.1f,%.1f)\n", i, pts[i][0], pts[i][1], pts[i][2]);
        }

    }

    public static void display2pts(double[][] pts, int n1, int n2) {
        System.out.printf("\nThe closet points are %d & %d:\n", n1, n2);
        System.out.printf("pt[%d][] = (%.1f,%.1f,%.1f)\n", n1, pts[n1][0], pts[n1][1], pts[n1][2]);
        System.out.printf("pt[%d][] = (%.1f,%.1f,%.1f)\n", n2, pts[n2][0], pts[n2][1], pts[n2][2]);
    }
}
