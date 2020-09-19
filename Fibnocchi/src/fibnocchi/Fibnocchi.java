/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibnocchi;

import java.util.Scanner;

/**
 *
 * @author Safofoh
 */
public class Fibnocchi {

    /**
     * @param args the command line arguments
     */
    
    public static void Fibonacci(int n){
        
        int f = 0;
        int s = 1;
        int i = 1;
        int sum = 0;
        
        while (i<=n){
            
            
            int temp = f;
            f = s;
            s = sum;
            sum = f+s;
            System.out.print(sum + ", ");
            i++;
        }
               
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.print("Enter n of Fibonacci Series\n");  
        int n= sc.nextInt();  
        Fibonacci(n);
        
        
    }
    
}
