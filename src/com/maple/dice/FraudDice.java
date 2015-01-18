package com.maple.dice;

import com.maple.game.Mode;

public class FraudDice extends Dice {

	private Mode mode;
	private int fraudDiceNum;
	
	public FraudDice () {
		mode = Mode.NORMAL;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	@Override
	public int rollDice() {
	
		while (true) {
			fraudDiceNum = super.rollDice();				
			if (fraudDiceNum <= 2 && mode == Mode.STRONG) {
				continue;
			} else if (fraudDiceNum >= 5 && mode == Mode.WEAK) {
				continue;
			} else {
				break;
			}
		}
		return fraudDiceNum;
	}
}
