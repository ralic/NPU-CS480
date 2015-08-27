/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.pkg13108.weishun_wk3;

/*import java.util.Scanner;*/
/**
 *
 * @author raliclo
 */
public class CS480G13108Weishun_wk3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Scanner in = new Scanner(System.in);*/
        int i;
        int[] IntList = new int[10];
        for (i = 0; i < IntList.length; i++) {
            IntList[i] = (int) (Math.random() * 100);
            System.out.println("Integer[" + i + "] is " + IntList[i]);
        }
        int avgINT = (average(IntList));
        System.out.println("Average of Integer numbers is " + avgINT + "\n");

        double[] DoubleList = new double[10];
        for (i = 0; i < 10; i++) {
            DoubleList[i] = (Math.random() * 50);
            System.out.printf("Double[%d] is %3.2f\n", i, DoubleList[i]);
        }
        double avgDouble = (average(DoubleList));
        System.out.printf("Average of Double numbers is %3.2f\n", avgDouble);

    }

    public static int average(int[] array) {
        int i = 0;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //System.out.println("Sum is " + sum);
        int avg = (int) (sum / 10);
        //System.out.println("Avg is " + avg);
        return avg;
    }

    public static double average(double[] array) {
        int i = 0;
        double sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //System.out.println("Sum is " + sum);
        double avg = (sum / 10);
        //System.out.println("Avg is " + avg);
        return avg;
    }
}
