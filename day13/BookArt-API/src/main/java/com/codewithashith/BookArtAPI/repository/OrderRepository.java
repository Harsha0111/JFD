package com.codewithashith.BookArtAPI.repository;

import com.codewithashith.BookArtAPI.model.Book;
import com.codewithashith.BookArtAPI.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
