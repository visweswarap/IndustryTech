package com.industrytech.cources.models;

import java.sql.Timestamp;
import java.util.Date;

public class Course {

    private int id;
    private String name;
    private int duration;
    private Double fee;

    private String createdBy;
    private String modifiedBy;
    private Date createdDate;
    private Date modifiedDate;

    public Course(int id, String name, int duration, Double fee, String createdBy, String modifiedBy, Date createdDate, Date modifiedDate, CourseType type) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.fee = fee;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.type = type;
    }

    public Course(){

    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

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

    public Timestamp createDate() {
        return null;
    }

    public enum CourseType {
        PROGRAMMING,
        TESTING,
        PROJECT_TRAINING
    }
}
