package com.industrytech.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("")
    String getUser(ModelMap modelMap) throws SQLException {
        modelMap.addAttribute("message", "");
        return "login";
    }
}
