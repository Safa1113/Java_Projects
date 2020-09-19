/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modlist;

/**
 *
 * @author Safofoh
 */
public class Modlist {

    /**
     * @param args the command line arguments
     */
    public static void modlist() {
              int p = 3733;
        int mod = 11;
        
           for (int i=0; i<=mod*p ;i+=p){
           
      
             
              
             int n = 0;
              if ((p+1)%6 == 0 )
                  n=(p+1)/6;
              else if ((p-1)%6 == 0 )
                   n=(p-1)/6;
              int g = (i%mod + 2*n)%mod;
                System.out.println(i%mod + "  " + g);
        
           
       }
    }
    
       public static void functionlist() {
      
           for (int i=1; i<=22 ;i++){
           
             int func;
             
            // func = (36*(i*i))+(12*i)+1;
             func = (i*i*i*i);
             int mod5 = func % 5;
             int mod7 = func % 7;
             int mod11 = func % 11;
             int mod13 = func % 13;
              
             
                System.out.println(i + " func = " + func +  " " + mod5 +  " " + mod7 +  " " + mod11 +  " " + mod13);
        
           
       }
    }
    
    
    public static void main(String[] args) {
    //  modlist();
  functionlist();
        
    }
    
}
