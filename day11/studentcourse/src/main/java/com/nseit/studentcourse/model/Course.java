package com.nseit.studentcourse.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;
    private String courseName;
    private Integer courseDuration;
//    @ManyToMany
//    @JoinTable(name="COURSE_STUDENTS",
//            joinColumns=@JoinColumn(name="COURSE_ID"),
//            inverseJoinColumns=@JoinColumn(name="STUDENT_ID"))
//    private List<Student> students = new ArrayList<>();



}
