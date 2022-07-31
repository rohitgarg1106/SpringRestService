package com.Meesho.rest;

import com.Meesho.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> studentList;

    @PostConstruct
    public void loadData(){
        studentList = new ArrayList<Student>();

        studentList.add(new Student("Rohit", "Garg"));
        studentList.add(new Student("Harshil", "Jain"));
        studentList.add(new Student("Vatsal", "Agarwal"));
    }
    //define endpoint for "/students" - return list of students
    @GetMapping("/students")
    public List<Student> getStudents(){

        return studentList;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){

        if(id >= studentList.size() || id < 0){
            throw new StudentNotFoundException("Student id not found - "  + id);
        }
        return studentList.get(id);
    }



}
