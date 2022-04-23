package com.example.music.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.music.domain.Music;

@Repository
public interface MusicRepo extends JpaRepository<Music, Long> {

}
