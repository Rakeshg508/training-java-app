package com.training.demo.trainingdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("message")
    public String getWelcomeMessage() {
        return "Welcome";
    }

}
