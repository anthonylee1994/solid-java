package com.solid.dependency.inversion;

/**
 * @author anthonylee
 */
// Good Example: This class follows the Dependency Inversion Principle. It depends on the Database interface.
public record GoodUser(Database database, String username) {
    public void save() {
        database.save(username);
    }
}
