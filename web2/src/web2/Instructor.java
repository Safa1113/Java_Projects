package web2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Safofoh
 */

import java.sql.*;  


public class Instructor {
    
    int id;
    String username;
    String password;
    String name;
    String email;
    String speciality;
    
    Instructor(int ID){
        
        String st = "select * from instructor where id = " + ID;
        
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/webph2","root","");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery(st);  
        while(rs.next())  
        {
            id = rs.getInt(1);
            username = rs.getString(2);
            password = rs.getString(3);
            name = rs.getString(4);
            email = rs.getString(5);
            speciality = rs.getString(6);
            
        }
        System.out.println(id+"  "+username+"  "+password+"  "+name+"  "+email+"  "+speciality);  
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
  
        
    }
}
