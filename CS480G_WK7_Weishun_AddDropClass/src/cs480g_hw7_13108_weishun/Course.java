/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g_hw7_13108_weishun;

/**
 *
 * @author raliclo
 */
public class Course {

    private String courseName;
    private static int size = 16;
    private String[] students = new String[size];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) {
        // if numberOfStudents larger than size, increase size of array
        if (numberOfStudents >= size) {
            size *= 2;
            String[] temp = new String[size];
            //System.arraycopy(students, 0, temp, 0, students.length);
            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }
            students = temp;
            System.out.println("\nArray Size Enlarged to Double.");
        }
        students[numberOfStudents] = student;
        System.out.println("** " + student + " is added into " + this.courseName);
        numberOfStudents++;

    }

    public void printvalues() {
        System.out.println("\nPrinting Whole object");
        System.out.println("\nCourse Name =" + this.courseName);
        System.out.println("numberOfStudents=" + this.numberOfStudents);
        System.out.println("Printing all students name info ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("students[" + i + "]= " + students[i]);
        }
    }

    public void printvalid() {
        System.out.println("\nCourse Name =" + this.courseName);
        System.out.println("numberOfStudents=" + this.numberOfStudents);
        System.out.println("Printing all students name info ");
        for (int i = 0; i < this.numberOfStudents; i++) {
            System.out.println("students[" + i + "]= " + students[i]);
        }
        System.out.println("Final Students List for " + this.courseName);
        for (int i = 0; i < this.numberOfStudents; i++) {
            if ((i % 5) == 0) {
                System.out.println("\n");
            }
            System.out.print(students[i] + "\t");
        }
    }

    public void clear() {
        System.out.println("\n!! Clear all student records");
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        this.numberOfStudents = 0;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudents(String student) {
        // set students[i] to null if it equals to student name
        // count new numberof students
        System.out.println();
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].equals(student)) {
                this.students[i] = null;
                this.numberOfStudents--;
                System.out.println("##Droping student name " + student);
            }
        }
        // creat temp array same as the new numbersofstudents to replace students

        String[] temp = new String[this.numberOfStudents];
        int j = 0; // temp array index
        size = this.numberOfStudents; //resize new array
        // remove student[i] if its values is null
        // copy students[i] into temp array if it is not null
        for (String student1 : students) {
            if (student1 == null) {
            } else {
                temp[j] = student1;
                //System.out.println("students["+i+"] is in new array["+j+"]"); // for debug,put students i in temp array
                j++;
            }
        }

        // replace reference of students array
        this.students = temp;
    }

}
