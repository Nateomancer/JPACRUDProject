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
	String jpql="Select C from Character C";
	
	@Override
	public DndCharacter findById(int charId) {

		return em.find(DndCharacter.class, charId);
	}

	@Override
	public List<DndCharacter> findAll() {
	
		return em.createQuery("Select C from DndCharacter C", DndCharacter.class).getResultList();
	}

}
