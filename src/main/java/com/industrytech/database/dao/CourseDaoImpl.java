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
        Connection connection = null;
        PreparedStatement pstmt=null;
        String get = "SELECT * FROM technologies.course;";
         try {
             connection = ConnectionFactory.produce();
             pstmt = connection.prepareStatement(get);
             ResultSet rs = pstmt.executeQuery();
             List<Course> courses = new ArrayList<>();
             Course course = null;
             while (rs.next()) {
                 course = new Course();
                 course.setId(rs.getInt("id"));
                 course.setName(rs.getString("name"));
                 course.setDuration(rs.getInt("duration"));
                 course.setFee(rs.getDouble("fees"));
                 course.setCreatedDate(rs.getDate("created_date"));
                 course.setModifiedDate(rs.getDate("modified_date"));
                 course.setCreatedBy(rs.getString("created_by"));
                 course.setModifiedBy(rs.getString("modified_by"));
                 courses.add(course);
             }

             return courses;
         }catch (Exception ignored){

         }finally {
             connection.close();
             pstmt.close();
         }
        return null;
    }

    @Override
    public boolean save(Course course) throws SQLException {
        // Your logic here
        Connection connection = null;
        String insert = "INSERT INTO technologies.course VALUES(?,?,?,?,?,?,?,?);";
        PreparedStatement pstmt = null;
        try {
            connection = ConnectionFactory.produce();
            pstmt = connection.prepareStatement(insert);
            pstmt.setInt(1, course.getId());
            pstmt.setString(2, course.getName());
            pstmt.setInt(3, course.getDuration());
            pstmt.setDouble(4, course.getFee());
            pstmt.setTimestamp(5, course.createDate());
            pstmt.setTimestamp(6, course.createDate());
            pstmt.setString(7, course.getCreatedBy());
            pstmt.setString(8, course.getModifiedBy());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (connection != null)
                connection.close();
            if (pstmt != null)
                pstmt.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.produce();
        System.out.println(connection);
    }

    @Override
    public boolean saveMany(List<Course> courses) {
        return false;
    }
}
