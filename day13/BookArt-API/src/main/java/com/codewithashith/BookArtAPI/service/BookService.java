package com.codewithashith.BookArtAPI.service;

import com.codewithashith.BookArtAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
}
