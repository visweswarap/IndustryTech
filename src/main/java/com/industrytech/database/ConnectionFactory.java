package com.industrytech.database;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    String dbUser = "postgres";
    String dbPass = "postgres";
    String url = "jdbc:postgresql://localhost:5432";
    String dbName = "IndustryTech";

    public static Connection produce()throws SQLException
    {
        System.out.println("Getting connection....");
        ConnectionFactory factory = new ConnectionFactory();
        DriverManager.registerDriver(new Driver());
        System.out.println("URL: " + factory.url+"/"+factory.dbName);
        return DriverManager.getConnection( factory.url+"/"+factory.dbName, factory.dbUser, factory.dbPass);
    }


}
