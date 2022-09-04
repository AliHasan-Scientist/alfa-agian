package com.alfa.again.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "student_table")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stud_ID", nullable = false, unique = true)
    //primary key of student_table
    private UUID studentId;
    @Column(name = "stud_fName", nullable = false, length = 65)
    private String firstName;
    @Column(name = "stud_lName", nullable = false, length = 65)
    private String lastName;
    @Column(name = "stud_gender")
    private String gender;
    @Column(name = "stud_age")
    private Integer age;
    @Column(name = "stud_address")
    private String studentAddress;
    @Column(name = "stud_email", nullable = false, unique = true)
    private String email;
    @Column(name = "stud_pass", nullable = false)
    private String studentPassword;


    // default constructor
    public Student() {
    }
}