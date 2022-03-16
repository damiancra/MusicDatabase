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
	
	private AnimalsServiceList service; //CDI - context & dependency injection
	
	public AnimalsController(AnimalsServiceList service) {
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
			return this.animals;
		}
		
	//READ BY ID
		@GetMapping("/readById")
		public Animals getById(@PathVariable int id) {
			return this.animals.get(id);
		}
		
		
	//UPDATE
		@PutMapping("/update/{id}")
		public Animals update(@PathVariable int id, @RequestBody Animals updated) {
			this.animals.set(id, updated);
			return this.animals.get(id);
		}
		
	//DELETE
		@DeleteMapping("/delete")
		public void delete(@PathParam("id") int id) {
			this.animals.remove(id);
		}
		
}