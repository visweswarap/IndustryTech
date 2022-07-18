package com.industrytech.users.dao;


import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public boolean save(User user) throws SQLException {
        Connection connection = null;
        String insert = "INSERT INTO technologies.user" +
                "(first_name, last_name, email, mobile_number)" +
                " VALUES(?, ?, ?,?);";
        PreparedStatement pstmt = null;
        try {
            connection = ConnectionFactory.produce();
            pstmt = connection.prepareStatement(insert);
            pstmt.setString(1, user.getFirstname());
            pstmt.setString(2, user.getLastname());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(3, user.getMobile());
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (pstmt != null)
                pstmt.close();
            if (connection != null)
                connection.close();
        }
    }
}
