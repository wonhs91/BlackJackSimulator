package com.step63n1.view;

import com.step63n1.model.enums.BlackJackChoice;

public interface BlackJackInputView {
	
	public void askRuleSpecifications();
	
	public boolean askSplit();
	
	public BlackJackChoice askDecision();
	
	public int getNumDecks();
	
	public boolean getDoesDealerStandSoft17();
	
	public double getBlackJackWager();
	
	public int getNumPlayers();
	
	public double getMinBet();
	
	public void askSettingsSpecifications();

}
