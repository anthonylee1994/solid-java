package com.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Tester {
    default void test() {
        System.out.println("I can test");
    }
}
