package com.non.solid.d;

/**
 * @author anthonylee
 */
public class BadEmailNotification implements BadNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending notification via email");
    }
}
