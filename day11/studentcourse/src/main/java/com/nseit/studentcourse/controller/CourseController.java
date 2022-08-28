package com.nseit.studentcourse.controller;

import com.nseit.studentcourse.model.Course;
import com.nseit.studentcourse.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public void add(Course course) {
        courseService.add(course);

    }

    @PutMapping
    public void update(Course course) {
        courseService.update(course);
    }

    @GetMapping("/all")
    public List<Course> view() {

        return courseService.view();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int courseId) {
        courseService.delete(courseId);
    }
}
