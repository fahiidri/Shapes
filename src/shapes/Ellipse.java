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
public class Ellipse extends Shape {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public Ellipse() {
        this(new Point(), "ellipse", 10, 10);
    }
    
    public Ellipse(Point place, String name, int a, int b) {
        super(place, name);
        setA(a);
        setB(b);
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(", a: %d, b: %d", getA(), getB());
    }
}