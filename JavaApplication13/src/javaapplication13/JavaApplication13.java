/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;



import java.util.Scanner;

class Employee
  {
  private String employeeName;
  private int age;
  private int hours;
  private double rate, pay;


  public void Employee (){
      
      employeeName = "";
      age = 0;
      pay = 0;
  }
  public void setEmployeeName ( String name )
  {
  employeeName = name;
  }
  public void setHours( int h){
      hours = h;
      
  }
  public void setAge (int a){
      
      age = a;
  }
  public void setRate (int r){
      rate = r;
  }
  public int getAge(){
      return age;
  }
  
  public double getPay(){
      return pay;
  }
  public String getEmployeeName()
  {
  return employeeName;
  }
  public void setPay(double p){
      
      pay = p;
  }
  
  public double calculatePay()
  {
  if ( hours > 40 )
  { 
  int extraHours = hours - 40;
  pay = ( 40 * rate ) + ( extraHours * rate );
  }
  else pay = hours * rate;

  return pay;
  }

  
  @Override
  public String toString(){
      String s = String.format("Employee's name: %s \nGross Salary: %f\nAge: %d\n", getEmployeeName(), pay, age);
      return s;
  }
  }


class Relations_Department extends Employee {
    
    public String toString(){
        String s = super.toString();
        s+= "Employee is promoted to Relations_Depatment";
        return s;
       
    }
    
}

class Quality_Management extends Employee {
    
    public String toString(){
        String s = super.toString();
        s+= "Employee is promoted to Quality_Management_Depatment";
        return s;
       
    }
    
}
class Marketing_Management extends Employee {
    
    public String toString(){
        String s = super.toString();
        s+= "Employee is promoted to Marketing_Management_Depatment";
        return s;
       
    }
    
}




public class JavaApplication13 {
    
    static Employee e;
    static boolean isfired = false;
    
    public static void fire (){
        
        isfired = true;
        System.out.println("Employee has been fired succcessfully");
        
    }
    
  public static void increase (){
        
        
           Scanner s = new Scanner(System.in);
     
        
     String print = String.format("Enter new pay to %s: old pay is %f",e.getEmployeeName(), e.getPay());
        System.out.println(print);
        double pay = s.nextDouble();
        e.setPay(pay);
    }
  
  public static void promote (){
      
      
      
         String lis1 = "Please choose one of these options\nPromote to\n 1) Relations_Department\n 2) Quality_Management\n 3) Marketing_Management\n********************";
      
         Employee e2 = new Employee();
      
       int i;
            do {
            System.out.println(lis1);
            Scanner s = new Scanner(System.in);
             i = s.nextInt();
                switch (i) {
                    case 1:
                        e2 = new Relations_Department();
                        break;
                    case 2:
                        e2 = new Quality_Management();  
                        break;
                     case 3:
                        e2 = new Marketing_Management();
                        break;
                    default:
                        System.out.println("Wrong Entry, try again");
                        break;
                }
            }while (i!=1 && i!=2 && i!=3);
      
             
                    
         e2.setEmployeeName(e.getEmployeeName());
         e2.setAge(e.getAge());
         e2.setPay(e.getPay());
         
         e = e2;
         
         System.out.println("Employee has been promoted successfully");
         System.out.println(e.toString());
      
  }
    
    public static void setPay (){
        
        
           Scanner s = new Scanner(System.in);
     
        
        System.out.println("Enter employee pay:");
        double pay = s.nextDouble();
        e.setPay(pay);
    }
    
      public static void cal (){
        
        
           Scanner s = new Scanner(System.in);
     
        
        System.out.println("Enter employee Hours work:");
        int h = s.nextInt();
        
         System.out.println("Enter rate:");
        int r = s.nextInt();
        
        e.setHours(h);
        e.setRate(r);
        
          System.out.println("Pay is " + e.calculatePay());
    }
      
    public static void addemp(){
        Scanner s = new Scanner(System.in);
        e = new Employee();
        
        System.out.println("Hiring new Employee\n********");
        System.out.println("Enter employee name:");
        String name = s.nextLine();
        e.setEmployeeName(name);
        
        System.out.println("Enter employee age:");
        int age = s.nextInt();
        e.setAge(age);
        
          System.out.println("Do you want to set pay manually or calculate it?\n  1) manually\n  2) calculate it");
          
          int i;
          
              do {     
             i = s.nextInt();
                switch (i) {
                    case 1:
                        setPay();
                        break;
                    case 2:
                        cal();
                    default:
                        System.out.println("Wrong Entry, try again");
                        break;
                }
            }while (i!=1 && i!=2);
        
          System.out.println("Employee has been added successfully");
            System.out.println(e.toString() + "\n*************");
        
        
    }

    public static void list (boolean isadd){
        
        String lis1 = "Please choose one of these options\n 1) Add Employee\n 2) Exit\n********************";
        String lis2 = "Please choose one of these options\n 1) Increase salary\n 2) Promote\n 3) Fire\n 4) Print Employee details\n 5) Exit\n********************";
        if (isadd){
            int i;
            do {
            System.out.println(lis1);
            Scanner s = new Scanner(System.in);
             i = s.nextInt();
                switch (i) {
                    case 1:
                        addemp();
                        break;
                    case 2:
                        System.exit(0);
                    default:
                        System.out.println("Wrong Entry, try again");
                        break;
                }
            }while (i!=1 && i!=2);
            
        }else{
                 int i;
            do {
            System.out.println(lis2);
            Scanner s = new Scanner(System.in);
             i = s.nextInt();
                switch (i) {
                    case 1:
                         if (isfired)
                            System.out.println("Employee is fired");
                        else
                        increase();
                        break;
                    case 2:
                         if (isfired)
                            System.out.println("Employee is fired");
                        else
                        promote();
                        break;
                    case 3:
                         if (isfired)
                            System.out.println("Employee is fired");
                        else
                        fire();
                        break;
                    case 4:
                        if (isfired)
                            System.out.println("Employee is fired");
                        else
                        System.out.println(e.toString());
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Wrong Entry, try again");
                        break;
                }
            }while (i!=5 );
            
        }
        
        
        
    }
    
    public static void main(String[] args) {
       System.out.println("Welcome");
       boolean isadd = true;
       list (isadd);
        isadd = false;
       list (isadd);
       
    }
    
}
