package com.codewithashith.BookArtAPI.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class BookUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String password;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Order> orders;

    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = {@JoinColumn(name = "USER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "ROLE")})
    private Set<Role> roles;

    public BookUser(String userName, String password, Set<Role> roles) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
    }
}
