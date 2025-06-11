package com.example.supermarket.service;

import com.example.supermarket.model.UserEntity;
import com.example.supermarket.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public final UserRepository userRepository;

    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

}
