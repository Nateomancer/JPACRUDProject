package com.skilldistillery.dndcharacterjpa.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;

class DndCharacterTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private DndCharacter character;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("DndCharacterJPA");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();

	}

	@BeforeEach
	void setUp() throws Exception {

		em = emf.createEntityManager();
		character = em.find(DndCharacter.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {

		em.close();
		character = null;
	}

	@Test
	@DisplayName("JPA Dummy Test")
	void test() {

	}

	
	@Test
	@DisplayName("testing basic character mappings")
	void test1() {
		assertNotNull(character);
		assertEquals("Nateomancer", character.getCharacterName());

	}

}
