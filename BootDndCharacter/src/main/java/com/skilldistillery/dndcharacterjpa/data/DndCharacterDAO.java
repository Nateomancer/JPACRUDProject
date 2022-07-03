package com.skilldistillery.dndcharacterjpa.data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
//import com.skilldistillery.dndcharacterjpa.controller.EntityManagerFactory
import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;

@Service
@Transactional
public interface DndCharacterDAO {

	DndCharacter findCharacterById(int id);

	List<DndCharacter> findAllCharacters();

	DndCharacter findCharacterByName(String characterName);

	List<DndCharacter> findCharacterByJobAndRace(String characterClass, String race);
	
	DndCharacter createNewDndCharacter(DndCharacter newDndCharacter);
	
	DndCharacter updateExistingDndCharacter(int id, String name, String Job, DndCharacter updateDndCharacter);
	
	boolean deleteExistingDndCharacter(int id);



}
