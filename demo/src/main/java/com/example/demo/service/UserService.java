package com.example.demo.service;

import com.example.demo.exception.CustomException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
        @Autowired
        private UserRepository userRepo;

        public User addNewUser(User newUser){
            return userRepo.save(newUser);
        }

        public void removeUser (Long userId){
            userRepo.deleteById(userId);
        }

        public User fetchUser (Long id){
            return userRepo.findById(id).orElse(null);
        }
    /**
     * Updates a user in the system.
     *
     * @param  id             the ID of the user to update
     * @param  updatedUser    the updated user object
     * @return                the updated user object if the user exists, null otherwise
     */
        public User updateUser (Long id, User updatedUser){
            if (userRepo.existsById(id)) {
                updatedUser.setId(id);
                return userRepo.save(updatedUser);
            }
            return null; // Couldn't find the user
        }

        public List<User> getAllUsers () {
            return userRepo.findAll();
        }
    }
