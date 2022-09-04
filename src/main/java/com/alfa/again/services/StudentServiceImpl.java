package com.alfa.again.services;

import com.alfa.again.entity.Student;
import com.alfa.again.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
