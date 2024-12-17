package com.example.student.service;


import com.example.student.dao.entities.Student;
import com.example.student.dao.repositories.StudentRepository;
import com.example.student.dto.StudentDto;
import com.example.student.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentManager implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<StudentDto> getStudentByDateNaissance(String date) {
        List<Student> students = studentRepository.findByDateNaissance(date);
        List<StudentDto> studentDtos = new ArrayList<>();
        for(Student student : students){
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student=studentMapper.fromStudentDtoToStudent(studentDto);
        student=studentRepository.save(student);
        studentDto=studentMapper.fromStudentToStudentDto(student);
        return studentDto;
    }
}