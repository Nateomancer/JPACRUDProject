package com.skilldistillery.guitarcollection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.guitarcollection.data.GuitarDAO;

@Controller
public class GuitarController {
	
	@Autowired
	private GuitarDAO dao;

	@RequestMapping(path = "/")
	public String index(Model model) {

		model.addAttribute("DEBUG", dao.findById(1));

		return "index";

	}

}
