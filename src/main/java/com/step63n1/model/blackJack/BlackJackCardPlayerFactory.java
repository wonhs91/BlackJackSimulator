package com.step63n1.model.blackJack;

import com.step63n1.model.CardPlayer;

public class BlackJackCardPlayerFactory {

	private boolean isDealer;
	
	private double startingBetAmount;

	private double originalAsset;
	
	public CardPlayer generateDealer(double originalAsset){
		return new BlackJackDealer(originalAsset);
	}
	
	public CardPlayer generateDealer(){
		return this.generateDealer(Double.MAX_VALUE);
	}
	
	public CardPlayer generatePlayer(double originalAsset, double startingBetAmount){
		return new BlackJackPlayer(originalAsset, startingBetAmount);
	}
	
	public CardPlayer generatePlayer(){
		return this.generatePlayer(500.0, 5.0);
	}

}
