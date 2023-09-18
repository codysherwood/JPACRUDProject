package com.skilldistillery.superheros.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

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
//	private SuperHeroDaoImpl dao;

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
	void hero_mapping() {
		assertNotNull(hero);
		assertEquals("Spider-Man", hero.getName());
		assertEquals(70, hero.getHeightInInches());
		assertEquals(167, hero.getWeightInPounds());
	}
	
//	

}
