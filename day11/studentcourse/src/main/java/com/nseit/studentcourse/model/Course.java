package com.nseit.studentcourse.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue
    private Integer id;
    private String courseName;
    private Integer courseDuration;
    @ManyToMany

}
