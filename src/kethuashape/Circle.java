/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethuashape;

/**
 *
 * @author DELL
 */
public class Circle extends Shape{
    private  double radius;
    private final double pi=3.14;
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
         this.radius=radius;
         this.setColor(color);
         this.setFilled(filled);
    }
    
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*2*pi;
    }
    public double getPerimeter(){
        return radius*radius*pi;
    }
    @Override
    public String toString(){
        String a;
        a="dien tich hinh tron: "+getArea()+"\n";
        a=a+"chu vi hinh tron: "+getPerimeter()+"n";
        return a;
    }
}
