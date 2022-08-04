package com.industrytech.rest;

import com.industrytech.cources.models.Course;
import com.industrytech.repository.UserRepository;
import com.industrytech.users.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class UsersRestController {
    @Autowired
    UserRepository repository;
    @RequestMapping(value = "/rest/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> allUsers = (List<User>) repository.findAll();
        return allUsers;
    }
}
