package com.step63n1.controller.blackJack.impl;

import com.step63n1.controller.blackJack.BlackJackTableSettingsSetup;
import com.step63n1.model.TableSettings;
import com.step63n1.model.blackJack.BlackJackTableSettings;

public class BlackJackTableSettingsSetupImpl implements BlackJackTableSettingsSetup{

	BlackJackTableSettings blackJackTableSettings;
	
	public TableSettings setUpTableSettings() {
		// TODO Auto-generated method stub
		blackJackTableSettings.setMinBet(5);
		blackJackTableSettings.setNumPlayers(1);
		return null;
	}

}
