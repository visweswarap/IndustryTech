package com.industrytech.users.dao;

import com.industrytech.cources.models.Course;
import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    private String email;
    private String password;

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

    @Override
    public List<User> loginValidate(User user) throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;
        String get = "SELECT * FROM technologies.login WHERE email_id = ? AND password=?;";
        try {
            connection = ConnectionFactory.produce();
            pstmt = connection.prepareStatement(get);
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getPassword());
            ResultSet rs = pstmt.executeQuery();
            List<User> users = new ArrayList<>();
            User userData = null;
            while (rs.next()){
                userData = new User();
                userData.setId(rs.getInt("id"));
                userData.setFirstname(rs.getString("first_name"));
                userData.setLastname(rs.getString("Last_name"));
                userData.setEmail(rs.getString("email_id"));
                userData.setPassword(rs.getString("password"));
                userData.setMobile(rs.getString("mobile_number"));
                userData.setCreatedDate(rs.getDate("created_date"));
                userData.setModifiedDate(rs.getDate("modified_date"));
                users.add(userData);
            }
            //Todo: check if one record exist
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            assert pstmt != null;
            pstmt.close();
            connection.close();
        }

    }


}