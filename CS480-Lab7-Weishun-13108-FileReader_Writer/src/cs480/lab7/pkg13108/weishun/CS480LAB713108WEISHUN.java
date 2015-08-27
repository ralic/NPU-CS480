/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab7.pkg13108.weishun;

import java.io.IOException;

/**
 *
 * @author raliclo
 */
public class CS480LAB713108WEISHUN {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FRWR test = new FRWR();
        //test.FRWRexe(test.getfileR(),"test2.txt");
        test.FRWRnf(1, "Address.txt");
        test.FRWRnf(11, "Website.txt");
        test.FRWRnf(12, "Phone.txt");
    }

}

/*
Tasks:
1.	Write a java program that reads a file line by line and write its first and last line in a new file at a separate location.
2.	Write a java program that reads a file(csv file) and write the name of the location (first field) and website address of its contents delimited by '&'(instead of csv) in a new line, new file at a separate location.
3.	Also write the phone numbers in a different file named "phone.txt"(each phone number in a different line).

Hint:
•	Refer your java.io slide.
•	Refer online documentation regarding File, FileReader, FileWriter, BufferedReader, BufferedWriter.
•	Refer your Strings.pptx for string manipulation.
•	Refer online documentation of String if necessary.

*/
