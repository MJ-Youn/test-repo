package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

/**
 * (non-javadoc)
 * 
 * @author MJ Youn
 * @since 2024. 08. 20.
 */
@Repository
public class StudentRepository {

    public List<Student> findAll() {
        // TODO 모든 학생의 목록 조회
        return null;
    }

}
