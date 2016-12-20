package com.step63n1.service.blackJack.impl;

import java.util.ArrayList;
import java.util.List;

import com.step63n1.model.BlackJackTableSitter;
import com.step63n1.model.blackJack.BlackJackCardPlayerFactory;
import com.step63n1.model.blackJack.BlackJackTableSettings;
import com.step63n1.service.blackJack.BlackJackPopulatePlayers;

public class BlackJackPopulatePlayersImpl implements BlackJackPopulatePlayers{


	
	public List<BlackJackTableSitter> populatePlayers(BlackJackTableSettings blackJackTableSettings) {
		return generatePlayers(blackJackTableSettings.getMaxNumPlayers());

	}
	
	private List<BlackJackTableSitter> generatePlayers(int numPlayer){
		
		List<BlackJackTableSitter> blackJackPlayers = new ArrayList<BlackJackTableSitter>();
		BlackJackCardPlayerFactory blackJackCardPlayerFactory = new BlackJackCardPlayerFactory();
		
		blackJackPlayers.add(blackJackCardPlayerFactory.generateDealer());
		
		for (int i = 0; i < numPlayer; i++){
			blackJackPlayers.add(blackJackCardPlayerFactory.generatePlayer());
		}
		
		return blackJackPlayers;
	}
	
}
