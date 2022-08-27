package com.nseit.studentcourse.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String studentName;
    private Integer rollNo;
    private Integer age;
    @ManyToMany
}
