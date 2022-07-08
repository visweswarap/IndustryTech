package com.industrytech.cources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/courses")
public class CoursesController {

    @GetMapping("/all")
    String getAllCourses(ModelMap modelMap){
        modelMap.addAttribute("message", "");
        return "items";

    }

    @GetMapping("/new")
    String newCourse(ModelMap modelMap){
        modelMap.addAttribute("message", "");
        return "new-course";
    }

    @PostMapping("/insert")
    String saveCourse(ModelMap modelMap){
        modelMap.addAttribute("message", "");
        return "success";
    }


}
