package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

/**
 * (non-javadoc)
 * 
 * @author MJ Youn
 * @since 2024. 08. 20.
 */
@Service
public class StudentService {

    private StudentRepository studentRepo;

    protected StudentService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public StudentDTO findOne(String name) {
        List<Student> students = this.studentRepo.findAll();

        return students //
                .parallelStream() //
                .filter(s -> s.getName().equals(name)) //
                .map(s -> new StudentDTO()) //
                .findAny() //
                .orElseGet(null);
    }

}
