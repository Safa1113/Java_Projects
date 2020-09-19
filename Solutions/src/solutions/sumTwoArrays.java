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


public class sumTwoArrays {

    /**
     * @param args the command line arguments
     */
    
    
    public static int[] sumOf2Arrays(int[] array1, int[] array2) {
        int[] sum = new int[array1.length < array2.length? array1.length:array2.length];
        for (int i=0; i < sum.length; i++) {
        sum[i] += array1[i] + array2[i];
        }
    return sum;
    }
     
    public static void main(String[] args) {
        System.out.print("Enter length of Array1:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int len1 = myObj.nextInt(); 
        System.out.print("Enter length of Array2:\n");
        int len2 = myObj.nextInt(); 
        int a1[] = new int[len1];
        int a2[] = new int[len2];
        
        System.out.print("Enter numbers to be added to Array1\n");
        for(int i = 0; i < len1; i++)
        {
            a1[i] = myObj.nextInt();
            
        }
        System.out.print("Enter numbers to be added to Array2\n");
        for(int i = 0; i < len2; i++)
        {
            a2[i] = myObj.nextInt();
            
        } 
        
        int[] result = sumOf2Arrays(a1,a2);
        
        System.out.print("The sum of numbers in the array is " + java.util.Arrays.toString(result));
    }
    
}
