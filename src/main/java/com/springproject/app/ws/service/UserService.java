package com.springproject.app.ws.service;

import com.springproject.app.ws.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
