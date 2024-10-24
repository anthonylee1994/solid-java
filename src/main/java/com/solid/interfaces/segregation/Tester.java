package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Tester {
    public default void test() {
        System.out.println("I can test");
    }
}
