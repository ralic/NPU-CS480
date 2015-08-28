/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.quiz2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author raliclo
 */
public interface LineReader {
	public int readLines(String filename) throws FileNotFoundException,IOException;
	public int readFirstNLines(String filename, int n) throws FileNotFoundException,IOException;
	public int readLastNLines(String filename, int n) throws FileNotFoundException,IOException;
	public int readSpecificLines(String filename, int m, int n) throws FileNotFoundException,IOException;   
}



