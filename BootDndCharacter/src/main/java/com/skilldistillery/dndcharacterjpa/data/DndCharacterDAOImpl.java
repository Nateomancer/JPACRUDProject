package com.skilldistillery.dndcharacterjpa.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

//import com.skilldistillery.dndcharacterjpa.controller.EntityManagerFactory;
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
		
	}

	
	
	//Find character by id
	@Override
	public DndCharacter findCharacterById(int id) {

		DndCharacter dndCharIdResult = null;
		dndCharIdResult = em.find(DndCharacter.class, id);

		System.err.println("---PRINTING FIND BY CHARACTER ID---");
		System.err.println("LOOKING FOR ID: " + id);
		System.err.println("FOUND CHARACTER: " + id);
		em.close();
		return dndCharIdResult;
	
	
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
		em.close();
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
		em.close();
		return dndCharNameJobSearchResult;

	}
	
	
	
	
	
////-----CRUD OPERATIONS-----
	
	//CREATE CHARACTER
	@Override
	public DndCharacter createNewDndCharacter(DndCharacter newDndCharacter) {
		 

		@SuppressWarnings("unused")
		boolean dndCharacterCreated=false;
	
		if(newDndCharacter !=null){
		
		
		System.out.println("Before persist " + newDndCharacter);
		em.persist(newDndCharacter);
		System.out.println("After persist " + newDndCharacter);

		System.err.println("New Dnd Character Created");
		dndCharacterCreated=true;
		}else {
			System.err.println("Character was not created");
			dndCharacterCreated=false;
			
		}
		em.close();
		return newDndCharacter;

		
	}


	//UPDATE CHARACTER
	@Override
	public DndCharacter updateExistingDndCharacter(int id, String name, String job, DndCharacter updateDummyChar) {
		
		@SuppressWarnings("unused")
		boolean dndCharacterUpdated=false;
		
		
		

		DndCharacter dbDndCharacter = em.find(DndCharacter.class, id);

		if (dbDndCharacter != null) {
			
			System.err.println("Dnd Character ID "+ id+" updating...");
			System.err.println("Old Name: "+updateDummyChar.getName());
			System.err.println("Old Job: "+updateDummyChar.getJob());

			dbDndCharacter.setName(updateDummyChar.getName());
			dbDndCharacter.setJob(updateDummyChar.getJob());
			
			dndCharacterUpdated=true;
			
			System.err.println("Dnd Character ID " + id + "Updated!");
			System.err.println("New Name: " + updateDummyChar.getName());
			System.err.println("New Job: " + updateDummyChar.getJob());
		}
		
		em.close();
		
		
		
		return updateDummyChar;
	}


	//DELETE CHARACTER
	@Override
	public boolean deleteExistingDndCharacter(int id) {

		boolean successfullyDeleted = false;
		DndCharacter deleteDndCharacter = em.find(DndCharacter.class, id);

		if (deleteDndCharacter != null) {
			
			System.err.println("Delete Dnd Character ID: "+ id);
		
			em.remove(deleteDndCharacter);

			successfullyDeleted = !em.contains(deleteDndCharacter);

			
			System.err.println("Character Deleted ID: "+ id);
		}else if(deleteDndCharacter == null) {
			
			System.err.println("Deletion unsuccesful for Character ID "+ id);
		}


		em.close();

		return successfullyDeleted;
		
		
	
	}


}
