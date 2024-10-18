package com.non.solid.o;

import java.math.BigDecimal;

/**
 * @author anthonylee
 */
public class BadOrderReport {
    private final String customer;
    private final BigDecimal total;
    private final String address;

    public BadOrderReport(String customer, BigDecimal total, String address) {
        this.customer = customer;
        this.total = total;
        this.address = address; // new added field
    }

    public void invoice() {
        System.out.println("Invoice");
        System.out.println(customer);
        System.out.println(total);
    }

    public void billOfLading() {
        System.out.println("BOL");
        System.out.println(customer);
        System.out.println("Shipping Label...");
        System.out.println(address); // new added field
    }
}
