package com.allcodesnick.den.skatemaddness.service;



import com.allcodesnick.den.skatemaddness.model.User;

import java.util.List;

public interface UserService {

    List<User> listUserAccounts();

    User createUserAccount(User user);
}