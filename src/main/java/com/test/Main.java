package com.test;

import com.non.solid.dependency.inversion.BadEmailNotification;
import com.non.solid.dependency.inversion.BadEmployee;
import com.non.solid.interfaces.segregation.BadCircle;
import com.non.solid.interfaces.segregation.BadCube;
import com.non.solid.liskov.substitution.BadRectangle;
import com.non.solid.liskov.substitution.BadSquare;
import com.non.solid.open.closed.BadOrderReport;
import com.non.solid.single.responsibility.BadInvoice;
import com.solid.dependency.Inversion.GoodEmailNotification;
import com.solid.dependency.Inversion.GoodEmployee;
import com.solid.interfaces.segregation.GoodCircle;
import com.solid.interfaces.segregation.GoodCube;
import com.solid.liskov.substitution.GoodRectangle;
import com.solid.liskov.substitution.GoodSquare;
import com.solid.liskov.substitution.Shape;
import com.solid.open.closed.BillOfLading;
import com.solid.open.closed.GoodOrderReport;
import com.solid.open.closed.OrderReportInvoice;
import com.solid.single.responsibility.GoodInvoice;
import com.solid.single.responsibility.InvoicePrinter;
import com.solid.single.responsibility.SalesTaxCalculator;
import com.solid.single.responsibility.State;

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
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println("Area: " + rectangle.area());

        var square = new BadSquare(5);
        square.setWidth(10);
        square.setHeight(20);
        System.out.println("Area: " + square.area());
    }

    public static void liskovSubstitution() {
        var goodRectangle = new GoodRectangle(5, 10);
        goodRectangle.setWidth(10);
        goodRectangle.setHeight(20);

        var goodSquare = new GoodSquare(5);
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
