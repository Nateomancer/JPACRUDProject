package com.skilldistillery.dndcharacterjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	@RequestMapping(path = { "/", "index.do" })
	public String index(Model model) {
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@INDEX@@@@@@@@@@@@@@@@@@");
		System.err.println("@@@@@@@@@@@@@@@@@@INDEX@@@@@@@@@@@@@@@@@@");
		model.addAttribute("characters", dao.findAll());
		return "index";
	}

	@RequestMapping(path ="showCharacter.do")
	public String showCharacter( Integer id, Model model) {

		System.out.println("Char ID: " + id);
		System.err.println("Printing Character info for character ID: " + id);
		DndCharacter dndChar = dao.findById(id);
		model.addAttribute("dndChar", dndChar);
		System.err.println("Character: " + dndChar);
		return "index";
	}

}
