package com.solid.open.closed;

/**
 * @author anthonylee
 */
// Good Example: This class follows the Open/Closed Principle. It calculates the
// area of a circle.
public record GoodCircle(double radius) implements Shape {
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
