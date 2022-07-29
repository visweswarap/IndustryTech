package com.industrytech.cources.controller;

import com.industrytech.admin.MailComponent;
import com.industrytech.cources.models.Course;
import com.industrytech.database.dao.CourseDao;
import com.industrytech.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/courses")
public class CoursesController {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());

    @Autowired
    CourseDao courseDao;
    @Autowired
    CourseRepository repository;

    @Value("${jdbc.user}")
    String userName;

    @Autowired
    YamlPropertiesFactoryBean yamlProperties;

//    @Value("${email.configs}")
//    List<Object> configsData;

    @Autowired
    Environment env;

//    @Autowired
//    List<MailComponent.EmailConfig> configs;

    @GetMapping("")
    String getAllCourses(ModelMap modelMap) throws SQLException {
        List<Course> courses = repository.findAll();
        modelMap.addAttribute("courses", courses);
        return "courses";
    }
    @PostMapping("/insert")
    @ResponseBody
    String saveCourse(ModelMap modelMap, @ModelAttribute Course course) throws SQLException {
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
        return "success";
    }

    @GetMapping("/delete")
    String deleteCourse(ModelMap modelMap) {

        //   modelMap.addAttribute("courses", courses);
        return "home";
    }

}
