package com.industrytech.database;

import org.postgresql.Driver;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

   // String dbUser = "postgres";
  //  String dbPass = "postgres";
  //  String url = "jdbc:postgresql//localhost:5432";
   // String dbName = "IndustryTech";

    public static Connection produce()throws SQLException
    {
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection( "jdbc:postgresql://localhost:5432/jdbcpractice",
                "postgres",
                "postgres");
        // register driver
        // get connection by driver manager
        // return connection

    }


}
