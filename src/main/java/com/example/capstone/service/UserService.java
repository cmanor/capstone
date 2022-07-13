package com.example.capstone.service;

import com.example.capstone.model.User;
import com.example.capstone.web.dto.UserRegistrationDto;

import java.util.List;


public interface UserService {
    User save(UserRegistrationDto registrationDto);
    List<User> getAllUsers();
    void saveUser(User user);
}
