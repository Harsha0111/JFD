package com.codewithashith.BookArtAPI.controller;

import com.codewithashith.BookArtAPI.model.BookUser;
import com.codewithashith.BookArtAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/sign")
    public int register(@RequestBody BookUser bookUser) {
        BookUser registeredBookUser = userService.register(bookUser);
        return 1;
    }
}
