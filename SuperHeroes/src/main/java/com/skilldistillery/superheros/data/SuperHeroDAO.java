package com.skilldistillery.superheros.data;

import java.util.List;

import com.skilldistillery.superheros.entities.SuperHero;

public interface SuperHeroDAO {
	SuperHero findById(int heroId);
	List<SuperHero> findAllHeroes();
	SuperHero create(SuperHero newHero);
	SuperHero update(SuperHero updatingHero);
	boolean deleteById(int heroId);
}
