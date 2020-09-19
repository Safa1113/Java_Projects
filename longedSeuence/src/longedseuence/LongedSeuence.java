/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longedseuence;

/**
 *
 * @author Safofoh
 */
public class LongedSeuence {

    /**
     * @param args the command line arguments
     */
    
    public static void Normal() {
    
             
int max =0; int index=0; int m=0; 
for (int i=1; i<=99999999; i++)
{
m=0;
for (int j = 0; j<= 9999; j++)
{
    

    if (   ((i+j)%(5)==2) || ((i+j)%(5)==0)  || ((i+j)%(7)==0) ||  ((i+j)%(7)==2)  || ((i+j)%(11)==0)   ||   ((i+j)%(11)==4)   || ((i+j)%(13)==0)  ||  ((i+j)%(13)==4)    ||  ((i+j)%(17)==0)   ||  ((i+j)%(17)==6)  ||  ((i+j)%(19)==6)  ||  ((i+j)%(19)==0)   ||  ((i+j)%(23)==0)   || ((i+j)%(23)==8) /*  ||  ((i+j)%(29)==0)   || ((i+j)%(29)==10) ||  ((i+j)%(31)==0)   || ((i+j)%(31)==10) ||  ((i+j)%(37)==0)   || ((i+j)%(37)==12) ||  ((i+j)%(41)==0)   || ((i+j)%(41)==14)  ||  ((i+j)%(43)==0)   || ((i+j)%(43)==14)  ||  ((i+j)%(47)==0)   || ((i+j)%(47)==16)   ||  ((i+j)%(53)==0)   || ((i+j)%(53)==18) */ )
    
          
    m++;
else
break;
}

if (m>max)
{
max =m;
index =i;
//}


//m=0;
//}
System.out.println(index + "=" + max); 
String s = "";
for (int k = index; k < index+ max; k++){

       if (k%(5)==0  || k%(5)==2 )
       s = String.format(s+ "5" + "  "); 
          else   
        if (k%(7)==0  ||  k%(7)==2)
        s = String.format(s+"7" + "  "); 

           else      if (k%(11)==0  || k%(11)==4)
        s = String.format(s+"11" + "  "); 
           else      if (k%(13)==0 || k%(13)==4)
        s = String.format(s+"13" + "  "); 
           
           else      if (k%(17)==0 || k%(17)==6)
       s = String.format(s+"17" + "  "); 
         else      if (k%(19)==0 || k%(19)==6 )
        s = String.format(s+"19" + "  ");
        else      if (k%(23)==0 || k%(23)==8 )
        s = String.format(s+"23" + "  ");
      else      if (k%(29)==0  || k%(29)==10)
        s = String.format(s+"29" + "  ");
         else      if (k%(31)==0  || k%(31)==10)
        s = String.format(s+"31" + "  ");
             else      if (k%(37)==0  || k%(37)==12)
        s = String.format(s+"37" + "  ");
  
               
  
}
System.out.println(s+ "  "); 

}

    

}

    
    
    
    }
    
    
      public static void long24() {
    
             
String s = "";

int distance = 25*3 / 2;
int countT = 0;
for (int j = 1; j<= distance; j++)
{
    int x2 =6*j-4;
    int x4 =6*j-2;
    
    int flag = 0;
    for (int k=1;k<=4; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            
            
            flag = 0;
           
            
            break;
        }
                else{
        flag = 1;    
        
        
        }
        
    }
        if (flag == 1)
        s = String.format(s+"F" + "  ");


}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 
/*String s = "";
for (int k = 6; k < distance*6; k+=6){

    
    
    
    
       if ((k-4)%(5)==0  || (k-2)%(5)==0 )
       s = String.format(s+ "5" + "  "); 
          else   
        if ((k-4)%(7)==0  ||  (k-2)%(7)==0)
        s = String.format(s+"7" + "  "); 
           else 
            if ((k-4)%(11)==0  || (k-2)%(11)==0)
        s = String.format(s+"11" + "  "); 
           else
                if ((k-4)%(13)==0 || (k-2)%(13)==0)
        s = String.format(s+"13" + "  "); 
           
           else  
                    if ((k-4)%(17)==0 || (k-2)%(17)==0)
       s = String.format(s+"17" + "  "); 
         else   
                        if ((k-4)%(19)==0 || (k-2)%(19)==0 )
        s = String.format(s+"19" + "  ");
        else  
                            if ((k-4)%(23)==0 || (k-2)%(23)==0 )
        s = String.format(s+"23" + "  ");
      else  
                                if ((k-4)%(29)==0  || (k-2)%(29)==0)
        s = String.format(s+"29" + "  ");
         else  
                                    if ((k-4)%(31)==0  || (k-2)%(31)==0)
        s = String.format(s+"31" + "  ");
             else  
                                        if ((k-4)%(37)==0  || (k-2)%(37)==0)
        s = String.format(s+"37" + "  ");
       else
                 s = String.format(s+"F" + "  ");
  
}*/
System.out.println(s+ "  "); 

//}

    



    
    
    
    }
      
      
      public static void long11() {
    
             
String s = "";

int distance = 25*3 / 2;
int countT = 0;
for (int j = 1; j<= distance; j++)
{
    int x2 =6*j-1;
    int x4 =6*j+1;
    int flag = 0;
    for (int k=1;k<=3; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            flag = 0;
            break;
            
        }
        else{
        flag = 1;    
        
        
        }
    }
    if (flag == 1)
        s = String.format(s+"F" + "  ");

}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 

System.out.println(s+ "  "); 



    }
    
      
      public static void Normal2() {
    
             
          int distance = 25*3;
          int coun2 = 0;
          int count = 0;
int max =0; int index=0; int m=0; 
for (int i=1; i<=99999999; i++)
{
m=0;
count = 0;
coun2 = 0;
for (int j = 0; j<= distance ; j++)
{
    coun2++;

    if (   ((i+j)%(5)==2) || ((i+j)%(5)==0)  || ((i+j)%(7)==0) ||  ((i+j)%(7)==2)  || ((i+j)%(11)==0)   ||   ((i+j)%(11)==4)   || ((i+j)%(13)==0)  ||  ((i+j)%(13)==4)    ||  ((i+j)%(17)==0)   ||  ((i+j)%(17)==6)  ||  ((i+j)%(19)==6)  ||  ((i+j)%(19)==0)   ||  ((i+j)%(23)==0)   || ((i+j)%(23)==8)  /*  ||  ((i+j)%(29)==0)   || ((i+j)%(29)==10) ||  ((i+j)%(31)==0)   || ((i+j)%(31)==10) ||  ((i+j)%(37)==0)   || ((i+j)%(37)==12) ||  ((i+j)%(41)==0)   || ((i+j)%(41)==14)  ||  ((i+j)%(43)==0)   || ((i+j)%(43)==14)  ||  ((i+j)%(47)==0)   || ((i+j)%(47)==16)   ||  ((i+j)%(53)==0)   || ((i+j)%(53)==18) */ )
    
    {  
    m++;
    count++;
    }
//else
//break;
}

if (count>max)
{
max =count;
index =i;
//}


//m=0;
//}
System.out.println(index + "=" + max + " distance = " + coun2); 
String s = "";
for (int k = index; k < index+ max; k++){

       if (k%(5)==0  || k%(5)==2 )
       s = String.format(s+ "5" + "  "); 
          else   
        if (k%(7)==0  ||  k%(7)==2)
        s = String.format(s+"7" + "  "); 

           else      if (k%(11)==0  || k%(11)==4)
        s = String.format(s+"11" + "  "); 
           else      if (k%(13)==0 || k%(13)==4)
        s = String.format(s+"13" + "  "); 
           
           else      if (k%(17)==0 || k%(17)==6)
       s = String.format(s+"17" + "  "); 
         else      if (k%(19)==0 || k%(19)==6 )
        s = String.format(s+"19" + "  ");
        else      if (k%(23)==0 || k%(23)==8 )
        s = String.format(s+"23" + "  ");
    //  else      if (k%(29)==0  || k%(29)==10)
      //  s = String.format(s+"29" + "  ");
       //  else      if (k%(31)==0  || k%(31)==10)
       // s = String.format(s+"31" + "  ");
        //     else      if (k%(37)==0  || k%(37)==12)
       // s = String.format(s+"37" + "  ");
       else     
        s = String.format(s+"F" + "  ");
  
               
  
}
System.out.println(s+ "  "); 

}

    

}

    
    
    
    }
    
    public static void long37() {
    
             
String s = "";

int distance = 25*3;
int countT = 0;
for (int j = 1; j<= distance; j++)
{
    int x2 =6*j-3;
    int x4 =6*j+1;
    
    int flag = 0;
    for (int k=1;k<=4; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            
            
            flag = 0;
           
            
            break;
        }
                else{
        flag = 1;    
        
        
        }
        
    }
        if (flag == 1)
        s = String.format(s+"F" + "  ");


}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 
/*String s = "";
for (int k = 6; k < distance*6; k+=6){

    
    
    
    
       if ((k-4)%(5)==0  || (k-2)%(5)==0 )
       s = String.format(s+ "5" + "  "); 
          else   
        if ((k-4)%(7)==0  ||  (k-2)%(7)==0)
        s = String.format(s+"7" + "  "); 
           else 
            if ((k-4)%(11)==0  || (k-2)%(11)==0)
        s = String.format(s+"11" + "  "); 
           else
                if ((k-4)%(13)==0 || (k-2)%(13)==0)
        s = String.format(s+"13" + "  "); 
           
           else  
                    if ((k-4)%(17)==0 || (k-2)%(17)==0)
       s = String.format(s+"17" + "  "); 
         else   
                        if ((k-4)%(19)==0 || (k-2)%(19)==0 )
        s = String.format(s+"19" + "  ");
        else  
                            if ((k-4)%(23)==0 || (k-2)%(23)==0 )
        s = String.format(s+"23" + "  ");
      else  
                                if ((k-4)%(29)==0  || (k-2)%(29)==0)
        s = String.format(s+"29" + "  ");
         else  
                                    if ((k-4)%(31)==0  || (k-2)%(31)==0)
        s = String.format(s+"31" + "  ");
             else  
                                        if ((k-4)%(37)==0  || (k-2)%(37)==0)
        s = String.format(s+"37" + "  ");
       else
                 s = String.format(s+"F" + "  ");
  
}*/
System.out.println(s+ "  "); 

//}

    



    
    
    
    }
    
      public static void long35() {
    
             
String s = "";

int distance = 25*3;
int countT = 0;
for (int j = 1; j<= distance; j++)
{
    int x2 =6*j-3;
    int x4 =6*j-1;
    
    int flag = 0;
    for (int k=1;k<=4; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            
            
            flag = 0;
           
            
            break;
        }
                else{
        flag = 1;    
        
        
        }
        
    }
        if (flag == 1)
        s = String.format(s+"F" + "  ");


}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 
/*String s = "";
for (int k = 6; k < distance*6; k+=6){

    
    
    
    
       if ((k-4)%(5)==0  || (k-2)%(5)==0 )
       s = String.format(s+ "5" + "  "); 
          else   
        if ((k-4)%(7)==0  ||  (k-2)%(7)==0)
        s = String.format(s+"7" + "  "); 
           else 
            if ((k-4)%(11)==0  || (k-2)%(11)==0)
        s = String.format(s+"11" + "  "); 
           else
                if ((k-4)%(13)==0 || (k-2)%(13)==0)
        s = String.format(s+"13" + "  "); 
           
           else  
                    if ((k-4)%(17)==0 || (k-2)%(17)==0)
       s = String.format(s+"17" + "  "); 
         else   
                        if ((k-4)%(19)==0 || (k-2)%(19)==0 )
        s = String.format(s+"19" + "  ");
        else  
                            if ((k-4)%(23)==0 || (k-2)%(23)==0 )
        s = String.format(s+"23" + "  ");
      else  
                                if ((k-4)%(29)==0  || (k-2)%(29)==0)
        s = String.format(s+"29" + "  ");
         else  
                                    if ((k-4)%(31)==0  || (k-2)%(31)==0)
        s = String.format(s+"31" + "  ");
             else  
                                        if ((k-4)%(37)==0  || (k-2)%(37)==0)
        s = String.format(s+"37" + "  ");
       else
                 s = String.format(s+"F" + "  ");
  
}*/
System.out.println(s+ "  "); 

//}

    



    
    
    
    }
      
      
        public static void long46() {
    
             
String s = "";

int distance = 25*3;
int countT = 0;
for (int j = 1; j<= distance; j++)
{
    int x2 =6*j;
    int x4 =6*j-2;
    
    int flag = 0;
    for (int k=1;k<=4; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            
            
            flag = 0;
           
            
            break;
        }
                else{
        flag = 1;    
        
        
        }
        
    }
        if (flag == 1)
        s = String.format(s+"F" + "  ");


}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 
/*String s = "";
for (int k = 6; k < distance*6; k+=6){

    
    
    
    
       if ((k-4)%(5)==0  || (k-2)%(5)==0 )
       s = String.format(s+ "5" + "  "); 
          else   
        if ((k-4)%(7)==0  ||  (k-2)%(7)==0)
        s = String.format(s+"7" + "  "); 
           else 
            if ((k-4)%(11)==0  || (k-2)%(11)==0)
        s = String.format(s+"11" + "  "); 
           else
                if ((k-4)%(13)==0 || (k-2)%(13)==0)
        s = String.format(s+"13" + "  "); 
           
           else  
                    if ((k-4)%(17)==0 || (k-2)%(17)==0)
       s = String.format(s+"17" + "  "); 
         else   
                        if ((k-4)%(19)==0 || (k-2)%(19)==0 )
        s = String.format(s+"19" + "  ");
        else  
                            if ((k-4)%(23)==0 || (k-2)%(23)==0 )
        s = String.format(s+"23" + "  ");
      else  
                                if ((k-4)%(29)==0  || (k-2)%(29)==0)
        s = String.format(s+"29" + "  ");
         else  
                                    if ((k-4)%(31)==0  || (k-2)%(31)==0)
        s = String.format(s+"31" + "  ");
             else  
                                        if ((k-4)%(37)==0  || (k-2)%(37)==0)
        s = String.format(s+"37" + "  ");
       else
                 s = String.format(s+"F" + "  ");
  
}*/
System.out.println(s+ "  "); 

//}

    



    
    
    
    }
        
          public static void long62() {
    
             
String s = "";

int distance = 25*3;
int countT = 0;
for (int j = 1; j<= distance; j++)
{
    int x2 =6*j-4;
    int x4 =6*j;
    
    int flag = 0;
    for (int k=1;k<=4; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            
            
            flag = 0;
           
            
            break;
        }
                else{
        flag = 1;    
        
        
        }
        
    }
        if (flag == 1)
        s = String.format(s+"F" + "  ");


}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 
/*String s = "";
for (int k = 6; k < distance*6; k+=6){

    
    
    
    
       if ((k-4)%(5)==0  || (k-2)%(5)==0 )
       s = String.format(s+ "5" + "  "); 
          else   
        if ((k-4)%(7)==0  ||  (k-2)%(7)==0)
        s = String.format(s+"7" + "  "); 
           else 
            if ((k-4)%(11)==0  || (k-2)%(11)==0)
        s = String.format(s+"11" + "  "); 
           else
                if ((k-4)%(13)==0 || (k-2)%(13)==0)
        s = String.format(s+"13" + "  "); 
           
           else  
                    if ((k-4)%(17)==0 || (k-2)%(17)==0)
       s = String.format(s+"17" + "  "); 
         else   
                        if ((k-4)%(19)==0 || (k-2)%(19)==0 )
        s = String.format(s+"19" + "  ");
        else  
                            if ((k-4)%(23)==0 || (k-2)%(23)==0 )
        s = String.format(s+"23" + "  ");
      else  
                                if ((k-4)%(29)==0  || (k-2)%(29)==0)
        s = String.format(s+"29" + "  ");
         else  
                                    if ((k-4)%(31)==0  || (k-2)%(31)==0)
        s = String.format(s+"31" + "  ");
             else  
                                        if ((k-4)%(37)==0  || (k-2)%(37)==0)
        s = String.format(s+"37" + "  ");
       else
                 s = String.format(s+"F" + "  ");
  
}*/
System.out.println(s+ "  "); 

//}

    



    
    
    
    }
          
          
          
          public static void long63() {
    
             
String s = "";

int distance = 25*3;
int countT = 0;
for (int j = 1; j<= distance; j++)
{
    int x2 =4*j-1;
    int x4 =4*(j+7);
    
    int flag = 0;
    for (int k=1;k<=4; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            
            
            flag = 0;
           
            
            break;
        }
                else{
        flag = 1;    
        
        
        }
        
    }
        if (flag == 1)
        s = String.format(s+"F" + "  ");


}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 
/*String s = "";
for (int k = 6; k < distance*6; k+=6){

    
    
    
    
       if ((k-4)%(5)==0  || (k-2)%(5)==0 )
       s = String.format(s+ "5" + "  "); 
          else   
        if ((k-4)%(7)==0  ||  (k-2)%(7)==0)
        s = String.format(s+"7" + "  "); 
           else 
            if ((k-4)%(11)==0  || (k-2)%(11)==0)
        s = String.format(s+"11" + "  "); 
           else
                if ((k-4)%(13)==0 || (k-2)%(13)==0)
        s = String.format(s+"13" + "  "); 
           
           else  
                    if ((k-4)%(17)==0 || (k-2)%(17)==0)
       s = String.format(s+"17" + "  "); 
         else   
                        if ((k-4)%(19)==0 || (k-2)%(19)==0 )
        s = String.format(s+"19" + "  ");
        else  
                            if ((k-4)%(23)==0 || (k-2)%(23)==0 )
        s = String.format(s+"23" + "  ");
      else  
                                if ((k-4)%(29)==0  || (k-2)%(29)==0)
        s = String.format(s+"29" + "  ");
         else  
                                    if ((k-4)%(31)==0  || (k-2)%(31)==0)
        s = String.format(s+"31" + "  ");
             else  
                                        if ((k-4)%(37)==0  || (k-2)%(37)==0)
        s = String.format(s+"37" + "  ");
       else
                 s = String.format(s+"F" + "  ");
  
}*/
System.out.println(s+ "  "); 

//}

    



    
    
    
    }
          
          
           public static void long22() {
    
             
String s = "";

int distance = 25*3 / 2;
int countT = 0;
for (int j = 1-distance; j<= distance; j++)
{
    int x2 =2*j;
    int x4 =2*j+1;
    
    int flag = 0;
    for (int k=1;k<=4; k++)
    {
        int k1 = 6*k-1;
        int k2 = 6*k+1;
        
        if ((x2%k1== 0) || (x2%k2== 0) || (x4%k1== 0) || (x4%k2== 0))
        {
            countT ++;
            if (x2%k1 == 0 || x4%k1 == 0)
            s = String.format(s+ k1 + "  "); 
            else if (x2%k2 == 0 || x4%k2 == 0)
            s = String.format(s+ k2 + "  "); 
            
            
            flag = 0;
           
            
            break;
        }
                else{
        flag = 1;    
        
        
        }
        
    }
        if (flag == 1)
        s = String.format(s+"F" + "  ");


}


System.out.println("count of T " + countT + " count of 2T " + 2 * countT); 
/*String s = "";
for (int k = 6; k < distance*6; k+=6){

    
    
    
    
       if ((k-4)%(5)==0  || (k-2)%(5)==0 )
       s = String.format(s+ "5" + "  "); 
          else   
        if ((k-4)%(7)==0  ||  (k-2)%(7)==0)
        s = String.format(s+"7" + "  "); 
           else 
            if ((k-4)%(11)==0  || (k-2)%(11)==0)
        s = String.format(s+"11" + "  "); 
           else
                if ((k-4)%(13)==0 || (k-2)%(13)==0)
        s = String.format(s+"13" + "  "); 
           
           else  
                    if ((k-4)%(17)==0 || (k-2)%(17)==0)
       s = String.format(s+"17" + "  "); 
         else   
                        if ((k-4)%(19)==0 || (k-2)%(19)==0 )
        s = String.format(s+"19" + "  ");
        else  
                            if ((k-4)%(23)==0 || (k-2)%(23)==0 )
        s = String.format(s+"23" + "  ");
      else  
                                if ((k-4)%(29)==0  || (k-2)%(29)==0)
        s = String.format(s+"29" + "  ");
         else  
                                    if ((k-4)%(31)==0  || (k-2)%(31)==0)
        s = String.format(s+"31" + "  ");
             else  
                                        if ((k-4)%(37)==0  || (k-2)%(37)==0)
        s = String.format(s+"37" + "  ");
       else
                 s = String.format(s+"F" + "  ");
  
}*/
System.out.println(s+ "  "); 

//}

    



    
    
    
    }
    
    public static void main(String[] args) {
  

        System.out.println("Normal:\n\n"); 
        Normal();
        System.out.println("\n\nlong24:\n\n"); 
        long24();
        System.out.println("\n\nlong11:\n\n"); 
        long11();
        System.out.println("\n\nlong37:\n\n"); 
        long37();
        System.out.println("\n\nlong35:\n\n"); 
        long35();
        System.out.println("\n\nlong64:\n\n"); 
        long46();
        System.out.println("\n\nlong62:\n\n"); 
        long62();
        
        System.out.println("\n\nlong63:\n\n"); 
        long63();
        
        System.out.println("\n\nlong22:\n\n"); 
        long22();
        
        System.out.println("\n\nNormal2:\n\n"); 
        Normal2();
        
        

        
    }
    
}
