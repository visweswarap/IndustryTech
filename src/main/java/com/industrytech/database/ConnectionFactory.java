package com.industrytech.database;

import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class ConnectionFactory {

    String dbUser = "";
    String dbPass = "";
    String url = "";
    String dbName = "";

    public static Connection produce(){
        // register driver
        // get connection by driver manager
        // return connection
        return null;
    }
}
