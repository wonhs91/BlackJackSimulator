package com.step63n1.view.impl;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.step63n1.model.enums.BlackJackChoice;
import com.step63n1.view.BlackJackInputView;

@Component
public class BlackJackInputViewImpl implements BlackJackInputView {

	private int numDecks;
	private boolean doesDealerStandSoft17;
	private double blackJackWager;

	private int numPlayers;
	private double minBet;

	public int getNumDecks() {
		return numDecks;
	}

	public boolean getDoesDealerStandSoft17() {
		return doesDealerStandSoft17;
	}

	public double getBlackJackWager() {
		return blackJackWager;
	}

	public void askRuleSpecifications() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("# of decks: ");
		numDecks = scanner.nextInt();
		System.out.println("does Dealer Stand Soft 17?: ");
		doesDealerStandSoft17 = scanner.nextBoolean();
		System.out.println("What is the blackjack wager:");
		blackJackWager = scanner.nextDouble();
	}

	public void askSettingsSpecifications() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("# of players: ");
		numPlayers = scanner.nextInt();
		System.out.println("minimum Bet: ");
		minBet = scanner.nextDouble();

	}

	public void askNextMove() {

		System.out.println("Stand,");
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public double getMinBet() {
		return minBet;
	}

	public boolean askSplit() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Split? (t/f): ");
		if (scanner.next().contains("(t|T)")) {
			return true;
		}
		return false;
	}

	public BlackJackChoice askDecision() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("stand, hit, double (s/h/d): ");
			String choice = scanner.next();
			if (choice.contains("(s|S)")) {
				return BlackJackChoice.Stand;
			} else if (choice.contains("(h|H)")) {
				return BlackJackChoice.Hit;
			} else if (choice.contains("(d|D)")) {
				return BlackJackChoice.Double;
			}
		}

	}

}
