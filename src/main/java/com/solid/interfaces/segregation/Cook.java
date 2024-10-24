package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Cook {
    public default void cook() {
        System.out.println("I can cook");
    }
}
