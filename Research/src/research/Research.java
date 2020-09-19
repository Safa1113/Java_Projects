/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package research;

/**
 *
 * @author Safofoh
 */
public class Research {
    
    int id;
    String name;
    double score;
    String level;
    String result;
    
    Research (int id, String name, double score, String level){
        this.id = id;
        this.name = name;
        this.score = score;
        this.level= level;
                
        
    }
    void display (){
        this.result = this.test();
        System.out.println(id + "  " + name + "  " + score + "  " + level + "  " + result);
    }
    
    String test (){
        
        String r ="";
        
        if (level == "undergrad"){
            if (score >= 60 )
                r = "pass";
            else
               r = "fail"; 
        }
        if (level == "grad"){
            if (score >= 70 )
                r = "pass";
            else
               r = "fail"; 
        }
        return r;
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Research r1 = new Research (325, "Ali Mohamad", 50, "undergrad");
        Research r2 = new Research (432, "Layla mosa", 70, "grad");
        Research r3 = new Research (265, "Mona Hassan", 80, "undergrad");
        Research r4 = new Research (73, "Mansour Saleh", 60, "grad");
        
        r1.display();
        r2.display();
        r3.display();
        r4.display();
        
    }
    
}
