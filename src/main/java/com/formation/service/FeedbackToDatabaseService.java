package com.formation.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FeedbackToDatabaseService implements IFeedback {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void say(Feedback newFeedback) {
		this.jdbcTemplate.update("insert into feedback ( USER, MESSAGE, EVENT_TIME) values (?,?,?)",
				newFeedback.getUser(), newFeedback.getMessage(), newFeedback.getEventTime());
	}

	@Override
	public void amend(Feedback updatedFeedback) {
		this.jdbcTemplate.update("update feedback set USER = ?, MESSAGE = ?, EVENT_TIME = ? where id = ?",
				updatedFeedback.getUser(), updatedFeedback.getMessage(), updatedFeedback.getEventTime(),
				updatedFeedback.getId());
	}

	@Override
	public void unSayTo(String user) {
		this.jdbcTemplate.update("delete from feedback where USER = ?", user);

	}

	@Override
	public List<Feedback> tellMeAll() {
		return null;
	}

	@Override
	public List<Feedback> tellMeWhatWasSaidToHimThisDay(String user, LocalDate day) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedback> listAllFeedbackWith(String user) {
		// TODO Auto-generated method stub
		return null;
	}

}