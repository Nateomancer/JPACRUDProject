package com.skilldistillery.dndcharacterjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.dndcharacterjpa.data.DndCharacterDAO;
import com.skilldistillery.dndcharacterjpa.entities.DndCharacter;

@Controller
public class CharacterController {

	@Autowired
	private DndCharacterDAO dao;

	// home page
	// index method
	// PROGRAM START
	@RequestMapping(path = { "/", "index.do" })
	public String index(Model model) {

		System.err.println("@@@@@@@@@@@@@@@@@@---PROGRAM START---@@@@@@@@@@@@@@@@@@");
		System.err.println("@@@@@@@@@@@@@@@@@@---INDEX---@@@@@@@@@@@@@@@@@@");
		// List<DndCharacter> completeDndCharacterList = null;
		List<DndCharacter> completeDndCharacterList = dao.findAllCharacters();
		model.addAttribute("dndCharacters", completeDndCharacterList);
		return "index";
	}

	// FIND CHARACTER BY ID
	// "/", "index.do","showCharacter.do"}
	// {"showCharacter.do"}
	@RequestMapping(path = "findCharacterById.do", method = RequestMethod.GET)
	public String findCharacterById(@RequestParam Integer id, Model model) {

		System.err.println("@@@@@@@@@@@@@@@@@@---SHOW CHARACTER BY ID---@@@@@@@@@@@@@@@@@@");
		System.err.println("Char ID: " + id);
		System.err.println("Printing Character info for character ID: " + id);
		DndCharacter dndCharIdResult = dao.findCharacterById(id);
		model.addAttribute("dndCharIdResult", dndCharIdResult);
		System.err.println("FROM CONTROLLER: Character Found: " + dndCharIdResult);

		return "index";
	}

	// FIND CHARACTER BY NAME
	@RequestMapping(path = "findCharacterByName.do", method = RequestMethod.GET)
	public String findCharacterByName(@RequestParam String name, Model model) {

		System.err.println("@@@@@@@@@@@@@@@@@@---SHOW CHARACTER BY NAME---@@@@@@@@@@@@@@@@@@");
		System.out.println("Char name: " + name);
		System.err.println("Printing Character info for character Name: " + name);
		DndCharacter dndCharNameResult = dao.findCharacterByName(name);
		model.addAttribute("dndCharNameResult", dndCharNameResult);
		System.err.println("dndCharNameResult: " + dndCharNameResult);

		return "index";
	}

	// FIND CHARACTER BY CLASS OR RACE
	@RequestMapping(path = "findCharacterByJobAndRace.do", method = RequestMethod.GET)
	public String findCharacterByJobAndRace(@RequestParam String job, String race, Model model) {

		System.err.println("@@@@@@@@@@@@@@@@@@---SHOW CHARACTER BY CLASS AND RACE---@@@@@@@@@@@@@@@@@@");
		System.out.println("Char class: " + job);
		System.out.println("Char race: " + race);
		System.err.println("findCharacterByClassAndRace.do");

		List<DndCharacter> dndCharJobRaceSearchResult = dao.findCharacterByJobAndRace(job, race);
		model.addAttribute("dndCharJobRaceSearchResult", dndCharJobRaceSearchResult);

		return "index";
	}
	
	
	//CREATE CHARACTER
	//UPDATE CHARACTER
	//DELETE CHARACTER

}
