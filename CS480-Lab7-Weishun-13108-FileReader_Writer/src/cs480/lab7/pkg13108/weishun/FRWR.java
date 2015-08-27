/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480.lab7.pkg13108.weishun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author raliclo
 */
public class FRWR {
        private String fileR = "./SampleCSVFile.txt";
        private String fileW = "./SampleCSVFile-Writer.txt";
        private FileReader fr;
        private FileWriter fw;
        private BufferedReader br;
        private BufferedWriter bw;
        private int countLines;
    
    /**
     *
     * @throws IOException
     */
    public FRWR() throws IOException{
        countLines=this.FRWRexe(this.fileR,this.fileW);
    }
       
    //FRWRstart help setup FR/BR FW/BR all at a time
    public void FRWRstart(String filename,String filename2) throws FileNotFoundException, IOException{
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        fw = new FileWriter(filename2);
        bw = new BufferedWriter(fw);
    }
    
    // FRWRnf generates nth string in each line into another file.
    // spliter = [,] as default
    public void FRWRnf(int n,String filename2) throws IOException,NullPointerException
    {
        FRWRstart(fileR,filename2);
        
        String line=br.readLine();
        int i,j=0;
        int size=999;
        int size2=999;
        int counts=0;
        
        String[] splits= line.split("[,]");
        String[][] splitss = new String[size][size2] ;
        for (j=0;(line!=null);j++)
        {
            for (i=0;i<splits.length;i++)
            {  
               //System.out.println(split[i]);
               splitss[counts][i]=splits[i];
               System.out.println(splitss[counts][i]);
               splits= line.split("[,]");
               if (i==n) {
                   bw.write(splitss[counts][n]+"\n");
                }
               }
            line=br.readLine();
            counts++;
        }
        closeall();
    }
            
    // FRWRexe returns lines of the file 
    // first input filename is the source file
    // second input filename is the destination file
    public int FRWRexe (String filename,String filename2) throws FileNotFoundException,IOException {
        FRWRstart(filename,filename2);        
        int count=0;
        String line=br.readLine();
        for (int i =1 ; (line != null);i++)
        {
        //process each line in some way
//        System.out.println(i+" Line :"+line);     // skipable    
        //fw.write(i+" Line :"+line+"\n");
        bw.append(i+" Line :"+line+"\n");
        line=br.readLine();        
        count++;
        }
        this.closeall();
        return count;
        }
    
    //setter for BR
    public void setfrbr(String filename) throws FileNotFoundException
    {
        this.fr=new FileReader(filename);
        this.br=new BufferedReader(br);
    }
    
    //setter for BW
    public void setfwbw(String filename) throws FileNotFoundException, IOException
    {
        this.fw=new FileWriter(filename);
        this.bw=new BufferedWriter(fw);
    }
    
    //closeall() help to close every FR/BR BR/BW
    public void closeall() throws IOException
    {
        this.br.close();
        this.bw.close();
        this.fr.close();
        this.fw.close();
    }
    public String getfileR()
    {
        return fileR;
    }
    public String getfileW()
    {
        return fileW;
    }
}
