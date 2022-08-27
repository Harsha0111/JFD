package com.nseit.studentcourse.repository;

import com.nseit.studentcourse.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
