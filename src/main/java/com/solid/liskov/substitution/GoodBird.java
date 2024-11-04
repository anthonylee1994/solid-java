package com.solid.liskov.substitution;

/**
 * @author anthonylee
 */
// Good Example: This class follows the Liskov Substitution Principle. It implements the Flyable and Eatable interfaces.
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
