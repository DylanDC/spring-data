package com.formation.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AbstractFeedbackTest {

	@Test
	public void test() {
		// GIVEN
		AbstractFeedback test = new FeedbackToConsole();
		// AbstractFeedback mockedTest = new FeedbackToConsole();
		// WHEN
		int resultat = test.giveMeTheCaptainAge(10, 3);
		int resultat2 = test.giveMeTheCaptainAge(0, 0);
		// THEN
		assertEquals(58, resultat);
		assertEquals(42, resultat2);
	}

}
