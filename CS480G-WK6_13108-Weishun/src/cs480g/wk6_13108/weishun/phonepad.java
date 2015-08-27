/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs480g.wk6_13108.weishun;

/**
 *
 * @author raliclo
 */
public class phonepad {
    
   public int convert1(char c)
    {
       int a = (int)c;
       if (a>=97 && a<=122) a=a-32;
       if (a<65 || a>90) return c;
       if (a<=(int)'C') return 2;
       if (a<=(int)'F') return 3;
       if (a<=(int)'I') return 4;
       if (a<=(int)'L') return 5';
       if (a<=(int)'O') return 6';
       if (a<=(int)'S') return 7;
       if (a<=(int)'V') return 8;
         else return 9;
    }  // convert1
   }


    public static int getNumber(char uppercaseLetter) {
        int z=-1;
        switch (uppercaseLetter){
            case 'A' : z= 2; break;
            case 'B' : z= 2; break;
            case 'C' : z= 2; break;
            case 'D' : z= 3; break;
            case 'E' : z= 3; break;
            case 'F' : z= 3; break; 
            case 'G' : z= 4; break;
            case 'H' : z= 4; break;
            case 'I' : z= 4; break;
            case 'J' : z= 5; break;
            case 'K' : z= 5; break;
            case 'L' : z= 5; break;                 
            case 'M' : z= 6; break;
            case 'N' : z= 6; break;
            case 'O' : z= 6; break;
            case 'P' : z= 7; break;
            case 'Q' : z= 7; break;
            case 'R' : z= 7; break; 
            case 'S' : z= 7; break;
            case 'T' : z= 8; break;
            case 'U' : z= 8; break;
            case 'V' : z= 8; break;
            case 'W' : z= 9; break;
            case 'X' : z= 9; break;                  
            case 'Y' : z= 9; break;                  
            case 'Z' : z= 4; break;                                  
        }
        return z;
    }