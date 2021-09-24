package com.springproject.app.ws.ui.controller;

import com.springproject.app.ws.service.UserService;
import com.springproject.app.ws.shared.dto.UserDto;
import com.springproject.app.ws.ui.model.request.UserDetailsRequestModel;
import com.springproject.app.ws.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// for add, delete, get and update user

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest returnValue = new UserRest();
//        1. create a new user data object which includes user's details
        UserDto userDto = new UserDto();
//        2. pass value from input to the just created data object
        BeanUtils.copyProperties(userDetails,userDto);
//        3. Use user dto to create a user
        UserDto createdUser = userService.createUser(userDto);
//        4. Pass value from createdUser to return it.
        BeanUtils.copyProperties(createdUser,returnValue);
        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
