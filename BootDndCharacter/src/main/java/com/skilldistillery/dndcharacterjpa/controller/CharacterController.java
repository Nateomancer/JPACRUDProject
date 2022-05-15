package com.skilldistillery.dndcharacterjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.dndcharacterjpa.data.DndCharacterDAO;

@Controller
public class CharacterController {

@Autowired
private DndCharacterDAO dao;

@RequestMapping(path= {"/", "index"})
public String index(Model model) {
	
	model.addAttribute("Characters", dao.findAll());
	return "index";
}
}
