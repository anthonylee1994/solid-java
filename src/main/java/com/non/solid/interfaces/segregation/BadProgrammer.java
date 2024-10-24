package com.non.solid.interfaces.segregation;

/**
 * @author anthonylee
 */
public class BadProgrammer implements Worker {
    @Override
    public void cook() {
        throw new UnsupportedOperationException("I can't cook");
    }

    @Override
    public void clean() {
        throw new UnsupportedOperationException("I can't clean");
    }
}
