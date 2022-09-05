package com.nseit.Blog.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
    private String image;
    @ManyToMany
    @JoinTable(name = "post_user",
            joinColumns = @JoinColumn(name = "post_id",referencedColumnName ="id"),
            inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"))
   private Set<BlogUser> blogUsers;
}
