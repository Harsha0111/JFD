package com.codewithashith.Delete_blog.repository;

import com.codewithashith.Delete_blog.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BlogUser, Integer> {
    BlogUser findByUserName(String userName);
}
