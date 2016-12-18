package com.step63n1.service.dao.impl;

import java.util.List;

import com.step63n1.model.blackJack.TrumpCard;
import com.step63n1.model.blackJack.TrumpDecks;
import com.step63n1.service.dao.TrumpDecksDao;

public class TrumpDecksDaoImpl implements TrumpDecksDao{
	private TrumpDecks blackJackDecks;
	
	
	public TrumpCard drawCard(){
		List<TrumpCard> blackJackCards = blackJackDecks.getDecks();
		TrumpCard drawnCard = blackJackCards.get(blackJackCards.size() - 1);
		blackJackCards.remove(blackJackCards.size() - 1);
		
		blackJackDecks.setDecks(blackJackCards);
		
		return drawnCard;
	}


	public void insertCard() {
		// TODO Auto-generated method stub
		
	}


	public void removeCard() {
		// TODO Auto-generated method stub
		
	}
}
