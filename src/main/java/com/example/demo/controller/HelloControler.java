package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class HelloControler {
    @GetMapping("/hellllo")
    public String sayHello() {
        return "Hi!, How Are You?";
    }
}