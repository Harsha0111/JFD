package com.codewithashith.BookArtAPI.controller;

import com.codewithashith.BookArtAPI.service.BookService;
import com.codewithashith.BookArtAPI.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
}
