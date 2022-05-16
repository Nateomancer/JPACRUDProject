package com.skilldistillery.dndcharacterjpa.data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;

@Service
@Transactional
public interface DndCharacterDAO {

	DndCharacter findCharacterById(int id);

	List<DndCharacter> findAllCharacters();

	DndCharacter findCharacterByName(String characterName);

	List<DndCharacter> findByJobAndRace(String characterClass, String race);

}
