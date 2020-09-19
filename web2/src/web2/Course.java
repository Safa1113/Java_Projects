/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web2;
import web2.Instructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Safofoh
 */
public class Course {
    	
    int id;
    int instructor_id;
    Instructor instructor;
    String name;
    String field;
    String description;
    String book_cover;
    
    Course(int instructor_id, String name, String field, String description, String book_cover){
        
        
    this.instructor = new Instructor(instructor_id);
    this.name = name;
    this.field = field;
    this.description = description;
    this.book_cover = book_cover;
    this.instructor_id = instructor_id;
        
        
  
  
        
    }
    
    public void add (){
        
        
        
        String st = String.format("INSERT INTO `course`(`instructor_id`, `name`, `field`, `description`, `book_cover`) VALUES (%d,\"%s\",\"%s\",\"%s\",\"%s\")", instructor_id,name,field,description,book_cover);

        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/webph2","root","");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        stmt.executeUpdate(st);  
        
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
        
    }
    
}