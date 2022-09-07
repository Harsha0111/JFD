package com.codewithashith.Delete_blog.repository;

import com.codewithashith.Delete_blog.model.BlogUser;
import com.codewithashith.Delete_blog.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}
