package cs480.lab.pkgfinal;

import java.util.Scanner;

public class Student extends Person {

    private long id;

    private double gpa;

    private String stream;

    public Student(long a, double b, String c) throws InvalidInputException {
        this.id = a;
        this.gpa = b;
        this.stream = c;
    }

    public Student() throws InvalidInputException {
        try {
            this.getInput();
        } catch (InvalidInputException ex) {
            System.out.println(ex.toString());
        }
        try {
            super.getInput();
        } catch (InvalidInputException ex2) {
            System.out.println(ex2.toString());
        }
    }

    @Override
    public void getInput() throws InvalidInputException {

        InvalidInputException iie = new InvalidInputException();
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter Student ID :");
            this.setId(in.nextLong());
        } catch (Exception ex) {
            System.out.println("Student ID set to 0 \n ");
            throw iie.foundInvalidInputException(ex.toString(), ex.hashCode());
        }
        try {
            System.out.println("Enter Student gpa :");
            this.setGpa(in.nextDouble());
        } catch (Exception ex) {
            System.out.println("Student GPA set to 0.0 \n ");
            throw iie.foundInvalidInputException(ex.toString(), ex.hashCode());
        }
        try {
            System.out.println("Enter Student stream :");
            this.setStream(in.nextLine());
        } catch (Exception ex) {
            throw iie.foundInvalidInputException(ex.toString(), ex.hashCode());
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        super.display();
        System.out.println("|Id=" + getId() + "|gpa=" + getGpa() + "|stream=" + getStream()); //To change body of generated methods, choose Tools | Templates.

        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "|Id=" + getId() + "|gpa=" + getGpa() + "|stream=" + getStream();
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the stream
     */
    public String getStream() {
        return stream;
    }

    /**
     * @param stream the stream to set
     */
    public void setStream(String stream) {
        this.stream = stream;
    }
}
