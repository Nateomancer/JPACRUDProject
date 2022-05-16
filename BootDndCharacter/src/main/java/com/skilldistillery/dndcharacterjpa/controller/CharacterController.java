package com.skilldistillery.dndcharacterjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

		System.err.println("---PROGRAM START---");
		System.err.println("---Character Controller---");
		System.err.println("---INDEX---");
		List<DndCharacter> completeDndCharacterList = dao.findAllCharacters();
		model.addAttribute("dndCharacters", completeDndCharacterList);
		return "index";
	}

	// FIND CHARACTER BY ID
	// "/", "index.do","showCharacter.do"}
	// {"showCharacter.do"}
	@RequestMapping(path = "findCharacterById.do", method = RequestMethod.GET)
	public String findCharacterById(@RequestParam Integer id, Model model) {
		
		System.err.println("---Character Controller---");
		System.err.println("---SHOW CHARACTER BY ID---");
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
		
		System.err.println("---Character Controller---");
		System.err.println("---SHOW CHARACTER BY NAME---");
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

		System.err.println("---Character Controller---");
		System.err.println("---SHOW CHARACTER BY CLASS AND RACE---");
		System.out.println("Char class: " + job);
		System.out.println("Char race: " + race);
		System.err.println("findCharacterByClassAndRace.do");

		List<DndCharacter> dndCharJobRaceSearchResult = dao.findCharacterByJobAndRace(job, race);
		model.addAttribute("dndCharJobRaceSearchResult", dndCharJobRaceSearchResult);

		return "index";
	}
	
	
	//CREATE CHARACTER
	@RequestMapping(path="createNewDndCharacter.do", method = RequestMethod.GET)
	public String createNewDndCharacterView(@RequestParam String name, String job, String race, Model model) {
		
		ModelAndView mv = new ModelAndView();
		
		System.err.println("---Character Controller---");
		System.out.println("---createNewDndCharacter---");
		DndCharacter newDndCharacter= new DndCharacter(name, job, race);
		System.out.println("Before calling create: " + newDndCharacter);
		dao.createNewDndCharacter(newDndCharacter);
		System.out.println("After calling create: " + newDndCharacter);
		
		model.addAttribute("newDndCharacter", newDndCharacter);
		return "index";
	}
	
	
	//UPDATE CHARACTER
	@RequestMapping(path="updateExistingDndCharacter.do", method=RequestMethod.GET) 
	public String updateExistingDndCharacter(@RequestParam int id, String name, String job, Model model) {
		
		DndCharacter updateDummyChar=new DndCharacter(name, job);
		
		System.err.println("---Character Controller---");
		System.err.println("---updateExistingDndCharacter---");
		
		DndCharacter updatedChar=dao.updateExistingDndCharacter(id, name, job, updateDummyChar);
	 	
		model.addAttribute("updateDndCharacter", updatedChar);
		
		return "index";
	}
	
	
	//DELETE CHARACTER
	@RequestMapping(path="deleteExistingDndCharacter.do", params="id", method=RequestMethod.GET)
	public String deleteExistingDndCharacter(int id, Model model) {
		
		
	boolean dndCharacterDeleted=false;
		
		System.err.println("---Character Controller---");
		System.err.println("---deleteExistingDndCharacter---");
		
		dndCharacterDeleted=dao.deleteExistingDndCharacter(id);
		
		model.addAttribute("dndCharacterDeleted", dndCharacterDeleted);
	
		return "index";
	}

}
