package com.codewithashith.BookArtAPI.service;

import com.codewithashith.BookArtAPI.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CartRepository cartRepository;

}
