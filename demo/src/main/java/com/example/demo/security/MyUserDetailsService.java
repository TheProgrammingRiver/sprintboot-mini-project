package com.example.demo.security;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;
    /**
     * Loads a user object from the database based on the given username.
     *
     * @param  username  the username of the user to load
     * @return           the UserDetails object representing the loaded user
     * @throws UsernameNotFoundException if the user doesn't exist in the database
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User foundUser = userRepo.findByUsername(username);
        if (foundUser == null) {
            throw new UsernameNotFoundException("user doesn't exist.");
        }
        return new org.springframework.security.core.userdetails.User(
                foundUser.getUsername(), foundUser.getPassword(), new ArrayList<>());
    }
}





