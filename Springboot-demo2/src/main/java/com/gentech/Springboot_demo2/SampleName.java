package com.gentech.Springboot_demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class SampleName {

    @GetMapping("msg")

    public String Welcome() {
        return "Welcome to BootStrap World";
    }
}


