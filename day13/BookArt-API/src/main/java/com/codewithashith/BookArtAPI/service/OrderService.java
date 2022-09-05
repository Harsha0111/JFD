package com.codewithashith.BookArtAPI.service;

import com.codewithashith.BookArtAPI.repository.OrderRepository;
import com.codewithashith.BookArtAPI.repository.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
}
