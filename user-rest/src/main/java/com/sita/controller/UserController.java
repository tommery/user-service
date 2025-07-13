package com.sita.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from User Service!";
    }
    
    @GetMapping("/git")
    public String git() {
        return "CI/CD succesfully completed!!!  take 12";
    }
    
    @GetMapping("/oz")
    public String oz() {
        return "Oz is the king";
    }
    
    @GetMapping("/tomer")
    public String tomer() {
        return "Tomer is the king's father";
    }
}
