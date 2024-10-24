package com.solid.liskov.substitution;

/**
 * @author anthonylee
 */
public class GoodBird implements Flyable, Eatable {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void eat() {
        System.out.println("I can eat");
    }
}
