package com.industrytech.database.dao;

import com.industrytech.cources.models.Course;
import com.industrytech.database.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CourseDaoImpl implements CourseDao {
    @Override
    public List<Course> getAll() throws SQLException {
        return null;
    }
    @Override
    public boolean save(Course course) throws SQLException {
        return true;
    }
    @Override
    public boolean saveMany(List<Course> courses) {
        return false;
    }
}
