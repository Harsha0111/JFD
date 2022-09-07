package com.codewithashith.Delete_blog.dataloader;

import com.codewithashith.Delete_blog.model.BlogUser;
import com.codewithashith.Delete_blog.model.Role;
import com.codewithashith.Delete_blog.repository.RoleRepository;
import com.codewithashith.Delete_blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Set;

@Component
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private boolean alreadySetup = false;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    @Transactional
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        if (alreadySetup) {
            return;
        }

//         Create user roles
        Role userRole = createRoleIfNotFound(Role.USER);
        Role adminRole = createRoleIfNotFound(Role.ADMIN);

        // Create users
        createUserIfNotFound("admin", adminRole);

        alreadySetup = true;
    }

    @Transactional
    private Role createRoleIfNotFound(final String name) {
        Role role = roleRepository.findByName(name);
        if (role == null) {
            role = new Role();
            role.setName(name);
            role = roleRepository.save(role);
        }
        return role;
    }

    @Transactional
    private BlogUser createUserIfNotFound(final String name, final Role role) {
        BlogUser user = userRepository.findByUserName(name);
        if (user == null) {
            user = new BlogUser(name, bCryptPasswordEncoder.encode("admin"));
            user.setRoles(Set.of(role));
            user = userRepository.save(user);
        }
        return user;
    }
}
