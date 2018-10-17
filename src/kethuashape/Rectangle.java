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
public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
        
    }
    public Rectangle(double width,double length){
        this.length=length;
        this.width=width;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.length=length;
        this.width=width;
        this.setColor(color);
        this.setFilled(filled);
        
    }
    
    public double getWidth() {
        return width;
    }

    
    public void setWidth(double width) {
        this.width = width;
    }

    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        String a;
        a="dien tich hinh chu nhat: "+getArea()+"\n";
        a=a+"chu vi hinh chu nhat: "+getPerimeter()+"\n";
        return a;
    }
}
