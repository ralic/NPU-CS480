/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriterDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raliclo
 */
public class WriterDemo {

    public static void main(String[] args) throws IOException {

        class Writer {

            public String name;
            public String age;
            public String emailAddress;
            public int yearOfBirth;
        }
        List<Writer> w = new ArrayList();
        String file = "test.txt";
        FileWriter fw1 = new FileWriter(file + '1');

        Writer w1 = new Writer();
        w1.name = "James";
        w1.age = "24";
        w1.emailAddress = "james@company.com";
        w.add(w1);// Array for print

        fw1.write(w1.name + " " + w1.age + " " + w1.emailAddress + " " + w1.yearOfBirth);
        fw1.close();

        FileWriter fw2 = new FileWriter(file + '2');
        Writer w2 = new Writer();
        w2.name = "Joe";
        w2.age = "25";
        w2.yearOfBirth = 1988;
        w.add(w2);

        fw2.write(w2.name + " " + w2.age + " " + w2.emailAddress + " " + w2.yearOfBirth);
        fw2.close();

        for (int i = 0; i < 2; i++) {
            System.out.println("Name: " + w.get(i).name);
            System.out.println("Age: " + w.get(i).age);
            System.out.println("Email Address: " + w.get(i).emailAddress);
            System.out.println("Year Of Birth: " + w.get(i).yearOfBirth + "\n");
        }
    }
}
