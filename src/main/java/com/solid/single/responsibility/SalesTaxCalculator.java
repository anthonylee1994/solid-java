package com.solid.single.responsibility;

import java.math.BigDecimal;

/**
 * @author anthonylee
 */
public class SalesTaxCalculator {
    private final State state;

    public SalesTaxCalculator(State state) {
        this.state = state;
    }

    public BigDecimal taxRate() {
        return switch (state) {
            case State.AZ -> new BigDecimal("5.5");
            case State.TX -> new BigDecimal("3.2");
            case State.CA -> new BigDecimal("8.7");
        };
    }
}
