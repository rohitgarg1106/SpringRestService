package com.Meesho.rest;

import com.Meesho.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> studentList;

    //define endpoint for "/students" - return list of students
    @GetMapping("/students")
    public List<Student> getStudents(){
        studentList = new ArrayList<Student>();

        studentList.add(new Student("Rohit", "Garg"));
        studentList.add(new Student("Harshil", "Jain"));
        studentList.add(new Student("Vatsal", "Agarwal"));

        return studentList;

    }
}
