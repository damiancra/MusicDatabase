package com.example.animals.rest;

import java.util.ArrayList;

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

import com.example.animals.domain.Animals;
import com.example.animals.service.AnimalsServiceDB;

@RestController
public class AnimalsController {
	
	private AnimalsServiceDB service; //CDI - context & dependency injection
	
	public AnimalsController(AnimalsServiceDB service) {
		super();
		this.service = service;
	}
	
	//CRUD
	
	//CREATE
	@PostMapping("/create")
	public ResponseEntity<Animals> createAnimal(@RequestBody Animals a) {
		return new ResponseEntity<Animals>(this.service.create(a), HttpStatus.CREATED);

	}
	
	//READ
		@GetMapping("readAll")
		public List<Animals> readAnimal() {
			return this.service.read();
		}
		
	//READ BY ID
		@GetMapping("/readById")
		public Animals getById(@PathVariable int id) {
			return this.service.readOne(id);
		}
		
		
	//UPDATE
		@PutMapping("/update/{id}")
		public Animals update(@PathVariable int id, @RequestBody Animals updated) {
			return this.service.update(id, updated);
		}
		
	//DELETE
		@DeleteMapping("/delete")
		public Animals delete(@PathParam("id") int id) {
			return this.service.delete(id);
		}
		
}