package com.codewithashith.Delete_blog.service;

import com.codewithashith.Delete_blog.exception.ResourceAlreadyExistException;
import com.codewithashith.Delete_blog.exception.ResourceNotFoundException;
import com.codewithashith.Delete_blog.model.BlogUser;
import com.codewithashith.Delete_blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public BlogUser register(BlogUser blogUser) {
        blogUser.setPassword(bCryptPasswordEncoder.encode(blogUser.getPassword()));

        BlogUser userAlreadyExists = userRepository.findByUserName(blogUser.getUserName());
        if (userAlreadyExists != null) {
            throw new ResourceAlreadyExistException("User Already Exists");
        }

        return userRepository.save(blogUser);

    }

    public BlogUser login(BlogUser blogUser) {
        BlogUser userAlreadyExists = userRepository.findByUserName(blogUser.getUserName());
        if (userAlreadyExists != null) {
            if (!bCryptPasswordEncoder.matches(blogUser.getPassword(), userAlreadyExists.getPassword())) {
                throw new ResourceNotFoundException("Invalid Password!");
            }
        } else {
            throw new ResourceNotFoundException("Invalid Username");
        }
        return userAlreadyExists;
    }
}
