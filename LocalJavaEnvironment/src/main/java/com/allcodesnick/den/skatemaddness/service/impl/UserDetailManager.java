package com.allcodesnick.den.skatemaddness.service.impl;


import com.allcodesnick.den.skatemaddness.model.User;
import com.allcodesnick.den.skatemaddness.repository.UserRepository;
import com.allcodesnick.den.skatemaddness.model.ApplicationUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailManager implements UserDetailsService {

    private UserRepository userRepository;

    public UserDetailManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByUsername(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found" + username));
        return user.map(ApplicationUserDetails::new).get();
    }
}