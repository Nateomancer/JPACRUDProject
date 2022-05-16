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

class DndCharacterTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private DndCharacter character1;
	private DndCharacter character2;

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
		character1 = em.find(DndCharacter.class, 1);
		character2 = em.find(DndCharacter.class, 2);
	}

	@AfterEach
	void tearDown() throws Exception {

		em.close();
		character1 = null;
		character2 = null;
	}

	@Test
	@DisplayName("JPA Dummy Test")
	void test() {

	}

	@Test
	@DisplayName("testing basic character mappings for character1")
	void test1() {
		assertNotNull(character1);
		assertEquals("Nateomancer", character1.getName());
		assertEquals("Warlock", character1.getJob());
		assertEquals("Half Orc", character1.getRace());
		assertEquals(14, character1.getStrength());
		assertEquals(8, character1.getDexterity());
		assertEquals(10, character1.getConstitution());
		assertEquals(14, character1.getIntelligence());
		assertEquals(10, character1.getWisdom());
		assertEquals(15, character1.getCharisma());
	}

	@Test
	@DisplayName("Testing basic character mappings for character2")
	void test2() {
		assertNotNull(character2);
		assertEquals("Dragonaut", character2.getName());
		assertEquals("Barbarian", character2.getJob());
		assertEquals("Half Orc", character2.getRace());
		assertEquals(15, character2.getStrength());
		assertEquals(14, character2.getDexterity());
		assertEquals(14, character2.getConstitution());
		assertEquals(8, character2.getIntelligence());
		assertEquals(10, character2.getWisdom());
		assertEquals(10, character2.getCharisma());

	}

}
