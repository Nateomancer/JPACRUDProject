package com.skilldistillery.dndcharacterjpa.data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public interface DndCharacterDAO {

	Character findById(int id);

	List<Character> findall();

}
