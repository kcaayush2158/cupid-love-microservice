package com.example.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {
    @PrimaryKey
    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
