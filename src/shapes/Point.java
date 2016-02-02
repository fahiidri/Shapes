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
public class Point {
    
    private int x;
    private int y;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    public Point(){
        this(10,10);
    
    }
    public Point (int x ,  int y){
        setX(x);
        setY(y);
    }
  
    
    @Override
     public String toString(){
          return String.format("(%s,%s)", getX(), getY());
     }
}
