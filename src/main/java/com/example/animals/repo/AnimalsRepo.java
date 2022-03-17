package com.example.animals.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.animals.domain.Animals;

@Repository
public interface AnimalsRepo extends JpaRepository<Animals, Long> {

}
