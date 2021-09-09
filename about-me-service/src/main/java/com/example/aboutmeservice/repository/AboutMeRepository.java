package com.example.aboutmeservice.repository;

import com.example.aboutmeservice.model.AboutMe;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutMeRepository extends CassandraRepository<AboutMe ,Integer> {
 AboutMe findById(int id);

}
