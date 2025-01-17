package com.solid.open.closed;

/**
 * @author anthonylee
 */
// Good Example: This class follows the Open/Closed Principle. It calculates the
// area of a rectangle.
public record GoodRectangle(double width, double height) implements Shape {
    public double area() {
        return width * height;
    }
}
