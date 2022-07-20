package com.example.capstone.service;

import com.example.capstone.model.User;
import com.example.capstone.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
