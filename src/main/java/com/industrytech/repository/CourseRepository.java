package com.industrytech.repository;

import com.industrytech.cources.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("courseRepository")
public interface CourseRepository extends JpaRepository<Course, Integer> {

    default boolean findByLogin() {
        return false;
    }
}
