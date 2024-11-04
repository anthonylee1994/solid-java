package com.non.solid.open.closed;

/**
 * @author anthonylee
 */
// Bad Example: This class violates the Open-Closed Principle. It is not closed for modification.
public class BadShapeCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof BadRectangle rectangle) {
            return rectangle.width() * rectangle.height();
        } else if (shape instanceof BadCircle circle) {
            return Math.PI * Math.pow(circle.radius(), 2);
        }
        return 0;
    }
}
