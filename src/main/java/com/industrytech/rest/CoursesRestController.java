package com.industrytech.rest;

import com.industrytech.cources.models.Course;
import com.industrytech.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class CoursesRestController {

    @Autowired
    CourseRepository repository;

    @RequestMapping(value = "/rest/courses", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Course> getAllCourses(){
        List<Course> all = repository.findAll();
        System.out.println(all);
        return all;
    }
}
