/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod;

/**
 *
 * @author Safofoh
 */
public class Mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for (int i=1; i<50005;i++){
           
        //   if ((i%5 == 4) && (i%2 ==1) && (i%3 ==1) && (i%13 ==0))
               
           if ((i%7 == 2) && (i%5 ==3) )
              
              
               System.out.println(i);
           
           
       }
    }
    
}
