package com.industrytech.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;

public class ConnectionFactory {

    String dbUser = "postgres";
    String dbPass = "postgres";
    String url = "127.0.0.1:5432";
    String dbName = "IndustryTech";

    public static Connection produce() {
        // register driver
        // get connection by driver manager
        // return connection
        return null;
    }
}
