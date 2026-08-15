package com.example.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
        new Student(1, "harish"),
        new Student(2, "dravid")
        ));
    @GetMapping("/getStudent")
    public List<Student> getStudents(){
        return students;
    }
    @PostMapping("/post")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrf(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }



}
