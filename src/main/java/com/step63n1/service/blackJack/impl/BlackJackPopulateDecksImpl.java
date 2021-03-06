package com.step63n1.service.blackJack.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.step63n1.model.blackJack.BlackJackHouseRules;
import com.step63n1.model.blackJack.TrumpCard;
import com.step63n1.model.blackJack.TrumpDeck;
import com.step63n1.model.blackJack.TrumpDecks;
import com.step63n1.model.enums.Rank;
import com.step63n1.model.enums.Suit;
import com.step63n1.service.blackJack.BlackJackPopulateDecks;

@Service
public class BlackJackPopulateDecksImpl implements BlackJackPopulateDecks{
	
	private BlackJackHouseRules blackJackHouseRules;
	
	public TrumpDecks populateDecks(BlackJackHouseRules houseRules) {
		// TODO Auto-generated method stub
		blackJackHouseRules = houseRules;
		return this.generateDecks();
	}
	
	private TrumpDecks generateDecks(){
		TrumpDecks trumpDecks = new TrumpDecks();
		List<TrumpDeck> decks = new ArrayList<TrumpDeck>();
		
		for (int i = 0; i < blackJackHouseRules.getNumDecks(); i++){
			decks.add(this.generateDeck());
		}
		
		trumpDecks.setDecks(blackJackHouseRules.getNumDecks(), decks);
		
		return trumpDecks;
	}
	
	private TrumpDeck generateDeck(){
		TrumpDeck trumpDeck = new TrumpDeck();
		List<TrumpCard> trumpCards = new ArrayList<TrumpCard>();
		
		for (Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()){
				trumpCards.add(this.generateCard(suit, rank));
			}
		}
		
		trumpDeck.setDeck(trumpCards);
		
		return trumpDeck;
	}
	
	private TrumpCard generateCard(Suit suit, Rank rank){
		TrumpCard trumpCard = new TrumpCard(suit, rank);
		return trumpCard;
	}

}
