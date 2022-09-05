package com.codewithashith.BookArtAPI.service;

import com.codewithashith.BookArtAPI.model.Role;
import com.codewithashith.BookArtAPI.model.BookUser;
import com.codewithashith.BookArtAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        BookUser bookUser = userRepository.findByUsername(username);
        if (bookUser != null) {
            return new org.springframework.security.core.userdetails
                    .User(bookUser.getUserName(), bookUser.getPassword(),
                    buildSimpleGrantedAuthorities(bookUser.getRoles()));
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    private static List<SimpleGrantedAuthority> buildSimpleGrantedAuthorities(final Set<Role> roles) {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    public BookUser register(BookUser bookUser) {
        return userRepository.save(bookUser);
    }
}
