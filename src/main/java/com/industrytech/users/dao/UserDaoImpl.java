package com.industrytech.users.dao;

import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UserDaoImpl implements UserDao {


    @Override
    public boolean save(User user) throws SQLException {
        Connection connection = null;
        String insert = "INSERT INTO technologies.login" +
                "(first_name, last_name, email_id,password,mobile_number,created_date,modified_date)" +
                " VALUES(?, ?, ?,?,?,CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
        PreparedStatement pstmt = null;
        try {
            connection = ConnectionFactory.produce();
            pstmt = connection.prepareStatement(insert);
            pstmt.setString(1, user.getFirstname());
            pstmt.setString(2, user.getLastname());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getMobile());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (pstmt != null)
                pstmt.close();
            if (connection != null)
                connection.close();
        }
    }


    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.produce();
        System.out.println(connection);

    }
}