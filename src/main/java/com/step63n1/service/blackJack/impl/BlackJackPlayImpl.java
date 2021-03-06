package com.step63n1.service.blackJack.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.model.BlackJackTableSitter;
import com.step63n1.model.blackJack.BlackJackDealer;
import com.step63n1.model.blackJack.BlackJackHouseRules;
import com.step63n1.model.blackJack.BlackJackPlayer;
import com.step63n1.model.blackJack.Hand;
import com.step63n1.model.blackJack.TrumpCard;
import com.step63n1.model.blackJack.TrumpDecks;
import com.step63n1.model.enums.Rank;
import com.step63n1.service.blackJack.BlackJackPlay;
import com.step63n1.view.BlackJackInputView;

@Service
public class BlackJackPlayImpl implements BlackJackPlay{
	
	@Autowired
	private BlackJackInputView blackJackInputView;

	private BlackJackHouseRules blackJackHouseRules;
	private TrumpDecks trumpDecks;
	private List<BlackJackTableSitter> blackJackTableSitters;
	
	private BlackJackDealer blackJackDealer;
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
				blackJackDealer = (BlackJackDealer)tableSitter;
			}
			else{
				blackJackPlayers.add((BlackJackPlayer)tableSitter);
			}
		}
	}
	
	private void dealCards(){
		int numRoundOfDeal = 2;
		int numPlayers = blackJackPlayers.size();
		
		/*
		 * deal cards to players + dealer with 2 rounds. 
		 */
		for (int i = 0; i <= numRoundOfDeal; i++){
			
			// deal cards to players
			for (int j = 0; j <= numPlayers; j++){
				BlackJackPlayer blackJackPlayer = blackJackPlayers.get(j);
				
				blackJackPlayer.addHand(drawCard());
			}
			
			//deal cards to dealer
			blackJackDealer.addHand(drawCard());
		}
		
	}
	
	private TrumpCard drawCard(){
		List<TrumpCard> decks = trumpDecks.getDecks();
		TrumpCard drawnCard = decks.get(trumpDecks.getNumCardInDecks() - 1);
		decks.remove(trumpDecks.getNumCardInDecks() - 1);
		trumpDecks.setDecks(decks);
		
		return drawnCard;
	}
	
	public void handPlay(Hand hand){
		if (this.getHandCount(hand) == 21){
			hand.stand();
		}
	}


	public void playerPlay(BlackJackPlayer blackJackPlayer){
		/*
		 * step1: check for black Jack
		 */
		if(this.getHandCount(blackJackPlayer) == 21){
			blackJackPlayer.getHands().;
			//check if dealer has ace
		}
		/*
		 * step2: ask for their decision
		 */
		else{
			boolean doesSplit = blackJackInputView.askSplit();
			if (doesSplit){
				blackJackPlayer.getHands();
			}
		}
		
	}
	
	public void dealerPlay(){
		
	}
	
	public int getHandCount(Hand hand){
		int numAce = 0;
		int handCount = 0;
		for(TrumpCard card: hand.getHand()){
			if (card.getRank().equals(Rank.Ace)){
				numAce++;
			}
			else{
				handCount += card.getRank().getNumVal();
			}
		}
		
		for(int i = 0; i < numAce; i++){
			if((handCount + 11) > 21){
				handCount += 1;
			}
			else{
				handCount += 11;
			}
		}
		return handCount;
		
	}
}
