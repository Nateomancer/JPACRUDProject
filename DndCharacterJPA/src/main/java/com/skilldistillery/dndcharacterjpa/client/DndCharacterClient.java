package com.skilldistillery.dndcharacterjpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;

public class DndCharacterClient {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DndCharacter");
		EntityManager em = emf.createEntityManager();

		DndCharacter dndchar = em.find(DndCharacter.class, 1);
		System.out.println(dndchar);

		em.close();
		emf.close();


	}

}
