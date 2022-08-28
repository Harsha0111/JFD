package com.nseit.studentcourse.service;

import com.nseit.studentcourse.model.Course;
import com.nseit.studentcourse.model.Student;
import com.nseit.studentcourse.repository.CourseRepository;
import com.nseit.studentcourse.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void add(Student student) {
        studentRepository.save(student);
    }

    public void update(Student student) {
        studentRepository.save(student);

    }

    public List<Student> view() {
        return studentRepository.findAll();
    }

    public void delete(int id) {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (student.getStuId()== id) {
                studentRepository.delete(student);
            }
        }
    }
}
