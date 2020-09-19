/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web2;
import web2.Course;
/**
 *
 * @author Safofoh
 */
public class addCourse {
    
    
    addCourse(int instructor_id, String name, String field, String description, String book_cover){
        
        Course c = new Course(instructor_id, name, field, description, book_cover);
    
}
}
