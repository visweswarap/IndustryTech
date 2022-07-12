package com.industrytech.cources;

import com.industrytech.cources.models.Course;
import com.industrytech.database.dao.CourseDao;
import com.industrytech.database.dao.CourseDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    CourseDao courseDao;

    @GetMapping("/all")
    String getAllCourses(ModelMap modelMap ) throws SQLException {
        modelMap.addAttribute("message", "");
        List<Course> course = null;
        CourseDaoImpl daocourse = new CourseDaoImpl();
        course = daocourse.getAll();

        return "items";

    }

    @GetMapping("/new")
    String newCourse(ModelMap modelMap){
        modelMap.addAttribute("message", "");
        return "new-course";
    }

    @PostMapping("/insert")
    String saveCourse(ModelMap modelMap, @ModelAttribute Course course) throws SQLException {
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
