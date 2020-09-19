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
public class sumof_array {

    /**
     * @param args the command line arguments
     */
    public static int sumOfNumbers(int[] array) {
        int sum = 0;
        for (int i=0; i < array.length; i++) {
        sum += array[i];
        }
    return sum;
    }
     
     
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers to be summed:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        int a[] = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            a[i] = myObj.nextInt();
            
        }
 
        
        int result = sumOfNumbers(a);
        
        System.out.print("The sum of numbers in the array is " + result);
           
    }
    
}
