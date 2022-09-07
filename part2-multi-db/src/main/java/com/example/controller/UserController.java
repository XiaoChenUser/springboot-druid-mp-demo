package com.example.controller;

import com.example.dto.UserDTO;
import com.example.mapper.UserMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserMapper userMapper;


    @RequestMapping("/add")
    public Integer addUser(String username, String password) {
        UserDTO user = new UserDTO();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.insert(user);
    }

    @RequestMapping("/get/{id}")
    public UserDTO getUser(@PathVariable("id") Integer id) {
        return userMapper.selectById(id);
    }

    @RequestMapping("/delete/{id}")
    public Boolean deleteUser(@PathVariable("id") Integer id) {
        UserDTO userDTO = userMapper.selectById(id);
        if (userDTO == null) {
            return false;
        }
        userMapper.deleteById(id);
        return true;
    }
}
