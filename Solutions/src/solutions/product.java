/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutions;

import java.util.Scanner;
import static solutions.sumof_array.sumOfNumbers;

/**
 *
 * @author Safofoh
 */
public class product {

    /**
     * @param args the command line arguments
     */
    
    
    public static int productOfArray(int[] array) {
        int prod = 1;
        for (int i=0; i < array.length; i++) {
        prod *= array[i];
        }
    return prod;
    }
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers to find their product:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        int a[] = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            a[i] = myObj.nextInt();
            
        }
 
        
        int result = productOfArray(a);
        
        System.out.print("The product of these numbers is " + result);
    }
    
}
