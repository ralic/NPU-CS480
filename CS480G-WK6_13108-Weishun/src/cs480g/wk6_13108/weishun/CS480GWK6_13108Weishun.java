package cs480g.wk6_13108.weishun;

import java.util.Scanner;

/**
 *
 * @author raliclo
 */
public class CS480GWK6_13108Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        while (1 == 1) { // Continious running follow scripts
            String str = "0";
            // Prompt user to enter string using while loop
            while (str.length() != 13) {
                System.out.print("Enter a string : ");
                str = in.nextLine();
                if (str.length() == 13) {   // Break while loop to print phone number when format length is 13.
                    break;
                }
                System.out.println("You have entered a string with length: " + str.length());
                System.out.println("Enter again with x-xxx-xxxxxxx as phone number!\n");
            }

            System.out.printf("Phone number is :");
            printstr2Number(str.toUpperCase()); // Convert Uppercase string to phone numbers
        }
    }

    // This method convert characters to integer based on the phonepad coversion table.
    private static int getNumber(char uppercaseLetter) {
        int a = uppercaseLetter;
        //if (a>=97 && a<=122) {a=a-32; return a;}
        //if (a<(int)'A' || a>(int)'Z') return a;
        if (a <= 'C') {
            return 2;
        }
        if (a <= 'F') {
            return 3;
        }
        if (a <= 'I') {
            return 4;
        }
        if (a <= 'L') {
            return 5;
        }
        if (a <= 'O') {
            return 6;
        }
        if (a <= 'S') {
            return 7;
        }
        if (a <= 'V') {
            return 8;
        } else {
            return 9;
        }
    }

    //This method help to print out the string to phone numbers.
    private static void printstr2Number(String str) {
        int temp;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if (temp >= 'A' & temp <= 'Z') {
                System.out.printf("%d", getNumber(str.charAt(i)));
            } else //System.out.printf("%c",(char)getNumber(str.charAt(i)));  // method-1
            {
                System.out.printf("%c", str.charAt(i));  // method-2
            }
        }
        System.out.println("\n");
    }

}

/*
 (Phone keypads)
 The international standard letter/number mapping found on the telephone is: (refer to the attachment)

 Write a method that returns a number, given an uppercase letter, as follows:
 public static int getNumber(char uppercaseLetter)
 Write a test program that prompts the user to enter a phone number as a string. The input number may contain letters. The program translates a letter (upper- or lowercase) to a digit and leaves all other characters intact. Refer to the attachment for the sample output and required output.
 Submit your source code and screenshots in one WORD document or zip file (if more files included) at “Week 6 Assignment” from course portal by 11:30pm the next class day.
 File name: CS480(Section)_Week#_StudentID
 Late penalty: 10% off for one day late; 20% off for two days late; 30% off for three days late; 50% off for 4 days late; 70% off for 5 days late. No credit received afterwards. && Any resubmission request will apply 10 points deduction.
 */
