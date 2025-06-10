package com.Supermarket.service;

import com.Supermarket.model.UserEntity;
import com.Supermarket.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);


        }
    public List<UserEntity> findAllUsers(){
        return userRepository.findAll();
    }

     public UserEntity updateUser(Long id, UserEntity userEntity){
       var findUser = userRepository.findById(id);
       findUser.get().setName(userEntity.getName());
        findUser.get().setRole(userEntity.getRole());
        findUser.get().setTurn(userEntity.getTurn());
        findUser.get().setId(userEntity.getId());
        var saveUser = userRepository.save(findUser.get());
        return saveUser;
    }
    public void deleteUser(Long id){
        var findUserId = userRepository.findById(id);
        var user = findUserId.get();
        userRepository.delete(user);



    }

    }


