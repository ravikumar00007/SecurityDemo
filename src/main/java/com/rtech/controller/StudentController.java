package com.rtech.controller;

import com.rtech.entity.StudentEntity;
import com.rtech.service.impl.StudentMgmtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentMgmtServiceImpl service;
    @PostMapping("/register")
    public String studentRegister(@RequestBody StudentEntity student){
        String msg = service.registerStudent(student);

       System.out.println(msg);
        return msg;
    }
    @GetMapping("/show")
    public String showStudentName(){
        System.out.println("student name shown");
        return "student name shown";
    }
    @GetMapping("/result")
    public String showResult(){
        return "Student result shown";
    }
    @GetMapping("/info")
    public String studentInfo(){
        return "Student info shown";
    }
}
