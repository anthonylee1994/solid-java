package com.solid.dependency.inversion;

/**
 * @author anthonylee
 */
public class MySQLDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("Saving data to MySQL database: " + data);
    }
}
