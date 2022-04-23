package com.example.music.service;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import com.example.music.domain.Music;
import com.example.music.repo.MusicRepo;
import com.example.music.service.MusicServiceDB;

@SpringBootTest
@ActiveProfiles("test")
public class MusicServiceDBTest {

	// data
		private Music input;
		private Music returned;

		@Autowired // the class we are testing
		private MusicServiceDB serv;

		@MockBean // this is the class we are dependent on so have to mock
		private MusicRepo rep;

		@BeforeEach
		void setUp() {
//			System.out.println("before");
			input = new Music("Eric Prydz", 2001, "Call On Me");
			returned = new Music(1L, "Eric Prydz", 2001, "Call On Me");
		}

		@Test
		void testCreate() {
//			System.out.println("test 1");
			// GIVEN
			// input/data

			// WHEN
			Mockito.when(this.rep.save(input)).thenReturn(returned);
			// THEN
			assertThat(this.serv.create(input)).isEqualTo(returned);

			// Verification
			Mockito.verify(this.rep, Mockito.times(1)).save(input);
		}

		@Test
		void testRead() {
//			System.out.println("test 2");
			// GIVEN
			List<Music> readList = new ArrayList<>();
			readList.add(input);
			// WHEN
			Mockito.when(this.rep.findAll()).thenReturn(readList);
			// THEN
			assertThat(this.serv.read()).isEqualTo(readList);
			// VERIFY
			Mockito.verify(this.rep, Mockito.times(1)).findAll();
		}

		
		
		@Test
		void testReadOne() {
			// GIVEN
			Long id = 1L;// method input
			// variables setup in method
			Optional<Music> optAnim = Optional.of(returned);
			// WHEN a certain method is called, return ....
			Mockito.when(this.rep.findById(id)).thenReturn(optAnim);
			// THEN check what was returned is equal to what was expected
			assertThat(this.serv.readOne(id)).isEqualTo(returned);
			// VERIFY
			Mockito.verify(this.rep, Mockito.times(1)).findById(id);
		}
		

		@Test
		void testUpdate() {
			// GIVEN - id, object
			Long id = 1L;
			// NEW MUSIC OBJECT FOR INPUT TO UPDATE METHOD
			Music toUpdate = new Music("Fleetwood Mac", 1978, "The Chain");
			// METHOD USES AN OPTIONAL VERSION OF THE MUSIC OBJECT
			Optional<Music> opt = Optional.of(returned);
			// UPDATED VERSION:
			Music updated = new Music(id, toUpdate.getArtist(), toUpdate.getYear(), toUpdate.getSong());
			// WHEN
			Mockito.when(this.rep.findById(id)).thenReturn(opt);
			Mockito.when(this.rep.save(updated)).thenReturn(updated);
			// THEN
			assertThat(this.serv.update(id, toUpdate)).isEqualTo(updated);
			// VERIFY
			Mockito.verify(this.rep, Mockito.times(1)).findById(id);
			Mockito.verify(this.rep, Mockito.times(1)).save(updated);
		}

		@Test
		void testDelete() {
			// GIVEN
			Long id = 1L;//user input
			// Optional Chocolate
			Optional<Music> optChoco = Optional.of(returned);
			// WHEN
			Mockito.when(this.rep.findById(id)).thenReturn(optChoco);
			// THEN
			assertThat(this.serv.delete(id)).isEqualTo(returned);
			// VERIFY
			Mockito.verify(this.rep, Mockito.times(1)).deleteById(id);
			Mockito.verify(this.rep, Mockito.times(1)).findById(id);
		}

		@Test
		void testRemove() {
			// GIVEN
			Long id = 1L;
			// WHEN
			Mockito.when(this.rep.existsById(id)).thenReturn(false);
			// THEN
			assertThat(this.serv.remove(id)).isTrue();
			// VERIFY
			Mockito.verify(this.rep, Mockito.times(1)).deleteById(id);
			Mockito.verify(this.rep, Mockito.times(1)).existsById(id);
		}

		@AfterEach
		void clear() {
//			System.out.println("after");
		}

	
}

