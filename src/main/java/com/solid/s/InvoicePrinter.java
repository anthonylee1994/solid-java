package com.solid.s;

/**
 * @author anthonylee
 */
public class InvoicePrinter {
    private final GoodInvoice goodInvoice;
    private final SalesTaxCalculator salesTaxCalculator;

    public InvoicePrinter(GoodInvoice goodInvoice, SalesTaxCalculator salesTaxCalculator) {
        this.goodInvoice = goodInvoice;
        this.salesTaxCalculator = salesTaxCalculator;
    }

    public void print() {
        System.out.println("Printing invoice...");
        System.out.println("Customer: " + goodInvoice.customer());
        System.out.println("State: " + goodInvoice.state());
        System.out.println("Total: " + goodInvoice.total());
        System.out.println("Sales Tax: " + salesTaxCalculator.taxRate());
    }
}
