package com.codewithashith.BookArtAPI.repository;

import com.codewithashith.BookArtAPI.model.BookUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BookUser, Long> {

    BookUser findByUsername(String userName);
}
