package com.solid.liskov.substitution;

/**
 * @author anthonylee
 */
public class GoodPenguin implements Eatable {
    @Override
    public void eat() {
        System.out.println("I can eat");
    }
}
