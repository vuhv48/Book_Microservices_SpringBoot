package com.microservice.product_service.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentService {

    @GetMapping("/student")
    public String getStudent(){
        Student student = new Student();
        student.setName("Nguyen");
        student.getName();
        return "test";
    }
}
