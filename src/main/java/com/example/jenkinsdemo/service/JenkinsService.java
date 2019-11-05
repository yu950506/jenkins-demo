package com.example.jenkinsdemo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsService {

    @GetMapping("/demo")
    public String demo() {
        return "Hello Jenkins";
    }

    @GetMapping("/demo2")
    public String demo2() {
        return "Hello Jenkins 2 !!!";
    }

    @GetMapping("/demo3")
    public String demo3(){
        return "Hello Jenkins 3 test update !!!";
    }
}
