package com.industrytech.users.controller;

import com.industrytech.repository.UserRepository;
import com.industrytech.users.dao.UserDao;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import com.industrytech.users.model.User;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class UserController {
    private static final org.apache.log4j.Logger logger = Logger.getLogger(UserController.class);
    @Autowired
    UserDao userDao;
    @Autowired
    HttpServletRequest request;
    @Autowired
    UserRepository repository;
    @GetMapping("")
    String getAllUsers(ModelMap modelMap) throws SQLException {
        User user = (User) request.getSession().getAttribute("user");
        logger.info("No User Login first login");
        if(user == null){
            return "login";
        }
        List<User> users = (List<User>) repository.findAll();
        modelMap.addAttribute("users", users);
        logger.info("Get All Login  User Details. ");
          return "admin";
    }

    @PostMapping("/register")
    @ResponseBody
    String saveUser(ModelMap modelMap, @ModelAttribute User user) throws SQLException {
        user.setId(user.getId());
        user.setFirstname(user.getFirstname());
        user.setLastname(user.getLastname());
        user.setEmail(user.getEmail());
        user.setMobile(user.getMobile());
        user.setPassword(user.getPassword());
        user.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        user.setModifiedDate(new Timestamp(System.currentTimeMillis()));
        repository.save(user);
        logger.info("Save User Details.");
         return "login";
    }

    @GetMapping("/details")
    String getLoginUser(ModelMap modelMap) throws SQLException {
        List<User> users = null;
        User user = (User) request.getSession().getAttribute("user");
        String email = user.getEmail();
        User user1 = repository.findByUser(email);
        modelMap.addAttribute("user", user1);
        logger.info("Get User Details of only login User");
        return "userdetails";

    }

}

