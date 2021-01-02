package com.manjula.firstDemo.repository;

import com.manjula.firstDemo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

//public interface StudentRepository extends Repository<Student,Integer> {
//    Student save(Student student);
//}

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
