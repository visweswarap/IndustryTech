package com.industrytech.database.dao;

import com.industrytech.cources.models.Course;

import java.util.List;

public interface CourseDao {

    List<Course> getAll();

    boolean save(Course course);

    boolean saveMany(List<Course> courses);


}
