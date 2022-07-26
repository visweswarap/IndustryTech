package com.industrytech.controllers;

import com.industrytech.cources.models.Course;
import com.industrytech.database.ConnectionFactory;
import com.industrytech.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @Autowired
    CourseRepository repository;

    @RequestMapping
    String getDefault(){
        List<Course> all = repository.findAll();
        return "home";
    }

    @RequestMapping("/home")
    String getHomePage(){
        return "home";
    }
}
