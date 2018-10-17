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
public class KeThuaShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape=new Shape("red", true);
      
        System.out.println(shape.toString1());
        System.out.println("-------------------------");
        Circle circle=new Circle(2, "blue", true);
        System.out.println(circle.toString());
        System.out.println(circle.toString1());
        System.out.println("-----------------------------");
        Rectangle rectangle=new Rectangle(2, 3, "green", true);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.toString1());
        System.out.println("---------------------------------");
        Square square=new Square(4,"yellow",true);
        System.out.println(square.toString());
        System.out.println(square.toString1());
        
    }
    
}
