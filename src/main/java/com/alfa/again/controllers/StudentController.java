package com.alfa.again.controllers;

import com.alfa.again.commons.URI;
import com.alfa.again.entity.Student;
import com.alfa.again.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(URI.uri)
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student addedStudent = studentService.createStudent(student);
        return (new ResponseEntity<>(addedStudent, HttpStatus.CREATED));
    }

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> addedStudent = studentService.getAllStudents();
        return (new ResponseEntity<>(addedStudent, HttpStatus.OK));
    }
}
