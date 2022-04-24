package com.example.music.service;

import java.util.ArrayList;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.music.domain.Music;

@Service
public class MusicServiceList implements MusicInterface<Integer> {
	
	//STORE INFO IN, ALTERNATIVE TO DB:
			private List<Music> music = new ArrayList<>();

	@Override
	public Music create(Music x) {
		x.setId((long) this.music.indexOf(x));//added this to update id variable with array index
		this.music.add(x);
		Music created = this.music.get(this.music.size() -1);
		return created;
	}

	@Override
	public List<Music> read() {
		// TODO Auto-generated method stub
		return this.music;
	}
	
	public Music readOne(Integer id) {
		// TODO Auto-generated method stub
		return this.music.get(id);
	}

	@Override
	public Music update(Integer id, Music y) {
		// TODO Auto-generated method stub
		this.music.set(id, y);
		return this.music.get(id);
	}

	@Override
	public Music delete(Integer id) {
		// TODO Auto-generated method stub
		return this.music.remove((int)id);
	}

}
