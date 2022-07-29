package com.industrytech.users.dao;

import com.industrytech.cources.models.Course;
import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;
import org.spockframework.runtime.ConfigurationBuilder;
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
        return true;
    }
    @Override
    public List<User> loginValidate(User user) throws SQLException {
        return null;
    }
}