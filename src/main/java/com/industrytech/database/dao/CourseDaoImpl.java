package com.industrytech.database.dao;

import com.industrytech.cources.models.Course;
import com.industrytech.database.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CourseDaoImpl implements CourseDao{
     int id,duration;
     double fees;
     Date cdate,mdate;
     String name,cname,mname;
    @Override
    public List<Course> getAll() throws SQLException {
        Connection connection = ConnectionFactory.produce();
        String get = "SELECT * FROM technologies.course;";
        PreparedStatement pstmt = connection.prepareStatement(get);
        ResultSet rs = pstmt.executeQuery(get);
        List<Course> courses = new ArrayList<>();
        while(rs.next())
        {
            id = rs.getInt(1);
            name = rs.getString(2);
            duration = rs.getInt(3);
            fees = rs.getDouble(4);
            cdate = rs.getDate(5);
            mdate = rs.getDate(6);
            cname  = rs.getString(7);
            mname  = rs.getString(8);
            courses.add(new Course(id,name,duration,fees,cdate,mdate,cname,mname));
        }

        return courses;
    }

    @Override
    public boolean save(Course course) throws SQLException {
        // Your logic here
        Connection connection = ConnectionFactory.produce();
        String insert = "INSERT INTO technologies.course VALUES(?,?,?,?,?,?,?,?);";
        PreparedStatement pstmt = connection.prepareStatement(insert);
        pstmt.setInt(1,course.getId());
        pstmt.setString(2, course.getName());
        pstmt.setInt(3,course.getDuration());
        pstmt.setDouble(4,course.getFee());
        pstmt.setTimestamp(5,course.createDate());
        pstmt.setTimestamp(6,course.createDate());
        pstmt.setString(7,course.getCname());
        pstmt.setString(8,course.getMname());
        pstmt.executeUpdate();
        connection.close();
        pstmt.close();
        return false;
    }

    public static void main(String[] args) throws SQLException {
        Connection connection=ConnectionFactory.produce();
        System.out.println(connection);
    }
    @Override
    public boolean saveMany(List<Course> courses) {
        return false;
    }
}
