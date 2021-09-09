package com.example.aboutmeservice.service;

import com.example.aboutmeservice.model.AboutMe;
import com.example.aboutmeservice.repository.AboutMeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutMeService {

    @Autowired
    private AboutMeRepository aboutMeRepository;

    public AboutMe findAllAboutMe(int id) {
        return aboutMeRepository.findById(id);

    }

    //save about me in our own profile
    public AboutMe saveAboutMe(AboutMe aboutMe) {
        return aboutMeRepository.save(aboutMe);
    }


    public List<AboutMe> findAll() {
       return this.aboutMeRepository.findAll();
    }
}