package com.non.solid.dependency.inversion;

/**
 * @author anthonylee
 */
public class BadEmailNotification implements BadNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending notification via email");
    }
}
