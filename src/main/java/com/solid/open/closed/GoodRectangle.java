package com.solid.open.closed;

/**
 * @author anthonylee
 */
public record GoodRectangle(double width, double height) implements Shape {
    public double area() {
        return width * height;
    }
}
