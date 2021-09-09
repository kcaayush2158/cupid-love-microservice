package com.example.userservice.controller;

import com.example.userservice.model.AboutMe;
import com.example.userservice.model.User;
import com.example.userservice.service.AboutMeService;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private AboutMeService aboutMeService;

    @GetMapping("/all")
    public List<User> listAll(){
        return  userService.findAll();
    }
    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/{username}")
    public User listAll(@PathVariable("username") String username){
        return  userService.findByUsername(username);
    }
    @GetMapping("/list-about-me")
    List<AboutMe> list(){
        return aboutMeService.list();
    }
}
