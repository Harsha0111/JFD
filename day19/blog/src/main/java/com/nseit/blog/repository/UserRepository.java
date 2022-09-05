package com.nseit.blog.repository;

import com.nseit.blog.model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<BlogUser,Integer> {
    BlogUser findByUserName(String userName);
}
