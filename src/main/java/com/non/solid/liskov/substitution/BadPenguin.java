package com.non.solid.liskov.substitution;

/**
 * @author anthonylee
 */
// Bad Example: This class violates the Liskov Substitution Principle. It throws
// an exception when the fly method is called.
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
