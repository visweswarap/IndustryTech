package com.industrytech.users.controller;

import com.industrytech.cources.models.Course;
import com.industrytech.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    HttpServletRequest request;

    @GetMapping("")
    String getUser(ModelMap modelMap) throws SQLException {

        HttpSession session = request.getSession();
        User user = new User();
        user.setEmail("");
        session.setAttribute("user", user);
        modelMap.addAttribute("message", "");
        return "login";

    }
    @PostMapping("/register")
    @ResponseBody
    String saveUser(ModelMap modelMap, @ModelAttribute User user) throws SQLException
    {
        boolean isSaved = userDao.save(user);
        if (isSaved) {
            modelMap.addAttribute("message", "SUCCESS FULLY SAVED");
        } else {
            modelMap.addAttribute("message", "FIELDS ARE ENTER CORRECTLY");
        }
        return "success";
    }

    }

