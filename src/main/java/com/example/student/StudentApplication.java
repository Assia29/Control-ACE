package com.example.student;

import com.example.student.dto.StudentDto;
import com.example.student.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }


    @Bean
    CommandLineRunner start(StudentService studentService){
        return args -> {
            studentService.saveStudent(
                    StudentDto.builder().name("assia").email("assia@gmail.com").dateNaissance("29-05-2002").build()
            );
            studentService.saveStudent(
                    StudentDto.builder().name("rim").email("rim@test.com").dateNaissance("13-01-2007").build()
            );
            studentService.saveStudent(
                    StudentDto.builder().name("imane").email("imane@test.com").dateNaissance("15-08-2017").build()
            );
            studentService.saveStudent(
                    StudentDto.builder().name("hamza").email("hamza@test.com").dateNaissance("02-11-2012").build()
            );

        };
    }
}

