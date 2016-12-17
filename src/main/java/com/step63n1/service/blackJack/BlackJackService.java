package com.step63n1.service.blackJack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.step63n1.model.CardPlayer;
import com.step63n1.model.Decks;
import com.step63n1.model.HouseRules;
import com.step63n1.model.TableSettings;
import com.step63n1.service.CardGameService;
import com.step63n1.service.helper.CardShuffleHelper;

@Service ("blackJackService")
public class BlackJackService implements CardGameService{

	@Autowired
	BlackJackRuleSetup blackJackRuleSetup;
	
	@Autowired
	BlackJackTableSettingsSetup blackJackTableSettingsSetup;
	
	@Autowired
	BlackJackPopulateDecks blackJackPopulateDecks;
	
	@Autowired
	BlackJackPopulatePlayers blackJackPopulatePlayers; 

	
	public void start(){
		
		HouseRules blackJackHouseRules = null;
		TableSettings blackJackTableSettings = null;
		Decks trumpDecks = null;
		List<CardPlayer> blackJackTableSittings = null;
		
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
