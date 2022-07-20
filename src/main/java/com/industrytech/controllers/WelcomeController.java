package com.industrytech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

    @RequestMapping
    String getDefault(){
        return "home";
    }

    @RequestMapping("/home")
    String getHomePage(){
        return "home";
    }
}
