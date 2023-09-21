package com.skilldistillery.superheros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(path = {"createHero.do"}, method=RequestMethod.POST)
	public String createHero(SuperHero hero, Model model ) {
		SuperHero newHero = heroDao.create(hero);
		model.addAttribute("hero",newHero);
		return "heroCreated";
	}
	
	@RequestMapping(path = {"deleteHero.do"})
	public String deleteHero(int heroId, Model model) {
		boolean deleted = heroDao.deleteById(heroId);
		model.addAttribute("deleted", deleted);
		return "deleteSuccesfull";
	}
	
	@RequestMapping(path={"updateHero.do"})
	public String updateHero(SuperHero hero, Model model) {
		SuperHero updatedHero = heroDao.update(hero);
		model.addAttribute("hero", updatedHero);
		return "UpdateHero";
		
	}

}
