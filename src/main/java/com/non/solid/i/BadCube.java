package com.non.solid.i;

/**
 * @author anthonylee
 */
public class BadCube implements IShapeAreaCalculator {
    private final double side;

    public BadCube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}
