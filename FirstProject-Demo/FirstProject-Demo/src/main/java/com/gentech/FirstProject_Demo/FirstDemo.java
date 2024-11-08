package com.gentech.FirstProject_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/v1/demo")
public class FirstDemo {

    @GetMapping("msg")

    public String getMessage() {
        return "Welcome Spring Boot World";
    }
}
