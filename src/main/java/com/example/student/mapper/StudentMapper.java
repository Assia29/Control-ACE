package com.example.student.mapper;

import com.example.student.dao.entities.Student;
import com.example.student.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDto.class);
    }}