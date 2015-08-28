/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.quiz2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author raliclo
 */
public class ImplementLineReader implements LineReader {
           
        @Override
        public int readLines(String filename) throws FileNotFoundException,IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        //BufferedWriter bw = new BufferedWriter(filename);
        int count=0;
        String line= br.readLine();
        for (int i =1 ; ( line != null);i++)
        {
        //process each line in some way
        System.out.println(i+" Line :"+line);
        line= br.readLine();
        count++;
        }
        br.close();
        return count;
        }
        
        @Override
        public int readFirstNLines(String filename,int n) throws FileNotFoundException,IOException  {
        BufferedReader br = new BufferedReader(new FileReader(filename));     
        String line = br.readLine();
        for( int i = 1; (line  != null) && i <= n; i++)
        {
            System.out.println(i+" Line :"+line);
            line = br.readLine();
        }
        br.close();
        return 1;
        }
        
        @Override
        public int readLastNLines(String filename, int n) throws FileNotFoundException,IOException{
            RandomAccessFile rafile = new RandomAccessFile(filename, "r");
            StringBuilder builder = new StringBuilder();
            long length = rafile.length();
            length--;
            rafile.seek(length);
            int lines = 0;
            for(long seek = length; seek >= 0; --seek){
                rafile.seek(seek);
                char c = (char)rafile.read();
                if (c != '\n') {builder.append(c);}
                if (c == '\n'){
                        builder = builder.reverse();
                        if (lines >=1) {System.out.println(lines+" Line :"+builder.toString());};
                        lines++;
                        // creat new line
                        builder = null;
                        builder = new StringBuilder();
                        // stop after n lines
                        if (lines == (n+1)){
                            break;
                        }
                }
           }
            return 1;
        }
        
        
    public int readLastNLines2(String filename, int n) throws FileNotFoundException,IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));     
        String line = br.readLine();        
        int totalLines = 0;
        for( int i = 1; (line != null); i++)
        {
           line = br.readLine();
           totalLines++;
        }
        br.close();
        BufferedReader br2 = new BufferedReader(new FileReader(filename));
        line = br2.readLine();
        for( int i = 1; (line  != null);i++)
        {
            if (i>(totalLines-n) && (line !=null)) {
            System.out.println(i+" Line :"+line);
            }
            line = br2.readLine();
        }
        br2.close();
        return 2;   
        }
        
            
        
        @Override
	public int readSpecificLines(String filename, int m, int n) throws FileNotFoundException,IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));     
        String line = br.readLine();        
        for( int i = 1; (line != null); i++)
        {
            if ( i>=m && i<=n && (line !=null) ) 
           {
            System.out.println(i+" Line :"+line);
           }
           line = br.readLine();
        }
        br.close();    
        return (m-n);
        }

}
