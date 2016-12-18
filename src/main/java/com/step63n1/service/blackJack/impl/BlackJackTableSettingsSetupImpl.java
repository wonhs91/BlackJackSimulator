package com.step63n1.service.blackJack.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.step63n1.model.blackJack.BlackJackTableSettings;
import com.step63n1.service.blackJack.BlackJackTableSettingsSetup;
import com.step63n1.view.BlackJackInputView;

public class BlackJackTableSettingsSetupImpl implements BlackJackTableSettingsSetup{

	BlackJackTableSettings blackJackTableSettings;
	
	@Autowired
	BlackJackInputView blackJackInputView;
	
	
	public BlackJackTableSettings setUpTableSettings() {
		// TODO Auto-generated method stub
		blackJackTableSettings = new BlackJackTableSettings();
		blackJackInputView.askSettingsSpecifications();
		
		blackJackTableSettings.setNumPlayers(blackJackInputView.getNumPlayers());
		blackJackTableSettings.setMinBet(blackJackInputView.getMinBet());
		return blackJackTableSettings;
	}

}
