/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g_hw9_13108_weishun;

/**
 *
 * @author raliclo
 */
import java.util.*;

public class ArrayListDemo {
	public ArrayListDemo() {
		// create an array list
		ArrayList al= new ArrayList();
		System.out.println("Initial ArrayList : "+al);
		
		 // add elements to the array list
		al.add("A");
		al.add("B");
		
		//find size of ArrayList
		System.out.println("Size of al :"+al.size());
		// display the array list
		System.out.println("Contents of al :"+al);
		al.add(1,"C");
		System.out.println("Contents of al :"+al);
		System.out.println("Size of al :"+al.size());
	}
}
