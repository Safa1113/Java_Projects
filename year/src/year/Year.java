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
public class Year {

   public static void main (String [] arge) {

Scanner n = new Scanner (System.in); 

int year = n.nextInt();
if ( year%4==0 ) { 

System.out.print ( "The lear year " +year); 
                 }

else if (year%4 !=0) { 

System.out.print (" The simple year "+year); 
          }
    }
    
}
