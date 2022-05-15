//package com.skilldistillery.dndcharacterjpa.client;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;
//
//public class DndCRUDClient {
//
//	public static void main(String[] args) {
//
////		DnDCRUDClient dndCC = new DnDCRUDClient();
////		DndCharacter dndChar = new DndCharacter();
////		System.out.println();
////		dndCC.addNewDndCharacter(dndChar);
////		System.out.println();
////
////		System.out.println("Was deleted?" + cc.deleteAddress(730));
//
//	}
//
//	// Create new character
//	// NEED NAME, CLASS, RACE, STATS
//	// STRENGTH, DEXTRERTY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA
//	public DndCharacter addNewDndCharacter(DndCharacter dndCharCreate) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DndCharacter");
//		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//
//		em.persist(dndCharCreate);
//
//		em.persist(dndCharCreate);
//
//		em.getTransaction().commit();
//
//		em.close();
//		em.close();
//		emf.close();
//		return dndCharCreate;
//
//	}
//
//	// UPDATE CHARACTER NAME
//	// NAMES CANNOT BE NULL, UPDATE NAMES THAT ALREADY EXSIT
//	public int updateDndCharacterName(int charId, String newName) {
//
//		int count = 0;
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DndCharacter");
//		EntityManager em = emf.createEntityManager();
//
//		String jpql = "SELECT cust FROM customer cust WHERE cust.email= '' OR cust.email IS NULL";
//		List<DndCharacter> dndCharUpdateList = em.createQuery(jpql, DndCharacter.class).getResultList();
//
//		em.getTransaction().begin();
//
//		for (DndCharacter dndChar : dndCharUpdateList) {
//
//			count++;
//			dndChar.setCharacterName(dndChar.getCharacterName() + "Nateomancer");
//
//		}
//		return count;
//	}
//
//	// UPDATE CHARACTER STATS
//	// STRENGTH, DEXTRERTY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA
//	// STATS CANNOT BE NULL
//	public int updateDndCharacterStats() {
//
//		int count = 0;
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DndCharacter");
//		EntityManager em = emf.createEntityManager();
//
//		String jpql = "SELECT cust FROM customer cust WHERE cust.email= '' OR cust.email IS NULL";
//		List<DndCharacter> dndCharUpdateList = em.createQuery(jpql, DndCharacter.class).getResultList();
//
//		em.getTransaction().begin();
//
//		for (DndCharacter dndChar : dndCharUpdateList) {
//
//			count++;
//			dndChar.setCharacterName(dndChar.getCharacterName() + "sdcustomer.org");
//
//		}
//		return count;
//	}
//
//	// UPDATE CHARACTER ALIGNMENT
//	// ALIGNMENT CAN BE NULL
//	public int updateNullDndCharacterAlignment() {
//
//		int count = 0;
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DndCharacter");
//		EntityManager em = emf.createEntityManager();
//		String jpql = "SELECT cust FROM customer cust WHERE cust.email= '' OR cust.email IS NULL";
//		List<DndCharacter> dndCharUpdateList = em.createQuery(jpql, DndCharacter.class).getResultList();
//
//		em.getTransaction().begin();
//
//		for (DndCharacter dndChar : dndCharUpdateList) {
//
//			count++;
//			dndChar.setCharacterName(dndChar.getCharacterName() + "sdcustomer.org");
//		}
//		return count;
//	}
//
//	// UPDATE CHARACTER BACKGROUND
//	// CAN BE NULL
////	public int updateNullDndCharacterBackGround() {
////
////		int count = 0;
////		EntityManagerFactory emf = Persistence.createEntityManagerFactory("DndCharacter");
////		EntityManager em = emf.createEntityManager();
////		String jpql = "SELECT cust FROM customer cust WHERE cust.email= '' OR cust.email IS NULL";
////		List<DndCharacter> dndCharUpdateList = em.createQuery(jpql, DndCharacter.class).getResultList();
////
////		em.getTransaction().begin();
////
////		for (DndCharacter dndChar : dndCharUpdateList) {
////
////			count++;
////			DndCharacter.setCharacterName(DndCharacter.getCharacterName() + "sdcustomer.org");
////		}
////		return count;
////	}
////	
//
//	// Delete a Dnd Character by id
//	public boolean deleteDndCharacter(int dndCharId) {
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
//		EntityManager em = emf.createEntityManager();
//		boolean wasDeleted = false;
//
//		DndCharacter dndChar = em.find(DndCharacter.class, dndCharId);
//		if (dndChar != null) {
//
//			em.getTransaction().begin();
//
//			em.remove(dndCharId);
//
//			em.getTransaction().commit();
//		}
//
//		return wasDeleted = !em.contains(dndCharId);
//
//	}
//
//}
