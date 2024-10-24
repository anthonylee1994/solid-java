package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Cleaner {
    public default void clean() {
        System.out.println("I can clean");
    }
}
