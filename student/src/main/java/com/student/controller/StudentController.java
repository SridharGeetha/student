package com.student.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.Student;
import com.student.repository.StudentRepository;

@RestController
public class StudentController {
    
    @Autowired
    StudentRepository repository;

    @GetMapping("/getallstudents")
    public ArrayList<Student> getAll(){
        return (ArrayList<Student>) repository.findAll();
    }
}
