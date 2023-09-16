package com.skilldistillery.superheros.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuperHeroTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private SuperHero hero;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPASuperHeroes");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		hero = em.find(SuperHero.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
			em.close();
			hero = null;
		}
	

	@Test
	void get_hero_name_() {
		assertNotNull(hero);
		assertEquals("Spider-Man", hero.getName());
	}

}
