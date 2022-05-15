package com.skilldistillery.dndcharacterjpa.data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;

@Service
@Transactional
public interface DndCharacterDAO {

	DndCharacter findById(int id);

	List<DndCharacter> findAll();

}
