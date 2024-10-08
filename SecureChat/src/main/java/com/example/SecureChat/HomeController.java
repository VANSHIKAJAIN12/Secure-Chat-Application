package com.example.SecureChat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Secure Chat Application!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, authenticated user!";
    }
}