package com.codewithashith.BookArtAPI.controller;

import com.codewithashith.BookArtAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
}
