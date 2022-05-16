package com.skilldistillery.dndcharacterjpa.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;

@Service
@Transactional
public class DndCharacterDAOImpl implements DndCharacterDAO {

	@PersistenceContext
	private EntityManager em;

	// List all characters in table
	// Returns a List of every DndCharacter in the DB
	@Override
	public List<DndCharacter> findAllCharacters() {

		List<DndCharacter> completeDndCharacterList = null;
		String jpql = "SELECT c from DndCharacter c";
		completeDndCharacterList = em.createQuery(jpql, DndCharacter.class).getResultList();

		System.err.println("---PRINTING FIND ALL CHARACTERS---");
		for (DndCharacter dndCharacter : completeDndCharacterList) {

			System.err.println(dndCharacter);
		}

		return completeDndCharacterList;
		// return em.createQuery("Select C from dnd_character C",
		// DndCharacter.class).getResultList();
	}

	// String jpql="Select C from Character C";
	// Find Character by id
	@Override
	public DndCharacter findCharacterById(int id) {

		DndCharacter dndCharIdResult = null;
		dndCharIdResult = em.find(DndCharacter.class, id);

		System.err.println("---PRINTING FIND BY CHARACTER ID---");
		System.err.println("LOOKING FOR ID: " + id);
		System.err.println("FOUND CHARACTER: " + id);

		return dndCharIdResult;
		// return em.find(DndCharacter.class, charId);
		// em.close();
	}

	// Find Character by Name
	// Returns DndCharacter Object
	@Override
	public DndCharacter findCharacterByName(String name) {

		DndCharacter dndCharNameResult = null;
		String jpql = "SELECT c FROM DndCharacter c WHERE c.name = :fn";

		dndCharNameResult = em.createQuery(jpql, DndCharacter.class).setParameter("fn", name).getSingleResult();
		System.out.println("---PRINTING FIND CHARACTER BY NAME---");
		System.err.println("LOOKING FOR: " + name);
		System.err.println("NAME FOUND: " + dndCharNameResult);

		return dndCharNameResult;

	}

	// List Character by Class or Race
	// returns a Dnd Character list
	@Override
	public List<DndCharacter> findCharacterByJobAndRace(String job, String race) {

		List<DndCharacter> dndCharNameJobSearchResult = null;
		String jpql = "SELECT c FROM DndCharacter c WHERE c.job = :cc AND c.race =: cr";
		dndCharNameJobSearchResult = em.createQuery(jpql, DndCharacter.class).setParameter("cc", job)
				.setParameter("cr", race).getResultList();

		System.err.println("---PRINTING FIND BY CLASS AND RACE---");
		for (DndCharacter dndCharacter : dndCharNameJobSearchResult) {

			System.err.println(dndCharacter);
		}

		return dndCharNameJobSearchResult;

	}

	// CREATE CHARACTER
	// UPDATE CHARACTER
	// DELETE CHARACTER

}
