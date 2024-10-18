package com.test;

import com.non.solid.d.BadEmailNotification;
import com.non.solid.d.BadEmployee;
import com.non.solid.i.BadCircle;
import com.non.solid.i.BadCube;
import com.non.solid.l.BadRectangle;
import com.non.solid.l.BadSquare;
import com.non.solid.o.BadOrderReport;
import com.non.solid.s.BadInvoice;
import com.solid.d.GoodEmailNotification;
import com.solid.d.GoodEmployee;
import com.solid.i.GoodCircle;
import com.solid.i.GoodCube;
import com.solid.l.GoodRectangle;
import com.solid.l.GoodSquare;
import com.solid.l.Shape;
import com.solid.o.BillOfLading;
import com.solid.o.GoodOrderReport;
import com.solid.o.OrderReportInvoice;
import com.solid.s.GoodInvoice;
import com.solid.s.InvoicePrinter;
import com.solid.s.SalesTaxCalculator;
import com.solid.s.State;

import java.math.BigDecimal;
import java.util.Set;

/**
 * @author anthonylee
 */
public class Main {
    public static void violateSingleResponsibility() {
        var invoice = new BadInvoice("Anthony", "AZ", BigDecimal.valueOf(100));
        invoice.printInvoice();
    }

    public static void singleResponsibility() {
        var invoice = new GoodInvoice("Anthony", State.AZ, BigDecimal.valueOf(100));
        var salesTaxCalculator = new SalesTaxCalculator(invoice.state());
        var invoicePrinter = new InvoicePrinter(invoice, salesTaxCalculator);
        invoicePrinter.print();
    }

    public static void violateOpenClosed() {
        var badOrderReport = new BadOrderReport("Anthony", BigDecimal.valueOf(100), "123 Main St.");
        badOrderReport.invoice();
        badOrderReport.billOfLading();
    }


    public static void openClosed() {
        var goodOrderReport = new GoodOrderReport("Anthony", BigDecimal.valueOf(100));
        var invoice = new OrderReportInvoice(goodOrderReport);
        var billOfLading = new BillOfLading(goodOrderReport,"123 Main St.");
        invoice.printOut();
        billOfLading.printOut();
    }

    public static void violateLiskovSubstitution() {
        var rectangle = new BadRectangle(5, 10);
        System.out.println("Area: " + rectangle.area());

        var square = new BadSquare(5);
        square.setWidth(10);
        square.setHeight(20);
        System.out.println("Area: " + square.area());
    }

    public static void liskovSubstitution() {
        GoodRectangle goodRectangle = new GoodRectangle(5, 10);

        GoodSquare goodSquare = new GoodSquare(5);
        goodSquare.setSide(10);

        for (Shape shape : Set.of(goodRectangle, goodSquare)) {
            System.out.println("Area: " + shape.area());
        }
    }

    public static void violateInterfaceSegregation() {
        var badCube = new BadCube(5);
        System.out.println("Cube Area: " + badCube.calculateArea());
        System.out.println("Cube Volume: " + badCube.calculateVolume());

        var badCircle = new BadCircle(5);
        System.out.println("Circle Area: " + badCircle.calculateArea());
        System.out.println("Circle Volume: " + badCircle.calculateVolume()); // Error
    }

    public static void interfaceSegregation() {
        var goodCube = new GoodCube(5);
        System.out.println("Cube Area: " + goodCube.calculateArea());
        System.out.println("Cube Volume: " + goodCube.calculateVolume());

        var goodCircle = new GoodCircle(5);
        System.out.println("Circle Area: " + goodCircle.calculateArea());
    }

    public static void violateDependencyInversion() {
        var badEmailNotification = new BadEmailNotification();
        BadEmployee badEmployee = new BadEmployee(badEmailNotification);
        badEmployee.notifyUser();
    }

    public static void dependencyInversion() {
        var goodNotification = new GoodEmailNotification();
        GoodEmployee goodEmployee = new GoodEmployee(goodNotification);
        goodEmployee.notifyUser();
    }

    public static void main(String[] args) {
        dependencyInversion();
    }
}
