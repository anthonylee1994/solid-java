package com.non.solid.l;

/**
 * @author anthonylee
 */
public class BadRectangle {
    private int width;
    private int height;

    public BadRectangle(int width, int height) {
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
