package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Coder {
    public default void code() {
        System.out.println("I can code");
    }
}
