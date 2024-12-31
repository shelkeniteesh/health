package com.trackit.health.controller;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthController {

    @GetMapping("/greet")
    public String greeString(HttpServletRequest request) {
        return new String("Hello, There!" + request.getSession().getId());
    }
    
}
