package com.posco.budget_spring.controller;

import com.posco.budget_spring.model.UserDto;
import com.posco.budget_spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserDto userDto;

    @Autowired
    UserService userService;

    @PostMapping("/")
    public boolean login(@RequestBody UserDto userDto) {
        UserDto result = null;
        try{
            userDto.setUserid(userDto.getUserid());
            userDto.setPassword(userDto.getPassword());
            result = userService.serviceLogin(userDto.getUserid(), userDto.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(result != null) return true;
        return false;
    }
}
