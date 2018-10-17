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
public class Square extends Rectangle{
    private double side;
    public Square(){
        
    }
    public Square(double side){
       // this.side=side;
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side);
       this.setColor(color);
       this.setFilled(filled);
    }

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side){
        this.side=width;
      
    }
    @Override
    public void setLength(double side){
        this.side=length;
    }
    @Override
    public String toString(){
        String a;
        a="dien tich hinh vuong: "+getArea()+"\n";
        a=a+"chu vi hinh vuong: "+getPerimeter()+"\n";
        return a; 
    }
}
