package com.skilldistillery.superheros.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.query.ImmutableEntityUpdateQueryHandlingMode;
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
	public List<SuperHero> findAllHeroes() {
		String jpql = "select h from SuperHero h";
		return em.createQuery(jpql, SuperHero.class).getResultList();
	}

	@Override
	public SuperHero create(SuperHero hero) {
		em.persist(hero);
		return hero;
	}

	@Override
	public SuperHero update(SuperHero updatingHero) {
		SuperHero updatedHero = em.find(SuperHero.class, updatingHero.getId());
		updatedHero.setName(updatingHero.getName());
		updatedHero.setHeightInInches(updatingHero.getHeightInInches());
		updatedHero.setWeightInPounds(updatingHero.getWeightInPounds());
		updatedHero.setDescription(updatingHero.getDescription());
		updatedHero.setImageUrl(updatingHero.getImageUrl());
		return updatedHero;
	}

	@Override
	public boolean deleteById(int heroId) {
		boolean deletedHero = false;
		SuperHero hero = em.find(SuperHero.class, heroId);
		if (hero != null) {
			em.remove(hero);
			deletedHero = true;
		}
		return deletedHero;

	}

}
