package com.non.solid.dependency.inversion;

/**
 * @author anthonylee
 */
public class BadUser {
    private final String username;
    private final BadMySQLDatabase database;

    public BadUser(String username) {
        database = new BadMySQLDatabase();
        this.username = username;
    }

    public void save() {
        database.save(username);
    }
}
