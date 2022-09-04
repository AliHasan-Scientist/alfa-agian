package com.alfa.again.services;

import com.alfa.again.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAllStudents();
}
