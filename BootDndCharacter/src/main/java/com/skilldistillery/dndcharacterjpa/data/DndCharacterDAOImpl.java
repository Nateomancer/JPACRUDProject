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
	
	
	

	// String jpql="Select C from Character C";
	// Find Character by id
	@Override
	public DndCharacter findCharacterById(int charId) {

		DndCharacter charById = null;
		charById = em.find(DndCharacter.class, charId);
		
		System.err.println("---PRINTING FIND BY CHARACTER ID---");
		System.err.println("LOOKING FOR ID: "+charId);
		System.err.println("FOUND CHARACTER: "+charById);
		
		return charById;
		//return em.find(DndCharacter.class, charId);
		//em.close();
	}
	

	
	// List all characters in table
	// Returns a List of every DndCharacter in the DB
	@Override
	public List<DndCharacter> findAllCharacters() {

		List<DndCharacter> completeDndCharacterList = null;
		String jpql="SELECT c from DndCharacter c";
		completeDndCharacterList = em.createQuery(jpql, DndCharacter.class).getResultList();
		
		System.err.println("---PRINTING FIND ALL CHARACTERS---");
		for (DndCharacter dndCharacter : completeDndCharacterList) {
			
			System.err.println(dndCharacter);
		}
		

		return completeDndCharacterList;
		//return em.createQuery("Select C from dnd_character C", DndCharacter.class).getResultList();
	}
	
	

	// Find Character by Name
	// Returns DndCharacter Object
	@Override
	public DndCharacter findCharacterByName(String findName) {
		
		DndCharacter nameResult = null;
		String jpql = "SELECT c FROM DndCharacter c WHERE c.name = :fn";

		nameResult=em.createQuery(jpql, DndCharacter.class)
				.setParameter("fn", findName)
				.getSingleResult();
		System.out.println("---PRINTING FIND CHARACTER BY NAME---");
		System.err.println("LOOKING FOR: "+ findName);
		System.err.println("NAME FOUND: "+nameResult);
	
		return nameResult;

	}

	
	
	// List Character by Class or Race
	// returns a Dnd Character list
	@Override
	public List<DndCharacter> findByClassAndRace(String job, String race) {

		List<DndCharacter> searchResult = null;
		String jpql = "SELECT c FROM DndCharacter c WHERE c.job = :cc AND C.race =: cr";
		searchResult = em.createQuery(jpql, DndCharacter.class)
				.setParameter("cc", job)
				.setParameter("cr", race)
				.getResultList();
		
		System.err.println("---PRINTING FIND BY CLASS AND RACE---");
		for (DndCharacter dndCharacter : searchResult) {
			
			System.err.println(dndCharacter);
		}

		return searchResult;

	}

	
	
	// CREATE CHARACTER
	// UPDATE CHARACTER
	// DELETE CHARACTER

}
