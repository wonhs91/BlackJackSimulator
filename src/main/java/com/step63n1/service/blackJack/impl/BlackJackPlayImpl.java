package com.step63n1.service.blackJack.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.model.blackJack.BlackJackPlayer;
import com.step63n1.service.blackJack.BlackJackDealCards;
import com.step63n1.service.blackJack.BlackJackPlay;

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
