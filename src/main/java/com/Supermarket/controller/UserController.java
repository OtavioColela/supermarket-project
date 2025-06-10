package com.Supermarket.controller;

import com.Supermarket.model.UserEntity;
import com.Supermarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    public UserService userService;
    @PostMapping("/criar")
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);

    }
    @GetMapping
    public List<UserEntity> findAllUsers(UserEntity userEntity){
        return userService.findAllUsers(userEntity);

    }
    @PutMapping("/{id}")

    public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity userEntity){
        var userSaved = userService.updateUser(id, userEntity);
        return userSaved;


    }
    @DeleteMapping("/{id}")
    public void UserEntity(@PathVariable Long id){
        userService.deleteUser(id);
    }


}
