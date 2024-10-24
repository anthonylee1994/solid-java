package com.solid.liskov.substitution;

/**
 * @author anthonylee
 */
public class GoodRectangle implements Shape {
    private int width;
    private int height;

    public GoodRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}
