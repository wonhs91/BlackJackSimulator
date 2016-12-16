package com.step63n1.model.blackJack;

import com.step63n1.model.CardPlayer;

public class BlackJackCardPlayerFactory {

	private boolean isDealer;
	
	private double startingBetAmount;

	private double originalAsset;

	
	public BlackJackCardPlayerFactory(boolean isDealer){
		this.isDealer = isDealer;
		this.originalAsset = Double.MAX_VALUE;
	}
	
	public BlackJackCardPlayerFactory(){
		this.isDealer = false;
		this.startingBetAmount = 5.0;
		this.originalAsset = 500.0;
		
	}

	public void setStartingBetAmount(double startingBetAmount) {
		this.startingBetAmount = startingBetAmount;
	}
	
	public void setOriginalAsset(double originalAsset){
		this.originalAsset = originalAsset;
	}
	
	
	public CardPlayer generate(){
		if (isDealer){
			if (originalAsset != Double.MAX_VALUE){
				return new BlackJackDealer(originalAsset);
			}
			else{
				return new BlackJackDealer();
			}
		}
		else{
			 return new BlackJackPlayer(originalAsset, startingBetAmount);
		}
	}
	
	public void renewConfig(boolean isDealer){
		this.isDealer = isDealer;
		if (isDealer){
			this.originalAsset = Double.MAX_VALUE;
		}
		else{
			this.startingBetAmount = 5.0;
			this.originalAsset = 500.0;
		}
	}
}
