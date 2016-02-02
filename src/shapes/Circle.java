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
public class Circle extends Ellipse {
    public int getRadius() {
        return super.getA();
    }

    public void setRadius(int radius) {
        super.setA(radius);
        super.setB(radius);
    }
    
    public Circle() {
        this("nimi" ,new Point(), 10);
    }
    
    public Circle( String name,Point place, int radius) {
        super( place, name, radius, radius);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s, r: %d", super.getName(), super.getPlace(), super.getA());
    }
}
