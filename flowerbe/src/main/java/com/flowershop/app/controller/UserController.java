package com.flowershop.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flowershop.app.model.CreateUserRequest;
import com.flowershop.app.model.WebResponse;
import com.flowershop.app.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/")
public class UserController {
    
    @Autowired
    private UserService userService;

    // Create--------------------------------------------------------------------  
    @PostMapping("users")
    public WebResponse create(@RequestBody CreateUserRequest request){
        userService.create(request);
        return null;
    }
    
    // Read----------------------------------------------------------------------
    // Update--------------------------------------------------------------------
    // Delete--------------------------------------------------------------------
}
