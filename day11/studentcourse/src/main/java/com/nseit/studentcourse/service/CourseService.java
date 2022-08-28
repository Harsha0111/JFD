package com.nseit.studentcourse.service;

import com.nseit.studentcourse.model.Course;
import com.nseit.studentcourse.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public void add(Course course) {
        courseRepository.save(course);
    }

    public void update(Course course) {
        courseRepository.save(course);

    }

    public List<Course> view() {
        return courseRepository.findAll();
    }

    public void delete(int id) {
        List<Course> courses = courseRepository.findAll();
        for (Course course : courses) {
            if (course.getCourseId()== id) {
                courseRepository.delete(course);
            }
        }
    }
}