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
public class CS480G_HW7_13108_Weishun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creat testcourse
        Course testcourse = new Course("CS480 JavaCourse");        
        testcourse.printvalues();
        // add student 1~10
        for (int i=0;i<10;i++)
        {
            testcourse.addStudent("Test 1~10");
        }
        testcourse.printvalues();
        // add student 11~20
        for (int i=10;i<20;i++)
        {
            testcourse.addStudent("TestStudent#"+(i+1));
        }
        testcourse.printvalues();
        // add more students
        testcourse.addStudent("Ralic");
        testcourse.addStudent("Lo"); 
        // print valid students
        testcourse.printvalid();
        // drop student Test 1~10s & Ralic
        testcourse.dropStudents("Test 1~10");
        testcourse.dropStudents("Ralic"); 
        testcourse.printvalues();
        // clear all
        testcourse.clear();
        testcourse.printvalues();
        
    }
        

    
}

/*
Revise the Course class as follows:
¢ The array size is fixed in Listing 10.6. 
Improve it to automatically increase the array size 
by creating a new larger array and 
copying the contents of the current array to it. 
( default capacity = 16, increased the size of array to the double if necessary)
¢Implement the dropStudent method.
¢Add a new method named clear() that removes all students from the course.
¢Write a test program that creates a course with default capacity, adds twenty students, removes two, adds another two and displays the students in the course.
Submit your source code and screenshots in one WORD document or zip file (if more files included) at “Week 7 Assignment” from course portal by 11:30pm the next class day.
File name: CS480(Section)_Week#_StudentID

*/