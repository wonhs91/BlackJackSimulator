package com.step63n1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.step63n1.service.blackJack.BlackJackService;

public class Main {
	
	public static void main(String []args){
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		BlackJackService blackJackService = (BlackJackService) context.getBean("blackJackService");
		blackJackService.start();
		
		
	}
}
