package com.industrytech.cources.controller;


import com.industrytech.controllers.WelcomeController;
import com.industrytech.cources.models.Course;
import com.industrytech.database.dao.CourseDao;
import com.industrytech.repository.CourseRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@PropertySource("classpath:mail.yml")
@Controller
@RequestMapping("/courses")
public class CoursesController {
    private static final Logger logger = Logger.getLogger(CoursesController.class);
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    @Autowired
    CourseDao courseDao;
    @Autowired
    CourseRepository repository;

    @GetMapping("")
    String getAllCourses(ModelMap modelMap) throws SQLException {
        List<Course> courses = repository.findAll();
        modelMap.addAttribute("courses", courses);
        logger.info("Get All Courses Details");
        return "courses";
    }

    @PostMapping("/insert")
    @ResponseBody
    Map<String, String> saveCourse(ModelMap modelMap, @ModelAttribute Course course) throws SQLException {
        System.out.println("Inserting details...");
        course.setType(Course.CourseType.PROGRAMMING);
        course.setId(course.getId());
        course.setName(course.getName());
        course.setFee(course.getFee());
        course.setCreatedBy("Admin");
        course.setModifiedBy("Admin");
        course.setCreatedDate(timestamp);
        course.setModifiedDate(timestamp);
        repository.save(course);
        Map<String, String> map = new HashMap<>();
        map.put("message", "success");
        logger.info("Save Courses Details");
        return map;
    }

    @GetMapping("/delete")
    String deleteCourse(ModelMap modelMap) {
        logger.info("Delete Courses Details");
        //   modelMap.addAttribute("courses", courses);
        return "home";
    }

}
