package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;

/**
 * (non-javadoc)
 * 
 * @author MJ Youn
 * @since 2024. 08. 20.
 */
@RestController
public class ApiController {

    private StudentService studentServ;

    protected ApiController(StudentService studentServ) {
        this.studentServ = studentServ;
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/api/students/{name}")
    public StudentDTO findOne(@PathVariable String name) {
        return this.studentServ.findOne(name);
    }

}
