/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.*;  

class Instructor {
    
    int id;
    String username;
    String password;
    String name;
    String email;
    String speciality;
    
    Instructor(int id){
        try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/webph2","root","");  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from instructor");  
        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));  
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
  
        
    }
}

public class NewClass {
    
}
