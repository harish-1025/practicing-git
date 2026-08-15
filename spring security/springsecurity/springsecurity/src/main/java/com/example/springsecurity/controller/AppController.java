package com.example.springsecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/api")
public class AppController {

    @GetMapping("/greet")
    public String greet(HttpServletRequest req)
    {
        return "Welcome to spring security"+req.getSession().getId();

    }

}
