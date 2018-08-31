package com.formation.service;

public class FeedbackToConsole extends AbstractFeedback implements IFeedback {

	@Override
	public void say(String something) {
		System.out.println(something);

	}

	@Override
	public void calcul(Integer A, Integer B) {
		Integer C = A + B;
		System.out.println(C);
	}

}
