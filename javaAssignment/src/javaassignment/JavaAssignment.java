/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

class superTime {
    
    int hour;
    int minute;
    int second;
    String meridiem;
    
    
    superTime (int h, int m, int s, String mr) {
    hour = (h>0&&h<=12)?h:0;
    minute = (m>=0&&m<60)?m:0;
    second = (s>=0&&s<60)?s:0;
    
    if ("a.m.".equals(mr)||"p.m.".equals(mr))
        meridiem = mr;
    else
        meridiem = "a.m.";
    
       
}
      superTime (int h, int m, int s) {
    hour = (h>=0&&h<24)?h:0;
    minute = (m>=0&&m<60)?m:0;
    second = (s>=0&&s<60)?s:0;
    if (h>=0&&h<12)
        meridiem = "a.m.";
    else
        meridiem = "p.m.";
   
       
}
    
      superTime (int h, int m) {
    hour = (h>=0&&h<24)?h:0;
    minute = (m>=0&&m<60)?m:0;
    second = 0;
        if (h>=0&&h<12)
        meridiem = "a.m.";
    else
        meridiem = "p.m.";
  
       
} 
      
      void displayTime(int flag){
          
          int hour1 = hour;
          int hour2;
          int hour3;
          
          if (hour>=10&&hour<=12)
          hour1 = hour;
          else if (hour%12>=10)
          hour1 = hour%12;
          else if (hour>12)
          hour1 = hour%12;
          
          if (hour <= 12 && meridiem.equals("p.m."))
          hour2  = 12+hour;
          else
          hour2 = hour;
          
          if (hour <= 12 && meridiem.equals("p.m."))
          hour3  = 12+hour;
          else
          hour3 = hour;
          
          
         
          
          
          if (flag == 1)
              
              System.out.println(((hour1>=10)?hour1:("0"+hour1))+":"+((minute>=10)?minute:("0"+minute))+":"+((second>=10)?second:("0"+second))+" "+meridiem);
          else if (flag == 2)
               System.out.println(((hour2>=10)?hour2:("0"+hour2%12))+":"+((minute>=10)?minute:("0"+minute))+":"+((second>=10)?second:("0"+second)));
          else if (flag == 3)
              System.out.println(((hour3>=10)?hour3:("0"+hour3%12))+":"+((minute>=10)?minute:("0"+minute)));
          
      }
    
    
    
}
public class JavaAssignment {


    public static void main(String[] args) {
       superTime t  = new superTime(5,15,55,"a.m.");
       t.displayTime(1);
       t.displayTime(2);
       t.displayTime(3);
       superTime t2  = new superTime(1,15,55,"p.m.");
       t2.displayTime(1);
       t2.displayTime(2);
       t2.displayTime(3);
       superTime t3  = new superTime(9,30,0);
       t3.displayTime(1);
       t3.displayTime(2);
       t3.displayTime(3);
       superTime t4  = new superTime(5,30,0);
       t4.displayTime(1);
       t4.displayTime(2);
       t4.displayTime(3);
       superTime t5  = new superTime(13,45);
       t5.displayTime(1);
       t5.displayTime(2);
       t5.displayTime(3);
       superTime t6  = new superTime(11,5);
       t6.displayTime(1);
       t6.displayTime(2);
       t6.displayTime(3);
       
        
    }
    
}
