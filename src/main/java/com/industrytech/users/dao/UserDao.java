package com.industrytech.users.dao;


import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface UserDao {

    public boolean save(User user) throws SQLException;
}
