package com.step63n1.model.blackJack;

import org.springframework.beans.factory.annotation.Autowired;

import com.step63n1.model.HouseRules;
import com.step63n1.model.enums.Game;

public class BlackJackHouseRules extends HouseRules{
	
	private Game game = Game.BlackJack;
	
	private int numDecks;
	private boolean doesDealerStandSoft17;
	private double blackJackWager;
	
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


}
