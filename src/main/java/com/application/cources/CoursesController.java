package com.application.cources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")
public class CoursesController {

    @GetMapping("/all")
    String getAllCourses(ModelMap modelMap){

        return "success";
    }

}
