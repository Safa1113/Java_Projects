/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomworkrawan;

/**
 *
 * @author Safofoh
 */



class DataOfBirth {
    private int day;
    private int month;
    private int year;
    
    public DataOfBirth ( int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    
   public int getDay(){
       return day;
   }
      public int getMonth(){
       return month;
   }
         public int getYear(){
       return year;
   }
         
   public void setDay(int newday){
       
   }
      public void setMonth(int newmonth){
       
   }
         public void setYear(int newyear){
       
   }
         
    @Override
         public String toString(){
             String s = String.format("DateOfBirth:%02d/%02d/%02d", day,month, year); 
             return s;
         }
}


interface CountSalary{
  public double Salary();
}


class Person {
    private String firstName;
    private String lastName;
    private String year;
    
    public DataOfBirth ( int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    
   public int getDay(){
       return day;
   }
      public int getMonth(){
       return month;
   }
         public int getYear(){
       return year;
   }
         
   public void setDay(int newday){
       
   }
      public void setMonth(int newmonth){
       
   }
         public void setYear(int newyear){
       
   }
         
    @Override
         public String toString(){
             String s = String.format("DateOfBirth:%02d/%02d/%02d", day,month, year); 
             return s;
         }
}

public class JavaHomworkRawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
