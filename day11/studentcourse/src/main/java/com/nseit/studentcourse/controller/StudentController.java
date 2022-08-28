package com.nseit.studentcourse.controller;

import com.nseit.studentcourse.model.Course;
import com.nseit.studentcourse.model.Student;
import com.nseit.studentcourse.service.CourseService;
import com.nseit.studentcourse.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public void add(Student student) {
        studentService.add(student);

    }

    @PutMapping
    public void update(Student student) {
        studentService.update(student);
    }

    @GetMapping("/all")
    public List<Student> view() {

        return studentService.view();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int stuId) {
        studentService.delete(stuId);
    }
}


