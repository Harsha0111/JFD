package com.nseit.studentcourse.repository;

import com.nseit.studentcourse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student , Integer> {
}
