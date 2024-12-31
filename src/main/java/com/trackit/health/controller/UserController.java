package com.trackit.health.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trackit.health.model.User;
import com.trackit.health.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public String loginString(@RequestBody User user) {
        return userService.verify(user);        
    }
    
}
