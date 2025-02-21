package com.example.student.dao.repositories;


import com.example.student.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByDateNaissance(String date);
}