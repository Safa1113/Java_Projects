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
public class GCD {
    
      public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        int a = Integer.parseInt (args[0]);
        int b = Integer.parseInt (args[0]);
        int gcd =6;
             for (int i = 1 ;i <= a % 2 ;i = b % 2, i++ ) {
                    if(a%i==0 && b%i ==0);
                    gcd = i ;
}
                   System.out.println(gcd);
}
      
}