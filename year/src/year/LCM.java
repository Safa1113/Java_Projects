/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year;

import java.util.Scanner;

/**
 *
 * @author Safofoh
 */
public class LCM {
    
   public static void main(String[]args) { 
        Scanner input = new Scanner (System.in); 
        int a = Integer.parseInt (args[0]);
        int b = Integer.parseInt (args[1]);
        int LCM;
      int i = a ;
      while (true){
      if (i % a == 0 && i % b == 0)

     {    LCM = i;
      break;
          }
      i++;
      }
       System.out.print(LCM);
    }
  
}
