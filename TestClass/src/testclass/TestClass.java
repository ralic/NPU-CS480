/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raliclo
 */
public class TestClass {

    public static void main(String[] args) {
        int size = 10;
        ArrayList<Person> Ppls = new ArrayList();
        for (int i = 0; i < size; i++) {
            Person[] ppl;
            ppl = new Person[size];
            ppl[i] = new Person();
            ppl[i].setBirthday(LocalDate.MIN);
            ppl[i].setEmailAddress("abc");
            ppl[i].setGender(Sex.MALE);
            ppl[i].setName("A");
            Ppls.add(ppl[i]);
        }
        for (int i = 0; i < Ppls.size(); i++) {
            System.out.println(Ppls.get(i).toString());
        }
        System.out.println("---Tradition---");

        for (Person Ppl : Ppls) {
            System.out.println(Ppl.toString());
        }
        System.out.println("---For loop---");

        Ppls.stream().forEach((Ppl) -> {
            System.out.println(Ppl.toString());
        });
        System.out.println("---Lambda Experssion---");
        //        Ppls.add(b);
        //        printPersonsOlderThan
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}

//    public class TestClass {
//
//        public static long main(String[] args) {
//            System.out.println("Hello");
////        return 10L;
//        }
//    }
