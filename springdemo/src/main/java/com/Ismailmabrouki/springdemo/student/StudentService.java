package com.Ismailmabrouki.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;



@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Ismail",
                        "Mabrouki",
                        LocalDate.now(),
                        "ismailmabrouki98@gmail.com",
                        25
                ),
                new Student(
                        "Ahmed1",
                        "Mabrouki",
                        LocalDate.now(),
                        "med@gmail.com",
                        20
                )
        );
    }
}
