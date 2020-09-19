/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web2;
import web2.Instructor;

/**
 *
 * @author Safofoh
 */
public class Web2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Instructor i = new Instructor(1); 
        Course e = new Course(1,"rrrr","ssrrrss","ssrrrss","ssrrss"); 
        e.add();
        String st = "select * from instructor where id = " + 1;
        System.out.print(st);
        
    }
    
}
