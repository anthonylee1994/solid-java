package com.solid.open.closed;

/**
 * @author anthonylee
 */
// Good Example: This class follows the Open/Closed Principle. It calculates the
// area of a shape.
public class GoodShapeCalculator {
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}
