package com.formation.user;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.service.IFeedback;

@Component
public class UserInteraction {
	@Autowired
	private IFeedback feedback;

	public IFeedback getFeedback() {
		return feedback;
	}

	public void setFeedback(IFeedback feedback) {
		this.feedback = feedback;
	}

	/**
	 * To say hello to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayHello(String name) {
		feedback.say(MessageFormat.format("Hello {0} !", name));

	}

	/**
	 * To say goodbye to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayGoodBye(String name) {
		feedback.say(MessageFormat.format("Goodbye {0} !", name));
	}

	public void additioner(Integer A, Integer B) {
		feedback.calcul(A, B);

	}

	public int sayTheCaptainAgeForAFamousThreeMast(float boatSize, int nbMast) {
		return feedback.giveMeTheCaptainAge(boatSize, nbMast);
	}
}
