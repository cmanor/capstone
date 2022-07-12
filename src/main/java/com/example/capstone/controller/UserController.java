package com.example.capstone.controller;

import com.example.capstone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    // display list of users
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listUsers", userService.getAllUsers());
        return "index";
    }
}
