package com.skilldistillery.superheros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.superheros.data.SuperHeroDAO;
import com.skilldistillery.superheros.entities.SuperHero;

@Controller
public class SuperHeroController {
	
	@Autowired
	public SuperHeroDAO heroDao;
	
	@RequestMapping(path = {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("heroList", heroDao.findAllHeroes());
		return "home";
	}
	
	@RequestMapping(path = {"getHero.do"})
	public String FindHeroById(@RequestParam int id, Model model) {
		SuperHero hero = heroDao.findById(id);
		model.addAttribute("hero", hero);
		return "showHero";
	}

}
