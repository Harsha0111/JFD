package com.nseit.blog.controller;

import com.nseit.blog.model.BlogUser;
import com.nseit.blog.response.APIResponse;
import com.nseit.blog.service.BlogUserDetailsService;
import com.nseit.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private APIResponse apiResponse;

    @PostMapping("/login")
    public ResponseEntity<APIResponse> login(@RequestBody BlogUser blogUser){
        BlogUser loggedInUser = userService.login(blogUser);
    }

}
