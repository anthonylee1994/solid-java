package com.solid.i;

/**
 * @author anthonylee
 */
public class GoodCube implements IAreaCalculator, IVolumeCalculator{
    private final double side;

    public GoodCube(double side) {
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
