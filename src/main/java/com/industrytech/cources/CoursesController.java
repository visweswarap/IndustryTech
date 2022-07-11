package com.industrytech.cources;

import com.industrytech.cources.models.Course;
import com.industrytech.database.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    CourseDao courseDao;

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
    String saveCourse(ModelMap modelMap, @ModelAttribute Course course){
        modelMap.addAttribute("message", "");
        course.setType(Course.CourseType.PROGRAMMING);
        courseDao.save(course);
        return "success";
    }
   @GetMapping("/home")
    String courseHome(ModelMap modelMap){
        modelMap.addAttribute("message", "");
        return "index";
    }

}
