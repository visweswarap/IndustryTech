package com.industrytech.users.controller;

import com.industrytech.repository.UserRepository;
import com.industrytech.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import com.industrytech.users.model.User;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    HttpServletRequest request;
    @Autowired
    UserRepository repository;

    @GetMapping("")
    String getAllUsers(ModelMap modelMap) throws SQLException {
        List<User> users = (List<User>) repository.findAll();
        modelMap.addAttribute("users",users);
        return "users";

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
        return "login";
    }

    @GetMapping("/loginform")
    String getLogin(ModelMap modelMap) throws SQLException {

        return "login";

    }

    }

