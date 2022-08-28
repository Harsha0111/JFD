package com.nseit.studentcourse.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Integer stuId;
    private String studentName;
    private Integer rollNo;
    private Integer age;
//    @ManyToMany(mappedBy = "student")
//    private List<Student> student;
}
