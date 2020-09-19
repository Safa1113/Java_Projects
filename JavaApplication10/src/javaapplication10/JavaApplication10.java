/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;


class Factory {
    String name;
    
    int wcapacity;
    int wused;
    Worker[] worker;
    int pcapacity;
    int pused;
    Product[] product;
    int mcapacity;
    int mused;
    Machine[] machine;
    int fcapacity;
    int fused;
    FactoryLine[] line;
    
    
    Factory (){
    name = "AwatefFactory";
   
    
    
    
    worker = new Worker[10];
    wcapacity =10;
     wused =0;
     product = new Product[5];
    pcapacity =5;
     pused =0;
      machine = new Machine[3];
    mcapacity =3;
     mused =0;
        line = new FactoryLine[3];
    fcapacity =3;
     fused =0;
}
    
        
        void addWorker (){
            if (wused == wcapacity-1)
                System.out.println("\nyou can not add any more workers");
            else
            {
                 Worker w = new Worker(this);
                 worker[wused] = w;
                 wused++;
                 System.out.println("\n you have added");
                 w.info();
                 
            }
        }
        
        void addProduct (){
            if (pused == pcapacity-1)
                System.out.println("\nyou can not add any more products");
            else
            {
                 Product p = new Product(this);
                 product[pused] = p;
                 pused++;
                 System.out.println("\n you have added");
                 p.info();
                 
            }
        }
        
         void addMachine (){
            if (mused == mcapacity-1)
                System.out.println("\nyou can not add any more machines");
            else
            {
                 Machine m = new Machine(this);
                 machine[mused] = m;
                 pused++;
                 System.out.println("\n you have added");
                 m.info();
                 
            }
        }
        
             void addLine (){
            if (fused == fcapacity-1)
                System.out.println("\nyou can not add any more lines");
            else
            {
                 FactoryLine l = new FactoryLine();
                 line[fused] = l;
                 fused++;
                 System.out.println("\n you have added");
                 l.info();
                 
            }
        }
         
        
        void printWorker(){
             System.out.println("\n");
        for (int i =0; i < wused; i++){
             System.out.println("\n Worker "+i+" :");
            worker[i].info();
        }
        }
        
        void printProduct(){
             System.out.println("\n");
        for (int i =0; i < pused; i++){
             System.out.println("\n Product "+i+" :");
            product[i].info();
        }
        }
        
           void printMachine(){
             System.out.println("\n");
        for (int i =0; i < mused; i++){
             System.out.println("\n Machine "+i+" :");
            machine[i].info();
        }
        }
           
                 void printLine(){
             System.out.println("\n");
        for (int i =0; i < fused; i++){
             System.out.println("\n Line "+i+" :");
            line[i].info();
        }
        }
        
        
           
                      void changeWorkerInfo (){
         Scanner s = new Scanner(System.in);
         System.out.println("\n Please choose  Worker index");
         printWorker();
         int index = s.nextInt();;
         if (index < wused)
         worker[index].changeLine(this);
         
     }
           
           
           
        void menu (){
    
           
        System.out.println("Welcom to our factory \nPlease press\n \n 1 Add new Line \n 2 print all lines \n 3 Add new worker \n 4 print all Workers information \n 5 Add new product \n 6 print all products information \n 7 Add new machine \n 8 print all machines   \n 9 count generated products by day \n 10 Change worker to another factory line \n 11 print all information of this factory \n 12 End program");
        
       
    }
        void settings (){
            
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
            case 9:  FactoryLine.countProducts(this);
                     break;
            case 10:  changeWorkerInfo();
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


class FactoryLine {
    String name;

    int numofProducts;
    
    FactoryLine (){
           

    
    
      System.out.println("\n Please enter line name");
         Scanner s = new Scanner(System.in);
         name = s.nextLine();
         
         System.out.println("\n Please enter number of products generated by this factory line in an hour");
         
         numofProducts = s.nextInt();
        
    }
    
    static void countProducts(Factory f){
        int sum = 0;
        
         System.out.println("\n");
        for (int i =0; i < f.fused; i++){
             System.out.println("\n Line "+i+" :");
            sum += f.line[i].getnumofProducts();
        }
        System.out.println("\nTotal generated products by this factory is "+ sum +" \n");
    }
    
    int getnumofProducts(){
        return numofProducts;
    }
    
 
    
    void info (){
        System.out.println("\nline name is " + name + "\n");
        System.out.println("\nline generated products number per hour is " + numofProducts + "\n");
    }


}
class Machine {
     String name;
     FactoryLine l;
     Worker w;
    
     
      Machine (Factory f){
        System.out.println("\n Please enter Machine name");
         Scanner s = new Scanner(System.in);
         name = s.nextLine();
         
         
          
         System.out.println("\n Please choose your factory line index");
         f.printLine();
         int index = s.nextInt();;
         if (index < f.fused)
         l = f.line[index];
         else
             f.addLine();
         
         System.out.println("\n Please choose your worker index");
         f.printWorker();
          index = s.nextInt();
         if (index < f.wused)
         w = f.worker[index];
         else
             f.addWorker();
      }
         
       
        void info (){
           System.out.println("\nMachine name is " + name + "\n");
           System.out.println("\nMachine factory line information ");
                l.info();
                  System.out.println("\n");
                   System.out.println("\nMachine Worker information ");
                w.info();
                  System.out.println("\n");
                  
        
       
     }
}
     
     
     
 
class Product {
    String name;
    double price;
    FactoryLine l;
    Product (Factory f){
        
        
        System.out.println("\n Please enter Product name");
         Scanner s = new Scanner(System.in);
         name = s.nextLine();
         
         System.out.println("\n Please enter product price");
         price = s.nextInt();
         
          
         System.out.println("\n Please choose your factory line index");
         f.printLine();
         int index = s.nextInt();;
         if (index < f.fused)
         l = f.line[index];
         else
             f.addLine();
    
}
    
    void info (){
           System.out.println("\nProduct name is " + name + "\n");
        System.out.println("\nProduct price is " + price + "\n");
        System.out.println("\nProduct factory line information ");
                l.info();
                  System.out.println("\n");
       
     }

}


class Worker {
     String name;
     int age;
     FactoryLine l;
     Worker(Factory f){
         
         
         
         System.out.println("\n Please enter worker name");
         Scanner s = new Scanner(System.in);
         name = s.nextLine();
         
         System.out.println("\n Please enter worker age");
         age = s.nextInt();
         
         System.out.println("\n Please choose your factory line index");
         f.printLine();
         int index = s.nextInt();;
         if (index < f.fused)
         l = f.line[index];
         else
             f.addLine();
         
         
     }
     
     void changeLine (Factory f){
         Scanner s = new Scanner(System.in);
         System.out.println("\n Please choose your factory line index");
         f.printLine();
         int index = s.nextInt();;
         if (index < f.fused)
         l = f.line[index];
         
     }
     void info (){
           System.out.println("\nWorker name is " + name + "\n");
        System.out.println("\nWorker age is " + age + "\n");
        System.out.println("\nWorker factory line information ");
                l.info();
                  System.out.println("\n");
       
     }
     




}


public class JavaApplication10 {


  
    public static void main(String[] args) {
      
    
        Factory f = new Factory();
        f.settings();

        
    }
    
}
