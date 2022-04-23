package com.example.music.domain;

import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // marking this class as a table for SQL
public class Music {
	
	// create table music(
	// id int not null auto_increment,
	// artist varchar(255),
	// year int,
	// song varchar(255),
	// primary key(id)),
	
	//variables - columns in the table
	@Id // marks the field below as a primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private Long id;
	
	private String artist;
	private int year;
	private String song;
	
	//constructors - 3 types
	//overloading - polymorphism
	
	// 1 - default constructor - empty one
	public Music() {
		super();
	}
	
	// 2 - constructor with id
	public Music(Long id, String artist, int year, String song) {
		super();
		this.id = id;
		this.artist = artist;
		this.year = year;
		this.song = song;
	}
	
	// 3 - constructor without id
	public Music(String artist, int year, String song) {
		super();
		this.artist = artist;
		this.year = year;
		this.song = song;
	}
	
	
	//getters & setters
	public String getArtist() {
		return artist;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	
//	int x =10;
//	String a = "hello";
//	String b = new String("hello");
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(year, artist, song, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return year == other.year && Objects.equals(artist, other.artist) && Objects.equals(song, other.song)
				&& Objects.equals(id, other.id);
	}

	
	
}
