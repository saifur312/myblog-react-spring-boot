package com.myblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/success")
    public String testApp(){
        return "index.html";
    }
}
