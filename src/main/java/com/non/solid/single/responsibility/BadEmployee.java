package com.non.solid.single.responsibility;

/**
 * @author anthonylee
 */
// Bad Example: This class has multiple responsibilities. It calculates salary, saves to database, and displays profile.
public class BadEmployee {
    public void calculateSalary() {
        System.out.println("Calculate salary");
    }

    public void saveToDatabase() {
        System.out.println("Saving to database");
    }

    public void displayProfile() {
        System.out.println("Printing report");
    }
}
