package com.example.demo.application.controller;

import com.example.demo.application.mapper.UserMapper;
import com.example.demo.application.model.UserDto;
import com.example.demo.domain.model.UserDom;
import com.example.demo.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserMapper userMapper;
    private final UserService userService;

    public UserDto saveUser(UserDto userDto) {
        UserDom userDom = userMapper.dto2Dom(userDto);
        userDom = userService.saveUser(userDom);

        return userMapper.dom2Dto(userDom);
    }

}
