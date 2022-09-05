package com.nseit.blog.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class BlogUser {
    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private  String password;

}
