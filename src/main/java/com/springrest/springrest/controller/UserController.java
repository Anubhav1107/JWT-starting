package com.springrest.springrest.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.dao.UserRepo;
import com.springrest.springrest.entities.Users;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired private UserRepo userRepo;

    @GetMapping("/info")
    public Users getUserDetails(){
        String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return userRepo.findByEmail(email).get();
    }
    
}
