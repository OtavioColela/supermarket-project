package com.example.supermarket.service;

import com.example.supermarket.model.UserEntity;
import com.example.supermarket.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository userRepository;

    @Transactional
    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);

    }

}
