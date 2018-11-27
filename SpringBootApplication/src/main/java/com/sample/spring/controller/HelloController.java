package com.sample.spring.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Spring boot app!";
    }
    
    @RequestMapping("/java/hello")
    public String helloJava() {
        return "Java says hello";
    }

}