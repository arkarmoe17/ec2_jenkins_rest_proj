package com.example.awsresttest.controller;

import com.example.awsresttest.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    public List<User> userList = new ArrayList<>();

    @GetMapping()
    public List<User> getUserList(){
        return userList;
    }

    @PostMapping()
    public User createUser(@RequestBody User user){
        userList.add(user);
        return user;
    }
}
