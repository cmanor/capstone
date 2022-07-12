package com.example.capstone.service;

import com.example.capstone.model.User;

import java.util.List;


public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
}
