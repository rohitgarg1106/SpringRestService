package com.Meesho.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
    //add exception
    // Add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e){
        //create a StudentErrorResponse
        StudentErrorResponse error = new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage(), 131231313);

        //return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    // Add an exception handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception e){
        //create a StudentErrorResponse
        StudentErrorResponse error = new StudentErrorResponse(HttpStatus.BAD_REQUEST.value(), e.getMessage(), 131231313);

        //return ResponseEntity
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }


}
