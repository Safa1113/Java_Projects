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
public class Number {
    
        public static void main (String [] args ) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter Numbers");
         int Number1 = input.nextInt();
         int Number2 = input.nextInt();
         if (Number1 > Number2)
                    System.out.println( Number1 + "is the max Number");

                }
}
