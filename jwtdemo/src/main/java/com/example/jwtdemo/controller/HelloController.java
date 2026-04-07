package com.example.jwtdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<?> hello(Authentication authentication) {
        return ResponseEntity.ok(Map.of(
                "message", "Hello, " + authentication.getName() + "!",
                "status", "You accessed a PROTECTED route successfully."
        ));
    }
}