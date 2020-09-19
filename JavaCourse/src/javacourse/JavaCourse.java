/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author Safofoh
 */


public class JavaCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
        
        double a;
        a = 0;
        
        //int num = 2;
        int b = 3;
        for (int num = 2; num < 20;  num = num + 1)
        //while (num < 20)
        {
            //int div = num-1;
            boolean prime = true;
            for (int div = num-1; div > 1 && div < num; div = div - 1)
            //while (div > 1 && div < num)
            {
                if (num % div == 0)
                { prime = false;}
                //div = div - 1;
                
            }
            if (prime){
                System.out.println(num);
            }
        
        //num = num + 1;
        }
 
        
        /*
         a = a + 1;
        System.out.println(a);
         a = a + 1;
        System.out.println(a);
         a = a + 1;
        System.out.println(a);
        
      */
        System.out.println("Bye");
       
      
    }
    
}
