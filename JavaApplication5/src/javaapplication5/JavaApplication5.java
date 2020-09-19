/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

 
class CheckingAccount {
    private String name;
    private int id;
    private int balance;
    
    CheckingAccount (String n, int i, int b){
        name = n;
        id = i;
        balance = b;
    }
    void withdraw(int x){
        if (x>0)
            balance -= x;
        
    }
    void deposit(int x){
        if (x>0)
            balance += x;
    }
    void print_info (){
        System.out.println (name + "  " + id + "  " + balance);
    }
}

class InvestmentAccount {
    private String name;
    private int id;
    private int balance;
    
    InvestmentAccount (String n, int i, int b){
        name = n;
        id = i;
        balance = b;
    }
   
    void deposit(int x){
        if (x>0)
            balance += x;
    }
    void print_info (){
        System.out.println (name + "  " + id + "  " + balance);
    }
}

public class JavaApplication5 {
    


    public static void main(String[] args) {
        
        CheckingAccount c = new CheckingAccount("Ali",357, 20000);
        InvestmentAccount i = new InvestmentAccount("Mohammad",712, 500000);
        
        c.deposit(1000);
        c.withdraw(5000);
        
        i.deposit(15000);
        
        c.print_info();
        i.print_info();
        
    }
    
}
