package com.industrytech.controllers;

import com.industrytech.cources.models.Course;
import com.industrytech.repository.CourseRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;


@Controller
@RequestMapping("/")
public class WelcomeController {

    private static final Logger logger = Logger.getLogger(WelcomeController.class);

    @Autowired
    CourseRepository repository;

    @RequestMapping
    String getDefault(){
        logger.info("Accessing Default url ");
        List<Course> all = repository.findAll();
        return "home";
    }

    @RequestMapping("/home")
    String getHomePage(){
        return "home";
    }

}
