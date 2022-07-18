package com.industrytech.users.controller;

import com.industrytech.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @GetMapping("")
    String getUser(ModelMap modelMap) throws SQLException {
        modelMap.addAttribute("message", "");
        return "login";
     /*  boolean isSaved = userDao.save(user);
        if (isSaved) {
            modelMap.addAttribute("message", "SUCCESS FULLY LOGIN");
        } else {
            modelMap.addAttribute("message", "FAILED");
        }
        return "courses";*/
    }
}
