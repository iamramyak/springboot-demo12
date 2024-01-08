package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User create(User user);
    User getUserById(Long userId);

    User createUser(User user);
}
