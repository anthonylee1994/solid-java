package com.non.solid.single.responsibility;

import java.math.BigDecimal;

/**
 * @author anthonylee
 */
public class BadInvoice {
    private final String customer;
    private final String state;
    private final BigDecimal total;

    public BadInvoice(String customer, String state, BigDecimal total) {
        this.customer = customer;
        this.state = state;
        this.total = total;
    }

    public BigDecimal salesTax() {
        return switch (state) {
            case "AZ" -> new BigDecimal("5.5");
            case "TX" -> new BigDecimal("3.2");
            case "CA" -> new BigDecimal("8.7");
            default -> new BigDecimal("0.0");
        };
    }

    public void printInvoice() {
        System.out.println("Printing invoice...");
        System.out.println("Customer: " + customer);
        System.out.println("State: " + state);
        System.out.println("Total: " + total);
        System.out.println("Sales Tax: " + salesTax());
    }
}
