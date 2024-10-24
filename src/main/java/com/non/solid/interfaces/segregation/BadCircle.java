package com.non.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public class BadCircle implements IShapeAreaCalculator {
    private final double radius;

    public BadCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        throw new UnsupportedOperationException("Circle does not have volume");
    }
}
