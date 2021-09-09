package com.example.userservice.service;

import com.example.userservice.model.AboutMe;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ABOUT-ME-SERVICE", url="http://localhost:8082/about-me")
public interface AboutMeService {
    @GetMapping("/all")
    List<AboutMe> list();
}
