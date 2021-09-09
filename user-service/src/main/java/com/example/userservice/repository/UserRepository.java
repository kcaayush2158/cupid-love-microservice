package com.example.userservice.repository;

import com.example.userservice.model.User;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.stereotype.Repository;


public interface UserRepository extends CassandraRepository<User,Integer> {

    @AllowFiltering
    User findByUsername(String username);
}
