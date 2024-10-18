package com.solid.l;

/**
 * @author anthonylee
 */
public class GoodSquare implements Shape {
    private int side;

    public GoodSquare(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }
}
