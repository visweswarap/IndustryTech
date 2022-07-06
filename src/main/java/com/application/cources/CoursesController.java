package com.application.cources;

import com.application.cources.models.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/courses")
public class CoursesController {

    @GetMapping("/all")
    String getAllCourses(ModelMap modelMap){

        return "success";
    }

}
