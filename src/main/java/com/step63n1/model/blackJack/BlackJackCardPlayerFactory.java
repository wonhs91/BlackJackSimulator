package com.step63n1.model.blackJack;

import com.step63n1.model.BlackJackTableSitter;

public class BlackJackCardPlayerFactory {

	private boolean isDealer;
	
	private double startingBetAmount;

	private double originalAsset;
	
	public BlackJackTableSitter generateDealer(double originalAsset){
		return new BlackJackDealer(originalAsset);
	}
	
	public BlackJackTableSitter generateDealer(){
		return this.generateDealer(Double.MAX_VALUE/2);
	}
	
	public BlackJackTableSitter generatePlayer(double originalAsset, double startingBetAmount){
		return new BlackJackPlayer(originalAsset, startingBetAmount);
	}
	
	public BlackJackTableSitter generatePlayer(){
		return this.generatePlayer(500.0, 5.0);
	}

}
