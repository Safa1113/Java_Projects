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
public class average {

    /**
     * @param array
     * @param args the command line arguments
     * @return 
     */
    
    public static double averageOfArray(int[] array) {
        double sum = 0;
        for (int i=0; i < array.length; i++) {
        sum += array[i];
        }
        double average = sum / array.length;
    return average;
    }
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers to find their average:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        int a[] = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            a[i] = myObj.nextInt();
            
        }
 
        
        double result = averageOfArray(a);
        
        System.out.print("The average of these numbers is " + result);
    }
    
}