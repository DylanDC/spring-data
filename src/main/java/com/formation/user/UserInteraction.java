package com.formation.user;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.formation.service.Feedback;
import com.formation.service.IFeedback;

/**
 * Class to make interactions with the user
 */

@Component
public class UserInteraction {

	@Autowired
	private IFeedback feedbackService;

	public IFeedback getFeedbackService() {
		return feedbackService;
	}

	public void setFeedbackService(IFeedback feedbackService) {
		this.feedbackService = feedbackService;
	}

	public void sayHello(String user) {
		Feedback feedback = new Feedback(user, "Hello", LocalDateTime.now());
		feedbackService.say(feedback);

	}

	public void sayGoodBye(String user) {

	}

	public void makeABetterHelloTo(String user) {

	}

	public void deleteFeedbackWith(String user) {

	}

	public List<Feedback> listWhatWasSaidToHimToday(String user) {
		return null;

	}

}