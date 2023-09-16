package com.skilldistillery.superheros.data;

import java.util.List;

import com.skilldistillery.superheros.entities.SuperHero;

public interface SuperHeroDAO {
	SuperHero findById(int heroId);
	List<SuperHero> findAll();
	SuperHero create(SuperHero newHero);
	SuperHero update(SuperHero updatingHero);
	boolean deleteById(int heroId);
}
