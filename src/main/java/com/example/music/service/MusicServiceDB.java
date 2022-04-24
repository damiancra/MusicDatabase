package com.example.music.service;

import java.util.List;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.music.domain.Music;
import com.example.music.repo.MusicRepo;

@Service
public class MusicServiceDB implements MusicInterface<Long> {

	private MusicRepo repo; //inject dependency
	
	public MusicServiceDB(MusicRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Music create(Music x) {
		// TODO Auto-generated method stub
		return this.repo.save(x);
	}

	@Override
	public List<Music> read() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}
	
//	public Music readByGender(String gender) {
//	Optional<Music> opt = this.repo.findGender();
//	return opt.orElse(null);
//}
	
	public Music readOne(Long id) {
		// TODO Auto-generated method stub
		Optional<Music> optRead = this.repo.findById(id);
		return optRead.orElse(null);
	}

	@Override
	public Music update(Long id, Music y) {
		// TODO Auto-generated method stub
		Optional<Music> optAni = this.repo.findById(id);
		Music found = optAni.get();
		found.setYear(y.getYear());
		found.setArtist(y.getArtist());
		found.setSong(y.getSong());
		return this.repo.save(found);
	}

	
	// return object deleted to confirm info
	@Override
	public Music delete(Long id) {
		// TODO Auto-generated method stub
		Optional<Music> toDelete = this.repo.findById(id);
		this.repo.deleteById(id);
		return toDelete.orElse(null);
	}
	
	// boolean to return true or false if it deleted
	public boolean remove(Long id) { //id = 1
		this.repo.deleteById(id); //id = 1 - gone
		return !this.repo.existsById(id); //false - true
	}

}
