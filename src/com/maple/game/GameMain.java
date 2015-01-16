package com.maple.game;

import java.util.ArrayList;
import java.util.List;

import com.maple.dice.Dice;
import com.maple.player.Player;

public class GameMain {

	public static void main(String[] args) {
		
		List<Player> listPlayer = new ArrayList<Player>();
		
		listPlayer.add(new Player("주윤덕", new Dice()));
		listPlayer.add(new Player("엄마", new Dice()));
		
		Judge judge = new Judge(listPlayer, 5);
		judge.manageGame();

	}

}
