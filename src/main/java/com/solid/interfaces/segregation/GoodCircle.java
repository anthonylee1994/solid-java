package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public class GoodCircle implements IAreaCalculator {
    private final double radius;

    public GoodCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
