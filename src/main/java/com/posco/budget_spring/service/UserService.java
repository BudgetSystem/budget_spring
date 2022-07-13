package com.posco.budget_spring.service;

import com.posco.budget_spring.model.UserDto;
import com.posco.budget_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDto serviceLogin(String userid, String password) {
        return userRepository.findByUseridAndPassword(userid,password);
    }
}
