package com.industrytech.cources.controller;

import com.industrytech.cources.models.Course;
import com.industrytech.database.dao.CourseDao;
import com.industrytech.database.dao.CourseDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    CourseDao courseDao;

    @GetMapping("/all")
    String getAllCourses(ModelMap modelMap) throws SQLException {
        List<Course> courses = null;
        courses = courseDao.getAll();
        modelMap.addAttribute("courses", courses);
        return "items";

    }

    @GetMapping("/new")
    String newCourse(ModelMap modelMap) {
        modelMap.addAttribute("message", "");
        return "new-course";
    }

    @PostMapping("/insert")
    String saveCourse(ModelMap modelMap, @ModelAttribute Course course) throws SQLException {
        System.out.println("Inserting details...");
        course.setType(Course.CourseType.PROGRAMMING);
        course.setCreatedBy("Admin");
        course.setModifiedBy("Admin");
        course.setCreatedDate(new Date());
        course.setModifiedDate(new Date());
        boolean isSaved = courseDao.save(course);
        if (isSaved) {
            modelMap.addAttribute("message", "SUCCESS");
        } else {
            modelMap.addAttribute("message", "FAILED");
        }
        return "success";
    }

    @GetMapping("/home")
    String courseHome(ModelMap modelMap) {
        modelMap.addAttribute("message", "");
        return "index";
    }

}
