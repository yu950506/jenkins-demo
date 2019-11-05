package com.example.jenkinsdemo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsService {

    @GetMapping("/demo")
    public String demo() {
        return "Hello Jenkins";
    }

}
