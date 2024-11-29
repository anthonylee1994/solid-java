package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Cook {
    default void cook() {
        System.out.println("I can cook");
    }
}
