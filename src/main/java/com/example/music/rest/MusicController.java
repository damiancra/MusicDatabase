package com.example.music.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.music.domain.Music;
import com.example.music.service.MusicServiceDB;

@RestController
public class MusicController {
	
	private MusicServiceDB service; //CDI - context & dependency injection
	
	public MusicController(MusicServiceDB service) {
		super();
		this.service = service;
	}
	
	//CRUD
	
	//CREATE
	@PostMapping("/create")
	public ResponseEntity<Music> createMusic(@RequestBody Music a) {
		return new ResponseEntity<Music>(this.service.create(a), HttpStatus.CREATED);

	}
	
	//READ
		@GetMapping("/readAll")
		public List<Music> readMusic() {
			return this.service.read();
		}
		
	//READ BY ID
		@GetMapping("/readById/{id}")
		public Music getById(@PathVariable Long id) {
			return this.service.readOne(id);
		}
		
		
	//UPDATE
		@PutMapping("/update/{id}")
		public Music update(@PathVariable Long id, @RequestBody Music updated) {
			return this.service.update(id, updated);
		}
		
	//DELETE
		@DeleteMapping("/delete/{id}")
		public Music delete(@PathVariable Long id) {
			return this.service.delete(id);
		}
		
		@DeleteMapping("/remove")
		public boolean remove(@PathParam("id") Long id) {
			return this.service.remove(id);
		}
		
}