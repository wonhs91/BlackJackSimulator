package com.step63n1.model.blackJack;

import org.springframework.beans.factory.annotation.Autowired;

import com.step63n1.model.enums.Game;

public class BlackJackHouseRules {
	
	private Game game = Game.BlackJack;
	
	private int numDecks;
	private boolean doesDealerStandSoft17;
	private double blackJackWager;

	private double minBet;
	private int maxNumPlayers;
	
	public BlackJackHouseRules(){
		// default house rules
		numDecks = 6;
		doesDealerStandSoft17 = true;
		blackJackWager = 1.5;
	}
	
	public Game getGame() {
		// TODO Auto-generated method stub
		return Game.BlackJack;
	}

	
	public int getNumDecks(){
		return numDecks;
	}
	
	public void setNumDecks(int numDecks){
		this.numDecks = numDecks;
	}
	
	public boolean getDoesDealerStandSoft17(){
		return doesDealerStandSoft17;
	}
	
	public void setDoesDealerStandSoft17(boolean doesDealderStandSoft17){
		this.doesDealerStandSoft17 = doesDealderStandSoft17;
	}
	
	public double getBlackJackWager(){
		return blackJackWager;
	}
	
	public void setBlackJackWager(double blackJackWager){
		this.blackJackWager = blackJackWager;
	}

	public double getMinBet() {
		return minBet;
	}

	public void setMinBet(double minBet) {
		this.minBet = minBet;
	}

	public int getMaxNumPlayers() {
		return maxNumPlayers;
	}

	public void setMaxNumPlayers(int numPlayers) {
		if (numPlayers <= 0){
			numPlayers = 1;
		}
		this.maxNumPlayers = numPlayers;
	}

}
