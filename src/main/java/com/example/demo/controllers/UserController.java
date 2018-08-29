package com.example.demo.controllers;

import com.example.demo.models.ApplicationUser;
import com.example.demo.repositories.ApplicationUserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private ApplicationUserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(ApplicationUserRepository applicationUserRepository,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @GetMapping("/public")
    public String state() {
        return "public";
    }

    @GetMapping("/private")
    public String state1() {
        return "private";
    }

    @PostMapping("/login")
    public String signIn(@RequestBody ApplicationUser user) {
        return user.toString();
    }

    @PostMapping("/private_post")
    public String post(@RequestBody ApplicationUser user) {
        return user.toString();
    }

    @PostMapping("/sign_up")
    public ApplicationUser signUp(@RequestBody ApplicationUser user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        applicationUserRepository.save(user);
        return user;
    }
}
