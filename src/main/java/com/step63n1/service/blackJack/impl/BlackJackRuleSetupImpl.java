package com.step63n1.service.blackJack.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.model.blackJack.BlackJackHouseRules;
import com.step63n1.service.blackJack.BlackJackRuleSetup;
import com.step63n1.view.BlackJackInputView;

@Service
public class BlackJackRuleSetupImpl implements BlackJackRuleSetup{
	
	private BlackJackHouseRules blackJackHouseRules;
	
	@Autowired
	BlackJackInputView blackJackInputView;
	
	private void getRules() {
		/*
		 * step1: get blackjack house rules
		 */
		blackJackInputView.askRuleSpecifications();
		
		blackJackHouseRules = new BlackJackHouseRules();
		blackJackHouseRules.setNumDecks(blackJackInputView.getNumDecks());
		blackJackHouseRules.setDoesDealerStandSoft17(blackJackInputView.getDoesDealerStandSoft17());
		blackJackHouseRules.setBlackJackWager(blackJackInputView.getBlackJackWager());
		
	}
	
	public BlackJackHouseRules getBlackJackHouseRules(){
		return blackJackHouseRules;
	}

	public BlackJackHouseRules setUpHouseRules() {
		// TODO Auto-generated method stub
		getRules();
		return blackJackHouseRules;
	}
	


}
