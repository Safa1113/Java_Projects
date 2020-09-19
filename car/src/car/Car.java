/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.util.Scanner; 

class car {
    
    
    
    private String id;
    private int startkm;
    private int endkm;
    private double kmpl;
    private boolean rented;
    
    public car (String id, int startkm, int endkm, double kmpl, boolean rented){
    this.id = id;
    this.startkm = startkm;
    this.endkm = endkm;
    this.kmpl = kmpl;
    this.rented = rented;
        
    }
    
    public String get_id(){
        return id;
    }
    public int get_startkm(){
        return startkm;
    }
    public int get_endkm(){
        return endkm;
    }
    public double get_kmpl(){
        return kmpl;
    }
    public boolean get_rented(){
        return rented;
    }
    
    public double calculateLiters(){
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter last_rental_kmpl");

    
        double last_rental_kmpl =  myObj.nextDouble();
        System.out.println("Enter litreByKMPL");
        double litreByKMPL =  myObj.nextDouble();
        
        return last_rental_kmpl * litreByKMPL;
    } 
        
    public double calculateDistance(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter last_rental_kmpl");
        double last_rental_kmpl = myObj.nextDouble();
        return last_rental_kmpl;
    } 
    public boolean moreEconomic (car cc){
        if (cc.get_kmpl() > this.get_kmpl())
            return true;
        else
            return false;
    }
    
    public void displayInfo (){
        String r;
        if (rented)
            r = "yes";
        else 
            r = "no";
       
        System.out.println(String.format("| %-15s | %10dkm | %10dkm | %-5.2fkmpl | %-5s |" , id,  startkm, endkm, kmpl, r));
    }
}


public class Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ca c = new ca("Mazida", 12000, 12500, 15.7, true);
       c.displayInfo();
    }
    
}
