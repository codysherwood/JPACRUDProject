package com.skilldistillery.superheros.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.superheros.entities.SuperHero;

@Service
@Transactional
public class SuperHeroDaoImpl implements SuperHeroDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public SuperHero findById(int heroId) {
		
		return em.find(SuperHero.class, heroId);
	}

	@Override
	public List<SuperHero> findAll() {
		String jpql = "select h from SuperHero h";
		return em.createQuery(jpql, SuperHero.class).getResultList();
	}

	@Override
	public SuperHero create(SuperHero newHero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuperHero update(SuperHero updatingHero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int heroId) {
		// TODO Auto-generated method stub
		return false;
	}

}
