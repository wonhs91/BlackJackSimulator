package com.step63n1.controller.blackJack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.controller.CardGameService;
import com.step63n1.controller.helper.CardShuffleHelper;
import com.step63n1.model.Decks;
import com.step63n1.model.HouseRules;
import com.step63n1.model.TableSettings;

@Service ("blackJackService")
public class BlackJackService implements CardGameService{

	@Autowired
	BlackJackRuleSetup blackJackRuleSetup;
	
	@Autowired
	BlackJackTableSettingsSetup blackJackTableSettingsSetup;
	
	@Autowired
	BlackJackPopulateDecks blackJackPopulateDecks;

	
	public void start(){
		
		HouseRules blackJackHouseRules = null;
		TableSettings blackJackTableSettings = null;
		Decks trumpDecks = null;
		
		/*
		 * step1: Decide game rules. 
		 */
		blackJackHouseRules = blackJackRuleSetup.setUpHouseRules();
		
		/*
		 * step2: table settings
		 */
		blackJackTableSettings = blackJackTableSettingsSetup.setUpTableSettings();
		
		/*
		 * step3: Populate Decks
		 */ 		 
		trumpDecks = blackJackPopulateDecks.populateDecks(blackJackHouseRules);
		
		/*
		 * step4: shuffle Decks 
		 */
		trumpDecks = CardShuffleHelper.shuffleDecks(trumpDecks);

		/*
		 * step5: Play
		 */
		
	}
	
	
}
