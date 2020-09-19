/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutions;

import java.util.Scanner;
import static solutions.Factorial.factorial;

/**
 *
 * @author Safofoh
 */
public class FactorialUsingRecursion {

    /**
     * @param n
     */
    
    public static int factorialRecursion(int n) {
        
        
        if (n==0)
            return -1;
        else if (n==1)
            return 1;
        else
            return n * factorialRecursion(n-1);
  
    }    
    public static void main(String[] args) {
        System.out.print("Enter number to calculate its factorial:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
 
        int n = myObj.nextInt();  // Read user input
        int result = factorialRecursion(n);
        
        System.out.print("The factorial of "+n+" is "+ result);
    }
    
}
