package com.solid.o;

/**
 * @author anthonylee
 */
public class BillOfLading implements Printable {
    private final GoodOrderReport report;
    private final String address;

    public BillOfLading(GoodOrderReport report, String address) {
        this.report = report;
        this.address = address;
    }

    @Override
    public void printOut() {
        System.out.println("BOL");
        System.out.println(report.customer());
        System.out.println("Shipping Label...");
        System.out.println(address);
    }
}
