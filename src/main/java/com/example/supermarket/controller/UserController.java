package com.example.supermarket.controller;

import com.example.supermarket.dto.UserRequest;
import com.example.supermarket.model.UserEntity;
import com.example.supermarket.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public UserService userService;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);

    }
}
