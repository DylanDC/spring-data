package com.formation.user;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.formation.AppConfig;

//Nous fournissons la liste des classes de configuration Spring qui permettront d'avoir le contexte Spring correct dans nos test
@ContextConfiguration(classes = { AppConfig.class })
// Nous demandons une exécution particulière des tests avec une délagation de
// Junit à Spring pour la gestion du cycle de vie et donc
// l'injection des beans
@RunWith(SpringRunner.class)
public class UserInteractionTest {
	@Autowired
	UserInteraction test;

	@Test
	public void test() {

		int result = test.sayTheCaptainAgeForAFamousThreeMast(10, 3);

		assertEquals(58, result);
	}

}
