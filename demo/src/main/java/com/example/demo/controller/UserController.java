package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userSrv;

    @DeleteMapping("/{id}")
    public void removeUser(@PathVariable Long id) {
        userSrv.removeUser(id);
    }

    @PostMapping("/")
    public User addNewUser(@RequestBody User user) {
        return userSrv.addNewUser(user);
    }
}
