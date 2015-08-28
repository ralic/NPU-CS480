/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs457.hw102;

import java.util.*;
import java.io.*;
/*
 import java.io.FileReader;
 import java.io.BufferedReader;
 import java.io.IOException;
 */

/**
 *
 * @author raliclo
 */
public class CS457HW102 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     *
     */
    public static void main(String[] args) throws IOException {
        //use . to get current directory
        File dir = new File(".");
        File fin = new File(dir.getCanonicalPath() + File.separator + "salary.txt");
        readFile2(fin);
        int[][] S_P = new int[4][5];//Sales_Products

        System.out.println("Enter one line of data seperated by space");

    }

    private static void readFile2(File fin) throws IOException {
        // Construct BufferedReader from FileReader
        BufferedReader br = new BufferedReader(new FileReader(fin));
        String line = null;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            Scanner in = new Scanner(line);
            int s1 = in.nextInt();//salesperson number
            int s2 = in.nextInt();//product number
            int s3 = in.nextInt();//sold value
            System.out.printf("SalesPerson : %d, Product Number : %d, Sold Value : %d\n", s1, s2, s3);
        }
        br.close();
    }
}

/*
 int i,j;
 for (i=1,i<5,i++)
 {
 for (j=1,j<6,j++)
 {
 if (i = s1 && j= s2)
 {
 S_P[i][j]= S_P[i][j]+s3;
 }
 System.out.printf("S_P[%d][%d]=%d", i,j, S_P[i][j]);
 };
 };
 */
/*
 Use a two-dimensional array to solve the following problem:

 A company has four salespeople (1 to 4) who sell five different products (1 to 5).

 Once a day, each salesperson passes in a slip for each type of product sold.

 Each slip contains the following:
 a) The salesperson number
 b) The product number
 c) The total dollar value of that product sold that day

 Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information from all the slips for last month is available.

 Write an application that will read all this information for last month’s sales and summarize the total sales by salesperson and by product. All totals should be stored in the two-dimensional array sales.

 After processing all the information for last month, display the results in tabular format, with each column representing a salesperson and each row representing a particular product. Cross-total each row to get the total sales of each product for last month.

 Cross-total each column to get the total sales by salesperson for last month. Your output should include these cross-totals to the right of the totaled rows and to the bottom of the totaled columns.

 */
