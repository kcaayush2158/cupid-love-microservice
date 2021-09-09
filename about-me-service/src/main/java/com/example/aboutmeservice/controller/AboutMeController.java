package com.example.aboutmeservice.controller;

import com.example.aboutmeservice.model.AboutMe;
import com.example.aboutmeservice.service.AboutMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/about-me")
public class AboutMeController {
    @Autowired
    private AboutMeService aboutMeService;


    @Autowired
    @GetMapping("/all")
    private List<AboutMe> list(){
        return this.aboutMeService.findAll();
    }
}
