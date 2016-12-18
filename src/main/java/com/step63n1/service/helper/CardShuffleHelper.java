package com.step63n1.service.helper;

import java.util.Collections;
import java.util.List;

import com.step63n1.model.blackJack.TrumpCard;
import com.step63n1.model.blackJack.TrumpDecks;

public class CardShuffleHelper {

	public static List<TrumpCard> shuffleCards(List<TrumpCard> cards) {
		Collections.shuffle(cards);
		return cards;
	}

	public static TrumpDecks shuffleDecks(TrumpDecks decks) {
		List<TrumpCard> cards = decks.getDecks();
		Collections.shuffle(cards);
		decks.setDecks(cards);
		return decks;
	}

}
