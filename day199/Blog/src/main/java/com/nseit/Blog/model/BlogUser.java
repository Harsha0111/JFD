package com.nseit.Blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class BlogUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String password;

    @JsonIgnore
    @ManyToMany(mappedBy = "blogUsers",cascade = CascadeType.ALL)
    private Set<Post>posts;


    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "user_role",joinColumns = {@JoinColumn(name = "user_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")})
    private Set<Role> roles;
}

