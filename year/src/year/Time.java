/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year;

/**
 *
 * @author Safofoh
 */
public class Time {
        public static void main (String [] args)
{
           int h = Integer.parseInt(args[0]); 
            int m = Integer.parseInt(args[1]);
           if( m==59 )
                     if( h==12 )  {
                                 h=1; 
                                 m=0; 
             }

           else {

                               m=0;

                             h=h+1;}

else
                            m=m+1;

                      }
}
