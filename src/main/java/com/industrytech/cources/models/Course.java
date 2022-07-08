package com.industrytech.cources.models;

public class Course {

    int id;
    String name;
    CourseType type;

    static enum CourseType{
        PROGRAMMING,
        TESTING,
        PROJECT_TRAINING
    }
}
