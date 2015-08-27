package cs480.lab.pkgfinal;

import static java.lang.System.in;
import java.util.Scanner;

public class Person implements Inputable, IPrintable {

    private String name;
    private int age;
    private InvalidInputException IIE;

    public Person() throws InvalidInputException {
        try {
            getInput();
        } catch (InvalidInputException ex) {
            System.out.println(ex.toString() + "\n");
        }
    }

    public Person(String a, int b) {
        this.name = a;
        this.age = b;
    }

    @Override
    public String toString() {
        return "Name=" + getName() + " | Age=" + getAge();
    }

    @Override
    public void getInput() throws InvalidInputException {
        Scanner in = new Scanner(System.in);

        InvalidInputException iie = new InvalidInputException();
        try {
            System.out.println("Enter Person Name :");
            this.setName(in.nextLine());
        } catch (Exception ex) {
            throw iie.foundInvalidInputException(ex.toString(), ex.hashCode());
        }

        try {
            System.out.println("Enter Person Age :");
            this.setAge(in.nextInt());
        } catch (Exception ex) {
            System.out.println("Person Age set to 0 \n ");
            throw iie.foundInvalidInputException(ex.toString(), ex.hashCode());
        }

        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("|Name=" + getName() + "|Age=" + getAge()); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
