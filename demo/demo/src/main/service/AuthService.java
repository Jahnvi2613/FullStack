package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtUtil jwtUtil;

    public AuthService(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public String authenticate(AuthRequest request) {

        // Demo login (replace with DB later)
        if (request.getUsername().equals("admin") &&
            request.getPassword().equals("admin123")) {

            return jwtUtil.generateToken(request.getUsername());
        }

        throw new RuntimeException("Invalid credentials");
    }
}