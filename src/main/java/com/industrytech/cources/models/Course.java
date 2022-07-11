package com.industrytech.cources.models;

public class Course {

    private int id;
    private String name;
    private int duration;
    private double fee;
    private CourseType type = CourseType.PROGRAMMING;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public enum CourseType{
        PROGRAMMING,
        TESTING,
        PROJECT_TRAINING
    }
}
