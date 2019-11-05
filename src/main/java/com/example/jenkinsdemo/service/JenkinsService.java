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

    @GetMapping("/demo4")
    public String demo4(){
        return "Hello Jenkins 4 test update !!!";
    }
    @GetMapping("/demo5")
    public String demo5(){
        return "Hello Jenkins 5 test update !!!";
    }

    @GetMapping("/demo6")
    public String demo6(){
        return "Hello Jenkins 6 test update !!!";
    }
    @GetMapping("/demo7")
    public String demo7(){
        return "Hello Jenkins 7 test update !!!";
    }
    @GetMapping("/demo8")
    public String demo8(){
        return "Hello Jenkins 8 test update !!!";
    }

    @GetMapping("/demo10")
    public String demo10(){
        return "Hello Jenkins 10 test update !!!";
    }

    @GetMapping("/demo11")
    public String demo11(){
        return "Hello Jenkins 11 test update !!!";
    }
}
