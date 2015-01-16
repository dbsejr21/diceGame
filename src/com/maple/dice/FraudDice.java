package com.maple.dice;

public class FraudDice extends Dice {

	public enum Mode {
		NORMAL, STRONG, WEAK
	}

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
