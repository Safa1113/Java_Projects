/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solutions;

import java.util.Scanner;
import static solutions.sumTwoArrays.sumOf2Arrays;

/**
 *
 * @author Safofoh
 */
public class matrixMultiplication {

    /**
     * @param array1
     * @param array2
     * @return 
     */
    
    public static int[][] matrixMultiplication(int[][] array1, int[][] array2) {
        int[][] mult;
        mult = new int[array1.length][array2[0].length];
        for (int i=0; i < array1.length; i++) {
            for (int j=0; j < array2[0].length; j++) {
                for (int k=0; k < array2.length; k++) {
                    mult[i][j] += array1[i][k] * array2[k][j];
        }}}
    return mult;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter Number of rows in Array1:\n");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int row1 = myObj.nextInt(); 
        System.out.print("Enter Number of columns in Array1:\n");
        int clmn1 = myObj.nextInt(); 
        System.out.print("Enter Number of rows in Array2:\n");
        int row2 = myObj.nextInt(); 
        System.out.print("Enter Number of columns in Array2:\n");
        int clmn2 = myObj.nextInt(); 
        int a1[][] = new int[row1][clmn1];
        int a2[][] = new int[row2][clmn2];
        
        
        for(int i = 0; i < row1; i++)
        {
            for (int j=0; j<clmn1; j++){
                System.out.print("Enter the elemnt in row " + (i+1) + " and in column " + (j+1) + " for Array1:\n");
                a1[i][j] = myObj.nextInt();
            }
            
        }
        for(int i = 0; i < row2; i++)
        {
            for (int j=0; j<clmn2; j++){
                System.out.print("Enter the elemnt in row " + (i+1) + " and in column " + (j+1) + " for Array2:\n");
                a2[i][j] = myObj.nextInt();
            }
            
        }        
        
        
        int[][] result = matrixMultiplication(a1,a2);
        
        System.out.print("Matrix multiplication of the two Arrays:\n");
        for (int[] res : result) {
            System.out.print(java.util.Arrays.toString(res));
        }
    }
    
}
