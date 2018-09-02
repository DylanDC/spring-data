package com.formation.service;

import java.time.LocalDateTime;

public class Feedback {
	int id;
	String user;
	String message;
	LocalDateTime eventTime;

	public Feedback(String user, String message, LocalDateTime eventTime) {
		super();
		this.user = user;
		this.message = message;
		this.eventTime = eventTime;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", user=" + user + ", message=" + message + ", eventTime=" + eventTime + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalDateTime eventTime) {
		this.eventTime = eventTime;
	}

}
