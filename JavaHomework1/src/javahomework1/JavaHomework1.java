/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework1;

/**
 *
 * @author Safofoh
 */


abstract class Shape {

    
    long dim1;
    long dim2;
    
    public Shape(long d1, long d2){
        System.out.println("Seting values ...");
        setDim1(d1);
        setDim2(d2);
    }
    
    
    public void setDim1(long d){
        dim1 = d;
    }
    
    public long getDim1(){
        return dim1;
    }
    public void setDim2(long d){
        dim2 = d;
    }
    public long getDim2()
            {
        return dim2;
    }
    abstract public void draw();
    abstract public void erase();
        
    abstract public double area();
    
}


class Circle extends Shape{
    
    public Circle (long d1, long d2){
        super(d1, d2);
        
    }


    
    @Override
    public void draw() {
       System.out.println("Drawing a circle");
    }
    
    @Override
    public void erase() {
       System.out.println("Erasing the circle");
    }
    
    @Override
    public double area() {
       return 3.14 * getDim1() * getDim1();
    }
    
}

class Triangle extends Shape{
    
    public Triangle (long d1, long d2){
        super(d1,d2);

        
    }


    
    @Override
    public void draw() {
       System.out.println("Drawing a triangle");
    }
    
    @Override
    public void erase() {
       System.out.println("Erasing the triangle");
    }
    
    @Override
    public double area() {
       return 0.5 * getDim1() * getDim2();
    }
    
}


class Rectangle extends Shape{
    
    public Rectangle (long d1, long d2){
        super(d1,d2);

        
    }


    
    @Override
    public void draw() {
       System.out.println("Drawing a rectangle");
    }
    
    @Override
    public void erase() {
       System.out.println("Erasing the rectangle");
    }
    
    @Override
    public double area() {
       return getDim1() * getDim2();
    }
    
}

class Driver{
    
    Shape [] s = new Shape[3];
    
    public Driver(){
    s[0] = new Circle(3,0);
    s[1] = new Triangle(3,2);
    s[2] = new Rectangle(3,2);
    
    
    for (int i=0; i<3; i++){
        s[i].draw();
    }
    
    for (int i=0; i<3; i++){
        s[i].erase();
    }
        
    for (int i=0; i<3; i++){
        System.out.println(s[i].area());
    }

    }


    
    
    
    
}


public class JavaHomework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Driver d = new Driver();
    }
    
}
