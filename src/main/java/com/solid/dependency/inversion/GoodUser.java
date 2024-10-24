package com.solid.dependency.inversion;

/**
 * @author anthonylee
 */
public record GoodUser(Database database, String username) {
    public void save() {
        database.save(username);
    }
}
