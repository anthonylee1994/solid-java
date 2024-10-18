package com.solid.o;

/**
 * @author anthonylee
 */
public class OrderReportInvoice implements Printable {
    private final GoodOrderReport report;

    public OrderReportInvoice(GoodOrderReport report) {
        this.report = report;
    }

    @Override
    public void printOut() {
        System.out.println("Invoice");
        System.out.println(report.customer());
        System.out.println(report.total());
    }
}
