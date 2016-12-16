package com.step63n1.controller.blackJack.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.controller.blackJack.BlackJackDealCards;
import com.step63n1.controller.blackJack.BlackJackPlay;
import com.step63n1.model.blackJack.BlackJackPlayer;

@Service
public class BlackJackPlayImpl implements BlackJackPlay{
	
	@Autowired
	private BlackJackDealCards blackJackDeal;
	
	private List<BlackJackPlayer> blackJackPlayers;
	
	public void play() {
		// TODO Auto-generated method stub
		/*
		 * step1: Deal Card 
		 */
		blackJackDeal.dealCards();
		
	}

}
