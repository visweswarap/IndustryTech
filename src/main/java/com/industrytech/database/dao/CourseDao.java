package com.industrytech.database.dao;

import com.industrytech.cources.models.Course;

import java.sql.SQLException;
import java.util.List;

public interface CourseDao {
    List<Course> getAll() throws SQLException;
    boolean save(Course course) throws SQLException;
    boolean saveMany(List<Course> courses);
}
