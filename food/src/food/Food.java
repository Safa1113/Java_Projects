/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

/**
 *
 * @author Safofoh
 */


class food {
    String name;
    double price;
    int calories;
    int numOrders;
    
    public food(String name, double price, int calories){
        setValues( name,  price,  calories);
    }
    
    public void setValues(String name, double price, int calories){
    this.name = name;
    this.price = price;
    this.calories = calories;
    this.numOrders = 0;
        
    }
    
    public double orderFood (){
        numOrders++;
        double p;
        p = price * numOrders;
        
        if(numOrders == 2)
            p = p * 0.10;
        if(numOrders >= 3)
            p = p * 0.25;
        
        return p;
    }
    public int getCal (){
        return calories;
    }
    
     public double getPrice (){
        return price;
    }
    
     public int getnumOrders(){
         
         return numOrders;
     }
    
}




public class Food {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        food f =  new food("Fatoush", 5.95, 80);
        double total_calories;
        if ( f.getnumOrders() != 0)
        total_calories = n* f.getCal();
        else
         System.out.print("Error message: there's no order");
                    
        for (int i = 0; i<5; i++)
                    soup.orderFood();

        
       double g = soup.getPrice();
          double t = g * soup.getnumOrders();
        System.out.print("price is " + g + "Total price is " + t);
    }
    
}
