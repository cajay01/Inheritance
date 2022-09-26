package com.example.microservices.controller;

import com.example.microservices.exceptionHandler.datInvalidException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice("com.example.microservices")
public class GenericAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(datInvalidException.class)
    ResponseEntity<String> handleException(datInvalidException e){
        return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
