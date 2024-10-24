package com.solid.open.closed;

/**
 * @author anthonylee
 */
public record GoodCircle(double radius) implements Shape {
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
