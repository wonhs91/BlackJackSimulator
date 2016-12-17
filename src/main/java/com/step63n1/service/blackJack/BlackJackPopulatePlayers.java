package com.step63n1.service.blackJack;

import java.util.List;

import com.step63n1.model.CardPlayer;
import com.step63n1.model.TableSettings;

public interface BlackJackPopulatePlayers {
	
	public List<CardPlayer> populatePlayers(TableSettings blackJackTableSettings);

}
