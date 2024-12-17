package com.example.student.web;

import com.example.student.dto.StudentDto;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentGraphQLController {
    @Autowired
    StudentService studentService;

    @QueryMapping
    public List<StudentDto> getStudentByDateNaissance(@Argument String date){
        return studentService.getStudentByDateNaissance(date);
    }
    @MutationMapping
    public StudentDto saveStudent(StudentDto studentDto){
        return studentService.saveStudent(studentDto);
    }


}