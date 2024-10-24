package com.solid.dependency.Inversion;

/**
 * @author anthonylee
 */
public class GoodEmployee {
    private final GoodNotification notification;

    public GoodEmployee(GoodNotification notification) {
        this.notification = notification;
    }
    public void notifyUser() {
        notification.notifyUser();
    }
}
