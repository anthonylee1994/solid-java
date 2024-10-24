package com.solid.dependency.Inversion;

/**
 * @author anthonylee
 */
public class GoodEmailNotification implements GoodNotification {
    @Override
    public void notifyUser() {
        System.out.println("Sending notification via email");
    }
}
