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
public class GPA {
    
public static void main (String [] args) {

         Scanner input = new Scanner(System.in);
          System.out.print("Enter the geads ");
           int g1 = input.nextInt();
           int g2 = input.nextInt();
           int g3 = input.nextInt();
           int g4 = input.nextInt();
           int g5 = input.nextInt();
           int averag = (g1+g2+g3+g4+g5)/5;
           int GPA = 0;
           if(averag >= 90) {
                   System.out.println(GPA + "A");}
           else if (averag >= 80){
                  System.out.println(GPA + "B");}

           else if (averag >= 70) {
                   System.out.println(GPA + "c");}
           else 
                    System.out.println(GPA + "F");

              }
}
