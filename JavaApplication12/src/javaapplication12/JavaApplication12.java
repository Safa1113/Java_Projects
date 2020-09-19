/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;




class Worker
  {
  private String ID;
  private String name;
  private int age;

  private double salary;
 private String position;
 private FactoryLine t;


  public Worker (){
      
      name = "";
      age = 0;
      ID ="";
      
      salary = 0;
      position="";
      t = new FactoryLine();
      
  }
  
  public void setInfo (Factory f){
      Scanner s = new Scanner(System.in);
      
      System.out.println("\nplease enter worker ID\n");
      setWorkerID(s.nextLine());
      
      System.out.println("\nplease enter worker name\n");
      setWorkerName(s.nextLine());
      
      System.out.println("\nplease enter worker age\n");
      setAge(s.nextInt());
      
      
      
      System.out.println("\nplease enter worker Salary\n");
      setEmployeeSalary(s.nextInt());
      
      System.out.println("\nplease enter employee Psition\n");
      setEmployeePosition(s.nextLine());
      
      
      
      System.out.println("\n Please choose your factory line index");
         f.printLine();
         int index = s.nextInt();;
         if (index < f.ln)
         t = f.Lines[index];
         else
              System.out.println("\n Wrong Index");
      
      
      
  }
  public void setWorkerID ( String id )
  {
  ID = id;
  }
  public void setWorkerName ( String name )
  {
  this.name = name;
  }
  
   public void setEmployeePosition ( String p )
  {
  position = p;
  }
  
    public void setEmployeeSalary ( double s )
  {
  salary = s;
  }
    

 
  public void setAge (int a){
      
      age = a;
  }

  public int getAge(){
      return age;
  }
  

  public String getEmployeeName()
  {
  return name;
  }

  


  
  @Override
  public String toString(){
      String s = String.format("Worker's name: %s \nSalary: %f\nAge: %d\nPosition: %s \n ID: %s \n Factry Line:\n %s\n", getEmployeeName(), salary, age, position, ID, t.toString());
      return s;
  }
  }



class FactoryLine  {
    private String name;
    
    
    private int productsNumber;
    
    public FactoryLine (){
        name = "";
    
 
    productsNumber = 0;
    }
    
    public void setInfo (){
         Scanner s = new Scanner(System.in);
      
      System.out.println("\nplease enter name\n");
      setName(s.nextLine());
      
      
     
      
      System.out.println("\nplease enter how many products produces per day\n");
      setProductsNumber(s.nextInt());

        
    }
    
    public void setName (String s){
        name =s;
    }
    
     public String getName (){
        return name;
    }

              public void setProductsNumber (int p){
        productsNumber =p;
    }
                       public int getProductsNumber (){
        return productsNumber;
    }
   
      
   
            
            
     
              @Override
  public String toString(){
      String s = String.format("Factory line name: %s\nProducts it produces per day: %d \n", name, productsNumber);
      return s;
  }
    
}



class Machine extends FactoryLine{

    private FactoryLine t;
    
    public Machine (){
super();
 t = new FactoryLine();
    }
    
    public FactoryLine getLine (){
        return t;
    }
    
     public void setLine (FactoryLine f){
        t = f;
    }
    
    public void setInfo (Factory f){
         
        super.setInfo();
        
           Scanner s = new Scanner(System.in);
              
      System.out.println("\n Please choose your factory line index");
         f.printLine();
         int index = s.nextInt();;
         if (index < f.ln)
         t = f.Lines[index];
         else
             System.out.println("\n Wrong Index");
 
        
    }
    
  
   
   
              @Override
  public String toString(){
      String s = String.format("name: %s\n Factry Line:\n %s\n", super.getName(), t.toString());
      return s;
  }
    
}

  class Product extends Machine {
        public Product (){
            super();
        }
        
            
    public void setInfo (Factory f){
         
       
        
           Scanner s = new Scanner(System.in);
                    System.out.println("\nplease enter name\n");
      setName(s.nextLine());
      System.out.println("\n Please choose your factory line index");
         f.printLine();
         int index = s.nextInt();;
         if (index < f.ln)
         super.setLine(f.Lines[index]); 
         else
            System.out.println("\n Wrong Index");
 
        
    }
        
    }

class Factory {
    String name;

    Worker[] Workers ;
    int wn;
    
    
    Product[] Products;
    int pn;
    FactoryLine[] Lines;
    int ln;
    
    
    Machine[] Machines;
    int mn;
   
 
    
    
    Factory (){
    name = "ZahiyaFactory";
   
   
  
            
    Workers = new Worker[10];
    wn = -1;
    Products = new Product[5];
    pn = -1;
 
      Machines = new Machine[3];
      mn=-1;
        Lines = new FactoryLine[3];
        ln =-1;
 
        
        
         Scanner s = new Scanner(System.in);
        boolean loop = true;
        while(loop){
        menu();
        int choice = s.nextInt();
        
        switch (choice) {
            case 3:  addWorker();
                     break;
            case 4:  printWorker();
                     break;
            case 5:  addProduct();
                     break;
            case 6:  printProduct();
                     break;
            case 7:  addMachine();
                     break;
            case 8:  printMachine();
                     break;
            case 1:  addLine();
                     break;
            case 2:  printLine();
                     break;
            case 9:  countProducts();
                     break;
            case 10: changeWorkerInfo();
                     break;
            case 11:  info();
                     break;
            case 12:  System.exit(0);
                     break;
            default: System.out.println("Invalid entry");;
                     break;
        }
        
        }
        
        
}
    
        
        void addWorker (){
            if (wn == Workers.length-1)
                System.out.println("\nyou can not add any more workers");
            else
            {
                
                  System.out.println("\n Please enter worker information\n");
                  wn++;
     
         Workers[wn] = new Worker();
         Workers[wn].setInfo(this);
         
       
         
        
        }
        }
        
        
        void addProduct (){
            if (pn == Products.length-1)
                System.out.println("\nyou can not add any more products");
            else
            {
                   System.out.println("\n Please enter Product information");
                  pn++;
         
         Products[pn] = new Product();
         Products[pn].setInfo(this);
         
       
     
                 
            }
        }
        
         void addMachine (){
            if (mn == Machines.length-1)
                System.out.println("\nyou can not add any more machines");
            else
            {
                  System.out.println("\n Please enter Machine information");
                  mn++;
         Scanner s = new Scanner(System.in);
         Machines[mn] = new Machine();
         Machines[mn].setInfo(this);
         
       
   
                 
                 
            }
        }
        
             void addLine (){
            if (ln == Lines.length-1)
                System.out.println("\nyou can not add any more lines");
            else
            {
               System.out.println("\n Please enter Line information");
                  ln++;
         
         Lines[ln] = new FactoryLine();
         Lines[ln].setInfo();
   
         
            }
        }
         
        
        void printWorker(){
             System.out.println("\n");
        for (int i =0; i <= wn; i++){
             System.out.println("\n Worker "+i+" :\n info: " + Workers[i].toString() + "\n");
          
        }
        }
        
        void printProduct(){
             System.out.println("\n");
        for (int i =0; i <= pn; i++){
             System.out.println("\n Product "+i+" :\n name: " + Products[i] + "\n");
         
        }
        }
        
           void printMachine(){
             System.out.println("\n");
        for (int i =0; i <= mn; i++){
             System.out.println("\n Machine "+i+" :\n name: " + Machines[i] + "\n");
            
        }
        }
           
                 void printLine(){
             System.out.println("\n");
        for (int i =0; i <= ln; i++){
             System.out.println("\n Line "+i+" :\n name: " + Lines[i]+ "\n");
           
        }
        }
        
        
           
                      void changeWorkerInfo (){
         Scanner s = new Scanner(System.in);
         System.out.println("\n Please choose  Worker index");
         printWorker();
         int index = s.nextInt();
         if (index <= wn)
         changeWorkerLine(index);
         
     }
                   
                      
        void changeWorkerLine(int i){
                           Scanner s = new Scanner(System.in);
         System.out.println("\n Please set worker info");
         Workers[i].setInfo(this);
         

                          
                      }
           
           
        void countProducts(){
        int sum = 0;
        
         System.out.println("\n");
        for (int i =0; i <= ln; i++){
            
            sum += Lines[i].getProductsNumber();
        }
        System.out.println("\nTotal generated products by this factory is "+ sum +" \n");
    }  
        
        
        void menu (){
    
           
        System.out.println("Welcom to our factory \nPlease press\n \n 1 Add new Line \n 2 print all lines \n 3 Add new worker \n 4 print all Workers information \n 5 Add new product \n 6 print all products information \n 7 Add new machine \n 8 print all machines   \n 9 count generated products by day \n 10 Change worker to another factory line \n 11 print all information of this factory \n 12 End program");
        
       
    }

    
    void info (){
        System.out.println("\nFactory name is " + name + "\n");
        System.out.println("\nFactory Workers: \n");
        printWorker();
        System.out.println("\nFactory Products: \n");
        printProduct();
        System.out.println("\nFactory Machines: \n");
        printMachine();
        System.out.println("\nFactory Lines: \n");
        printLine();
        
        
    }
    
    
}








public class JavaApplication12 {

    
    public static void main(String[] args) {
       
        Factory f = new Factory();
  
    }
    
}
