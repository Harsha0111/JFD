package com.nseit.Blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Role {
    public static final String ROLE_USER = "USER";
    public static final String ROLE_ADMIN = "ADMIN";
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
    private Set<BlogUser> blogs;


}

