package com.allcodesnick.den.project2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project2Controller {

    @GetMapping("/p2")
    public String login() {
        return "Hello World";
    }
}