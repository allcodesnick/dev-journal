package com.allcodesnick.den.skatemaddness.service.impl;


import com.allcodesnick.den.skatemaddness.model.User;
import com.allcodesnick.den.skatemaddness.repository.UserRepository;
import com.allcodesnick.den.skatemaddness.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserManager implements UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @Override
    public List<User> listUserAccounts() {
        return userRepository.findAll();
    }

    @Override
    public User createUserAccount(User user) {
        User newUserAccount = new User(user.getUsername(), passwordEncoder.encode(user.getPassword()));
        return userRepository.save(newUserAccount);
    }
}