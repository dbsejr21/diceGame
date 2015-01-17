package com.maple.player;

import com.maple.dice.Dice;

public class Player {

	private String name;
	private int sumScore;
	private Dice dice;

	public Player(String name, Dice dice) {
		this.name = name;
		this.dice = dice;
	}

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSumScore() {
		return sumScore;
	}

	public Dice getDice() {
		return dice;
	}

	/*
	 * FIXME PlayerTest, FraudPlayerTest 이기는상황, 지는상황, 비기는상황 연출하기위한 
	 * 임시로 생성한 Set 메소드임. 삭제예정
	 */
	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}
	
	public void beforeRollDice() {
		
	}

	public void rollDice() {
		sumScore += dice.rollDice();
	}

}
