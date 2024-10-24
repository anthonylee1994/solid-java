package com.non.solid.liskov.substitution;

/**
 * @author anthonylee
 */
public class BadPenguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("I can't fly");
    }

    @Override
    public void eat() {
        System.out.println("I can eat fish");
    }
}
