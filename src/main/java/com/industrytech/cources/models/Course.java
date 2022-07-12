package com.industrytech.cources.models;

import java.sql.Timestamp;
import java.util.Date;

public class Course {

    private int id;
    private String name,cname,mname;
    private Date cdate,mdate;
    private int duration;
   private Double fee;

    public Course(int id, String name,int duration,Double fees,  Date cdate, Date mdate,String cname, String mname) {
        this.id = id;
        this.name = name;
        this.cname = cname;
        this.mname = mname;
        this.cdate = cdate;
        this.mdate = mdate;
        this.duration = duration;
        this.fee = fees;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
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

    public enum CourseType{
        PROGRAMMING,
        TESTING,
        PROJECT_TRAINING
    }
}
