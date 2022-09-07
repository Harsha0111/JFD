package com.codewithashith.Delete_blog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Post {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
    private LocalDateTime localDateTime;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private BlogUser blogUser;

    public Post() {
        localDateTime = LocalDateTime.now();
    }

}