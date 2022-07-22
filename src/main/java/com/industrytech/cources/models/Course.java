package com.industrytech.cources.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "technologies.customer")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    /**
     * id
     * name
     * duration
     * fees
     * created_date
     * modified_date
     * created_by
     * modified_by
     */
    @Column(name="name")
    private String name;

    @Column(name="duration")
    private int duration;

    @Column(name="fees")
    private Double fee;

    @Column(name="created_by")
    private String createdBy;

    @Column(name="modified_by")
    private String modifiedBy;

    @Column(name="created_date")
    private Date createdDate;

    @Column(name="modified_date")
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

    public Course() {

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
        ;
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
