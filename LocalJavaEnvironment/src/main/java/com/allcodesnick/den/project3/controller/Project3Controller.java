package com.allcodesnick.den.project3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project3Controller {

    @GetMapping("/p3")
    public String login() {
        return "Hello World";
    }
}