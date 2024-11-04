package com.non.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
// Bad Example: This class violates the Interface Segregation Principle. It throws an exception when the cook and clean methods are called.
public interface Worker {
    default void code() {
        System.out.println("I can code");
    }
    default void test() {
        System.out.println("I can test");
    }
    default void cook() {
        System.out.println("I can cook");
    }
    default void clean() {
        System.out.println("I can clean");
    }
}
