package com.solid.liskov.substitution;

/**
 * @author anthonylee
 */
// Good Example: This class follows the Liskov Substitution Principle. It implements the Eatable interface.
public class GoodPenguin implements Eatable {
    @Override
    public void eat() {
        System.out.println("I can eat");
    }
}
