/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutions;

import java.util.Scanner;
import static solutions.Solutions.sumOfNumbers;

/**
 *
 * @author Safofoh
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    
    public static int factorial(int n) {
        
        int fct = 1;
        if (n<=0)
            return -1;
        else
            
            for (int i =1; i<=n; i++){
            fct *= i;
            }
        
        return fct;
          
    }    
    
    
    public static void main(String[] args) {
        System.out.print("Enter number to calculate its factorial:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
 
        int n = myObj.nextInt();  // Read user input
        int result = factorial(n);
        
        System.out.print("The factorial of "+n+" is "+ result);
    }
    
}
