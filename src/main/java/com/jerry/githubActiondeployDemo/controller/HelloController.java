package com.jerry.githubActiondeployDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "신중민... 이 아무것도 아닌자야...";
    }
}
