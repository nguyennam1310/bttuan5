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
public class Shape {
    private String color;
    private boolean filled;
     public Shape(){  
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
 
    public String toString1(){
        String a;
        a="màu:"+this.color+"\n";
        a=a+"Filled:"+this.filled+"\n";
        return a;
        
    }
    
}
