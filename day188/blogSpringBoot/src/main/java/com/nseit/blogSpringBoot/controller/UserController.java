package com.nseit.blogSpringBoot.controller;

import com.nseit.blogSpringBoot.model.BlogUser;
import com.nseit.blogSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping
    List<BlogUser> get(){
        return userService.getAllUsers();
    }
}
