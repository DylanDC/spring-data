package com.formation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import com.formation.dao.MariaDBConfig;
import com.formation.service.FeedbackToDatabaseService;
import com.formation.service.IFeedback;
import com.formation.user.UserInteraction;

@Configuration
@Import(MariaDBConfig.class)
public class AppConfig {

	@Autowired
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public AppConfig(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public IFeedback feedback() {
		return new FeedbackToDatabaseService();
	}

	@Bean
	public UserInteraction user() {
		return new UserInteraction();
	}

}