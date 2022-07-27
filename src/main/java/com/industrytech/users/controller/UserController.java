package com.industrytech.users.controller;

import com.industrytech.cources.models.Course;
import com.industrytech.repository.CourseRepository;
import com.industrytech.repository.UserRepository;
import com.industrytech.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import com.industrytech.database.ConnectionFactory;
import com.industrytech.users.model.User;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
        user.setId(user.getId());
        user.setFirstname(user.getFirstname());
        user.setLastname(user.getLastname());
        user.setEmail(user.getEmail());
        user.setMobile(user.getMobile());
        user.setPassword(user.getPassword());
        user.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        user.setModifiedDate(new Timestamp(System.currentTimeMillis()));
       repository.save(user);
        return "success";
    }

    @PostMapping("/login")
    ModelAndView loginValidation(ModelMap modelMap, @ModelAttribute User user) throws SQLException {

        modelMap.addAttribute("email", user.getEmail());
        modelMap.addAttribute("errorLogin", "E-MAIL or Password wronly Entered");
        // modelMap.addAttribute("password", user.getPassword());
        List<User> users = null;
        String email = user.getEmail();
        String password=user.getPassword();
      User user1 = repository.findByLogin(email,password);
     //   users = userDao.loginValidate(user);

        if (user1 != null) {
            return new ModelAndView("redirect:/home", modelMap);
        }else {
            return new ModelAndView("redirect:login", modelMap);
        }
    }

    }

