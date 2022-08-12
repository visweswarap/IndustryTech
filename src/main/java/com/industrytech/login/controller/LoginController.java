package com.industrytech.login.controller;

import com.industrytech.cources.controller.CoursesController;
import com.industrytech.repository.UserRepository;
import com.industrytech.users.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("login")
public class LoginController {
    private static final Logger logger = Logger.getLogger(LoginController.class);
    @Autowired
    UserRepository repository;

    @RequestMapping("")
    String userLogin(){
        logger.info("Login Page Display");
        return "login";
    }

    @PostMapping("/validate")
    String loginValidation(HttpServletRequest request, @ModelAttribute User user) throws SQLException {
        //modelMap.addAttribute("email", user.getEmail());
        //modelMap.addAttribute("errorLogin", "E-MAIL or Password wronly Entered");
        // modelMap.addAttribute("password", user.getPassword());
        List<User> users = null;
        String email = user.getEmail();
        String password=user.getPassword();
        User user1 = repository.findByLogin(email,password);
       if (user1 != null) {
            user1.setPassword("");
            request.getSession().setAttribute("user", user1);
           logger.info("Verified Login User Validate or Not");
            return "redirect:/home";

        }else {
          request.setAttribute("email",user.getEmail());
          request.setAttribute("errorLogin","E-MAIL or Password wronly Entered");
           logger.info("User Not Validated ");
            return "redirect:/login";
        }


    }
}
