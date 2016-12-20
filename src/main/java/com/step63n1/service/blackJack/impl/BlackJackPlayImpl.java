package com.step63n1.service.blackJack.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.model.BlackJackTableSitter;
import com.step63n1.model.blackJack.BlackJackDealer;
import com.step63n1.model.blackJack.BlackJackHouseRules;
import com.step63n1.model.blackJack.BlackJackPlayer;
import com.step63n1.model.blackJack.TrumpCard;
import com.step63n1.model.blackJack.TrumpDecks;
import com.step63n1.service.blackJack.BlackJackDealCards;
import com.step63n1.service.blackJack.BlackJackPlay;

@Service
public class BlackJackPlayImpl implements BlackJackPlay{
	
	@Autowired
	private BlackJackDealCards blackJackDeal;
	
	private BlackJackHouseRules blackJackHouseRules;
	private TrumpDecks trumpDecks;
	private List<BlackJackTableSitter> blackJackTableSitters;
	
	private List<BlackJackDealer> blackJackDealers;
	private List<BlackJackPlayer> blackJackPlayers;
	
	public void play(BlackJackHouseRules blackJackHouseRules, TrumpDecks trumpDecks,
			List<BlackJackTableSitter> blackJackTableSitters) {
		// TODO Auto-generated method stub
		
		this.blackJackHouseRules = blackJackHouseRules;
		this.trumpDecks = trumpDecks;
		this.blackJackTableSitters = blackJackTableSitters;
		
		this.separateDealerToPlayers();
		this.dealCards();
	}
	
	private void separateDealerToPlayers(){
		for(BlackJackTableSitter tableSitter: blackJackTableSitters){
			if (tableSitter.isDealer()){
				blackJackDealers.add((BlackJackDealer)tableSitter);
			}
			else{
				blackJackPlayers.add((BlackJackPlayer)tableSitter);
			}
		}
	}
	
	private void dealCards(){
		int numRoundOfDeal = 2;
		int numPlayers = blackJackPlayers.size();
		
		for (int i = 0; i <= numRoundOfDeal; i++){
			for (int j = 0; j <= numPlayers; j++){
				BlackJackPlayer blackJackPlayer = blackJackPlayers.get(j);
				
				blackJackPlayer.addHand(drawCard());;
			}
		}
		
	}
	
	private TrumpCard drawCard(){
		List<TrumpCard> decks = trumpDecks.getDecks();
		TrumpCard drawnCard = decks.get(trumpDecks.getNumCardInDecks() - 1);
		decks.remove(trumpDecks.getNumCardInDecks() - 1);
		trumpDecks.setDecks(decks);
		
		return drawnCard;
	}

}
