package com.industrytech.cources.controller;

import com.industrytech.cources.models.Course;
import com.industrytech.database.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    CourseDao courseDao;

    @GetMapping("")
    String getAllCourses(ModelMap modelMap) throws SQLException {
        List<Course> courses = null;
        courses = courseDao.getAll();
        modelMap.addAttribute("courses", courses);
        return "courses";

    }

    @PostMapping("/insert")
    @ResponseBody String saveCourse(ModelMap modelMap, @ModelAttribute Course course) throws SQLException {
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
        return "home";
    }

}
