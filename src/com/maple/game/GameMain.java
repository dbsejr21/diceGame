package com.maple.game;

import com.maple.dice.Dice;
import com.maple.dice.FraudDice;
import com.maple.player.FraudPlayer;
import com.maple.player.Player;

public class GameMain {
	
	private static final int GameRound = 5; 

	public static void main(String[] args) {
		
		Player player = new Player("엄마", new Dice()); 
		FraudPlayer Fraudplayer = new FraudPlayer("주윤덕", new FraudDice(), player);
		
		
		Judge judge = new Judge();
		
		judge.setGameRound(GameRound);
		judge.registerPlayer(player);
		judge.registerPlayer(Fraudplayer);
		judge.manageGame();

	}
	
}
