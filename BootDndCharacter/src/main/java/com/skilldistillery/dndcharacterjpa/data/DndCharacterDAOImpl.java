package com.skilldistillery.dndcharacterjpa.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class DndCharacterDAOImpl implements DndCharacterDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Character findById(int characterId) {

		return em.find(Character.class, characterId);
	}

	@Override
	public List<Character> findall() {
		// TODO Auto-generated method stub
		return null;
	}

}
