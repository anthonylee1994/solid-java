package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Coder {
    default void code() {
        System.out.println("I can code");
    }
}
