package com.manjula.firstDemo.service;

import com.manjula.firstDemo.Student;

import java.util.Optional;

public interface StudentService {

    Student save(Student student);
    Student fetchStudentById(int id);
}
