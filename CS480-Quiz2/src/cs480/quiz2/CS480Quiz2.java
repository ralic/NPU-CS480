/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.quiz2;

import java.io.IOException;

/**
 *
 * @author raliclo
 */
public class CS480Quiz2 extends ImplementLineReader {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        ImplementLineReader lr = new ImplementLineReader();
        
        
        System.out.println("\nReading Whole Files\n");
        int totalLines = lr.readLines("./SampleCSVFile.txt");   
        System.out.println("\nReaded lines : "+totalLines);
        System.out.println("\nReading first 10 lines\n");
        int readfirst10= lr.readFirstNLines("./SampleCSVFile.txt",10);
        System.out.println("\nReading last 10 lines--method1\n");
        int readlast101 = lr.readLastNLines("./SampleCSVFile.txt",10);
        System.out.println("\nReading last 10 lines--method2\n");
        int readlast102 = lr.readLastNLines2("./SampleCSVFile.txt",10);
        System.out.println("\nReading Specific Lines\n");
        int readspecific = lr.readSpecificLines("./SampleCSVFile.txt", 10, 15);
    }
    
}
/*
1)	Implement the following interface:

public interface LineReader {
	public int readLines(String filename);
	public int readFirstNLines(String filename, int n);
	public int readLastNLines(String filename, int n);
	public int readSpecificLines(String filename, int m, int n);
}

*/