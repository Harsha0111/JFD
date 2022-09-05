package com.codewithashith.BookArtAPI.repository;

import com.codewithashith.BookArtAPI.model.Book;
import com.codewithashith.BookArtAPI.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
