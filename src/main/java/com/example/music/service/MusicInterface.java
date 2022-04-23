package com.example.music.service;

import java.util.List;


import com.example.music.domain.Music;

public interface MusicInterface<T> {
	
	//abstract methods for each of the CRUD
	
	Music create(Music x);
	
	List<Music> read();
	
	Music update(T id, Music y);
	
	Music delete(T id);

}
