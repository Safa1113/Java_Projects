/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutions;

import java.util.Scanner;

/**
 *
 * @author Safofoh
 */
public class Solutions {

    /**
     * @param args the command line arguments
     */
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i =0; i<n; i++){
            sum += i;
        }
        
        return sum;
          
    }
    
    
    public static void main(String[] args) {
        System.out.print("Enter N:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
 
        int n = myObj.nextInt();  // Read user input
        int result = sumOfNumbers(n);
        
        System.out.print("The sum of numbers less than "+n+" is "+ result);
   
    }
    
}
