/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author fahiidri
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Point point1 = new Point();
        System.out.println(point1);
        
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        
        Circle circle1 = new Circle();
        System.out.println(circle1);
        
        Ellipse ellipse1 = new Ellipse();
        System.out.println(ellipse1);
        
        Shape shape1 = new Shape();
        System.out.println(shape1);
        
        Square square1 = new Square();
        System.out.println(square1);
        
        
        Point point2 = new Point(4,2);
        System.out.println(point2);
        
        Rectangle rectangle2 = new Rectangle( "rectangle",point2, 2, 100);
        System.out.println(rectangle2);
        
        Circle circle2 = new Circle( "Circle",new Point(4,8), 100);
        System.out.println(circle2);
        
        Ellipse ellipse = new Ellipse(new Point(10,11), "ellipsi", 2, 4);
        System.out.println(ellipse);
        
        Shape shape2 = new Shape(new Point(800, 30), "shape2");
        System.out.println(shape2);
        
        Square square2 = new Square(new Point(4444,6666), "square", 4);
        System.out.println(square2);
    }
    
}
