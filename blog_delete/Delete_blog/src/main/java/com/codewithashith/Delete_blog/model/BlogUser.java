package com.codewithashith.Delete_blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
public class BlogUser {

    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String password;

    @JsonIgnore
    @OneToMany(mappedBy = "blogUser", cascade = CascadeType.ALL)
    private Set<Post> posts;

    @ManyToMany
    @JsonIgnore
    @Cascade({org.hibernate.annotations.CascadeType.ALL})
    @JoinTable(joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Set<Role> roles;

    public BlogUser() {
    }

    public BlogUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
