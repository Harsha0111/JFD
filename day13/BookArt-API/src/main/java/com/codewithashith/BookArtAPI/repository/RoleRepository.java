package com.codewithashith.BookArtAPI.repository;

import com.codewithashith.BookArtAPI.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
