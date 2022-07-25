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
        PreparedStatement pstmt = null;
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
        } catch (Exception ignored) {

        } finally {
            pstmt.close();
            connection.close();
        }
        return null;
    }

    @Override
    public boolean save(Course course) throws SQLException {
        Connection connection = null;
        String insert = "INSERT INTO technologies.course" +
                "(name, duration, fees, created_date, modified_date, created_by, modified_by)" +
                " VALUES(?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, ?, ?);";
        PreparedStatement pstmt = null;
        try {
            connection = ConnectionFactory.produce();
            pstmt = connection.prepareStatement(insert);
            pstmt.setString(1, course.getName());
            pstmt.setInt(2, course.getDuration());
            pstmt.setDouble(3, course.getFee());
            pstmt.setString(4, course.getCreatedBy());
            pstmt.setString(5, course.getModifiedBy());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            if (pstmt != null)
                pstmt.close();
            if (connection != null)
                connection.close();
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
