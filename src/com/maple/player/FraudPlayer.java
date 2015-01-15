package com.maple.player;

import com.maple.dice.FraudDice;

public class FraudPlayer extends Player {
	
	private FraudDice fraudDice;
	private Player enemy;
		
	public FraudPlayer(String name, FraudDice fraudDice, Player enemy) {
		super(name, fraudDice);
		this.enemy = enemy;
	}
	
	public void beforeRollDice() {
		
		if ( this.getSumScore() < enemy.getSumScore() ) {
			fraudDice.setMode(FraudDice.Mode.STRONG);
		} else if ( this.getSumScore() < enemy.getSumScore() ) {
			fraudDice.setMode(FraudDice.Mode.WEAK);
		} else {
			fraudDice.setMode(FraudDice.Mode.NORMAL);
		}
		
	}
	
	public void a() {
		
	}
}
