package com.skilldistillery.dndcharacterjpa;

import com.skilldistillery.dndcharacterjpa.data.DndCharacterDAO;
import com.skilldistillery.dndcharacterjpa.data.DndCharacterDAOImpl;
import com.skilldistillery.dndcharacterjpa.controller.*;
import com.skilldistillery.dndcharacterjpa.client.*;
import com.skilldistillery.dndcharacterjpa.entities.*;

@SuppressWarnings("unused")
public class DndCharacterDAOCrudTest {

	public static void main(String[] args) {

		DndCharacterDAO dao = new DndCharacterDAOImpl();

		//create
//		DndCharacter dndCharacterDAOCreateTest = new DndCharacter("Eliolekai The Nightmare", "Eldritch Necromancer", "Wraith");
//		System.out.println("Before calling create: "+dndCharacterDAOCreateTest);
//		dao.createNewDndCharacter(dndCharacterDAOCreateTest);
//		System.out.println("After calling create: "+dndCharacterDAOCreateTest);

		// update
//		DndCharacter dndCharacterDAOUpdateTest = new DndCharacter("Astrunoth", "Eldritch Pyromancer", "Demon");
//		System.out.println("before update: "+ dndCharacterDAOUpdateTest);
//		dao.updateExistingDndCharacter(4, anActor);
//		System.out.println("after update: " + dndCharacterDAOUpdateTest;
//		
		//delete
		boolean worked = dao.deleteExistingDndCharacter(4);
		System.out.println("Worked? " + worked);

	}

}
