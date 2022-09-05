package com.nseit.blogSpringBoot.service;

import com.nseit.blogSpringBoot.exception.UserExistException;
import com.nseit.blogSpringBoot.model.BlogUser;
import com.nseit.blogSpringBoot.model.Role;
import com.nseit.blogSpringBoot.repository.RoleRepository;
import com.nseit.blogSpringBoot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public BlogUser registerAsCustomer(BlogUser blogUser) {
        BlogUser user = userRepository.findByUserName(blogUser.getUserName());
        if (user != null) {
            throw new UserExistException("User Already Exception");
        }
        Role role = roleRepository.findByName(Role.ROLE_USER);
        blogUser.setRoles(Set.of(role));
        blogUser.setPassword(bCryptPasswordEncoder.encode(blogUser.getPassword()));
        return userRepository.save(blogUser);
    }

    public List<BlogUser> getAllUsers() {
        return userRepository.findAll();
    }

    public BlogUser loginAsCustomer(BlogUser blogUser) {
        BlogUser user = userRepository.findByUserName(blogUser.getUserName());
        if (user != null && bCryptPasswordEncoder.matches(blogUser.getPassword(), user.getPassword())) {
            return user;
        }
        return null;
    }
}