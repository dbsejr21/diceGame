package com.maple.dice;

public class FraudDice extends Dice {

	public enum Mode {
		NORMAL, STRONG, WEAK
	}

	private Mode mode = Mode.NORMAL;
	
	private int fraudDiceNum;
	
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

			switch (mode) {
			case NORMAL:
				break;
				
			case STRONG:
				if (fraudDiceNum <= 2) {
					continue;
				}
				break;
			case WEAK:
				if (fraudDiceNum >= 5) {
					continue;
				}
				break;
			}
			
			return fraudDiceNum;
		}
	}

}
