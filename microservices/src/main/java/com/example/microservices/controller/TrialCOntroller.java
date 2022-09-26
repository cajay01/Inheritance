package com.example.microservices.controller;

import com.example.microservices.exceptionHandler.datInvalidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1/api")
//@Tag
//@ApiResponse
public class TrialCOntroller {
    @GetMapping("/micro1/{id}")

    public String getMicro1(@PathVariable("id")
                                      String id) throws datInvalidException {
        if(id.length()>5){
          throw  new datInvalidException("Invalid input");
        }
        return "Hello";

    }

}
