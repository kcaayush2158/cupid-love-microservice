package com.example.aboutmeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LookingFor {
    private int fromAge;
    private int toAge;
    private String description;

}
