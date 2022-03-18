package com.example.animals.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.animals.domain.Animals;

@Repository
public interface AnimalsRepo extends JpaRepository<Animals, Long> {

}
