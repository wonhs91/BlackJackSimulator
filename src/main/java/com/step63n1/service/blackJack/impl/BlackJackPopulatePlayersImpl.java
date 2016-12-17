package com.step63n1.service.blackJack.impl;

import java.util.ArrayList;
import java.util.List;

import com.step63n1.model.CardPlayer;
import com.step63n1.model.TableSettings;
import com.step63n1.model.blackJack.BlackJackCardPlayerFactory;
import com.step63n1.model.blackJack.BlackJackPlayer;
import com.step63n1.model.blackJack.BlackJackTableSettings;
import com.step63n1.service.blackJack.BlackJackPopulatePlayers;

public class BlackJackPopulatePlayersImpl implements BlackJackPopulatePlayers{


	
	public List<CardPlayer> populatePlayers(TableSettings blackJackTableSettings) {
		return generatePlayers(blackJackTableSettings.getNumPlayers());

	}
	
	private List<CardPlayer> generatePlayers(int numPlayer){
		
		List<CardPlayer> blackJackPlayers = new ArrayList<CardPlayer>();
		BlackJackCardPlayerFactory blackJackCardPlayerFactory = new BlackJackCardPlayerFactory();
		
		blackJackPlayers.add(blackJackCardPlayerFactory.generateDealer());
		
		for (int i = 0; i < numPlayer; i++){
			blackJackPlayers.add(blackJackCardPlayerFactory.generatePlayer());
		}
		
		return blackJackPlayers;
	}

	
}
