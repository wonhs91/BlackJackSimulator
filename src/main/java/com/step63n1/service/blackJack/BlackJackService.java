package com.step63n1.service.blackJack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.model.BlackJackTableSitter;
import com.step63n1.model.blackJack.BlackJackHouseRules;
import com.step63n1.model.blackJack.BlackJackTableSettings;
import com.step63n1.model.blackJack.TrumpDecks;
import com.step63n1.service.helper.CardShuffleHelper;

@Service ("blackJackService")
public class BlackJackService {

	@Autowired
	BlackJackRuleSetup blackJackRuleSetup;
	
	@Autowired
	BlackJackTableSettingsSetup blackJackTableSettingsSetup;
	
	@Autowired
	BlackJackPopulateDecks blackJackPopulateDecks;
	
	@Autowired
	BlackJackPopulatePlayers blackJackPopulatePlayers; 

	
	public void start(){
		
		BlackJackHouseRules blackJackHouseRules = null;
		BlackJackTableSettings blackJackTableSettings = null;
		TrumpDecks trumpDecks = null;
		List<BlackJackTableSitter> blackJackTableSittings = null;
		
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
		 * step4: Populate Players
		 */
		blackJackTableSittings = blackJackPopulatePlayers.populatePlayers(blackJackTableSettings);
		
		/*
		 * step5: shuffle Decks 
		 */
		trumpDecks = CardShuffleHelper.shuffleDecks(trumpDecks);

		/*
		 * step6: play
		 */
	}
	
	
}
