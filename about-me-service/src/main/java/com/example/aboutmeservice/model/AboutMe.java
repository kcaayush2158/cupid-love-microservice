package com.example.aboutmeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AboutMe {
    @PrimaryKey
    private UUID id;
    private String address;
    private String occupation;
    private String education;

}
