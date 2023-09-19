package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public User addNewUser(User newUser) {
        return userRepo.save(newUser);
    }

    public void removeUser(Long userId) {
        userRepo.deleteById(userId);
    }

    public User fetchUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    
    public User updateUserDeets(Long id, User updatedUser) {
        if (userRepo.existsById(id)) {
            updatedUser.setId(id);
            return userRepo.save(updatedUser);
        }
        return null; // Couldn't find the user
    }
}
