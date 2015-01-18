package com.maple.player;

import com.maple.dice.FraudDice;
import com.maple.game.Mode;

public class FraudPlayer extends Player {

	private FraudDice fraudDice;
	private Player enemy;

	public FraudPlayer(String name, FraudDice fraudDice, Player enemy) {
		super(name, fraudDice);
		this.fraudDice = fraudDice;
		this.enemy = enemy;
	}

	@Override
	public void beforeRollDice() {	
		int myScore = this.getSumScore();
		int enemyScore = enemy.getSumScore();
		
		if ( myScore < enemyScore ) {
			fraudDice.setMode(Mode.STRONG);
		} else if ( (myScore - enemyScore) >= 6 ) {
			fraudDice.setMode(Mode.WEAK);
		} else {
			fraudDice.setMode(Mode.NORMAL);
		}
	}


}
