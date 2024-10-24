package com.non.solid.dependency.inversion;

/**
 * @author anthonylee
 */
public class BadMySQLDatabase {
    public void save(String data) {
        System.out.println("Saving data to MySQL database: " + data);
    }
}
