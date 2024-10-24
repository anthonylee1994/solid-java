package com.non.solid.dependency.inversion;

/**
 * @author anthonylee
 */
public class BadEmployee {
    private final BadEmailNotification emailNotification;

    public BadEmployee(BadEmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }
    public void notifyUser() {
        emailNotification.notifyUser();
    }
}
