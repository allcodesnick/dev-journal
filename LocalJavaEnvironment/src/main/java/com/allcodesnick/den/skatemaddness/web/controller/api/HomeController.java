package com.allcodesnick.den.skatemaddness.web.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String login() {
        return "Hello World";
    }
}