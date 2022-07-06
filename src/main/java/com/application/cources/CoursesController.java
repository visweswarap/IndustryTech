package com.application.cources;

import com.application.cources.models.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller("courses")
public class CoursesController {

    @GetMapping("")
    String getAllCourses(HttpServlet req, HttpServletResponse res){

        return "success";
    }

}
