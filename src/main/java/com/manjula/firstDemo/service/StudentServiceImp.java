package com.manjula.firstDemo.service;

import com.manjula.firstDemo.Student;
import com.manjula.firstDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student fetchStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            return  student.get();
        }
        return null;
    }
}
