package com.formation;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		ApplicationContext conf = new AnnotationConfigApplicationContext(AppConfig.class);
		UserInteraction interaction = conf.getBean(UserInteraction.class);
		interaction.sayHello("toto");
		interaction.sayGoodBye("lol");
		interaction.additioner(12, 4);
		System.out.println("et la c'est le bug!");
		// close application context
		((AbstractApplicationContext) conf).close();
	}
}