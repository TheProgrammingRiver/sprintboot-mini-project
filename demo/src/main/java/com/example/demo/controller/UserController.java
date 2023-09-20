package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/")
    public List<User> getAll() {
        return userSrv.getAllUsers();
    }

    @GetMapping("/{id}")
    public User fetchUser(@PathVariable Long id) {
        return userSrv.fetchUser(id);

    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userSrv.updateUser(id, user);
    }

}
