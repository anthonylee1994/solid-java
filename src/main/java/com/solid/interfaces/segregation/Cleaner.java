package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Cleaner {
    default void clean() {
        System.out.println("I can clean");
    }
}
