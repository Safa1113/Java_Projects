/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year;

/**
 *
 * @author Safofoh
 */
public class loop {
    
           public static void main(String[]args) {

           int i = 0 ;
int sum = 0;
int n = Integer.parseInt (args[0]);

          while (i <= n) 
                     {   i=i + 1; 
                     if(i <= n)
                               sum = sum + 1; 
                         i ++ ;
             }
        System.out.println(sum);
        }
}
