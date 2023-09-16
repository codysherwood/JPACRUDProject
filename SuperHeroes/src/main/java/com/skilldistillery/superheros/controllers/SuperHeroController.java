package com.skilldistillery.superheros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.superheros.data.SuperHeroDAO;

@Controller
public class SuperHeroController {
	
	@Autowired
	public SuperHeroDAO heroDao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("heroList", heroDao.findAll());
		return "home";
	}

}
