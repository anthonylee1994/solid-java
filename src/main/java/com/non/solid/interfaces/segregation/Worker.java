package com.non.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public interface Worker {
    public default void code() {
        System.out.println("I can code");
    }
    public default void test() {
        System.out.println("I can test");
    }
    public default void cook() {
        System.out.println("I can cook");
    }
    public default void clean() {
        System.out.println("I can clean");
    }
}
