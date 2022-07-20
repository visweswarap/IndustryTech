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
    String saveUser(ModelMap modelMap, @ModelAttribute User user) throws SQLException {
        boolean isSaved = userDao.save(user);
        if (isSaved) {
            modelMap.addAttribute("message", "SUCCESS FULLY SAVED");
        } else {
            modelMap.addAttribute("message", "FIELDS ARE ENTER CORRECTLY");
        }
        return "success";
    }

    @PostMapping("/login")
    @ResponseBody
    String loginValidation(ModelMap modelMap, @ModelAttribute User user) throws SQLException {

        modelMap.addAttribute("email", user.getEmail());
        modelMap.addAttribute("password", user.getPassword());
        boolean isLogin = userDao.loginValidate(user);
        if (isLogin) {
            return "home";
        } else {
            return "login";

        }
    }


    // Todo: Change this
    // login post mapping
    // read details from database where email and password matches
    // If there is any record? success
    // navigate to home page (home.jsp)
    // if no records or zero records, then wrong
    // Invalid login details, please try again
}

