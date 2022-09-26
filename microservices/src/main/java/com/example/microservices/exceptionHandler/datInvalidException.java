package com.example.microservices.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class datInvalidException extends Exception {
    String m="";
    public datInvalidException(String message){
        this.m=message;
    }


    public String HandleExc(){
        return this.m;
    }
}
