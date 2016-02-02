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
public class Square extends Rectangle {
    public int getSide(){
        return super.getHeight();
    }
    
    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }
    public Square(){
        this(new Point(), "square", 10);
    }
    public Square(Point place, String name, int side) {
        super(name, place, side, side);
    }
    @Override
    public String toString(){
        return String.format("%s %s, s: %d", super.getName(), super.getPlace(), super.getWidth());
        
    }
}
