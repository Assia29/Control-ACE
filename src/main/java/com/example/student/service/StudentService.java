package com.example.student.service;

import com.example.student.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public List<StudentDto> getStudentByDateNaissance(String date);
    public StudentDto saveStudent(StudentDto studentDto);
}